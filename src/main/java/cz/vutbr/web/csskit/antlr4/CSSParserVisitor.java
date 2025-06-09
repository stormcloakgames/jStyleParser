// Generated from CSSParser.g4 by ANTLR 4.13.2
package cz.vutbr.web.csskit.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSSParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSSParser#inlinestyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlinestyle(CSSParser.InlinestyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(CSSParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CSSParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#atstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtstatement(CSSParser.AtstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#import_uri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_uri(CSSParser.Import_uriContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(CSSParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#margin_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMargin_rule(CSSParser.Margin_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#inlineset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineset(CSSParser.InlinesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#media}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedia(CSSParser.MediaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#media_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedia_query(CSSParser.Media_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#media_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedia_term(CSSParser.Media_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#media_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedia_expression(CSSParser.Media_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#media_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedia_rule(CSSParser.Media_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#keyframes_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframes_name(CSSParser.Keyframes_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#keyframe_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframe_block(CSSParser.Keyframe_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#keyframe_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframe_selector(CSSParser.Keyframe_selectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#unknown_atrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknown_atrule(CSSParser.Unknown_atruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#unknown_atrule_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknown_atrule_body(CSSParser.Unknown_atrule_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleset(CSSParser.RulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(CSSParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CSSParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#important}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportant(CSSParser.ImportantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(CSSParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(CSSParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termValuePart}
	 * labeled alternative in {@link CSSParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermValuePart(CSSParser.TermValuePartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termInvalid}
	 * labeled alternative in {@link CSSParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermInvalid(CSSParser.TermInvalidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#funct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunct(CSSParser.FunctContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#valuepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuepart(CSSParser.ValuepartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#funct_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunct_args(CSSParser.Funct_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#funct_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunct_argument(CSSParser.Funct_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#combined_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombined_selector(CSSParser.Combined_selectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinator(CSSParser.CombinatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(CSSParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#selpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelpart(CSSParser.SelpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(CSSParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudo(CSSParser.PseudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CSSParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#bracketed_idents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketed_idents(CSSParser.Bracketed_identsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#ident_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_list_item(CSSParser.Ident_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(CSSParser.AnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#nostatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNostatement(CSSParser.NostatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#noprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoprop(CSSParser.NopropContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#norule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNorule(CSSParser.NoruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#nomediaquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomediaquery(CSSParser.NomediaqueryContext ctx);
}