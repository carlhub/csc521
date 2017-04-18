// Generated from History.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HistoryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HistoryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HistoryParser#history}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistory(HistoryParser.HistoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HistoryParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(HistoryParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HistoryParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(HistoryParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link HistoryParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(HistoryParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HistoryParser#idArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdArray(HistoryParser.IdArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HistoryParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(HistoryParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link HistoryParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(HistoryParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HistoryParser#actors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActors(HistoryParser.ActorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HistoryParser#actor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActor(HistoryParser.ActorContext ctx);
}