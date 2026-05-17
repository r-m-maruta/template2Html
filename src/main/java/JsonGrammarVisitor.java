// Generated from /home/rmpgm/Documents/ELP/Praticas/Projeto/src/main/JsonGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonGrammarParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JsonGrammarParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JsonGrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonGrammarParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(JsonGrammarParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonGrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(JsonGrammarParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonGrammarParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JsonGrammarParser.ArrayContext ctx);
}