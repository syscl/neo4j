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
package org.neo4j.cypher.internal.parser.v6;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * A ParseTreeListener for Cypher6Parser.
 * Generated by org.neo4j.cypher.internal.parser.GenerateListenerMavenPlugin
 */
public interface Cypher6ParserListener extends ParseTreeListener {
    void exitStatements(Cypher6Parser.StatementsContext ctx);

    void exitStatement(Cypher6Parser.StatementContext ctx);

    void exitRegularQuery(Cypher6Parser.RegularQueryContext ctx);

    void exitSingleQuery(Cypher6Parser.SingleQueryContext ctx);

    void exitClause(Cypher6Parser.ClauseContext ctx);

    void exitUseClause(Cypher6Parser.UseClauseContext ctx);

    void exitGraphReference(Cypher6Parser.GraphReferenceContext ctx);

    void exitFinishClause(Cypher6Parser.FinishClauseContext ctx);

    void exitReturnClause(Cypher6Parser.ReturnClauseContext ctx);

    void exitReturnBody(Cypher6Parser.ReturnBodyContext ctx);

    void exitReturnItem(Cypher6Parser.ReturnItemContext ctx);

    void exitReturnItems(Cypher6Parser.ReturnItemsContext ctx);

    void exitOrderItem(Cypher6Parser.OrderItemContext ctx);

    void exitAscToken(Cypher6Parser.AscTokenContext ctx);

    void exitDescToken(Cypher6Parser.DescTokenContext ctx);

    void exitOrderBy(Cypher6Parser.OrderByContext ctx);

    void exitSkip(Cypher6Parser.SkipContext ctx);

    void exitLimit(Cypher6Parser.LimitContext ctx);

    void exitWhereClause(Cypher6Parser.WhereClauseContext ctx);

    void exitWithClause(Cypher6Parser.WithClauseContext ctx);

    void exitCreateClause(Cypher6Parser.CreateClauseContext ctx);

    void exitInsertClause(Cypher6Parser.InsertClauseContext ctx);

    void exitSetClause(Cypher6Parser.SetClauseContext ctx);

    void exitSetItem(Cypher6Parser.SetItemContext ctx);

    void exitRemoveClause(Cypher6Parser.RemoveClauseContext ctx);

    void exitRemoveItem(Cypher6Parser.RemoveItemContext ctx);

    void exitDeleteClause(Cypher6Parser.DeleteClauseContext ctx);

    void exitMatchClause(Cypher6Parser.MatchClauseContext ctx);

    void exitMatchMode(Cypher6Parser.MatchModeContext ctx);

    void exitHint(Cypher6Parser.HintContext ctx);

    void exitMergeClause(Cypher6Parser.MergeClauseContext ctx);

    void exitMergeAction(Cypher6Parser.MergeActionContext ctx);

    void exitUnwindClause(Cypher6Parser.UnwindClauseContext ctx);

    void exitCallClause(Cypher6Parser.CallClauseContext ctx);

    void exitProcedureName(Cypher6Parser.ProcedureNameContext ctx);

    void exitProcedureArgument(Cypher6Parser.ProcedureArgumentContext ctx);

    void exitProcedureResultItem(Cypher6Parser.ProcedureResultItemContext ctx);

    void exitLoadCSVClause(Cypher6Parser.LoadCSVClauseContext ctx);

    void exitForeachClause(Cypher6Parser.ForeachClauseContext ctx);

    void exitSubqueryClause(Cypher6Parser.SubqueryClauseContext ctx);

    void exitSubqueryScope(Cypher6Parser.SubqueryScopeContext ctx);

    void exitSubqueryInTransactionsParameters(Cypher6Parser.SubqueryInTransactionsParametersContext ctx);

    void exitSubqueryInTransactionsBatchParameters(Cypher6Parser.SubqueryInTransactionsBatchParametersContext ctx);

    void exitSubqueryInTransactionsErrorParameters(Cypher6Parser.SubqueryInTransactionsErrorParametersContext ctx);

    void exitSubqueryInTransactionsReportParameters(Cypher6Parser.SubqueryInTransactionsReportParametersContext ctx);

    void exitOrderBySkipLimitClause(Cypher6Parser.OrderBySkipLimitClauseContext ctx);

    void exitPatternList(Cypher6Parser.PatternListContext ctx);

    void exitInsertPatternList(Cypher6Parser.InsertPatternListContext ctx);

    void exitPattern(Cypher6Parser.PatternContext ctx);

    void exitInsertPattern(Cypher6Parser.InsertPatternContext ctx);

    void exitQuantifier(Cypher6Parser.QuantifierContext ctx);

    void exitAnonymousPattern(Cypher6Parser.AnonymousPatternContext ctx);

    void exitShortestPathPattern(Cypher6Parser.ShortestPathPatternContext ctx);

    void exitPatternElement(Cypher6Parser.PatternElementContext ctx);

    void exitSelector(Cypher6Parser.SelectorContext ctx);

    void exitGroupToken(Cypher6Parser.GroupTokenContext ctx);

    void exitPathToken(Cypher6Parser.PathTokenContext ctx);

    void exitPathPatternNonEmpty(Cypher6Parser.PathPatternNonEmptyContext ctx);

    void exitNodePattern(Cypher6Parser.NodePatternContext ctx);

    void exitInsertNodePattern(Cypher6Parser.InsertNodePatternContext ctx);

    void exitParenthesizedPath(Cypher6Parser.ParenthesizedPathContext ctx);

    void exitNodeLabels(Cypher6Parser.NodeLabelsContext ctx);

    void exitNodeLabelsIs(Cypher6Parser.NodeLabelsIsContext ctx);

    void exitDynamicExpression(Cypher6Parser.DynamicExpressionContext ctx);

    void exitDynamicLabelType(Cypher6Parser.DynamicLabelTypeContext ctx);

    void exitLabelType(Cypher6Parser.LabelTypeContext ctx);

    void exitRelType(Cypher6Parser.RelTypeContext ctx);

    void exitLabelOrRelType(Cypher6Parser.LabelOrRelTypeContext ctx);

    void exitProperties(Cypher6Parser.PropertiesContext ctx);

    void exitRelationshipPattern(Cypher6Parser.RelationshipPatternContext ctx);

    void exitInsertRelationshipPattern(Cypher6Parser.InsertRelationshipPatternContext ctx);

    void exitLeftArrow(Cypher6Parser.LeftArrowContext ctx);

    void exitArrowLine(Cypher6Parser.ArrowLineContext ctx);

    void exitRightArrow(Cypher6Parser.RightArrowContext ctx);

    void exitPathLength(Cypher6Parser.PathLengthContext ctx);

    void exitLabelExpression(Cypher6Parser.LabelExpressionContext ctx);

    void exitLabelExpression4(Cypher6Parser.LabelExpression4Context ctx);

    void exitLabelExpression4Is(Cypher6Parser.LabelExpression4IsContext ctx);

    void exitLabelExpression3(Cypher6Parser.LabelExpression3Context ctx);

    void exitLabelExpression3Is(Cypher6Parser.LabelExpression3IsContext ctx);

    void exitLabelExpression2(Cypher6Parser.LabelExpression2Context ctx);

    void exitLabelExpression2Is(Cypher6Parser.LabelExpression2IsContext ctx);

    void exitLabelExpression1(Cypher6Parser.LabelExpression1Context ctx);

    void exitLabelExpression1Is(Cypher6Parser.LabelExpression1IsContext ctx);

    void exitInsertNodeLabelExpression(Cypher6Parser.InsertNodeLabelExpressionContext ctx);

    void exitInsertRelationshipLabelExpression(Cypher6Parser.InsertRelationshipLabelExpressionContext ctx);

    void exitExpression(Cypher6Parser.ExpressionContext ctx);

    void exitExpression11(Cypher6Parser.Expression11Context ctx);

    void exitExpression10(Cypher6Parser.Expression10Context ctx);

    void exitExpression9(Cypher6Parser.Expression9Context ctx);

    void exitExpression8(Cypher6Parser.Expression8Context ctx);

    void exitExpression7(Cypher6Parser.Expression7Context ctx);

    void exitComparisonExpression6(Cypher6Parser.ComparisonExpression6Context ctx);

    void exitNormalForm(Cypher6Parser.NormalFormContext ctx);

    void exitExpression6(Cypher6Parser.Expression6Context ctx);

    void exitExpression5(Cypher6Parser.Expression5Context ctx);

    void exitExpression4(Cypher6Parser.Expression4Context ctx);

    void exitExpression3(Cypher6Parser.Expression3Context ctx);

    void exitExpression2(Cypher6Parser.Expression2Context ctx);

    void exitPostFix(Cypher6Parser.PostFixContext ctx);

    void exitProperty(Cypher6Parser.PropertyContext ctx);

    void exitDynamicProperty(Cypher6Parser.DynamicPropertyContext ctx);

    void exitPropertyExpression(Cypher6Parser.PropertyExpressionContext ctx);

    void exitDynamicPropertyExpression(Cypher6Parser.DynamicPropertyExpressionContext ctx);

    void exitExpression1(Cypher6Parser.Expression1Context ctx);

    void exitLiteral(Cypher6Parser.LiteralContext ctx);

    void exitCaseExpression(Cypher6Parser.CaseExpressionContext ctx);

    void exitCaseAlternative(Cypher6Parser.CaseAlternativeContext ctx);

    void exitExtendedCaseExpression(Cypher6Parser.ExtendedCaseExpressionContext ctx);

    void exitExtendedCaseAlternative(Cypher6Parser.ExtendedCaseAlternativeContext ctx);

    void exitExtendedWhen(Cypher6Parser.ExtendedWhenContext ctx);

    void exitListComprehension(Cypher6Parser.ListComprehensionContext ctx);

    void exitPatternComprehension(Cypher6Parser.PatternComprehensionContext ctx);

    void exitReduceExpression(Cypher6Parser.ReduceExpressionContext ctx);

    void exitListItemsPredicate(Cypher6Parser.ListItemsPredicateContext ctx);

    void exitNormalizeFunction(Cypher6Parser.NormalizeFunctionContext ctx);

    void exitTrimFunction(Cypher6Parser.TrimFunctionContext ctx);

    void exitPatternExpression(Cypher6Parser.PatternExpressionContext ctx);

    void exitShortestPathExpression(Cypher6Parser.ShortestPathExpressionContext ctx);

    void exitParenthesizedExpression(Cypher6Parser.ParenthesizedExpressionContext ctx);

    void exitMapProjection(Cypher6Parser.MapProjectionContext ctx);

    void exitMapProjectionElement(Cypher6Parser.MapProjectionElementContext ctx);

    void exitCountStar(Cypher6Parser.CountStarContext ctx);

    void exitExistsExpression(Cypher6Parser.ExistsExpressionContext ctx);

    void exitCountExpression(Cypher6Parser.CountExpressionContext ctx);

    void exitCollectExpression(Cypher6Parser.CollectExpressionContext ctx);

    void exitNumberLiteral(Cypher6Parser.NumberLiteralContext ctx);

    void exitSignedIntegerLiteral(Cypher6Parser.SignedIntegerLiteralContext ctx);

    void exitListLiteral(Cypher6Parser.ListLiteralContext ctx);

    void exitPropertyKeyName(Cypher6Parser.PropertyKeyNameContext ctx);

    void exitParameter(Cypher6Parser.ParameterContext ctx);

    void exitParameterName(Cypher6Parser.ParameterNameContext ctx);

    void exitFunctionInvocation(Cypher6Parser.FunctionInvocationContext ctx);

    void exitFunctionArgument(Cypher6Parser.FunctionArgumentContext ctx);

    void exitFunctionName(Cypher6Parser.FunctionNameContext ctx);

    void exitNamespace(Cypher6Parser.NamespaceContext ctx);

    void exitVariable(Cypher6Parser.VariableContext ctx);

    void exitNonEmptyNameList(Cypher6Parser.NonEmptyNameListContext ctx);

    void exitType(Cypher6Parser.TypeContext ctx);

    void exitTypePart(Cypher6Parser.TypePartContext ctx);

    void exitTypeName(Cypher6Parser.TypeNameContext ctx);

    void exitTypeNullability(Cypher6Parser.TypeNullabilityContext ctx);

    void exitTypeListSuffix(Cypher6Parser.TypeListSuffixContext ctx);

    void exitCommand(Cypher6Parser.CommandContext ctx);

    void exitCreateCommand(Cypher6Parser.CreateCommandContext ctx);

    void exitDropCommand(Cypher6Parser.DropCommandContext ctx);

    void exitShowCommand(Cypher6Parser.ShowCommandContext ctx);

    void exitShowCommandYield(Cypher6Parser.ShowCommandYieldContext ctx);

    void exitYieldItem(Cypher6Parser.YieldItemContext ctx);

    void exitYieldSkip(Cypher6Parser.YieldSkipContext ctx);

    void exitYieldLimit(Cypher6Parser.YieldLimitContext ctx);

    void exitYieldClause(Cypher6Parser.YieldClauseContext ctx);

    void exitCommandOptions(Cypher6Parser.CommandOptionsContext ctx);

    void exitTerminateCommand(Cypher6Parser.TerminateCommandContext ctx);

    void exitComposableCommandClauses(Cypher6Parser.ComposableCommandClausesContext ctx);

    void exitComposableShowCommandClauses(Cypher6Parser.ComposableShowCommandClausesContext ctx);

    void exitShowIndexCommand(Cypher6Parser.ShowIndexCommandContext ctx);

    void exitShowIndexType(Cypher6Parser.ShowIndexTypeContext ctx);

    void exitShowIndexesEnd(Cypher6Parser.ShowIndexesEndContext ctx);

    void exitShowConstraintCommand(Cypher6Parser.ShowConstraintCommandContext ctx);

    void exitShowConstraintEntity(Cypher6Parser.ShowConstraintEntityContext ctx);

    void exitConstraintExistType(Cypher6Parser.ConstraintExistTypeContext ctx);

    void exitShowConstraintsEnd(Cypher6Parser.ShowConstraintsEndContext ctx);

    void exitShowProcedures(Cypher6Parser.ShowProceduresContext ctx);

    void exitShowFunctions(Cypher6Parser.ShowFunctionsContext ctx);

    void exitFunctionToken(Cypher6Parser.FunctionTokenContext ctx);

    void exitExecutableBy(Cypher6Parser.ExecutableByContext ctx);

    void exitShowFunctionsType(Cypher6Parser.ShowFunctionsTypeContext ctx);

    void exitShowTransactions(Cypher6Parser.ShowTransactionsContext ctx);

    void exitTerminateTransactions(Cypher6Parser.TerminateTransactionsContext ctx);

    void exitShowSettings(Cypher6Parser.ShowSettingsContext ctx);

    void exitSettingToken(Cypher6Parser.SettingTokenContext ctx);

    void exitNamesAndClauses(Cypher6Parser.NamesAndClausesContext ctx);

    void exitStringsOrExpression(Cypher6Parser.StringsOrExpressionContext ctx);

    void exitCommandNodePattern(Cypher6Parser.CommandNodePatternContext ctx);

    void exitCommandRelPattern(Cypher6Parser.CommandRelPatternContext ctx);

    void exitCreateConstraint(Cypher6Parser.CreateConstraintContext ctx);

    void exitConstraintType(Cypher6Parser.ConstraintTypeContext ctx);

    void exitDropConstraint(Cypher6Parser.DropConstraintContext ctx);

    void exitCreateIndex(Cypher6Parser.CreateIndexContext ctx);

    void exitCreateIndex_(Cypher6Parser.CreateIndex_Context ctx);

    void exitCreateFulltextIndex(Cypher6Parser.CreateFulltextIndexContext ctx);

    void exitFulltextNodePattern(Cypher6Parser.FulltextNodePatternContext ctx);

    void exitFulltextRelPattern(Cypher6Parser.FulltextRelPatternContext ctx);

    void exitCreateLookupIndex(Cypher6Parser.CreateLookupIndexContext ctx);

    void exitLookupIndexNodePattern(Cypher6Parser.LookupIndexNodePatternContext ctx);

    void exitLookupIndexRelPattern(Cypher6Parser.LookupIndexRelPatternContext ctx);

    void exitDropIndex(Cypher6Parser.DropIndexContext ctx);

    void exitPropertyList(Cypher6Parser.PropertyListContext ctx);

    void exitEnclosedPropertyList(Cypher6Parser.EnclosedPropertyListContext ctx);

    void exitAlterCommand(Cypher6Parser.AlterCommandContext ctx);

    void exitRenameCommand(Cypher6Parser.RenameCommandContext ctx);

    void exitGrantCommand(Cypher6Parser.GrantCommandContext ctx);

    void exitDenyCommand(Cypher6Parser.DenyCommandContext ctx);

    void exitRevokeCommand(Cypher6Parser.RevokeCommandContext ctx);

    void exitUserNames(Cypher6Parser.UserNamesContext ctx);

    void exitRoleNames(Cypher6Parser.RoleNamesContext ctx);

    void exitRoleToken(Cypher6Parser.RoleTokenContext ctx);

    void exitEnableServerCommand(Cypher6Parser.EnableServerCommandContext ctx);

    void exitAlterServer(Cypher6Parser.AlterServerContext ctx);

    void exitRenameServer(Cypher6Parser.RenameServerContext ctx);

    void exitDropServer(Cypher6Parser.DropServerContext ctx);

    void exitShowServers(Cypher6Parser.ShowServersContext ctx);

    void exitAllocationCommand(Cypher6Parser.AllocationCommandContext ctx);

    void exitDeallocateDatabaseFromServers(Cypher6Parser.DeallocateDatabaseFromServersContext ctx);

    void exitReallocateDatabases(Cypher6Parser.ReallocateDatabasesContext ctx);

    void exitCreateRole(Cypher6Parser.CreateRoleContext ctx);

    void exitDropRole(Cypher6Parser.DropRoleContext ctx);

    void exitRenameRole(Cypher6Parser.RenameRoleContext ctx);

    void exitShowRoles(Cypher6Parser.ShowRolesContext ctx);

    void exitGrantRole(Cypher6Parser.GrantRoleContext ctx);

    void exitRevokeRole(Cypher6Parser.RevokeRoleContext ctx);

    void exitCreateUser(Cypher6Parser.CreateUserContext ctx);

    void exitDropUser(Cypher6Parser.DropUserContext ctx);

    void exitRenameUser(Cypher6Parser.RenameUserContext ctx);

    void exitAlterCurrentUser(Cypher6Parser.AlterCurrentUserContext ctx);

    void exitAlterUser(Cypher6Parser.AlterUserContext ctx);

    void exitRemoveNamedProvider(Cypher6Parser.RemoveNamedProviderContext ctx);

    void exitPassword(Cypher6Parser.PasswordContext ctx);

    void exitPasswordOnly(Cypher6Parser.PasswordOnlyContext ctx);

    void exitPasswordExpression(Cypher6Parser.PasswordExpressionContext ctx);

    void exitPasswordChangeRequired(Cypher6Parser.PasswordChangeRequiredContext ctx);

    void exitUserStatus(Cypher6Parser.UserStatusContext ctx);

    void exitHomeDatabase(Cypher6Parser.HomeDatabaseContext ctx);

    void exitSetAuthClause(Cypher6Parser.SetAuthClauseContext ctx);

    void exitUserAuthAttribute(Cypher6Parser.UserAuthAttributeContext ctx);

    void exitShowUsers(Cypher6Parser.ShowUsersContext ctx);

    void exitShowCurrentUser(Cypher6Parser.ShowCurrentUserContext ctx);

    void exitShowSupportedPrivileges(Cypher6Parser.ShowSupportedPrivilegesContext ctx);

    void exitShowPrivileges(Cypher6Parser.ShowPrivilegesContext ctx);

    void exitShowRolePrivileges(Cypher6Parser.ShowRolePrivilegesContext ctx);

    void exitShowUserPrivileges(Cypher6Parser.ShowUserPrivilegesContext ctx);

    void exitPrivilegeAsCommand(Cypher6Parser.PrivilegeAsCommandContext ctx);

    void exitPrivilegeToken(Cypher6Parser.PrivilegeTokenContext ctx);

    void exitPrivilege(Cypher6Parser.PrivilegeContext ctx);

    void exitAllPrivilege(Cypher6Parser.AllPrivilegeContext ctx);

    void exitAllPrivilegeType(Cypher6Parser.AllPrivilegeTypeContext ctx);

    void exitAllPrivilegeTarget(Cypher6Parser.AllPrivilegeTargetContext ctx);

    void exitCreatePrivilege(Cypher6Parser.CreatePrivilegeContext ctx);

    void exitCreatePrivilegeForDatabase(Cypher6Parser.CreatePrivilegeForDatabaseContext ctx);

    void exitCreateNodePrivilegeToken(Cypher6Parser.CreateNodePrivilegeTokenContext ctx);

    void exitCreateRelPrivilegeToken(Cypher6Parser.CreateRelPrivilegeTokenContext ctx);

    void exitCreatePropertyPrivilegeToken(Cypher6Parser.CreatePropertyPrivilegeTokenContext ctx);

    void exitActionForDBMS(Cypher6Parser.ActionForDBMSContext ctx);

    void exitDropPrivilege(Cypher6Parser.DropPrivilegeContext ctx);

    void exitLoadPrivilege(Cypher6Parser.LoadPrivilegeContext ctx);

    void exitShowPrivilege(Cypher6Parser.ShowPrivilegeContext ctx);

    void exitSetPrivilege(Cypher6Parser.SetPrivilegeContext ctx);

    void exitPasswordToken(Cypher6Parser.PasswordTokenContext ctx);

    void exitRemovePrivilege(Cypher6Parser.RemovePrivilegeContext ctx);

    void exitWritePrivilege(Cypher6Parser.WritePrivilegeContext ctx);

    void exitDatabasePrivilege(Cypher6Parser.DatabasePrivilegeContext ctx);

    void exitDbmsPrivilege(Cypher6Parser.DbmsPrivilegeContext ctx);

    void exitDbmsPrivilegeExecute(Cypher6Parser.DbmsPrivilegeExecuteContext ctx);

    void exitAdminToken(Cypher6Parser.AdminTokenContext ctx);

    void exitProcedureToken(Cypher6Parser.ProcedureTokenContext ctx);

    void exitIndexToken(Cypher6Parser.IndexTokenContext ctx);

    void exitConstraintToken(Cypher6Parser.ConstraintTokenContext ctx);

    void exitTransactionToken(Cypher6Parser.TransactionTokenContext ctx);

    void exitUserQualifier(Cypher6Parser.UserQualifierContext ctx);

    void exitExecuteFunctionQualifier(Cypher6Parser.ExecuteFunctionQualifierContext ctx);

    void exitExecuteProcedureQualifier(Cypher6Parser.ExecuteProcedureQualifierContext ctx);

    void exitSettingQualifier(Cypher6Parser.SettingQualifierContext ctx);

    void exitGlobs(Cypher6Parser.GlobsContext ctx);

    void exitGlob(Cypher6Parser.GlobContext ctx);

    void exitGlobRecursive(Cypher6Parser.GlobRecursiveContext ctx);

    void exitGlobPart(Cypher6Parser.GlobPartContext ctx);

    void exitQualifiedGraphPrivilegesWithProperty(Cypher6Parser.QualifiedGraphPrivilegesWithPropertyContext ctx);

    void exitQualifiedGraphPrivileges(Cypher6Parser.QualifiedGraphPrivilegesContext ctx);

    void exitLabelsResource(Cypher6Parser.LabelsResourceContext ctx);

    void exitPropertiesResource(Cypher6Parser.PropertiesResourceContext ctx);

    void exitNonEmptyStringList(Cypher6Parser.NonEmptyStringListContext ctx);

    void exitGraphQualifier(Cypher6Parser.GraphQualifierContext ctx);

    void exitGraphQualifierToken(Cypher6Parser.GraphQualifierTokenContext ctx);

    void exitRelToken(Cypher6Parser.RelTokenContext ctx);

    void exitElementToken(Cypher6Parser.ElementTokenContext ctx);

    void exitNodeToken(Cypher6Parser.NodeTokenContext ctx);

    void exitDatabaseScope(Cypher6Parser.DatabaseScopeContext ctx);

    void exitGraphScope(Cypher6Parser.GraphScopeContext ctx);

    void exitCreateCompositeDatabase(Cypher6Parser.CreateCompositeDatabaseContext ctx);

    void exitCreateDatabase(Cypher6Parser.CreateDatabaseContext ctx);

    void exitPrimaryTopology(Cypher6Parser.PrimaryTopologyContext ctx);

    void exitPrimaryToken(Cypher6Parser.PrimaryTokenContext ctx);

    void exitSecondaryTopology(Cypher6Parser.SecondaryTopologyContext ctx);

    void exitSecondaryToken(Cypher6Parser.SecondaryTokenContext ctx);

    void exitDropDatabase(Cypher6Parser.DropDatabaseContext ctx);

    void exitAlterDatabase(Cypher6Parser.AlterDatabaseContext ctx);

    void exitAlterDatabaseAccess(Cypher6Parser.AlterDatabaseAccessContext ctx);

    void exitAlterDatabaseTopology(Cypher6Parser.AlterDatabaseTopologyContext ctx);

    void exitAlterDatabaseOption(Cypher6Parser.AlterDatabaseOptionContext ctx);

    void exitStartDatabase(Cypher6Parser.StartDatabaseContext ctx);

    void exitStopDatabase(Cypher6Parser.StopDatabaseContext ctx);

    void exitWaitClause(Cypher6Parser.WaitClauseContext ctx);

    void exitSecondsToken(Cypher6Parser.SecondsTokenContext ctx);

    void exitShowDatabase(Cypher6Parser.ShowDatabaseContext ctx);

    void exitCreateAlias(Cypher6Parser.CreateAliasContext ctx);

    void exitDropAlias(Cypher6Parser.DropAliasContext ctx);

    void exitAlterAlias(Cypher6Parser.AlterAliasContext ctx);

    void exitAlterAliasTarget(Cypher6Parser.AlterAliasTargetContext ctx);

    void exitAlterAliasUser(Cypher6Parser.AlterAliasUserContext ctx);

    void exitAlterAliasPassword(Cypher6Parser.AlterAliasPasswordContext ctx);

    void exitAlterAliasDriver(Cypher6Parser.AlterAliasDriverContext ctx);

    void exitAlterAliasProperties(Cypher6Parser.AlterAliasPropertiesContext ctx);

    void exitShowAliases(Cypher6Parser.ShowAliasesContext ctx);

    void exitSymbolicNameOrStringParameter(Cypher6Parser.SymbolicNameOrStringParameterContext ctx);

    void exitCommandNameExpression(Cypher6Parser.CommandNameExpressionContext ctx);

    void exitSymbolicNameOrStringParameterList(Cypher6Parser.SymbolicNameOrStringParameterListContext ctx);

    void exitSymbolicAliasNameList(Cypher6Parser.SymbolicAliasNameListContext ctx);

    void exitSymbolicAliasNameOrParameter(Cypher6Parser.SymbolicAliasNameOrParameterContext ctx);

    void exitSymbolicAliasName(Cypher6Parser.SymbolicAliasNameContext ctx);

    void exitStringListLiteral(Cypher6Parser.StringListLiteralContext ctx);

    void exitStringList(Cypher6Parser.StringListContext ctx);

    void exitStringLiteral(Cypher6Parser.StringLiteralContext ctx);

    void exitStringOrParameterExpression(Cypher6Parser.StringOrParameterExpressionContext ctx);

    void exitStringOrParameter(Cypher6Parser.StringOrParameterContext ctx);

    void exitMapOrParameter(Cypher6Parser.MapOrParameterContext ctx);

    void exitMap(Cypher6Parser.MapContext ctx);

    void exitSymbolicNameString(Cypher6Parser.SymbolicNameStringContext ctx);

    void exitEscapedSymbolicNameString(Cypher6Parser.EscapedSymbolicNameStringContext ctx);

    void exitUnescapedSymbolicNameString(Cypher6Parser.UnescapedSymbolicNameStringContext ctx);

    void exitSymbolicLabelNameString(Cypher6Parser.SymbolicLabelNameStringContext ctx);

    void exitUnescapedLabelSymbolicNameString(Cypher6Parser.UnescapedLabelSymbolicNameStringContext ctx);

    void exitEndOfFile(Cypher6Parser.EndOfFileContext ctx);
}
