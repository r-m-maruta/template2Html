// Generated from /home/rmpgm/Documents/ELP/Praticas/Projeto/src/main/ScriptGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScriptGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScriptGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScriptGrammarParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(ScriptGrammarParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptGrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ScriptGrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptGrammarParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(ScriptGrammarParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptGrammarParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_(ScriptGrammarParser.Else_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptGrammarParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(ScriptGrammarParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptGrammarParser#shortcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortcode(ScriptGrammarParser.ShortcodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptGrammarParser#access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess(ScriptGrammarParser.AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ScriptGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptGrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(ScriptGrammarParser.ArgContext ctx);
}