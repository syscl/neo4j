/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [https://neo4j.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.cypher.internal.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * A ParseTreeListener for CypherParser.
 * Generated by org.neo4j.cypher.internal.parser.GenerateListenerMavenPlugin
 */
public interface CypherParserListener extends ParseTreeListener {
    void exitStatements(CypherParser.StatementsContext ctx);

    void exitStatement(CypherParser.StatementContext ctx);

    void exitPeriodicCommitQueryHintFailure(CypherParser.PeriodicCommitQueryHintFailureContext ctx);

    void exitRegularQuery(CypherParser.RegularQueryContext ctx);

    void exitSingleQuery(CypherParser.SingleQueryContext ctx);

    void exitClause(CypherParser.ClauseContext ctx);

    void exitUseClause(CypherParser.UseClauseContext ctx);

    void exitGraphReference(CypherParser.GraphReferenceContext ctx);

    void exitFinishClause(CypherParser.FinishClauseContext ctx);

    void exitReturnClause(CypherParser.ReturnClauseContext ctx);

    void exitReturnBody(CypherParser.ReturnBodyContext ctx);

    void exitReturnItem(CypherParser.ReturnItemContext ctx);

    void exitReturnItems(CypherParser.ReturnItemsContext ctx);

    void exitOrderItem(CypherParser.OrderItemContext ctx);

    void exitOrderBy(CypherParser.OrderByContext ctx);

    void exitSkip(CypherParser.SkipContext ctx);

    void exitLimit(CypherParser.LimitContext ctx);

    void exitWhereClause(CypherParser.WhereClauseContext ctx);

    void exitWithClause(CypherParser.WithClauseContext ctx);

    void exitCreateClause(CypherParser.CreateClauseContext ctx);

    void exitInsertClause(CypherParser.InsertClauseContext ctx);

    void exitSetClause(CypherParser.SetClauseContext ctx);

    void exitSetItem(CypherParser.SetItemContext ctx);

    void exitRemoveClause(CypherParser.RemoveClauseContext ctx);

    void exitRemoveItem(CypherParser.RemoveItemContext ctx);

    void exitDeleteClause(CypherParser.DeleteClauseContext ctx);

    void exitMatchClause(CypherParser.MatchClauseContext ctx);

    void exitMatchMode(CypherParser.MatchModeContext ctx);

    void exitHint(CypherParser.HintContext ctx);

    void exitMergeClause(CypherParser.MergeClauseContext ctx);

    void exitMergeAction(CypherParser.MergeActionContext ctx);

    void exitUnwindClause(CypherParser.UnwindClauseContext ctx);

    void exitCallClause(CypherParser.CallClauseContext ctx);

    void exitProcedureResultItem(CypherParser.ProcedureResultItemContext ctx);

    void exitLoadCSVClause(CypherParser.LoadCSVClauseContext ctx);

    void exitForeachClause(CypherParser.ForeachClauseContext ctx);

    void exitSubqueryClause(CypherParser.SubqueryClauseContext ctx);

    void exitSubqueryInTransactionsParameters(CypherParser.SubqueryInTransactionsParametersContext ctx);

    void exitSubqueryInTransactionsBatchParameters(CypherParser.SubqueryInTransactionsBatchParametersContext ctx);

    void exitSubqueryInTransactionsErrorParameters(CypherParser.SubqueryInTransactionsErrorParametersContext ctx);

    void exitSubqueryInTransactionsReportParameters(CypherParser.SubqueryInTransactionsReportParametersContext ctx);

    void exitPatternList(CypherParser.PatternListContext ctx);

    void exitInsertPatternList(CypherParser.InsertPatternListContext ctx);

    void exitPattern(CypherParser.PatternContext ctx);

    void exitInsertPattern(CypherParser.InsertPatternContext ctx);

    void exitQuantifier(CypherParser.QuantifierContext ctx);

    void exitAnonymousPattern(CypherParser.AnonymousPatternContext ctx);

    void exitShortestPathPattern(CypherParser.ShortestPathPatternContext ctx);

    void exitPatternElement(CypherParser.PatternElementContext ctx);

    void exitSelector(CypherParser.SelectorContext ctx);

    void exitPathPatternNonEmpty(CypherParser.PathPatternNonEmptyContext ctx);

    void exitNodePattern(CypherParser.NodePatternContext ctx);

    void exitInsertNodePattern(CypherParser.InsertNodePatternContext ctx);

    void exitParenthesizedPath(CypherParser.ParenthesizedPathContext ctx);

    void exitNodeLabels(CypherParser.NodeLabelsContext ctx);

    void exitNodeLabelsIs(CypherParser.NodeLabelsIsContext ctx);

    void exitLabelType(CypherParser.LabelTypeContext ctx);

    void exitRelType(CypherParser.RelTypeContext ctx);

    void exitLabelOrRelType(CypherParser.LabelOrRelTypeContext ctx);

    void exitProperties(CypherParser.PropertiesContext ctx);

    void exitRelationshipPattern(CypherParser.RelationshipPatternContext ctx);

    void exitInsertRelationshipPattern(CypherParser.InsertRelationshipPatternContext ctx);

    void exitLeftArrow(CypherParser.LeftArrowContext ctx);

    void exitArrowLine(CypherParser.ArrowLineContext ctx);

    void exitRightArrow(CypherParser.RightArrowContext ctx);

    void exitPathLength(CypherParser.PathLengthContext ctx);

    void exitLabelExpression(CypherParser.LabelExpressionContext ctx);

    void exitLabelExpression4(CypherParser.LabelExpression4Context ctx);

    void exitLabelExpression4Is(CypherParser.LabelExpression4IsContext ctx);

    void exitLabelExpression3(CypherParser.LabelExpression3Context ctx);

    void exitLabelExpression3Is(CypherParser.LabelExpression3IsContext ctx);

    void exitLabelExpression2(CypherParser.LabelExpression2Context ctx);

    void exitLabelExpression2Is(CypherParser.LabelExpression2IsContext ctx);

    void exitLabelExpression1(CypherParser.LabelExpression1Context ctx);

    void exitLabelExpression1Is(CypherParser.LabelExpression1IsContext ctx);

    void exitInsertNodeLabelExpression(CypherParser.InsertNodeLabelExpressionContext ctx);

    void exitInsertRelationshipLabelExpression(CypherParser.InsertRelationshipLabelExpressionContext ctx);

    void exitExpression(CypherParser.ExpressionContext ctx);

    void exitExpression11(CypherParser.Expression11Context ctx);

    void exitExpression10(CypherParser.Expression10Context ctx);

    void exitExpression9(CypherParser.Expression9Context ctx);

    void exitExpression8(CypherParser.Expression8Context ctx);

    void exitExpression7(CypherParser.Expression7Context ctx);

    void exitComparisonExpression6(CypherParser.ComparisonExpression6Context ctx);

    void exitNormalForm(CypherParser.NormalFormContext ctx);

    void exitExpression6(CypherParser.Expression6Context ctx);

    void exitExpression5(CypherParser.Expression5Context ctx);

    void exitExpression4(CypherParser.Expression4Context ctx);

    void exitExpression3(CypherParser.Expression3Context ctx);

    void exitExpression2(CypherParser.Expression2Context ctx);

    void exitPostFix(CypherParser.PostFixContext ctx);

    void exitProperty(CypherParser.PropertyContext ctx);

    void exitPropertyExpression(CypherParser.PropertyExpressionContext ctx);

    void exitExpression1(CypherParser.Expression1Context ctx);

    void exitLiteral(CypherParser.LiteralContext ctx);

    void exitCaseExpression(CypherParser.CaseExpressionContext ctx);

    void exitCaseAlternative(CypherParser.CaseAlternativeContext ctx);

    void exitExtendedCaseExpression(CypherParser.ExtendedCaseExpressionContext ctx);

    void exitExtendedCaseAlternative(CypherParser.ExtendedCaseAlternativeContext ctx);

    void exitExtendedWhen(CypherParser.ExtendedWhenContext ctx);

    void exitListComprehension(CypherParser.ListComprehensionContext ctx);

    void exitPatternComprehension(CypherParser.PatternComprehensionContext ctx);

    void exitReduceExpression(CypherParser.ReduceExpressionContext ctx);

    void exitListItemsPredicate(CypherParser.ListItemsPredicateContext ctx);

    void exitNormalizeFunction(CypherParser.NormalizeFunctionContext ctx);

    void exitTrimFunction(CypherParser.TrimFunctionContext ctx);

    void exitPatternExpression(CypherParser.PatternExpressionContext ctx);

    void exitShortestPathExpression(CypherParser.ShortestPathExpressionContext ctx);

    void exitParenthesizedExpression(CypherParser.ParenthesizedExpressionContext ctx);

    void exitMapProjection(CypherParser.MapProjectionContext ctx);

    void exitMapProjectionElement(CypherParser.MapProjectionElementContext ctx);

    void exitCountStar(CypherParser.CountStarContext ctx);

    void exitExistsExpression(CypherParser.ExistsExpressionContext ctx);

    void exitCountExpression(CypherParser.CountExpressionContext ctx);

    void exitCollectExpression(CypherParser.CollectExpressionContext ctx);

    void exitNumberLiteral(CypherParser.NumberLiteralContext ctx);

    void exitSignedIntegerLiteral(CypherParser.SignedIntegerLiteralContext ctx);

    void exitListLiteral(CypherParser.ListLiteralContext ctx);

    void exitPropertyKeyName(CypherParser.PropertyKeyNameContext ctx);

    void exitParameter(CypherParser.ParameterContext ctx);

    void exitParameterName(CypherParser.ParameterNameContext ctx);

    void exitFunctionInvocation(CypherParser.FunctionInvocationContext ctx);

    void exitFunctionArgument(CypherParser.FunctionArgumentContext ctx);

    void exitFunctionName(CypherParser.FunctionNameContext ctx);

    void exitNamespace(CypherParser.NamespaceContext ctx);

    void exitVariable(CypherParser.VariableContext ctx);

    void exitNonEmptyNameList(CypherParser.NonEmptyNameListContext ctx);

    void exitCommand(CypherParser.CommandContext ctx);

    void exitCreateCommand(CypherParser.CreateCommandContext ctx);

    void exitDropCommand(CypherParser.DropCommandContext ctx);

    void exitAlterCommand(CypherParser.AlterCommandContext ctx);

    void exitRenameCommand(CypherParser.RenameCommandContext ctx);

    void exitShowCommand(CypherParser.ShowCommandContext ctx);

    void exitShowCommandYield(CypherParser.ShowCommandYieldContext ctx);

    void exitYieldItem(CypherParser.YieldItemContext ctx);

    void exitYieldSkip(CypherParser.YieldSkipContext ctx);

    void exitYieldLimit(CypherParser.YieldLimitContext ctx);

    void exitYieldClause(CypherParser.YieldClauseContext ctx);

    void exitShowBriefAndYield(CypherParser.ShowBriefAndYieldContext ctx);

    void exitShowIndexCommand(CypherParser.ShowIndexCommandContext ctx);

    void exitShowIndexesAllowBrief(CypherParser.ShowIndexesAllowBriefContext ctx);

    void exitShowIndexesNoBrief(CypherParser.ShowIndexesNoBriefContext ctx);

    void exitShowConstraintCommand(CypherParser.ShowConstraintCommandContext ctx);

    void exitConstraintAllowYieldType(CypherParser.ConstraintAllowYieldTypeContext ctx);

    void exitConstraintExistType(CypherParser.ConstraintExistTypeContext ctx);

    void exitConstraintBriefAndYieldType(CypherParser.ConstraintBriefAndYieldTypeContext ctx);

    void exitShowConstraintsAllowBriefAndYield(CypherParser.ShowConstraintsAllowBriefAndYieldContext ctx);

    void exitShowConstraintsAllowBrief(CypherParser.ShowConstraintsAllowBriefContext ctx);

    void exitShowConstraintsAllowYield(CypherParser.ShowConstraintsAllowYieldContext ctx);

    void exitShowProcedures(CypherParser.ShowProceduresContext ctx);

    void exitShowFunctions(CypherParser.ShowFunctionsContext ctx);

    void exitExecutableBy(CypherParser.ExecutableByContext ctx);

    void exitShowFunctionsType(CypherParser.ShowFunctionsTypeContext ctx);

    void exitShowTransactions(CypherParser.ShowTransactionsContext ctx);

    void exitTerminateCommand(CypherParser.TerminateCommandContext ctx);

    void exitTerminateTransactions(CypherParser.TerminateTransactionsContext ctx);

    void exitShowSettings(CypherParser.ShowSettingsContext ctx);

    void exitNamesAndClauses(CypherParser.NamesAndClausesContext ctx);

    void exitComposableCommandClauses(CypherParser.ComposableCommandClausesContext ctx);

    void exitComposableShowCommandClauses(CypherParser.ComposableShowCommandClausesContext ctx);

    void exitStringsOrExpression(CypherParser.StringsOrExpressionContext ctx);

    void exitType(CypherParser.TypeContext ctx);

    void exitTypePart(CypherParser.TypePartContext ctx);

    void exitTypeName(CypherParser.TypeNameContext ctx);

    void exitTypeNullability(CypherParser.TypeNullabilityContext ctx);

    void exitTypeListSuffix(CypherParser.TypeListSuffixContext ctx);

    void exitCommandNodePattern(CypherParser.CommandNodePatternContext ctx);

    void exitCommandRelPattern(CypherParser.CommandRelPatternContext ctx);

    void exitCreateConstraint(CypherParser.CreateConstraintContext ctx);

    void exitConstraintType(CypherParser.ConstraintTypeContext ctx);

    void exitDropConstraint(CypherParser.DropConstraintContext ctx);

    void exitCreateIndex(CypherParser.CreateIndexContext ctx);

    void exitOldCreateIndex(CypherParser.OldCreateIndexContext ctx);

    void exitCreateIndex_(CypherParser.CreateIndex_Context ctx);

    void exitCreateFulltextIndex(CypherParser.CreateFulltextIndexContext ctx);

    void exitFulltextNodePattern(CypherParser.FulltextNodePatternContext ctx);

    void exitFulltextRelPattern(CypherParser.FulltextRelPatternContext ctx);

    void exitCreateLookupIndex(CypherParser.CreateLookupIndexContext ctx);

    void exitLookupIndexNodePattern(CypherParser.LookupIndexNodePatternContext ctx);

    void exitLookupIndexRelPattern(CypherParser.LookupIndexRelPatternContext ctx);

    void exitDropIndex(CypherParser.DropIndexContext ctx);

    void exitPropertyList(CypherParser.PropertyListContext ctx);

    void exitEnableServerCommand(CypherParser.EnableServerCommandContext ctx);

    void exitAlterServer(CypherParser.AlterServerContext ctx);

    void exitRenameServer(CypherParser.RenameServerContext ctx);

    void exitDropServer(CypherParser.DropServerContext ctx);

    void exitShowServers(CypherParser.ShowServersContext ctx);

    void exitAllocationCommand(CypherParser.AllocationCommandContext ctx);

    void exitDeallocateDatabaseFromServers(CypherParser.DeallocateDatabaseFromServersContext ctx);

    void exitReallocateDatabases(CypherParser.ReallocateDatabasesContext ctx);

    void exitCreateRole(CypherParser.CreateRoleContext ctx);

    void exitDropRole(CypherParser.DropRoleContext ctx);

    void exitRenameRole(CypherParser.RenameRoleContext ctx);

    void exitShowRoles(CypherParser.ShowRolesContext ctx);

    void exitRoleToken(CypherParser.RoleTokenContext ctx);

    void exitCreateUser(CypherParser.CreateUserContext ctx);

    void exitDropUser(CypherParser.DropUserContext ctx);

    void exitRenameUser(CypherParser.RenameUserContext ctx);

    void exitAlterCurrentUser(CypherParser.AlterCurrentUserContext ctx);

    void exitAlterUser(CypherParser.AlterUserContext ctx);

    void exitPassword(CypherParser.PasswordContext ctx);

    void exitPasswordExpression(CypherParser.PasswordExpressionContext ctx);

    void exitPasswordChangeRequired(CypherParser.PasswordChangeRequiredContext ctx);

    void exitUserStatus(CypherParser.UserStatusContext ctx);

    void exitHomeDatabase(CypherParser.HomeDatabaseContext ctx);

    void exitShowUsers(CypherParser.ShowUsersContext ctx);

    void exitShowCurrentUser(CypherParser.ShowCurrentUserContext ctx);

    void exitShowPrivileges(CypherParser.ShowPrivilegesContext ctx);

    void exitShowSupportedPrivileges(CypherParser.ShowSupportedPrivilegesContext ctx);

    void exitShowRolePrivileges(CypherParser.ShowRolePrivilegesContext ctx);

    void exitShowUserPrivileges(CypherParser.ShowUserPrivilegesContext ctx);

    void exitPrivilegeAsCommand(CypherParser.PrivilegeAsCommandContext ctx);

    void exitPrivilegeToken(CypherParser.PrivilegeTokenContext ctx);

    void exitGrantCommand(CypherParser.GrantCommandContext ctx);

    void exitGrantRole(CypherParser.GrantRoleContext ctx);

    void exitDenyCommand(CypherParser.DenyCommandContext ctx);

    void exitRevokeCommand(CypherParser.RevokeCommandContext ctx);

    void exitRevokeRole(CypherParser.RevokeRoleContext ctx);

    void exitPrivilege(CypherParser.PrivilegeContext ctx);

    void exitAllPrivilege(CypherParser.AllPrivilegeContext ctx);

    void exitAllPrivilegeType(CypherParser.AllPrivilegeTypeContext ctx);

    void exitAllPrivilegeTarget(CypherParser.AllPrivilegeTargetContext ctx);

    void exitCreatePrivilege(CypherParser.CreatePrivilegeContext ctx);

    void exitCreatePrivilegeForDatabase(CypherParser.CreatePrivilegeForDatabaseContext ctx);

    void exitCreateNodePrivilegeToken(CypherParser.CreateNodePrivilegeTokenContext ctx);

    void exitCreateRelPrivilegeToken(CypherParser.CreateRelPrivilegeTokenContext ctx);

    void exitCreatePropertyPrivilegeToken(CypherParser.CreatePropertyPrivilegeTokenContext ctx);

    void exitActionForDBMS(CypherParser.ActionForDBMSContext ctx);

    void exitDropPrivilege(CypherParser.DropPrivilegeContext ctx);

    void exitLoadPrivilege(CypherParser.LoadPrivilegeContext ctx);

    void exitShowPrivilege(CypherParser.ShowPrivilegeContext ctx);

    void exitSetPrivilege(CypherParser.SetPrivilegeContext ctx);

    void exitPasswordToken(CypherParser.PasswordTokenContext ctx);

    void exitRemovePrivilege(CypherParser.RemovePrivilegeContext ctx);

    void exitWritePrivilege(CypherParser.WritePrivilegeContext ctx);

    void exitDatabasePrivilege(CypherParser.DatabasePrivilegeContext ctx);

    void exitDbmsPrivilege(CypherParser.DbmsPrivilegeContext ctx);

    void exitDbmsPrivilegeExecute(CypherParser.DbmsPrivilegeExecuteContext ctx);

    void exitAdminToken(CypherParser.AdminTokenContext ctx);

    void exitProcedureToken(CypherParser.ProcedureTokenContext ctx);

    void exitIndexToken(CypherParser.IndexTokenContext ctx);

    void exitConstraintToken(CypherParser.ConstraintTokenContext ctx);

    void exitTransactionToken(CypherParser.TransactionTokenContext ctx);

    void exitUserQualifier(CypherParser.UserQualifierContext ctx);

    void exitExecuteFunctionQualifier(CypherParser.ExecuteFunctionQualifierContext ctx);

    void exitExecuteProcedureQualifier(CypherParser.ExecuteProcedureQualifierContext ctx);

    void exitSettingQualifier(CypherParser.SettingQualifierContext ctx);

    void exitGlobs(CypherParser.GlobsContext ctx);

    void exitQualifiedGraphPrivilegesWithProperty(CypherParser.QualifiedGraphPrivilegesWithPropertyContext ctx);

    void exitQualifiedGraphPrivileges(CypherParser.QualifiedGraphPrivilegesContext ctx);

    void exitLabelsResource(CypherParser.LabelsResourceContext ctx);

    void exitPropertiesResource(CypherParser.PropertiesResourceContext ctx);

    void exitNonEmptyStringList(CypherParser.NonEmptyStringListContext ctx);

    void exitGraphQualifier(CypherParser.GraphQualifierContext ctx);

    void exitGraphQualifierToken(CypherParser.GraphQualifierTokenContext ctx);

    void exitRelToken(CypherParser.RelTokenContext ctx);

    void exitElementToken(CypherParser.ElementTokenContext ctx);

    void exitNodeToken(CypherParser.NodeTokenContext ctx);

    void exitCreateCompositeDatabase(CypherParser.CreateCompositeDatabaseContext ctx);

    void exitCreateDatabase(CypherParser.CreateDatabaseContext ctx);

    void exitPrimaryTopology(CypherParser.PrimaryTopologyContext ctx);

    void exitSecondaryTopology(CypherParser.SecondaryTopologyContext ctx);

    void exitDropDatabase(CypherParser.DropDatabaseContext ctx);

    void exitAlterDatabase(CypherParser.AlterDatabaseContext ctx);

    void exitAlterDatabaseAccess(CypherParser.AlterDatabaseAccessContext ctx);

    void exitAlterDatabaseTopology(CypherParser.AlterDatabaseTopologyContext ctx);

    void exitAlterDatabaseOption(CypherParser.AlterDatabaseOptionContext ctx);

    void exitStartDatabase(CypherParser.StartDatabaseContext ctx);

    void exitStopDatabase(CypherParser.StopDatabaseContext ctx);

    void exitWaitClause(CypherParser.WaitClauseContext ctx);

    void exitShowDatabase(CypherParser.ShowDatabaseContext ctx);

    void exitDatabaseScope(CypherParser.DatabaseScopeContext ctx);

    void exitGraphScope(CypherParser.GraphScopeContext ctx);

    void exitCommandOptions(CypherParser.CommandOptionsContext ctx);

    void exitCommandNameExpression(CypherParser.CommandNameExpressionContext ctx);

    void exitSymbolicNameOrStringParameter(CypherParser.SymbolicNameOrStringParameterContext ctx);

    void exitCreateAlias(CypherParser.CreateAliasContext ctx);

    void exitDropAlias(CypherParser.DropAliasContext ctx);

    void exitAlterAlias(CypherParser.AlterAliasContext ctx);

    void exitAlterAliasTarget(CypherParser.AlterAliasTargetContext ctx);

    void exitAlterAliasUser(CypherParser.AlterAliasUserContext ctx);

    void exitAlterAliasPassword(CypherParser.AlterAliasPasswordContext ctx);

    void exitAlterAliasDriver(CypherParser.AlterAliasDriverContext ctx);

    void exitAlterAliasProperties(CypherParser.AlterAliasPropertiesContext ctx);

    void exitShowAliases(CypherParser.ShowAliasesContext ctx);

    void exitSymbolicAliasNameList(CypherParser.SymbolicAliasNameListContext ctx);

    void exitSymbolicAliasNameOrParameter(CypherParser.SymbolicAliasNameOrParameterContext ctx);

    void exitSymbolicAliasName(CypherParser.SymbolicAliasNameContext ctx);

    void exitSymbolicNameOrStringParameterList(CypherParser.SymbolicNameOrStringParameterListContext ctx);

    void exitGlob(CypherParser.GlobContext ctx);

    void exitGlobRecursive(CypherParser.GlobRecursiveContext ctx);

    void exitGlobPart(CypherParser.GlobPartContext ctx);

    void exitStringList(CypherParser.StringListContext ctx);

    void exitStringLiteral(CypherParser.StringLiteralContext ctx);

    void exitStringOrParameter(CypherParser.StringOrParameterContext ctx);

    void exitMapOrParameter(CypherParser.MapOrParameterContext ctx);

    void exitMap(CypherParser.MapContext ctx);

    void exitSymbolicNameString(CypherParser.SymbolicNameStringContext ctx);

    void exitEscapedSymbolicNameString(CypherParser.EscapedSymbolicNameStringContext ctx);

    void exitUnescapedSymbolicNameString(CypherParser.UnescapedSymbolicNameStringContext ctx);

    void exitSymbolicLabelNameString(CypherParser.SymbolicLabelNameStringContext ctx);

    void exitUnescapedLabelSymbolicNameString(CypherParser.UnescapedLabelSymbolicNameStringContext ctx);

    void exitEndOfFile(CypherParser.EndOfFileContext ctx);
}
