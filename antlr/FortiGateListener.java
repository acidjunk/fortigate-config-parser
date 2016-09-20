// Generated from FortiGate.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FortiGateParser}.
 */
public interface FortiGateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#filler}.
	 * @param ctx the parse tree
	 */
	void enterFiller(FortiGateParser.FillerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#filler}.
	 * @param ctx the parse tree
	 */
	void exitFiller(FortiGateParser.FillerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(FortiGateParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(FortiGateParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(FortiGateParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(FortiGateParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(FortiGateParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(FortiGateParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(FortiGateParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(FortiGateParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(FortiGateParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(FortiGateParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(FortiGateParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(FortiGateParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#double_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quoted_string(FortiGateParser.Double_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#double_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quoted_string(FortiGateParser.Double_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#single_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quoted_string(FortiGateParser.Single_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#single_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quoted_string(FortiGateParser.Single_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FortiGateParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FortiGateParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(FortiGateParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(FortiGateParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(FortiGateParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(FortiGateParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#hash}.
	 * @param ctx the parse tree
	 */
	void enterHash(FortiGateParser.HashContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#hash}.
	 * @param ctx the parse tree
	 */
	void exitHash(FortiGateParser.HashContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#hashentries}.
	 * @param ctx the parse tree
	 */
	void enterHashentries(FortiGateParser.HashentriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#hashentries}.
	 * @param ctx the parse tree
	 */
	void exitHashentries(FortiGateParser.HashentriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiGateParser#hashentry}.
	 * @param ctx the parse tree
	 */
	void enterHashentry(FortiGateParser.HashentryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiGateParser#hashentry}.
	 * @param ctx the parse tree
	 */
	void exitHashentry(FortiGateParser.HashentryContext ctx);
}