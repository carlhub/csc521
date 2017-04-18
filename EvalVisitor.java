import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends HistoryBaseVisitor<Integer> {
	Map<String,Integer> symTable=new HashMap<String, Integer>();	
	
	public boolean checkTable(String id)
	{
		/*code inject*/		
		//String id = ctx.NAME().getText();
		int count=0;
		System.out.println("TABLE_VISIT. ID_NAME="+id);		
		for(String key: symTable.keySet() )/*check*/
		{						
			if(id.equals( key ))
			{
				System.out.println("count="+( count )+" key="+key+", id="+id);
				System.out.println("ERROR. Duplicate_ID_IN_TABLE.");
				//System.exit(0);
			}
			count++;
		}	
		return true;
	}

	@Override public Integer visitHistory(HistoryParser.HistoryContext ctx) 
	{	
		System.out.println("Create a \"History\".");
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitProg(HistoryParser.ProgContext ctx) 
	{ 
		System.out.println("Programm rule visited.");
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitPrint(HistoryParser.PrintContext ctx) 
	{
		System.out.println("Printing report.");
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitId(HistoryParser.IdContext ctx) 
	{
		/*code inject*/		
		String id = ctx.NAME().getText();
		System.out.println("ID_VISIT. ID_NAME="+id);		
		if(checkTable(id))
			symTable.put(id, null);
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitIdArray(HistoryParser.IdArrayContext ctx) 
	{ 
		/*code inject*/
		String id=ctx.NAME().getText();
		System.out.println("ID_ARRAY_VISIT. ID_ARRY_NAME="+id);
		if(checkTable(id))/*check*/
			symTable.put(id, null);
		
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitEvent(HistoryParser.EventContext ctx) 
	{ 
		/*code inject*/
		//String id=ctx.
		System.out.println("\"event\" detected.");
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitDate(HistoryParser.DateContext ctx) 
	{ 
		/*code inject*/
		System.out.println("DATE_VISIT__");
		String id=ctx.YEAR().getText();
		int year = Integer.parseInt(id);
		//Integer numb1=new Integer();
		if(year<1891)
			System.out.println("ERROR. YEAR_INVALID_OLD="+ year);
		else
			System.out.println("YEAR___"+year);
		
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitActors(HistoryParser.ActorsContext ctx) 
	{ 
		/*code inject*/
		//String id=ctx.`
		System.out.println("Potentials \"Actors\".");
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitActor(HistoryParser.ActorContext ctx) 
	{ 
		/*code inject*/
		String id=ctx.NAME().getText();
		if(checkTable(id))
		{
			System.out.println("ACTOR_ID_ADD="+id);
			symTable.put(id, null);
		}
		System.out.println("an \"Actor\" has been identified. ");
		return visitChildren(ctx); 
	}
	
}

//import java.util.HashMap;
//import java.util.Map;
//
//
//public class EvalVisitor extends LibExprBaseVisitor<Integer> {
//	Map<String,Integer> symTable = new HashMap<String, Integer>();
//	
//	@Override
//	public Integer visitIntDeclation(LabeledExprParser.IntDeclationContext ctx) {
//		String id = ctx.ID().getText();
//		symTable.put(id, null);
//		
//		/* code injection */
//		IR.addCode( "int " + id + ";");
//		return 0;
//	}
//	
//	public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
//		String id = ctx.ID().getText();
//		
//		if (!symTable.containsKey(id)) {
//			System.out.println("undeclared variable " + id);
//			System.exit(-1);
//		}
//		
//		int value = visit(ctx.expr()); // why does visit gets you the value assignment?!?
//		symTable.put(id, value);
//		
//		/* code injection */
//		IR.addCode( id + " = " + value + ";" );
//		
//		return value;
//	}
//	
//	public Integer visitInt(LabeledExprParser.IntContext ctx) {
//		return Integer.valueOf(ctx.INT().getText());
//	}
//	
//	public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
//		Integer value = visit(ctx.expr());
//		// System.out.println(value);
//		
//		// code injection
//		IR.addCode( "output(" + value + ");" );
//		return 0;
//	}
//	
//	public Integer visitId(LabeledExprParser.IdContext ctx) {
//		String id = ctx.ID().getText();
//		if (symTable.containsKey(id)) {
//			return symTable.get(id);
//		}
//		return 0;
//	}
//	
//	public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
//		int left = 0; // visit(ctx.expr(0));
//		int right = 1; // visit(ctx.expr(1));
//	
//		String leftStr = ctx.expr(0).getText();
//		String rightStr = ctx.expr(1).getText();
//
//		if ( ctx.op.getType() == LabeledExprParser.MUL) {
//			// IR.addCode( left + " * " + right + ";");
//			IR.addCode( "output(" +  leftStr + " * " + rightStr +  ");");
//			return left * right;
//		} else {
//			// IR.addCode( left + " / " + right + ";");
//			IR.addCode( "output(" +  leftStr + " / " + rightStr +  ");");
//			return left / right;
//		}
//	}
//	
//	public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
//		int left = 0; // visit(ctx.expr(0));
//		int right = 0; // visit(ctx.expr(1));
//	
//		String leftStr = ctx.expr(0).getText();
//		String rightStr = ctx.expr(1).getText();
//		
//		if ( ctx.op.getType() == LabeledExprParser.ADD) {
//			IR.addCode( "output(" +  leftStr + " + " + rightStr +  ");");
//			return left + right;
//		} else {
//			// IR.addCode( left + " - " + right + ";");
//			IR.addCode( "output(" +  leftStr + " - " + rightStr +  ";");
//			return left - right;
//		}
//	}
//	
//	public Integer visitParens(LabeledExprParser.ParensContext ctx) {
//		return visit(ctx.expr());
//	}
//}
