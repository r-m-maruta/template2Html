// Generated from /home/rmpgm/Documents/ELP/Praticas/Projeto/src/main/TemplateGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TemplateGrammarParser}.
 */
public interface TemplateGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TemplateGrammarParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(TemplateGrammarParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateGrammarParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(TemplateGrammarParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateGrammarParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(TemplateGrammarParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateGrammarParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(TemplateGrammarParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateGrammarParser#scriptContent}.
	 * @param ctx the parse tree
	 */
	void enterScriptContent(TemplateGrammarParser.ScriptContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateGrammarParser#scriptContent}.
	 * @param ctx the parse tree
	 */
	void exitScriptContent(TemplateGrammarParser.ScriptContentContext ctx);
}