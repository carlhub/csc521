import java.awt.Label;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;


public class IR {
	private static ArrayList<String> buffer=new ArrayList<>();
	private static String className;
	private static String filename;
//	static private Label copyrightL = new Label("\u00a9");
	
	public static void init(final String f){
		className=f;
		filename=f+".java";		
	}
	public static void setup()
	{
		buffer.add("/* imports*/");
		buffer.add("public class "+className+" { ");
//		buffer.add( "public static void output(int a) { System.out.println(a); }");

		buffer.add("public static void main(String[] args){ ");		
	}
	public static void addCode(String line)
	{
		buffer.add( line );
	}
	public static void tearDown()
	{
		buffer.add("System.out.println(\"\\n\\nEnd of story / report\\nHistory  v.103\\n\"); "   );
		buffer.add("}/*main*/");
		buffer.add("}/*class "+className+" */");
		buffer.add("/*end*/");
	}
	public static void dump()
	{
		File file=new File(filename);
		try
		{
			PrintWriter out=new PrintWriter(file);
			for(String line: buffer)
			{
				out.println( line );
			}
			out.close();			
		}
		catch (Exception e)
		{
			System.out.println("\nError in writing file.\n");
		}		
	}
}
