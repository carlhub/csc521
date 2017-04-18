// Generated from History.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HistoryParser}.
 */
public interface HistoryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HistoryParser#history}.
	 * @param ctx the parse tree
	 */
	void enterHistory(HistoryParser.HistoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HistoryParser#history}.
	 * @param ctx the parse tree
	 */
	void exitHistory(HistoryParser.HistoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HistoryParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(HistoryParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HistoryParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(HistoryParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HistoryParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(HistoryParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HistoryParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(HistoryParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HistoryParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(HistoryParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link HistoryParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(HistoryParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link HistoryParser#idArray}.
	 * @param ctx the parse tree
	 */
	void enterIdArray(HistoryParser.IdArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HistoryParser#idArray}.
	 * @param ctx the parse tree
	 */
	void exitIdArray(HistoryParser.IdArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HistoryParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(HistoryParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link HistoryParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(HistoryParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link HistoryParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(HistoryParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HistoryParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(HistoryParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HistoryParser#actors}.
	 * @param ctx the parse tree
	 */
	void enterActors(HistoryParser.ActorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HistoryParser#actors}.
	 * @param ctx the parse tree
	 */
	void exitActors(HistoryParser.ActorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HistoryParser#actor}.
	 * @param ctx the parse tree
	 */
	void enterActor(HistoryParser.ActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HistoryParser#actor}.
	 * @param ctx the parse tree
	 */
	void exitActor(HistoryParser.ActorContext ctx);
}