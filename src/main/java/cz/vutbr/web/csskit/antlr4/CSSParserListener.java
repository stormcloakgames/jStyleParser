// Generated from CSSParser.g4 by ANTLR 4.13.2
package cz.vutbr.web.csskit.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSSParser}.
 */
public interface CSSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSSParser#inlinestyle}.
	 * @param ctx the parse tree
	 */
	void enterInlinestyle(CSSParser.InlinestyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#inlinestyle}.
	 * @param ctx the parse tree
	 */
	void exitInlinestyle(CSSParser.InlinestyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(CSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(CSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CSSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CSSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#atstatement}.
	 * @param ctx the parse tree
	 */
	void enterAtstatement(CSSParser.AtstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#atstatement}.
	 * @param ctx the parse tree
	 */
	void exitAtstatement(CSSParser.AtstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#import_uri}.
	 * @param ctx the parse tree
	 */
	void enterImport_uri(CSSParser.Import_uriContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#import_uri}.
	 * @param ctx the parse tree
	 */
	void exitImport_uri(CSSParser.Import_uriContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(CSSParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(CSSParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#margin_rule}.
	 * @param ctx the parse tree
	 */
	void enterMargin_rule(CSSParser.Margin_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#margin_rule}.
	 * @param ctx the parse tree
	 */
	void exitMargin_rule(CSSParser.Margin_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#inlineset}.
	 * @param ctx the parse tree
	 */
	void enterInlineset(CSSParser.InlinesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#inlineset}.
	 * @param ctx the parse tree
	 */
	void exitInlineset(CSSParser.InlinesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#media}.
	 * @param ctx the parse tree
	 */
	void enterMedia(CSSParser.MediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#media}.
	 * @param ctx the parse tree
	 */
	void exitMedia(CSSParser.MediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#media_query}.
	 * @param ctx the parse tree
	 */
	void enterMedia_query(CSSParser.Media_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#media_query}.
	 * @param ctx the parse tree
	 */
	void exitMedia_query(CSSParser.Media_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#media_term}.
	 * @param ctx the parse tree
	 */
	void enterMedia_term(CSSParser.Media_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#media_term}.
	 * @param ctx the parse tree
	 */
	void exitMedia_term(CSSParser.Media_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#media_expression}.
	 * @param ctx the parse tree
	 */
	void enterMedia_expression(CSSParser.Media_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#media_expression}.
	 * @param ctx the parse tree
	 */
	void exitMedia_expression(CSSParser.Media_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#media_rule}.
	 * @param ctx the parse tree
	 */
	void enterMedia_rule(CSSParser.Media_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#media_rule}.
	 * @param ctx the parse tree
	 */
	void exitMedia_rule(CSSParser.Media_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#keyframes_name}.
	 * @param ctx the parse tree
	 */
	void enterKeyframes_name(CSSParser.Keyframes_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#keyframes_name}.
	 * @param ctx the parse tree
	 */
	void exitKeyframes_name(CSSParser.Keyframes_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#keyframe_block}.
	 * @param ctx the parse tree
	 */
	void enterKeyframe_block(CSSParser.Keyframe_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#keyframe_block}.
	 * @param ctx the parse tree
	 */
	void exitKeyframe_block(CSSParser.Keyframe_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#keyframe_selector}.
	 * @param ctx the parse tree
	 */
	void enterKeyframe_selector(CSSParser.Keyframe_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#keyframe_selector}.
	 * @param ctx the parse tree
	 */
	void exitKeyframe_selector(CSSParser.Keyframe_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#unknown_atrule}.
	 * @param ctx the parse tree
	 */
	void enterUnknown_atrule(CSSParser.Unknown_atruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#unknown_atrule}.
	 * @param ctx the parse tree
	 */
	void exitUnknown_atrule(CSSParser.Unknown_atruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#unknown_atrule_body}.
	 * @param ctx the parse tree
	 */
	void enterUnknown_atrule_body(CSSParser.Unknown_atrule_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#unknown_atrule_body}.
	 * @param ctx the parse tree
	 */
	void exitUnknown_atrule_body(CSSParser.Unknown_atrule_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterRuleset(CSSParser.RulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitRuleset(CSSParser.RulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(CSSParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(CSSParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CSSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CSSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#important}.
	 * @param ctx the parse tree
	 */
	void enterImportant(CSSParser.ImportantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#important}.
	 * @param ctx the parse tree
	 */
	void exitImportant(CSSParser.ImportantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(CSSParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(CSSParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(CSSParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(CSSParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termValuePart}
	 * labeled alternative in {@link CSSParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermValuePart(CSSParser.TermValuePartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termValuePart}
	 * labeled alternative in {@link CSSParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermValuePart(CSSParser.TermValuePartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termInvalid}
	 * labeled alternative in {@link CSSParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermInvalid(CSSParser.TermInvalidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termInvalid}
	 * labeled alternative in {@link CSSParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermInvalid(CSSParser.TermInvalidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#funct}.
	 * @param ctx the parse tree
	 */
	void enterFunct(CSSParser.FunctContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#funct}.
	 * @param ctx the parse tree
	 */
	void exitFunct(CSSParser.FunctContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#valuepart}.
	 * @param ctx the parse tree
	 */
	void enterValuepart(CSSParser.ValuepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#valuepart}.
	 * @param ctx the parse tree
	 */
	void exitValuepart(CSSParser.ValuepartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#funct_args}.
	 * @param ctx the parse tree
	 */
	void enterFunct_args(CSSParser.Funct_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#funct_args}.
	 * @param ctx the parse tree
	 */
	void exitFunct_args(CSSParser.Funct_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#funct_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunct_argument(CSSParser.Funct_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#funct_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunct_argument(CSSParser.Funct_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#combined_selector}.
	 * @param ctx the parse tree
	 */
	void enterCombined_selector(CSSParser.Combined_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#combined_selector}.
	 * @param ctx the parse tree
	 */
	void exitCombined_selector(CSSParser.Combined_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinator(CSSParser.CombinatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinator(CSSParser.CombinatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(CSSParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(CSSParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#selpart}.
	 * @param ctx the parse tree
	 */
	void enterSelpart(CSSParser.SelpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#selpart}.
	 * @param ctx the parse tree
	 */
	void exitSelpart(CSSParser.SelpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(CSSParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(CSSParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudo(CSSParser.PseudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudo(CSSParser.PseudoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(CSSParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(CSSParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#bracketed_idents}.
	 * @param ctx the parse tree
	 */
	void enterBracketed_idents(CSSParser.Bracketed_identsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#bracketed_idents}.
	 * @param ctx the parse tree
	 */
	void exitBracketed_idents(CSSParser.Bracketed_identsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#ident_list_item}.
	 * @param ctx the parse tree
	 */
	void enterIdent_list_item(CSSParser.Ident_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#ident_list_item}.
	 * @param ctx the parse tree
	 */
	void exitIdent_list_item(CSSParser.Ident_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(CSSParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(CSSParser.AnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#nostatement}.
	 * @param ctx the parse tree
	 */
	void enterNostatement(CSSParser.NostatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#nostatement}.
	 * @param ctx the parse tree
	 */
	void exitNostatement(CSSParser.NostatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#noprop}.
	 * @param ctx the parse tree
	 */
	void enterNoprop(CSSParser.NopropContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#noprop}.
	 * @param ctx the parse tree
	 */
	void exitNoprop(CSSParser.NopropContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#norule}.
	 * @param ctx the parse tree
	 */
	void enterNorule(CSSParser.NoruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#norule}.
	 * @param ctx the parse tree
	 */
	void exitNorule(CSSParser.NoruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#nomediaquery}.
	 * @param ctx the parse tree
	 */
	void enterNomediaquery(CSSParser.NomediaqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#nomediaquery}.
	 * @param ctx the parse tree
	 */
	void exitNomediaquery(CSSParser.NomediaqueryContext ctx);
}