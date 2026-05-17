// Generated from /home/rmpgm/Documents/ELP/Praticas/Projeto/src/main/ScriptGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScriptGrammarParser}.
 */
public interface ScriptGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScriptGrammarParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(ScriptGrammarParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptGrammarParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(ScriptGrammarParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ScriptGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ScriptGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptGrammarParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(ScriptGrammarParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptGrammarParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(ScriptGrammarParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptGrammarParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_(ScriptGrammarParser.Else_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptGrammarParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_(ScriptGrammarParser.Else_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptGrammarParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(ScriptGrammarParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptGrammarParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(ScriptGrammarParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptGrammarParser#shortcode}.
	 * @param ctx the parse tree
	 */
	void enterShortcode(ScriptGrammarParser.ShortcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptGrammarParser#shortcode}.
	 * @param ctx the parse tree
	 */
	void exitShortcode(ScriptGrammarParser.ShortcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptGrammarParser#access}.
	 * @param ctx the parse tree
	 */
	void enterAccess(ScriptGrammarParser.AccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptGrammarParser#access}.
	 * @param ctx the parse tree
	 */
	void exitAccess(ScriptGrammarParser.AccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ScriptGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ScriptGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(ScriptGrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(ScriptGrammarParser.ArgContext ctx);
}