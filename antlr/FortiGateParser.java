// Generated from FortiGate.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FortiGateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ID=18, DIGIT=19, WS=20, NEWLINE=21, INT=22;
	public static final int
		RULE_filler = 0, RULE_comment = 1, RULE_config = 2, RULE_section = 3, 
		RULE_attribute = 4, RULE_name = 5, RULE_string = 6, RULE_double_quoted_string = 7, 
		RULE_single_quoted_string = 8, RULE_value = 9, RULE_number = 10, RULE_array = 11, 
		RULE_hash = 12, RULE_hashentries = 13, RULE_hashentry = 14;
	public static final String[] ruleNames = {
		"filler", "comment", "config", "section", "attribute", "name", "string", 
		"double_quoted_string", "single_quoted_string", "value", "number", "array", 
		"hash", "hashentries", "hashentry"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'\r'", "'\n'", "'edit'", "'next'", "'set'", "'\"'", "'\\\"'", 
		"'''", "'-'", "'.'", "'['", "','", "']'", "'{'", "'}'", "'=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ID", "DIGIT", "WS", "NEWLINE", "INT"
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
	public String getGrammarFileName() { return "FortiGate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FortiGateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FillerContext extends ParserRuleContext {
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(FortiGateParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FortiGateParser.WS, i);
		}
		public FillerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterFiller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitFiller(this);
		}
	}

	public final FillerContext filler() throws RecognitionException {
		FillerContext _localctx = new FillerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_filler);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(32);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(30);
						comment();
						}
						break;
					case 2:
						{
						setState(31);
						match(WS);
						}
						break;
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
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

	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(FortiGateParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FortiGateParser.WS, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(38);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(37);
						match(WS);
						}
					}

					setState(40);
					match(T__0);
					setState(44);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(41);
							matchWildcard();
							}
							} 
						}
						setState(46);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					}
					setState(48);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(47);
						match(T__1);
						}
					}

					setState(50);
					match(T__2);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ConfigContext extends ParserRuleContext {
		public List<FillerContext> filler() {
			return getRuleContexts(FillerContext.class);
		}
		public FillerContext filler(int i) {
			return getRuleContext(FillerContext.class,i);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitConfig(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			filler();
			setState(56);
			section();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << WS))) != 0)) {
				{
				{
				setState(57);
				filler();
				setState(58);
				section();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SectionContext extends ParserRuleContext {
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(65);
				match(T__3);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(T__4);
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

	public static class AttributeContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__5);
			setState(74);
			string();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << ID) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(75);
				value();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FortiGateParser.ID, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_name);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(ID);
				}
				break;
			case T__6:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StringContext extends ParserRuleContext {
		public Double_quoted_stringContext double_quoted_string() {
			return getRuleContext(Double_quoted_stringContext.class,0);
		}
		public Single_quoted_stringContext single_quoted_string() {
			return getRuleContext(Single_quoted_stringContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string);
		try {
			setState(87);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				double_quoted_string();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				single_quoted_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Double_quoted_stringContext extends ParserRuleContext {
		public Double_quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_quoted_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterDouble_quoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitDouble_quoted_string(this);
		}
	}

	public final Double_quoted_stringContext double_quoted_string() throws RecognitionException {
		Double_quoted_stringContext _localctx = new Double_quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_double_quoted_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__6);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(90);
						match(T__7);
						}
						break;
					case 2:
						{
						setState(91);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(97);
			match(T__6);
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

	public static class Single_quoted_stringContext extends ParserRuleContext {
		public Single_quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_quoted_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterSingle_quoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitSingle_quoted_string(this);
		}
	}

	public final Single_quoted_stringContext single_quoted_string() throws RecognitionException {
		Single_quoted_stringContext _localctx = new Single_quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_single_quoted_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__8);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(100);
					matchWildcard();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(106);
			match(T__8);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FortiGateParser.ID, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public HashContext hash() {
			return getRuleContext(HashContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(ID);
				}
				break;
			case T__6:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				string();
				}
				break;
			case T__9:
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				number();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				array();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				hash();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(FortiGateParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(FortiGateParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(115);
				match(T__9);
				}
			}

			setState(119); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(118);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(121); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(130);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(123);
				match(T__10);
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(124);
						match(DIGIT);
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
			}

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

	public static class ArrayContext extends ParserRuleContext {
		public List<FillerContext> filler() {
			return getRuleContexts(FillerContext.class);
		}
		public FillerContext filler(int i) {
			return getRuleContext(FillerContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__11);
			setState(133);
			filler();
			setState(145);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << ID) | (1L << DIGIT))) != 0)) {
				{
				setState(134);
				value();
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(135);
						filler();
						setState(136);
						match(T__12);
						setState(137);
						filler();
						setState(138);
						value();
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
			}

			setState(147);
			filler();
			setState(148);
			match(T__13);
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

	public static class HashContext extends ParserRuleContext {
		public List<FillerContext> filler() {
			return getRuleContexts(FillerContext.class);
		}
		public FillerContext filler(int i) {
			return getRuleContext(FillerContext.class,i);
		}
		public HashentriesContext hashentries() {
			return getRuleContext(HashentriesContext.class,0);
		}
		public HashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitHash(this);
		}
	}

	public final HashContext hash() throws RecognitionException {
		HashContext _localctx = new HashContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__14);
			setState(151);
			filler();
			setState(153);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << ID))) != 0)) {
				{
				setState(152);
				hashentries();
				}
			}

			setState(155);
			filler();
			setState(156);
			match(T__15);
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

	public static class HashentriesContext extends ParserRuleContext {
		public List<HashentryContext> hashentry() {
			return getRuleContexts(HashentryContext.class);
		}
		public HashentryContext hashentry(int i) {
			return getRuleContext(HashentryContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(FortiGateParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FortiGateParser.WS, i);
		}
		public HashentriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashentries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterHashentries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitHashentries(this);
		}
	}

	public final HashentriesContext hashentries() throws RecognitionException {
		HashentriesContext _localctx = new HashentriesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_hashentries);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			hashentry();
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(WS);
					setState(160);
					hashentry();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
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

	public static class HashentryContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<FillerContext> filler() {
			return getRuleContexts(FillerContext.class);
		}
		public FillerContext filler(int i) {
			return getRuleContext(FillerContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public HashentryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashentry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).enterHashentry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiGateListener ) ((FortiGateListener)listener).exitHashentry(this);
		}
	}

	public final HashentryContext hashentry() throws RecognitionException {
		HashentryContext _localctx = new HashentryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_hashentry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			name();
			setState(167);
			filler();
			setState(168);
			match(T__16);
			setState(169);
			filler();
			setState(170);
			value();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00af\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\3\5\3)\n\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\5\3\63"+
		"\n\3\3\3\6\3\66\n\3\r\3\16\3\67\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4"+
		"B\13\4\3\5\7\5E\n\5\f\5\16\5H\13\5\3\5\3\5\3\6\3\6\3\6\7\6O\n\6\f\6\16"+
		"\6R\13\6\3\7\3\7\5\7V\n\7\3\b\3\b\5\bZ\n\b\3\t\3\t\3\t\7\t_\n\t\f\t\16"+
		"\tb\13\t\3\t\3\t\3\n\3\n\7\nh\n\n\f\n\16\nk\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\5\13t\n\13\3\f\5\fw\n\f\3\f\6\fz\n\f\r\f\16\f{\3\f\3\f\7\f"+
		"\u0080\n\f\f\f\16\f\u0083\13\f\5\f\u0085\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u008f\n\r\f\r\16\r\u0092\13\r\5\r\u0094\n\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\5\16\u009c\n\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00a4\n"+
		"\17\f\17\16\17\u00a7\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5.`i\2\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\u00b9\2$\3\2\2\2\4\65\3\2"+
		"\2\2\69\3\2\2\2\bF\3\2\2\2\nK\3\2\2\2\fU\3\2\2\2\16Y\3\2\2\2\20[\3\2\2"+
		"\2\22e\3\2\2\2\24s\3\2\2\2\26v\3\2\2\2\30\u0086\3\2\2\2\32\u0098\3\2\2"+
		"\2\34\u00a0\3\2\2\2\36\u00a8\3\2\2\2 #\5\4\3\2!#\7\26\2\2\" \3\2\2\2\""+
		"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2\2\2\')\7\26"+
		"\2\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*.\7\3\2\2+-\13\2\2\2,+\3\2\2\2-\60"+
		"\3\2\2\2./\3\2\2\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61\63\7\4\2\2\62"+
		"\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\66\7\5\2\2\65(\3\2\2\2\66\67"+
		"\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\5\3\2\2\29:\5\2\2\2:@\5\b\5\2;<\5"+
		"\2\2\2<=\5\b\5\2=?\3\2\2\2>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\7"+
		"\3\2\2\2B@\3\2\2\2CE\7\6\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G"+
		"I\3\2\2\2HF\3\2\2\2IJ\7\7\2\2J\t\3\2\2\2KL\7\b\2\2LP\5\16\b\2MO\5\24\13"+
		"\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\13\3\2\2\2RP\3\2\2\2SV\7\24"+
		"\2\2TV\5\16\b\2US\3\2\2\2UT\3\2\2\2V\r\3\2\2\2WZ\5\20\t\2XZ\5\22\n\2Y"+
		"W\3\2\2\2YX\3\2\2\2Z\17\3\2\2\2[`\7\t\2\2\\_\7\n\2\2]_\13\2\2\2^\\\3\2"+
		"\2\2^]\3\2\2\2_b\3\2\2\2`a\3\2\2\2`^\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\t"+
		"\2\2d\21\3\2\2\2ei\7\13\2\2fh\13\2\2\2gf\3\2\2\2hk\3\2\2\2ij\3\2\2\2i"+
		"g\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\13\2\2m\23\3\2\2\2nt\7\24\2\2ot\5\16"+
		"\b\2pt\5\26\f\2qt\5\30\r\2rt\5\32\16\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2s"+
		"q\3\2\2\2sr\3\2\2\2t\25\3\2\2\2uw\7\f\2\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2"+
		"\2xz\7\25\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0084\3\2\2\2}"+
		"\u0081\7\r\2\2~\u0080\7\25\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0084}\3\2\2\2\u0084\u0085\3\2\2\2\u0085\27\3\2\2\2\u0086\u0087\7\16"+
		"\2\2\u0087\u0093\5\2\2\2\u0088\u0090\5\24\13\2\u0089\u008a\5\2\2\2\u008a"+
		"\u008b\7\17\2\2\u008b\u008c\5\2\2\2\u008c\u008d\5\24\13\2\u008d\u008f"+
		"\3\2\2\2\u008e\u0089\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0088\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\5\2\2\2\u0096"+
		"\u0097\7\20\2\2\u0097\31\3\2\2\2\u0098\u0099\7\21\2\2\u0099\u009b\5\2"+
		"\2\2\u009a\u009c\5\34\17\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\5\2\2\2\u009e\u009f\7\22\2\2\u009f\33\3\2\2"+
		"\2\u00a0\u00a5\5\36\20\2\u00a1\u00a2\7\26\2\2\u00a2\u00a4\5\36\20\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\35\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\f\7\2\u00a9\u00aa"+
		"\5\2\2\2\u00aa\u00ab\7\23\2\2\u00ab\u00ac\5\2\2\2\u00ac\u00ad\5\24\13"+
		"\2\u00ad\37\3\2\2\2\31\"$(.\62\67@FPUY^`isv{\u0081\u0084\u0090\u0093\u009b"+
		"\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}