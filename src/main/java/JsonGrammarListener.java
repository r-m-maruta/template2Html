// Generated from /home/rmpgm/Documents/ELP/Praticas/Projeto/src/main/JsonGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonGrammarParser}.
 */
public interface JsonGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonGrammarParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JsonGrammarParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonGrammarParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JsonGrammarParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JsonGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JsonGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JsonGrammarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JsonGrammarParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(JsonGrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(JsonGrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonGrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JsonGrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonGrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JsonGrammarParser.ArrayContext ctx);
}