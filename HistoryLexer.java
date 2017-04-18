// Generated from History.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HistoryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, CONCAT=15, DESCRIPTION=16, 
		ARRAYBRACKET=17, YEAR=18, MM=19, DD=20, DIGIT=21, NAME=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "CONCAT", "DESCRIPTION", "ARRAYBRACKET", 
		"YEAR", "MM", "DD", "DIGIT", "NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'history'", "'{'", "'}'", "'print'", "'report'", "'('", "')'", 
		"';'", "'new'", "'Actor'", "'Date'", "'Event'", "'='", "'event'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "CONCAT", "DESCRIPTION", "ARRAYBRACKET", "YEAR", "MM", 
		"DD", "DIGIT", "NAME", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public HistoryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "History.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00be\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20q\n\20\3\21"+
		"\3\21\6\21u\n\21\r\21\16\21v\3\21\7\21z\n\21\f\21\16\21}\13\21\3\21\3"+
		"\21\3\22\3\22\5\22\u0083\n\22\3\22\3\22\3\22\3\22\7\22\u0089\n\22\f\22"+
		"\16\22\u008c\13\22\3\22\5\22\u008f\n\22\3\23\3\23\5\23\u0093\n\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00a0\n\24\3\25"+
		"\3\25\3\25\3\25\5\25\u00a6\n\25\3\26\3\26\3\27\3\27\6\27\u00ac\n\27\r"+
		"\27\16\27\u00ad\3\27\7\27\u00b1\n\27\f\27\16\27\u00b4\13\27\3\27\3\27"+
		"\3\30\6\30\u00b9\n\30\r\30\16\30\u00ba\3\30\3\30\2\2\31\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\3\2\16\5\2C\\aac|\6\2\"\"\62;C\\c|\3\2\63;\3"+
		"\2\62;\3\2\63\64\4\2\62\62:;\3\2\62\62\3\2\63\63\3\2\62\64\3\2\65\65\3"+
		"\2\62\63\5\2\13\f\17\17\"\"\u00c8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\59\3\2\2\2\7;\3\2\2\2"+
		"\t=\3\2\2\2\13C\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2"+
		"\25T\3\2\2\2\27Z\3\2\2\2\31_\3\2\2\2\33e\3\2\2\2\35g\3\2\2\2\37m\3\2\2"+
		"\2!r\3\2\2\2#\u008e\3\2\2\2%\u0090\3\2\2\2\'\u009f\3\2\2\2)\u00a5\3\2"+
		"\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00b8\3\2\2\2\61\62\7j\2\2\62\63\7"+
		"k\2\2\63\64\7u\2\2\64\65\7v\2\2\65\66\7q\2\2\66\67\7t\2\2\678\7{\2\28"+
		"\4\3\2\2\29:\7}\2\2:\6\3\2\2\2;<\7\177\2\2<\b\3\2\2\2=>\7r\2\2>?\7t\2"+
		"\2?@\7k\2\2@A\7p\2\2AB\7v\2\2B\n\3\2\2\2CD\7t\2\2DE\7g\2\2EF\7r\2\2FG"+
		"\7q\2\2GH\7t\2\2HI\7v\2\2I\f\3\2\2\2JK\7*\2\2K\16\3\2\2\2LM\7+\2\2M\20"+
		"\3\2\2\2NO\7=\2\2O\22\3\2\2\2PQ\7p\2\2QR\7g\2\2RS\7y\2\2S\24\3\2\2\2T"+
		"U\7C\2\2UV\7e\2\2VW\7v\2\2WX\7q\2\2XY\7t\2\2Y\26\3\2\2\2Z[\7F\2\2[\\\7"+
		"c\2\2\\]\7v\2\2]^\7g\2\2^\30\3\2\2\2_`\7G\2\2`a\7x\2\2ab\7g\2\2bc\7p\2"+
		"\2cd\7v\2\2d\32\3\2\2\2ef\7?\2\2f\34\3\2\2\2gh\7g\2\2hi\7x\2\2ij\7g\2"+
		"\2jk\7p\2\2kl\7v\2\2l\36\3\2\2\2mp\7-\2\2nq\5-\27\2oq\5!\21\2pn\3\2\2"+
		"\2po\3\2\2\2q \3\2\2\2rt\7$\2\2su\t\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2"+
		"\2vw\3\2\2\2w{\3\2\2\2xz\t\3\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|~\3\2\2\2}{\3\2\2\2~\177\7$\2\2\177\"\3\2\2\2\u0080\u0082\7]\2\2\u0081"+
		"\u0083\t\4\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u008f\7_\2\2\u0085\u0086\7]\2\2\u0086\u008a\t\4\2\2\u0087\u0089"+
		"\t\5\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\7_"+
		"\2\2\u008e\u0080\3\2\2\2\u008e\u0085\3\2\2\2\u008f$\3\2\2\2\u0090\u0092"+
		"\t\6\2\2\u0091\u0093\t\7\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\5+\26\2\u0095\u0096\5+\26\2\u0096&\3\2\2\2\u0097\u0098\7/\2\2\u0098"+
		"\u0099\t\b\2\2\u0099\u009a\t\4\2\2\u009a\u00a0\7/\2\2\u009b\u009c\7/\2"+
		"\2\u009c\u009d\t\t\2\2\u009d\u009e\t\n\2\2\u009e\u00a0\7/\2\2\u009f\u0097"+
		"\3\2\2\2\u009f\u009b\3\2\2\2\u00a0(\3\2\2\2\u00a1\u00a2\t\n\2\2\u00a2"+
		"\u00a6\t\5\2\2\u00a3\u00a4\t\13\2\2\u00a4\u00a6\t\f\2\2\u00a5\u00a1\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a6*\3\2\2\2\u00a7\u00a8\t\5\2\2\u00a8,\3"+
		"\2\2\2\u00a9\u00ab\7*\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b2\3\2"+
		"\2\2\u00af\u00b1\t\3\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b6\7+\2\2\u00b6.\3\2\2\2\u00b7\u00b9\t\r\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\b\30\2\2\u00bd\60\3\2\2\2\21\2pvy{\u0082\u008a"+
		"\u008e\u0092\u009f\u00a5\u00ad\u00b0\u00b2\u00ba\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}