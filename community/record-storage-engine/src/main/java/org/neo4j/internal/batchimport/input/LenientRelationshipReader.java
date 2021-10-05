/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.internal.batchimport.input;

import java.io.IOException;

import org.neo4j.common.EntityType;
import org.neo4j.internal.batchimport.ReadBehaviour;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.PropertyStore;
import org.neo4j.kernel.impl.store.RelationshipStore;
import org.neo4j.kernel.impl.store.record.RecordLoad;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.token.TokenHolders;

import static org.neo4j.internal.recordstorage.RecordCursorTypes.RELATIONSHIP_CURSOR;

class LenientRelationshipReader extends LenientStoreInputChunk
{
    private final RelationshipStore relationshipStore;
    private final RelationshipRecord record;

    LenientRelationshipReader( ReadBehaviour readBehaviour, RelationshipStore relationshipStore, PropertyStore propertyStore, TokenHolders tokenHolders,
            PageCacheTracer pageCacheTracer, StoreCursors storeCursors )
    {
        super( readBehaviour, propertyStore, tokenHolders, pageCacheTracer, storeCursors, storeCursors.readCursor( RELATIONSHIP_CURSOR ) );
        this.relationshipStore = relationshipStore;
        this.record = relationshipStore.newRecord();
    }

    @Override
    void readAndVisit( long id, InputEntityVisitor visitor, StoreCursors storeCursors ) throws IOException
    {
        relationshipStore.getRecordByCursor( id, record, RecordLoad.LENIENT_CHECK, cursor );
        if ( record.inUse() )
        {
            relationshipStore.ensureHeavy( record, storeCursors );
            int relationshipType = record.getType();
            String relationshipTypeName = LenientStoreInput.getTokenByIdSafe( tokenHolders.relationshipTypeTokens(), relationshipType ).name();
            if ( readBehaviour.shouldIncludeRelationship( relationshipTypeName ) )
            {
                visitor.type( relationshipTypeName );
                visitor.startId( record.getFirstNode(), Group.GLOBAL );
                visitor.endId( record.getSecondNode(), Group.GLOBAL );
                visitPropertyChainNoThrow( visitor, record, EntityType.RELATIONSHIP, new String[] {relationshipTypeName} );
                visitor.endOfEntity();
            }
        }
        else
        {
            readBehaviour.unused();
        }
    }

    @Override
    String recordType()
    {
        return "Relationship";
    }

    @Override
    boolean shouldIncludeProperty( ReadBehaviour readBehaviour, String key, String[] owningEntityTokens )
    {
        return readBehaviour.shouldIncludeRelationshipProperty( key, owningEntityTokens[0] );
    }
}
