// Generated from History.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HistoryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, CONCAT=15, DESCRIPTION=16, 
		ARRAYBRACKET=17, YEAR=18, MM=19, DD=20, DIGIT=21, NAME=22, WS=23;
	public static final int
		RULE_history = 0, RULE_prog = 1, RULE_print = 2, RULE_id = 3, RULE_idArray = 4, 
		RULE_event = 5, RULE_date = 6, RULE_actors = 7, RULE_actor = 8;
	public static final String[] ruleNames = {
		"history", "prog", "print", "id", "idArray", "event", "date", "actors", 
		"actor"
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

	@Override
	public String getGrammarFileName() { return "History.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HistoryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HistoryContext extends ParserRuleContext {
		public List<EventContext> event() {
			return getRuleContexts(EventContext.class);
		}
		public EventContext event(int i) {
			return getRuleContext(EventContext.class,i);
		}
		public HistoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_history; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).enterHistory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).exitHistory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HistoryVisitor ) return ((HistoryVisitor<? extends T>)visitor).visitHistory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HistoryContext history() throws RecognitionException {
		HistoryContext _localctx = new HistoryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_history);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				event();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HistoryParser.NAME, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<IdArrayContext> idArray() {
			return getRuleContexts(IdArrayContext.class);
		}
		public IdArrayContext idArray(int i) {
			return getRuleContext(IdArrayContext.class,i);
		}
		public List<EventContext> event() {
			return getRuleContexts(EventContext.class);
		}
		public EventContext event(int i) {
			return getRuleContext(EventContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HistoryVisitor ) return ((HistoryVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__0);
			setState(24);
			match(NAME);
			setState(25);
			match(T__1);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				setState(28);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(26);
					id();
					}
					break;
				case 2:
					{
					setState(27);
					idArray();
					}
					break;
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				event();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 );
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__4) {
				{
				{
				setState(38);
				print();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public List<TerminalNode> CONCAT() { return getTokens(HistoryParser.CONCAT); }
		public TerminalNode CONCAT(int i) {
			return getToken(HistoryParser.CONCAT, i);
		}
		public TerminalNode NAME() { return getToken(HistoryParser.NAME, 0); }
		public TerminalNode DESCRIPTION() { return getToken(HistoryParser.DESCRIPTION, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HistoryVisitor ) return ((HistoryVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(47);
			match(T__5);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPTION || _la==NAME) {
				{
				setState(48);
				_la = _input.LA(1);
				if ( !(_la==DESCRIPTION || _la==NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCAT) {
				{
				{
				setState(51);
				match(CONCAT);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(T__6);
			setState(58);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HistoryParser.NAME, 0); }
		public TerminalNode DESCRIPTION() { return getToken(HistoryParser.DESCRIPTION, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HistoryVisitor ) return ((HistoryVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__8);
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(62);
			match(NAME);
			setState(63);
			match(T__12);
			setState(64);
			match(DESCRIPTION);
			setState(65);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdArrayContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HistoryParser.NAME, 0); }
		public TerminalNode DESCRIPTION() { return getToken(HistoryParser.DESCRIPTION, 0); }
		public TerminalNode ARRAYBRACKET() { return getToken(HistoryParser.ARRAYBRACKET, 0); }
		public IdArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).enterIdArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).exitIdArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HistoryVisitor ) return ((HistoryVisitor<? extends T>)visitor).visitIdArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdArrayContext idArray() throws RecognitionException {
		IdArrayContext _localctx = new IdArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_idArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__8);
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAYBRACKET) {
				{
				setState(69);
				match(ARRAYBRACKET);
				}
			}

			setState(72);
			match(NAME);
			setState(73);
			match(T__12);
			setState(74);
			match(DESCRIPTION);
			setState(75);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventContext extends ParserRuleContext {
		public TerminalNode DESCRIPTION() { return getToken(HistoryParser.DESCRIPTION, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public ActorsContext actors() {
			return getRuleContext(ActorsContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HistoryVisitor ) return ((HistoryVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__13);
			setState(78);
			match(DESCRIPTION);
			setState(79);
			date();
			setState(80);
			actors();
			setState(81);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(HistoryParser.YEAR, 0); }
		public TerminalNode MM() { return getToken(HistoryParser.MM, 0); }
		public TerminalNode DD() { return getToken(HistoryParser.DD, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HistoryVisitor ) return ((HistoryVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_date);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(YEAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(YEAR);
				setState(85);
				match(MM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(YEAR);
				setState(87);
				match(MM);
				setState(88);
				match(DD);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActorsContext extends ParserRuleContext {
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
		}
		public ActorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).enterActors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).exitActors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HistoryVisitor ) return ((HistoryVisitor<? extends T>)visitor).visitActors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorsContext actors() throws RecognitionException {
		ActorsContext _localctx = new ActorsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_actors);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				actor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				actor();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(93);
					actor();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActorContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HistoryParser.NAME, 0); }
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HistoryListener ) ((HistoryListener)listener).exitActor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HistoryVisitor ) return ((HistoryVisitor<? extends T>)visitor).visitActor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_actor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\6"+
		"\3%\n\3\r\3\16\3&\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\3\4\3\4\3\4\5\4"+
		"\64\n\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\5\6I\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\\\n\b\3\t\3\t\3\t\7\ta\n\t\f\t\16\td"+
		"\13\t\5\tf\n\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\3\2\6\7\4\2"+
		"\22\22\30\30\3\2\f\16l\2\25\3\2\2\2\4\31\3\2\2\2\6\60\3\2\2\2\b>\3\2\2"+
		"\2\nE\3\2\2\2\fO\3\2\2\2\16[\3\2\2\2\20e\3\2\2\2\22g\3\2\2\2\24\26\5\f"+
		"\7\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2"+
		"\2\2\31\32\7\3\2\2\32\33\7\30\2\2\33 \7\4\2\2\34\37\5\b\5\2\35\37\5\n"+
		"\6\2\36\34\3\2\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!$"+
		"\3\2\2\2\" \3\2\2\2#%\5\f\7\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2"+
		"\'+\3\2\2\2(*\5\6\4\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2"+
		"\2-+\3\2\2\2./\7\5\2\2/\5\3\2\2\2\60\61\t\2\2\2\61\63\7\b\2\2\62\64\t"+
		"\3\2\2\63\62\3\2\2\2\63\64\3\2\2\2\648\3\2\2\2\65\67\7\21\2\2\66\65\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\t\2\2"+
		"<=\7\n\2\2=\7\3\2\2\2>?\7\13\2\2?@\t\4\2\2@A\7\30\2\2AB\7\17\2\2BC\7\22"+
		"\2\2CD\7\n\2\2D\t\3\2\2\2EF\7\13\2\2FH\t\4\2\2GI\7\23\2\2HG\3\2\2\2HI"+
		"\3\2\2\2IJ\3\2\2\2JK\7\30\2\2KL\7\17\2\2LM\7\22\2\2MN\7\n\2\2N\13\3\2"+
		"\2\2OP\7\20\2\2PQ\7\22\2\2QR\5\16\b\2RS\5\20\t\2ST\7\n\2\2T\r\3\2\2\2"+
		"U\\\7\24\2\2VW\7\24\2\2W\\\7\25\2\2XY\7\24\2\2YZ\7\25\2\2Z\\\7\26\2\2"+
		"[U\3\2\2\2[V\3\2\2\2[X\3\2\2\2\\\17\3\2\2\2]f\5\22\n\2^b\5\22\n\2_a\5"+
		"\22\n\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2e]"+
		"\3\2\2\2e^\3\2\2\2f\21\3\2\2\2gh\7\30\2\2h\23\3\2\2\2\r\27\36 &+\638H"+
		"[be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}