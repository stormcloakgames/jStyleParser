// Generated from CSSParser.g4 by ANTLR 4.13.2
package cz.vutbr.web.csskit.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STYLESHEET=1, INLINESTYLE=2, ATBLOCK=3, CURLYBLOCK=4, PARENBLOCK=5, BRACKETBLOCK=6, 
		RULE=7, SELECTOR=8, ELEMENT=9, PSEUDOCLASS=10, PSEUDOELEM=11, ADJACENT=12, 
		PRECEDING=13, CHILD=14, DESCENDANT=15, ATTRIBUTE=16, SET=17, DECLARATION=18, 
		VALUE=19, MEDIA_QUERY=20, INVALID_STRING=21, INVALID_SELECTOR=22, INVALID_SELPART=23, 
		INVALID_DECLARATION=24, INVALID_STATEMENT=25, INVALID_ATSTATEMENT=26, 
		INVALID_IMPORT=27, INVALID_DIRECTIVE=28, IMPORTANT=29, IDENT=30, CHARSET=31, 
		IMPORT=32, KEYFRAMES=33, MEDIA=34, PAGE=35, MARGIN_AREA=36, VIEWPORT=37, 
		FONTFACE=38, ATKEYWORD=39, CLASSKEYWORD=40, STRING=41, UNCLOSED_STRING=42, 
		HASH=43, INDEX=44, NUMBER=45, PERCENTAGE=46, DIMENSION=47, URI=48, UNCLOSED_URI=49, 
		UNIRANGE=50, CDO=51, CDC=52, SEMICOLON=53, COLON=54, COMMA=55, QUESTION=56, 
		PERCENT=57, EQUALS=58, SLASH=59, GREATER=60, LESS=61, LCURLY=62, RCURLY=63, 
		APOS=64, QUOT=65, LPAREN=66, RPAREN=67, LBRACKET=68, RBRACKET=69, EXCLAMATION=70, 
		TILDE=71, MINUS=72, PLUS=73, ASTERISK=74, POUND=75, AMPERSAND=76, HAT=77, 
		S=78, COMMENT=79, SL_COMMENT=80, EXPRESSION=81, FUNCTION=82, INCLUDES=83, 
		DASHMATCH=84, STARTSWITH=85, ENDSWITH=86, CONTAINS=87, CTRL=88, INVALID_TOKEN=89, 
		STRING_MACR=90, UNCLOSED_STRING_MACR=91, STRING_CHAR=92;
	public static final int
		RULE_inlinestyle = 0, RULE_stylesheet = 1, RULE_statement = 2, RULE_atstatement = 3, 
		RULE_import_uri = 4, RULE_page = 5, RULE_margin_rule = 6, RULE_inlineset = 7, 
		RULE_media = 8, RULE_media_query = 9, RULE_media_term = 10, RULE_media_expression = 11, 
		RULE_media_rule = 12, RULE_keyframes_name = 13, RULE_keyframe_block = 14, 
		RULE_keyframe_selector = 15, RULE_unknown_atrule = 16, RULE_unknown_atrule_body = 17, 
		RULE_ruleset = 18, RULE_declarations = 19, RULE_declaration = 20, RULE_important = 21, 
		RULE_property = 22, RULE_terms = 23, RULE_term = 24, RULE_funct = 25, 
		RULE_valuepart = 26, RULE_funct_args = 27, RULE_funct_argument = 28, RULE_combined_selector = 29, 
		RULE_combinator = 30, RULE_selector = 31, RULE_selpart = 32, RULE_attribute = 33, 
		RULE_pseudo = 34, RULE_string = 35, RULE_bracketed_idents = 36, RULE_ident_list_item = 37, 
		RULE_any = 38, RULE_nostatement = 39, RULE_noprop = 40, RULE_norule = 41, 
		RULE_nomediaquery = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"inlinestyle", "stylesheet", "statement", "atstatement", "import_uri", 
			"page", "margin_rule", "inlineset", "media", "media_query", "media_term", 
			"media_expression", "media_rule", "keyframes_name", "keyframe_block", 
			"keyframe_selector", "unknown_atrule", "unknown_atrule_body", "ruleset", 
			"declarations", "declaration", "important", "property", "terms", "term", 
			"funct", "valuepart", "funct_args", "funct_argument", "combined_selector", 
			"combinator", "selector", "selpart", "attribute", "pseudo", "string", 
			"bracketed_idents", "ident_list_item", "any", "nostatement", "noprop", 
			"norule", "nomediaquery"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'important'", null, null, "'@import'", 
			"'@keyframes'", "'@media'", "'@page'", null, "'@viewport'", "'@font-face'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'<!--'", "'-->'", "';'", "':'", "','", "'?'", "'%'", "'='", "'/'", "'>'", 
			"'<'", "'{'", "'}'", "'''", "'\"'", "'('", "')'", "'['", "']'", "'!'", 
			"'~'", "'-'", "'+'", "'*'", "'#'", "'&'", "'^'", null, null, null, "'expression('", 
			null, "'~='", "'|='", "'^='", "'$='", "'*='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STYLESHEET", "INLINESTYLE", "ATBLOCK", "CURLYBLOCK", "PARENBLOCK", 
			"BRACKETBLOCK", "RULE", "SELECTOR", "ELEMENT", "PSEUDOCLASS", "PSEUDOELEM", 
			"ADJACENT", "PRECEDING", "CHILD", "DESCENDANT", "ATTRIBUTE", "SET", "DECLARATION", 
			"VALUE", "MEDIA_QUERY", "INVALID_STRING", "INVALID_SELECTOR", "INVALID_SELPART", 
			"INVALID_DECLARATION", "INVALID_STATEMENT", "INVALID_ATSTATEMENT", "INVALID_IMPORT", 
			"INVALID_DIRECTIVE", "IMPORTANT", "IDENT", "CHARSET", "IMPORT", "KEYFRAMES", 
			"MEDIA", "PAGE", "MARGIN_AREA", "VIEWPORT", "FONTFACE", "ATKEYWORD", 
			"CLASSKEYWORD", "STRING", "UNCLOSED_STRING", "HASH", "INDEX", "NUMBER", 
			"PERCENTAGE", "DIMENSION", "URI", "UNCLOSED_URI", "UNIRANGE", "CDO", 
			"CDC", "SEMICOLON", "COLON", "COMMA", "QUESTION", "PERCENT", "EQUALS", 
			"SLASH", "GREATER", "LESS", "LCURLY", "RCURLY", "APOS", "QUOT", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "EXCLAMATION", "TILDE", "MINUS", "PLUS", 
			"ASTERISK", "POUND", "AMPERSAND", "HAT", "S", "COMMENT", "SL_COMMENT", 
			"EXPRESSION", "FUNCTION", "INCLUDES", "DASHMATCH", "STARTSWITH", "ENDSWITH", 
			"CONTAINS", "CTRL", "INVALID_TOKEN", "STRING_MACR", "UNCLOSED_STRING_MACR", 
			"STRING_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "CSSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    // logger
	    private org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(getClass());

	    // function level e.g. function(function(function()))
	    private int functLevel = 0;

	    /**
	     * Obtains the current
	     
	      lexer state from current token
	     */
	    private cz.vutbr.web.csskit.antlr4.CSSLexerState getCurrentLexerState(Token t){
	        if (t instanceof cz.vutbr.web.csskit.antlr4.CSSToken){
	            return ((cz.vutbr.web.csskit.antlr4.CSSToken) t).getLexerState();
	        }
	        return null;
	    }

	    /**
	      * get overtyped error strategy
	      * - strategy must be set to CSSErrorStrategy before parsing !!
	      */
	    private CSSErrorStrategy getCSSErrorHandler(){
	        if(this._errHandler instanceof CSSErrorStrategy){
	            return ((CSSErrorStrategy) this._errHandler);
	        }
	        log.error("ERROR STRATEGY IS NOT OF TYPE CSSErrorStrategy");
	        return null;
	    }


	public CSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlinestyleContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<InlinesetContext> inlineset() {
			return getRuleContexts(InlinesetContext.class);
		}
		public InlinesetContext inlineset(int i) {
			return getRuleContext(InlinesetContext.class,i);
		}
		public InlinestyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlinestyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterInlinestyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitInlinestyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitInlinestyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlinestyleContext inlinestyle() throws RecognitionException {
		InlinestyleContext _localctx = new InlinestyleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inlinestyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(86);
				match(S);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(92);
				declarations();
				}
				break;
			case 2:
				{
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93);
					inlineset();
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLON || _la==LCURLY );
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | inlinestyle | should be EMPTY");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public List<TerminalNode> CDO() { return getTokens(CSSParser.CDO); }
		public TerminalNode CDO(int i) {
			return getToken(CSSParser.CDO, i);
		}
		public List<TerminalNode> CDC() { return getTokens(CSSParser.CDC); }
		public TerminalNode CDC(int i) {
			return getToken(CSSParser.CDC, i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<NostatementContext> nostatement() {
			return getRuleContexts(NostatementContext.class);
		}
		public NostatementContext nostatement(int i) {
			return getRuleContext(NostatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -17661968777216L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 51937115L) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CDO:
					{
					setState(100);
					match(CDO);
					}
					break;
				case CDC:
					{
					setState(101);
					match(CDC);
					}
					break;
				case S:
					{
					setState(102);
					match(S);
					}
					break;
				case SEMICOLON:
				case RCURLY:
				case APOS:
				case QUOT:
					{
					setState(103);
					nostatement();
					}
					break;
				case INVALID_STRING:
				case INVALID_SELPART:
				case IDENT:
				case CHARSET:
				case IMPORT:
				case KEYFRAMES:
				case MEDIA:
				case PAGE:
				case VIEWPORT:
				case FONTFACE:
				case ATKEYWORD:
				case CLASSKEYWORD:
				case STRING:
				case UNCLOSED_STRING:
				case HASH:
				case NUMBER:
				case PERCENTAGE:
				case DIMENSION:
				case URI:
				case UNCLOSED_URI:
				case UNIRANGE:
				case COLON:
				case COMMA:
				case QUESTION:
				case PERCENT:
				case EQUALS:
				case SLASH:
				case GREATER:
				case LESS:
				case LCURLY:
				case RPAREN:
				case LBRACKET:
				case EXCLAMATION:
				case MINUS:
				case PLUS:
				case ASTERISK:
				case POUND:
				case AMPERSAND:
				case HAT:
				case INCLUDES:
				case DASHMATCH:
				case CTRL:
				case INVALID_TOKEN:
					{
					setState(104);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | stylesheet | should be EMPTY");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public AtstatementContext atstatement() {
			return getRuleContext(AtstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INVALID_STRING:
			case INVALID_SELPART:
			case IDENT:
			case CLASSKEYWORD:
			case STRING:
			case UNCLOSED_STRING:
			case HASH:
			case NUMBER:
			case PERCENTAGE:
			case DIMENSION:
			case URI:
			case UNCLOSED_URI:
			case UNIRANGE:
			case COLON:
			case COMMA:
			case QUESTION:
			case PERCENT:
			case EQUALS:
			case SLASH:
			case GREATER:
			case LESS:
			case LCURLY:
			case RPAREN:
			case LBRACKET:
			case EXCLAMATION:
			case MINUS:
			case PLUS:
			case ASTERISK:
			case POUND:
			case AMPERSAND:
			case HAT:
			case INCLUDES:
			case DASHMATCH:
			case CTRL:
			case INVALID_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				ruleset();
				}
				break;
			case CHARSET:
			case IMPORT:
			case KEYFRAMES:
			case MEDIA:
			case PAGE:
			case VIEWPORT:
			case FONTFACE:
			case ATKEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				atstatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | statement | should be EMPTY");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtstatementContext extends ParserRuleContext {
		public TerminalNode CHARSET() { return getToken(CSSParser.CHARSET, 0); }
		public TerminalNode IMPORT() { return getToken(CSSParser.IMPORT, 0); }
		public Import_uriContext import_uri() {
			return getRuleContext(Import_uriContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSSParser.SEMICOLON, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public TerminalNode VIEWPORT() { return getToken(CSSParser.VIEWPORT, 0); }
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public TerminalNode FONTFACE() { return getToken(CSSParser.FONTFACE, 0); }
		public TerminalNode MEDIA() { return getToken(CSSParser.MEDIA, 0); }
		public List<Media_ruleContext> media_rule() {
			return getRuleContexts(Media_ruleContext.class);
		}
		public Media_ruleContext media_rule(int i) {
			return getRuleContext(Media_ruleContext.class,i);
		}
		public TerminalNode KEYFRAMES() { return getToken(CSSParser.KEYFRAMES, 0); }
		public Keyframes_nameContext keyframes_name() {
			return getRuleContext(Keyframes_nameContext.class,0);
		}
		public List<Keyframe_blockContext> keyframe_block() {
			return getRuleContexts(Keyframe_blockContext.class);
		}
		public Keyframe_blockContext keyframe_block(int i) {
			return getRuleContext(Keyframe_blockContext.class,i);
		}
		public Unknown_atruleContext unknown_atrule() {
			return getRuleContext(Unknown_atruleContext.class,0);
		}
		public AtstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterAtstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitAtstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitAtstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtstatementContext atstatement() throws RecognitionException {
		AtstatementContext _localctx = new AtstatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atstatement);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARSET:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(CHARSET);
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(IMPORT);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(116);
					match(S);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				import_uri();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(123);
					match(S);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4559866036486144000L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4657107L) != 0)) {
					{
					setState(129);
					media();
					}
				}

				setState(132);
				match(SEMICOLON);
				}
				break;
			case PAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				page();
				}
				break;
			case VIEWPORT:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(VIEWPORT);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(136);
					match(S);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(LCURLY);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(143);
					match(S);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				declarations();
				setState(150);
				match(RCURLY);
				}
				break;
			case FONTFACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(FONTFACE);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(153);
					match(S);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(LCURLY);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(160);
					match(S);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				declarations();
				setState(167);
				match(RCURLY);
				}
				break;
			case MEDIA:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(MEDIA);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(170);
					match(S);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4559866036486144000L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4657107L) != 0)) {
					{
					setState(176);
					media();
					}
				}

				setState(179);
				match(LCURLY);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(180);
					match(S);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9207591776190201856L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6490091L) != 0)) {
					{
					{
					setState(186);
					media_rule();
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==S) {
						{
						{
						setState(187);
						match(S);
						}
						}
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(RCURLY);
				}
				break;
			case KEYFRAMES:
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				match(KEYFRAMES);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(200);
					match(S);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				keyframes_name();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(207);
					match(S);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(LCURLY);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(214);
					match(S);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT || _la==PERCENTAGE) {
					{
					{
					setState(220);
					keyframe_block();
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==S) {
						{
						{
						setState(221);
						match(S);
						}
						}
						setState(226);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(RCURLY);
				}
				break;
			case ATKEYWORD:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				unknown_atrule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | atstatement consume until RCURLY | SEMICOLON");
			        IntervalSet intervalSet = new IntervalSet(RCURLY, SEMICOLON);
			        getCSSErrorHandler().consumeUntilGreedy(this, intervalSet);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_ATSTATEMENT, "INVALID_ATSTATEMENT"));
			     
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_uriContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CSSParser.STRING, 0); }
		public TerminalNode URI() { return getToken(CSSParser.URI, 0); }
		public TerminalNode UNCLOSED_STRING() { return getToken(CSSParser.UNCLOSED_STRING, 0); }
		public TerminalNode UNCLOSED_URI() { return getToken(CSSParser.UNCLOSED_URI, 0); }
		public Import_uriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_uri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterImport_uri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitImport_uri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitImport_uri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_uriContext import_uri() throws RecognitionException {
		Import_uriContext _localctx = new Import_uriContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_import_uri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 851021999898624L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | import_uri | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public TerminalNode PAGE() { return getToken(CSSParser.PAGE, 0); }
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public List<Margin_ruleContext> margin_rule() {
			return getRuleContexts(Margin_ruleContext.class);
		}
		public Margin_ruleContext margin_rule(int i) {
			return getRuleContext(Margin_ruleContext.class,i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_page);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(PAGE);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					match(S);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(246);
				match(IDENT);
				}
			}

			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(249);
				pseudo();
				}
			}

			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(252);
				match(S);
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(LCURLY);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(259);
				match(S);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			declarations();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MARGIN_AREA) {
				{
				{
				setState(266);
				margin_rule();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | page | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Margin_ruleContext extends ParserRuleContext {
		public TerminalNode MARGIN_AREA() { return getToken(CSSParser.MARGIN_AREA, 0); }
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public Margin_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_margin_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMargin_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMargin_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMargin_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Margin_ruleContext margin_rule() throws RecognitionException {
		Margin_ruleContext _localctx = new Margin_ruleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_margin_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(MARGIN_AREA);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(275);
				match(S);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(LCURLY);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(282);
				match(S);
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			declarations();
			setState(289);
			match(RCURLY);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(290);
				match(S);
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | margin_rule | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlinesetContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public InlinesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterInlineset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitInlineset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitInlineset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlinesetContext inlineset() throws RecognitionException {
		InlinesetContext _localctx = new InlinesetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inlineset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(296);
				pseudo();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(297);
					match(S);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(303);
					match(COMMA);
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==S) {
						{
						{
						setState(304);
						match(S);
						}
						}
						setState(309);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(310);
					pseudo();
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==S) {
						{
						{
						setState(311);
						match(S);
						}
						}
						setState(316);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(324);
			match(LCURLY);
			setState(325);
			declarations();
			setState(326);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | inlineset | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaContext extends ParserRuleContext {
		public List<Media_queryContext> media_query() {
			return getRuleContexts(Media_queryContext.class);
		}
		public Media_queryContext media_query(int i) {
			return getRuleContext(Media_queryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public MediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMedia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMedia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_media);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			media_query();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329);
				match(COMMA);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(330);
					match(S);
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				media_query();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING MEDIA ERROR | consume until COMMA, LCURLY, SEMICOLON");
			        IntervalSet intervalSet = new IntervalSet(COMMA, LCURLY, SEMICOLON);
			        getCSSErrorHandler().consumeUntil(this, intervalSet, CSSLexerState.RecoveryMode.BALANCED, null);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Media_queryContext extends ParserRuleContext {
		public List<Media_termContext> media_term() {
			return getRuleContexts(Media_termContext.class);
		}
		public Media_termContext media_term(int i) {
			return getRuleContext(Media_termContext.class,i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public Media_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMedia_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMedia_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMedia_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Media_queryContext media_query() throws RecognitionException {
		Media_queryContext _localctx = new Media_queryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_media_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(342);
				media_term();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(343);
					match(S);
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4559866036486144000L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4657107L) != 0) );
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | media_query | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Media_termContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public Media_expressionContext media_expression() {
			return getRuleContext(Media_expressionContext.class,0);
		}
		public NomediaqueryContext nomediaquery() {
			return getRuleContext(NomediaqueryContext.class,0);
		}
		public Media_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMedia_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMedia_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMedia_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Media_termContext media_term() throws RecognitionException {
		Media_termContext _localctx = new Media_termContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_media_term);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(353);
					match(IDENT);
					}
					break;
				case LPAREN:
					{
					setState(354);
					media_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
			case NUMBER:
			case PERCENTAGE:
			case DIMENSION:
			case URI:
			case UNCLOSED_URI:
			case UNIRANGE:
			case COLON:
			case QUESTION:
			case PERCENT:
			case EQUALS:
			case SLASH:
			case GREATER:
			case LESS:
			case RPAREN:
			case EXCLAMATION:
			case MINUS:
			case PLUS:
			case ASTERISK:
			case POUND:
			case AMPERSAND:
			case HAT:
			case FUNCTION:
			case INCLUDES:
			case DASHMATCH:
			case CTRL:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				nomediaquery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING MEDIATERM ERROR | consume until COMMA, LCURLY, SEMICOLON");
			        IntervalSet intervalSet = new IntervalSet(COMMA, LCURLY, SEMICOLON);
			        getCSSErrorHandler().consumeUntil(this, intervalSet, CSSLexerState.RecoveryMode.RULE, null);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Media_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CSSParser.LPAREN, 0); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Media_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMedia_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMedia_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMedia_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Media_expressionContext media_expression() throws RecognitionException {
		Media_expressionContext _localctx = new Media_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_media_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(LPAREN);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(361);
				match(S);
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(IDENT);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(368);
				match(S);
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(374);
				match(COLON);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(375);
					match(S);
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				terms();
				}
			}

			setState(384);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING media_expression ERROR | consume until RPAREN, SEMICOLON");
			        IntervalSet intervalSet = new IntervalSet(RPAREN, SEMICOLON);
			        getCSSErrorHandler().consumeUntilGreedy(this, intervalSet);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Media_ruleContext extends ParserRuleContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public AtstatementContext atstatement() {
			return getRuleContext(AtstatementContext.class,0);
		}
		public Media_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMedia_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMedia_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMedia_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Media_ruleContext media_rule() throws RecognitionException {
		Media_ruleContext _localctx = new Media_ruleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_media_rule);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INVALID_STRING:
			case INVALID_SELPART:
			case IDENT:
			case CLASSKEYWORD:
			case STRING:
			case UNCLOSED_STRING:
			case HASH:
			case NUMBER:
			case PERCENTAGE:
			case DIMENSION:
			case URI:
			case UNCLOSED_URI:
			case UNIRANGE:
			case COLON:
			case COMMA:
			case QUESTION:
			case PERCENT:
			case EQUALS:
			case SLASH:
			case GREATER:
			case LESS:
			case LCURLY:
			case RPAREN:
			case LBRACKET:
			case EXCLAMATION:
			case MINUS:
			case PLUS:
			case ASTERISK:
			case POUND:
			case AMPERSAND:
			case HAT:
			case INCLUDES:
			case DASHMATCH:
			case CTRL:
			case INVALID_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				ruleset();
				}
				break;
			case CHARSET:
			case IMPORT:
			case KEYFRAMES:
			case MEDIA:
			case PAGE:
			case VIEWPORT:
			case FONTFACE:
			case ATKEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				atstatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | media_rule | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Keyframes_nameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Keyframes_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframes_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterKeyframes_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitKeyframes_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitKeyframes_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyframes_nameContext keyframes_name() throws RecognitionException {
		Keyframes_nameContext _localctx = new Keyframes_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_keyframes_name);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(IDENT);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Keyframe_blockContext extends ParserRuleContext {
		public List<Keyframe_selectorContext> keyframe_selector() {
			return getRuleContexts(Keyframe_selectorContext.class);
		}
		public Keyframe_selectorContext keyframe_selector(int i) {
			return getRuleContext(Keyframe_selectorContext.class,i);
		}
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public Keyframe_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframe_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterKeyframe_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitKeyframe_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitKeyframe_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyframe_blockContext keyframe_block() throws RecognitionException {
		Keyframe_blockContext _localctx = new Keyframe_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_keyframe_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			keyframe_selector();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(395);
				match(COMMA);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(396);
					match(S);
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				keyframe_selector();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(LCURLY);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(409);
				match(S);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
			declarations();
			setState(416);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {

				    log.debug("PARSING keyframe_selector ERROR | consume until RCURLY and add INVALID_STATEMENT");
			        IntervalSet intervalSet = new IntervalSet(RCURLY);
			        //we don't require {} to be balanced here because of possible parent 'media' sections that may remain open => RecoveryMode.RULE
			        getCSSErrorHandler().consumeUntilGreedy(this, intervalSet/*, CSSLexerState.RecoveryMode.RULE*/);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Keyframe_selectorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public Keyframe_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframe_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterKeyframe_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitKeyframe_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitKeyframe_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyframe_selectorContext keyframe_selector() throws RecognitionException {
		Keyframe_selectorContext _localctx = new Keyframe_selectorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_keyframe_selector);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(IDENT);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(419);
					match(S);
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PERCENTAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(PERCENTAGE);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(426);
					match(S);
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | keyframes_selector | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unknown_atruleContext extends ParserRuleContext {
		public TerminalNode ATKEYWORD() { return getToken(CSSParser.ATKEYWORD, 0); }
		public Unknown_atrule_bodyContext unknown_atrule_body() {
			return getRuleContext(Unknown_atrule_bodyContext.class,0);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(CSSParser.SEMICOLON, 0); }
		public Unknown_atruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown_atrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterUnknown_atrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitUnknown_atrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitUnknown_atrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unknown_atruleContext unknown_atrule() throws RecognitionException {
		Unknown_atruleContext _localctx = new Unknown_atruleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unknown_atrule);
		int _la;
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(ATKEYWORD);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(435);
					match(S);
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & -2289339347205881343L) != 0)) {
					{
					{
					setState(441);
					any();
					}
					}
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(447);
				unknown_atrule_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(ATKEYWORD);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(449);
					match(S);
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & -2289339347205881343L) != 0)) {
					{
					{
					setState(455);
					any();
					}
					}
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(461);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING unknown_atrule ERROR - consume until RCURLY");
			        IntervalSet intervalSet = new IntervalSet(RCURLY, SEMICOLON);
			        getCSSErrorHandler().consumeUntilGreedy(this, intervalSet, CSSLexerState.RecoveryMode.BALANCED);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_ATSTATEMENT, "INVALID_ATSTATEMENT"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unknown_atrule_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public Unknown_atrule_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown_atrule_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterUnknown_atrule_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitUnknown_atrule_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitUnknown_atrule_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unknown_atrule_bodyContext unknown_atrule_body() throws RecognitionException {
		Unknown_atrule_bodyContext _localctx = new Unknown_atrule_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unknown_atrule_body);

		      //the body is defined as empty so any content leads to recognition exception
		      //in that case, the whole body is consumed and the rule is closed
		      CSSLexerState begin = getCurrentLexerState(_localctx.getStart());
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(LCURLY);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(465);
				match(S);
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING unknown_atrule_body has some content | consume until RCURLY");
			        IntervalSet follow = new IntervalSet(RCURLY); //recover on the rule end
			        this.getCSSErrorHandler().consumeUntilGreedy(this, follow, CSSLexerState.RecoveryMode.DECL, begin);
			        _localctx.addErrorNode(this.getTokenFactory().create(RPAREN, "}")); //formally close the body
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulesetContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public List<Combined_selectorContext> combined_selector() {
			return getRuleContexts(Combined_selectorContext.class);
		}
		public Combined_selectorContext combined_selector(int i) {
			return getRuleContext(Combined_selectorContext.class,i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public NoruleContext norule() {
			return getRuleContext(NoruleContext.class,0);
		}
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ruleset);
		int _la;
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INVALID_SELPART:
			case IDENT:
			case CLASSKEYWORD:
			case HASH:
			case COLON:
			case LCURLY:
			case LBRACKET:
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2286986334437505L) != 0)) {
					{
					setState(473);
					combined_selector();
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(474);
						match(COMMA);
						setState(478);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==S) {
							{
							{
							setState(475);
							match(S);
							}
							}
							setState(480);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(481);
						combined_selector();
						}
						}
						setState(486);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(489);
				match(LCURLY);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(490);
					match(S);
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				declarations();
				setState(497);
				match(RCURLY);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
			case NUMBER:
			case PERCENTAGE:
			case DIMENSION:
			case URI:
			case UNCLOSED_URI:
			case UNIRANGE:
			case COMMA:
			case QUESTION:
			case PERCENT:
			case EQUALS:
			case SLASH:
			case GREATER:
			case LESS:
			case RPAREN:
			case EXCLAMATION:
			case MINUS:
			case PLUS:
			case POUND:
			case AMPERSAND:
			case HAT:
			case INCLUDES:
			case DASHMATCH:
			case CTRL:
			case INVALID_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				norule();

					    log.debug("PARSING ruleset: norule encountered | consume until RCURLY and add INVALID_STATEMENT");
				        IntervalSet intervalSet = new IntervalSet(RCURLY);
				        //we don't require {} to be balanced here because of possible parent 'media' sections that may remain open => RecoveryMode.RULE
				        getCSSErrorHandler().consumeUntilGreedy(this, intervalSet/*, CSSLexerState.RecoveryMode.RULE*/);
				        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

				    log.debug("PARSING ruleset ERROR | consume until RCURLY and add INVALID_STATEMENT");
			        IntervalSet intervalSet = new IntervalSet(RCURLY);
			        //we don't require {} to be balanced here because of possible parent 'media' sections that may remain open => RecoveryMode.RULE
			        getCSSErrorHandler().consumeUntilGreedy(this, intervalSet/*, CSSLexerState.RecoveryMode.RULE*/);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CSSParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSSParser.SEMICOLON, i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4594778829202915328L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 5005341L) != 0)) {
				{
				setState(504);
				declaration();
				}
			}

			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(507);
				match(SEMICOLON);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(508);
					match(S);
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4594778829202915328L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 5005341L) != 0)) {
					{
					setState(514);
					declaration();
					}
				}

				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | declarations | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public ImportantContext important() {
			return getRuleContext(ImportantContext.class,0);
		}
		public NopropContext noprop() {
			return getRuleContext(NopropContext.class,0);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaration);

		      CSSLexerState begin = getCurrentLexerState(_localctx.getStart());
		      log.debug("Decl begin: " + begin);
		    
		int _la;
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				property();
				setState(523);
				match(COLON);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(524);
					match(S);
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & -1136978593528937967L) != 0)) {
					{
					setState(530);
					terms();
					}
				}

				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXCLAMATION) {
					{
					setState(533);
					important();
					}
				}

				}
				break;
			case INVALID_STRING:
			case CLASSKEYWORD:
			case STRING:
			case UNCLOSED_STRING:
			case HASH:
			case NUMBER:
			case PERCENTAGE:
			case DIMENSION:
			case URI:
			case UNCLOSED_URI:
			case COLON:
			case COMMA:
			case QUESTION:
			case PERCENT:
			case EQUALS:
			case SLASH:
			case GREATER:
			case LESS:
			case EXCLAMATION:
			case PLUS:
			case ASTERISK:
			case INCLUDES:
			case DASHMATCH:
			case CTRL:
			case INVALID_TOKEN:
			case STRING_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				noprop();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & -2289339347205881343L) != 0)) {
					{
					{
					setState(537);
					any();
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING declaration ERROR | consume until SEMICOLON, RCURLY");
			        IntervalSet follow = new IntervalSet(SEMICOLON, RCURLY); //recover on the declaration end or rule end
			        //not greedy - the final ; or } must remain for properly finishing the declaration/rule
			        this.getCSSErrorHandler().consumeUntil(this, follow, CSSLexerState.RecoveryMode.DECL, begin);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_DECLARATION, "INVALID_DECLARATION"));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportantContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(CSSParser.EXCLAMATION, 0); }
		public TerminalNode IMPORTANT() { return getToken(CSSParser.IMPORTANT, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public ImportantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_important; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterImportant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitImportant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitImportant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportantContext important() throws RecognitionException {
		ImportantContext _localctx = new ImportantContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_important);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(EXCLAMATION);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(546);
				match(S);
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
			match(IMPORTANT);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(553);
				match(S);
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING IMPORTANT error");
			        IntervalSet intervalSet = new IntervalSet(RCURLY,SEMICOLON);
			        this.getCSSErrorHandler().consumeUntil(this, intervalSet, CSSLexerState.RecoveryMode.RULE, null);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_DIRECTIVE, "INVALID_DIRECTIVE"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(559);
				match(MINUS);
				}
			}

			setState(562);
			match(IDENT);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(563);
				match(S);
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING property ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermsContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(569);
				term();
				}
				}
				setState(572); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & -1136978593528937967L) != 0) );
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING terms ERROR functLevel = {}", functLevel);
			        if (functLevel == 0){
			            IntervalSet intervalSet = new IntervalSet(RCURLY, SEMICOLON);
			            this.getCSSErrorHandler().consumeUntilGreedy(this, intervalSet);
			            _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
			        }
			        else{
			            IntervalSet intervalSet = new IntervalSet(RPAREN, RCURLY, SEMICOLON);
			            this.getCSSErrorHandler().consumeUntilGreedy(this, intervalSet, CSSLexerState.RecoveryMode.FUNCTION);
			            _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
			        }
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermValuePartContext extends TermContext {
		public ValuepartContext valuepart() {
			return getRuleContext(ValuepartContext.class,0);
		}
		public TermValuePartContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterTermValuePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitTermValuePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitTermValuePart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermInvalidContext extends TermContext {
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CSSParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSSParser.SEMICOLON, i);
		}
		public TerminalNode ATKEYWORD() { return getToken(CSSParser.ATKEYWORD, 0); }
		public TermInvalidContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterTermInvalid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitTermInvalid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitTermInvalid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_term);
		int _la;
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INVALID_STRING:
			case INVALID_STATEMENT:
			case IDENT:
			case CLASSKEYWORD:
			case STRING:
			case UNCLOSED_STRING:
			case HASH:
			case NUMBER:
			case PERCENTAGE:
			case DIMENSION:
			case URI:
			case UNCLOSED_URI:
			case UNIRANGE:
			case COLON:
			case COMMA:
			case QUESTION:
			case PERCENT:
			case EQUALS:
			case SLASH:
			case GREATER:
			case LESS:
			case LPAREN:
			case LBRACKET:
			case MINUS:
			case PLUS:
			case ASTERISK:
			case EXPRESSION:
			case FUNCTION:
			case INCLUDES:
			case DASHMATCH:
				_localctx = new TermValuePartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				valuepart();
				}
				break;
			case LCURLY:
				_localctx = new TermInvalidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(LCURLY);
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(576);
					match(S);
					}
					}
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & -2289339342910914047L) != 0)) {
					{
					setState(590);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INVALID_STRING:
					case IDENT:
					case CLASSKEYWORD:
					case STRING:
					case UNCLOSED_STRING:
					case HASH:
					case NUMBER:
					case PERCENTAGE:
					case DIMENSION:
					case URI:
					case UNCLOSED_URI:
					case UNIRANGE:
					case COLON:
					case COMMA:
					case QUESTION:
					case PERCENT:
					case EQUALS:
					case SLASH:
					case GREATER:
					case LESS:
					case LPAREN:
					case LBRACKET:
					case EXCLAMATION:
					case MINUS:
					case PLUS:
					case ASTERISK:
					case FUNCTION:
					case INCLUDES:
					case DASHMATCH:
						{
						setState(582);
						any();
						}
						break;
					case SEMICOLON:
						{
						setState(583);
						match(SEMICOLON);
						setState(587);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==S) {
							{
							{
							setState(584);
							match(S);
							}
							}
							setState(589);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(595);
				match(RCURLY);
				}
				break;
			case ATKEYWORD:
				_localctx = new TermInvalidContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				match(ATKEYWORD);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(597);
					match(S);
					}
					}
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			      log.error("PARSING term ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctContext extends ParserRuleContext {
		public TerminalNode EXPRESSION() { return getToken(CSSParser.EXPRESSION, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CSSParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSSParser.SEMICOLON, i);
		}
		public TerminalNode FUNCTION() { return getToken(CSSParser.FUNCTION, 0); }
		public Funct_argsContext funct_args() {
			return getRuleContext(Funct_argsContext.class,0);
		}
		public FunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterFunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitFunct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitFunct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctContext funct() throws RecognitionException {
		FunctContext _localctx = new FunctContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funct);

		        functLevel++;
		    
		int _la;
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPRESSION:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				match(EXPRESSION);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(606);
					match(S);
					}
					}
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & -2289339342910914047L) != 0)) {
					{
					setState(620);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INVALID_STRING:
					case IDENT:
					case CLASSKEYWORD:
					case STRING:
					case UNCLOSED_STRING:
					case HASH:
					case NUMBER:
					case PERCENTAGE:
					case DIMENSION:
					case URI:
					case UNCLOSED_URI:
					case UNIRANGE:
					case COLON:
					case COMMA:
					case QUESTION:
					case PERCENT:
					case EQUALS:
					case SLASH:
					case GREATER:
					case LESS:
					case LPAREN:
					case LBRACKET:
					case EXCLAMATION:
					case MINUS:
					case PLUS:
					case ASTERISK:
					case FUNCTION:
					case INCLUDES:
					case DASHMATCH:
						{
						setState(612);
						any();
						}
						break;
					case SEMICOLON:
						{
						setState(613);
						match(SEMICOLON);
						setState(617);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==S) {
							{
							{
							setState(614);
							match(S);
							}
							}
							setState(619);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(625);
				match(RPAREN);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				match(FUNCTION);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(627);
					match(S);
					}
					}
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(634);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(633);
					funct_args();
					}
					break;
				}
				setState(636);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);

			        functLevel--;
			    
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | funct | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuepartContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode URI() { return getToken(CSSParser.URI, 0); }
		public TerminalNode UNCLOSED_URI() { return getToken(CSSParser.UNCLOSED_URI, 0); }
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public FunctContext funct() {
			return getRuleContext(FunctContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CSSParser.COMMA, 0); }
		public TerminalNode SLASH() { return getToken(CSSParser.SLASH, 0); }
		public Bracketed_identsContext bracketed_idents() {
			return getRuleContext(Bracketed_identsContext.class,0);
		}
		public TerminalNode CLASSKEYWORD() { return getToken(CSSParser.CLASSKEYWORD, 0); }
		public TerminalNode UNIRANGE() { return getToken(CSSParser.UNIRANGE, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(CSSParser.LESS, 0); }
		public TerminalNode QUESTION() { return getToken(CSSParser.QUESTION, 0); }
		public TerminalNode PERCENT() { return getToken(CSSParser.PERCENT, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode ASTERISK() { return getToken(CSSParser.ASTERISK, 0); }
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode LPAREN() { return getToken(CSSParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public List<ValuepartContext> valuepart() {
			return getRuleContexts(ValuepartContext.class);
		}
		public ValuepartContext valuepart(int i) {
			return getRuleContext(ValuepartContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public ValuepartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuepart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterValuepart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitValuepart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitValuepart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuepartContext valuepart() throws RecognitionException {
		ValuepartContext _localctx = new ValuepartContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_valuepart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(639);
					match(MINUS);
					}
				}

				setState(642);
				match(IDENT);
				}
				break;
			case 2:
				{
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(643);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(646);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(647);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(650);
				match(PERCENTAGE);
				}
				break;
			case 4:
				{
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(651);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(654);
				match(DIMENSION);
				}
				break;
			case 5:
				{
				setState(655);
				string();
				}
				break;
			case 6:
				{
				setState(656);
				match(URI);
				}
				break;
			case 7:
				{
				setState(657);
				match(UNCLOSED_URI);
				}
				break;
			case 8:
				{
				setState(658);
				match(HASH);
				}
				break;
			case 9:
				{
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(659);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(662);
				funct();
				}
				break;
			case 10:
				{
				setState(663);
				match(COMMA);
				}
				break;
			case 11:
				{
				setState(664);
				match(SLASH);
				}
				break;
			case 12:
				{
				setState(665);
				bracketed_idents();
				}
				break;
			case 13:
				{
				setState(666);
				match(CLASSKEYWORD);
				}
				break;
			case 14:
				{
				setState(667);
				match(UNIRANGE);
				}
				break;
			case 15:
				{
				setState(668);
				match(INCLUDES);
				}
				break;
			case 16:
				{
				setState(669);
				match(COLON);
				}
				break;
			case 17:
				{
				setState(670);
				match(GREATER);
				}
				break;
			case 18:
				{
				setState(671);
				match(LESS);
				}
				break;
			case 19:
				{
				setState(672);
				match(QUESTION);
				}
				break;
			case 20:
				{
				setState(673);
				match(PERCENT);
				}
				break;
			case 21:
				{
				setState(674);
				match(EQUALS);
				}
				break;
			case 22:
				{
				setState(675);
				match(ASTERISK);
				}
				break;
			case 23:
				{
				setState(676);
				match(DASHMATCH);
				}
				break;
			case 24:
				{
				setState(677);
				match(LPAREN);
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & -1136980792552455663L) != 0)) {
					{
					{
					setState(678);
					valuepart();
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(684);
				match(RPAREN);
				}
				break;
			}
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(687);
				match(S);
				}
				}
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

					log.error("Recognition exception | valuepart");
					IntervalSet intervalSet = new IntervalSet(RCURLY, SEMICOLON);
					getCSSErrorHandler().consumeUntil(this, intervalSet, CSSLexerState.RecoveryMode.NOBALANCE, null);
					_localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT,""));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Funct_argsContext extends ParserRuleContext {
		public List<Funct_argumentContext> funct_argument() {
			return getRuleContexts(Funct_argumentContext.class);
		}
		public Funct_argumentContext funct_argument(int i) {
			return getRuleContext(Funct_argumentContext.class,i);
		}
		public Funct_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterFunct_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitFunct_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitFunct_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funct_argsContext funct_args() throws RecognitionException {
		Funct_argsContext _localctx = new Funct_argsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_funct_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(693);
					funct_argument();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(696); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING funct_args ERROR functLevel = {}", functLevel);
			        IntervalSet intervalSet = new IntervalSet(RPAREN, RCURLY, SEMICOLON);
			        this.getCSSErrorHandler().consumeUntilGreedy(this, intervalSet, CSSLexerState.RecoveryMode.FUNCTION);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Funct_argumentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(CSSParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(CSSParser.SLASH, 0); }
		public TerminalNode LPAREN() { return getToken(CSSParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FunctContext funct() {
			return getRuleContext(FunctContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CSSParser.COMMA, 0); }
		public TerminalNode CLASSKEYWORD() { return getToken(CSSParser.CLASSKEYWORD, 0); }
		public TerminalNode UNIRANGE() { return getToken(CSSParser.UNIRANGE, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(CSSParser.LESS, 0); }
		public TerminalNode QUESTION() { return getToken(CSSParser.QUESTION, 0); }
		public TerminalNode PERCENT() { return getToken(CSSParser.PERCENT, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public Funct_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterFunct_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitFunct_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitFunct_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funct_argumentContext funct_argument() throws RecognitionException {
		Funct_argumentContext _localctx = new Funct_argumentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funct_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(698);
				match(IDENT);
				}
				break;
			case PLUS:
				{
				setState(699);
				match(PLUS);
				}
				break;
			case MINUS:
				{
				setState(700);
				match(MINUS);
				}
				break;
			case ASTERISK:
				{
				setState(701);
				match(ASTERISK);
				}
				break;
			case SLASH:
				{
				setState(702);
				match(SLASH);
				}
				break;
			case LPAREN:
				{
				setState(703);
				match(LPAREN);
				}
				break;
			case RPAREN:
				{
				setState(704);
				match(RPAREN);
				}
				break;
			case NUMBER:
				{
				setState(705);
				match(NUMBER);
				}
				break;
			case PERCENTAGE:
				{
				setState(706);
				match(PERCENTAGE);
				}
				break;
			case DIMENSION:
				{
				setState(707);
				match(DIMENSION);
				}
				break;
			case HASH:
				{
				setState(708);
				match(HASH);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
				{
				setState(709);
				string();
				}
				break;
			case EXPRESSION:
			case FUNCTION:
				{
				setState(710);
				funct();
				}
				break;
			case COMMA:
				{
				setState(711);
				match(COMMA);
				}
				break;
			case CLASSKEYWORD:
				{
				setState(712);
				match(CLASSKEYWORD);
				}
				break;
			case UNIRANGE:
				{
				setState(713);
				match(UNIRANGE);
				}
				break;
			case INCLUDES:
				{
				setState(714);
				match(INCLUDES);
				}
				break;
			case COLON:
				{
				setState(715);
				match(COLON);
				}
				break;
			case GREATER:
				{
				setState(716);
				match(GREATER);
				}
				break;
			case LESS:
				{
				setState(717);
				match(LESS);
				}
				break;
			case QUESTION:
				{
				setState(718);
				match(QUESTION);
				}
				break;
			case PERCENT:
				{
				setState(719);
				match(PERCENT);
				}
				break;
			case EQUALS:
				{
				setState(720);
				match(EQUALS);
				}
				break;
			case DASHMATCH:
				{
				setState(721);
				match(DASHMATCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(724);
				match(S);
				}
				}
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

					log.error("Recognition exception | funct_argument");
					IntervalSet intervalSet = new IntervalSet(RCURLY, SEMICOLON);
					getCSSErrorHandler().consumeUntil(this, intervalSet, CSSLexerState.RecoveryMode.BALANCED, null);
					_localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT,""));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Combined_selectorContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public Combined_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterCombined_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitCombined_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitCombined_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Combined_selectorContext combined_selector() throws RecognitionException {
		Combined_selectorContext _localctx = new Combined_selectorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_combined_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			selector();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 272385L) != 0)) {
				{
				{
				{
				setState(731);
				combinator();
				}
				setState(732);
				selector();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

				  log.error("Recognition exception | combined_selector | should be empty");
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombinatorContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(CSSParser.TILDE, 0); }
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_combinator);
		int _la;
		try {
			setState(761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GREATER:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(GREATER);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(740);
					match(S);
					}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				match(PLUS);
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(747);
					match(S);
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
				match(TILDE);
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(754);
					match(S);
					}
					}
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case S:
				enterOuterAlt(_localctx, 4);
				{
				setState(760);
				match(S);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | combinator| should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode ASTERISK() { return getToken(CSSParser.ASTERISK, 0); }
		public List<SelpartContext> selpart() {
			return getRuleContexts(SelpartContext.class);
		}
		public SelpartContext selpart(int i) {
			return getRuleContext(SelpartContext.class,i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selector);
		int _la;
		try {
			int _alt;
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==ASTERISK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 35186520752129L) != 0)) {
					{
					{
					setState(764);
					selpart();
					}
					}
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(770);
						match(S);
						}
						} 
					}
					setState(775);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				}
				break;
			case INVALID_SELPART:
			case CLASSKEYWORD:
			case HASH:
			case COLON:
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(777); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(776);
					selpart();
					}
					}
					setState(779); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 35186520752129L) != 0) );
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(781);
						match(S);
						}
						} 
					}
					setState(786);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING selector ERROR | inserting INVALID_SELECTOR");
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_SELECTOR, "INVALID_SELECTOR"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelpartContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public TerminalNode CLASSKEYWORD() { return getToken(CSSParser.CLASSKEYWORD, 0); }
		public TerminalNode LBRACKET() { return getToken(CSSParser.LBRACKET, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(CSSParser.RBRACKET, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public TerminalNode INVALID_SELPART() { return getToken(CSSParser.INVALID_SELPART, 0); }
		public SelpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterSelpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitSelpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitSelpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelpartContext selpart() throws RecognitionException {
		SelpartContext _localctx = new SelpartContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selpart);
		int _la;
		try {
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				match(HASH);
				}
				break;
			case CLASSKEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				match(CLASSKEYWORD);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(791);
				match(LBRACKET);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(792);
					match(S);
					}
					}
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(798);
				attribute();
				setState(799);
				match(RBRACKET);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(801);
				pseudo();
				}
				break;
			case INVALID_SELPART:
				enterOuterAlt(_localctx, 5);
				{
				setState(802);
				match(INVALID_SELPART);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING SELPART ERROR");
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_SELPART, "INVALID_SELPART"));
				  
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(CSSParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CSSParser.IDENT, i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode STARTSWITH() { return getToken(CSSParser.STARTSWITH, 0); }
		public TerminalNode ENDSWITH() { return getToken(CSSParser.ENDSWITH, 0); }
		public TerminalNode CONTAINS() { return getToken(CSSParser.CONTAINS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(IDENT);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(806);
				match(S);
				}
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 1040187393L) != 0)) {
				{
				setState(812);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 1040187393L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(813);
					match(S);
					}
					}
					setState(818);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(821);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(819);
					match(IDENT);
					}
					break;
				case INVALID_STRING:
				case STRING:
				case UNCLOSED_STRING:
					{
					setState(820);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(823);
					match(S);
					}
					}
					setState(828);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | attribute | should be empty");
			     
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(CSSParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CSSParser.COLON, i);
		}
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode FUNCTION() { return getToken(CSSParser.FUNCTION, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode INDEX() { return getToken(CSSParser.INDEX, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(COLON);
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(832);
				match(COLON);
				}
			}

			setState(868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case MINUS:
				{
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(835);
					match(MINUS);
					}
				}

				setState(838);
				match(IDENT);
				}
				break;
			case FUNCTION:
				{
				setState(839);
				match(FUNCTION);
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(840);
					match(S);
					}
					}
					setState(845);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(859);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(847);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUS) {
						{
						setState(846);
						match(MINUS);
						}
					}

					setState(849);
					match(IDENT);
					}
					break;
				case 2:
					{
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUS) {
						{
						setState(850);
						match(MINUS);
						}
					}

					setState(853);
					match(NUMBER);
					}
					break;
				case 3:
					{
					setState(855);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUS) {
						{
						setState(854);
						match(MINUS);
						}
					}

					setState(857);
					match(INDEX);
					}
					break;
				case 4:
					{
					setState(858);
					selector();
					}
					break;
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(861);
					match(S);
					}
					}
					setState(866);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(867);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {

			      log.error("PARSING pseudo ERROR | inserting INVALID_SELPART");
			       _localctx.addErrorNode(this.getTokenFactory().create(INVALID_SELPART, "INVALID_SELPART"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CSSParser.STRING, 0); }
		public TerminalNode UNCLOSED_STRING() { return getToken(CSSParser.UNCLOSED_STRING, 0); }
		public TerminalNode INVALID_STRING() { return getToken(CSSParser.INVALID_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6597071863808L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING string ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bracketed_identsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(CSSParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(CSSParser.RBRACKET, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<Ident_list_itemContext> ident_list_item() {
			return getRuleContexts(Ident_list_itemContext.class);
		}
		public Ident_list_itemContext ident_list_item(int i) {
			return getRuleContext(Ident_list_itemContext.class,i);
		}
		public TerminalNode INVALID_STATEMENT() { return getToken(CSSParser.INVALID_STATEMENT, 0); }
		public Bracketed_identsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketed_idents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterBracketed_idents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitBracketed_idents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitBracketed_idents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracketed_identsContext bracketed_idents() throws RecognitionException {
		Bracketed_identsContext _localctx = new Bracketed_identsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_bracketed_idents);
		int _la;
		try {
			setState(887);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				match(LBRACKET);
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(873);
					match(S);
					}
					}
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 140737488355361L) != 0)) {
					{
					{
					setState(879);
					ident_list_item();
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(885);
				match(RBRACKET);
				}
				break;
			case INVALID_STATEMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				match(INVALID_STATEMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

					log.error("Recognition exception | bracketed_idents | empty");
					_localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT,""));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ident_list_itemContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode INVALID_STATEMENT() { return getToken(CSSParser.INVALID_STATEMENT, 0); }
		public Ident_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterIdent_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitIdent_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitIdent_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ident_list_itemContext ident_list_item() throws RecognitionException {
		Ident_list_itemContext _localctx = new Ident_list_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ident_list_item);
		int _la;
		try {
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(889);
					match(MINUS);
					}
				}

				setState(892);
				match(IDENT);
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(893);
					match(S);
					}
					}
					setState(898);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case INVALID_STATEMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				match(INVALID_STATEMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

					log.error("Recognition exception | ident_list_item | empty");
					_localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT,""));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnyContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode CLASSKEYWORD() { return getToken(CSSParser.CLASSKEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode URI() { return getToken(CSSParser.URI, 0); }
		public TerminalNode UNCLOSED_URI() { return getToken(CSSParser.UNCLOSED_URI, 0); }
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public TerminalNode UNIRANGE() { return getToken(CSSParser.UNIRANGE, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(CSSParser.COMMA, 0); }
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(CSSParser.LESS, 0); }
		public TerminalNode QUESTION() { return getToken(CSSParser.QUESTION, 0); }
		public TerminalNode PERCENT() { return getToken(CSSParser.PERCENT, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode SLASH() { return getToken(CSSParser.SLASH, 0); }
		public TerminalNode EXCLAMATION() { return getToken(CSSParser.EXCLAMATION, 0); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode ASTERISK() { return getToken(CSSParser.ASTERISK, 0); }
		public TerminalNode FUNCTION() { return getToken(CSSParser.FUNCTION, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode LPAREN() { return getToken(CSSParser.LPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(CSSParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(CSSParser.RBRACKET, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_any);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(902);
				match(IDENT);
				}
				break;
			case CLASSKEYWORD:
				{
				setState(903);
				match(CLASSKEYWORD);
				}
				break;
			case NUMBER:
				{
				setState(904);
				match(NUMBER);
				}
				break;
			case PERCENTAGE:
				{
				setState(905);
				match(PERCENTAGE);
				}
				break;
			case DIMENSION:
				{
				setState(906);
				match(DIMENSION);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
				{
				setState(907);
				string();
				}
				break;
			case URI:
				{
				setState(908);
				match(URI);
				}
				break;
			case UNCLOSED_URI:
				{
				setState(909);
				match(UNCLOSED_URI);
				}
				break;
			case HASH:
				{
				setState(910);
				match(HASH);
				}
				break;
			case UNIRANGE:
				{
				setState(911);
				match(UNIRANGE);
				}
				break;
			case INCLUDES:
				{
				setState(912);
				match(INCLUDES);
				}
				break;
			case COLON:
				{
				setState(913);
				match(COLON);
				}
				break;
			case COMMA:
				{
				setState(914);
				match(COMMA);
				}
				break;
			case GREATER:
				{
				setState(915);
				match(GREATER);
				}
				break;
			case LESS:
				{
				setState(916);
				match(LESS);
				}
				break;
			case QUESTION:
				{
				setState(917);
				match(QUESTION);
				}
				break;
			case PERCENT:
				{
				setState(918);
				match(PERCENT);
				}
				break;
			case EQUALS:
				{
				setState(919);
				match(EQUALS);
				}
				break;
			case SLASH:
				{
				setState(920);
				match(SLASH);
				}
				break;
			case EXCLAMATION:
				{
				setState(921);
				match(EXCLAMATION);
				}
				break;
			case MINUS:
				{
				setState(922);
				match(MINUS);
				}
				break;
			case PLUS:
				{
				setState(923);
				match(PLUS);
				}
				break;
			case ASTERISK:
				{
				setState(924);
				match(ASTERISK);
				}
				break;
			case FUNCTION:
				{
				setState(925);
				match(FUNCTION);
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(926);
					match(S);
					}
					}
					setState(931);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & -2289339347205881343L) != 0)) {
					{
					{
					setState(932);
					any();
					}
					}
					setState(937);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(938);
				match(RPAREN);
				}
				break;
			case DASHMATCH:
				{
				setState(939);
				match(DASHMATCH);
				}
				break;
			case LPAREN:
				{
				setState(940);
				match(LPAREN);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & -2289339347205881343L) != 0)) {
					{
					{
					setState(941);
					any();
					}
					}
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(947);
				match(RPAREN);
				}
				break;
			case LBRACKET:
				{
				setState(948);
				match(LBRACKET);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & -2289339347205881343L) != 0)) {
					{
					{
					setState(949);
					any();
					}
					}
					setState(954);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(955);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(958);
				match(S);
				}
				}
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING any ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NostatementContext extends ParserRuleContext {
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSSParser.SEMICOLON, 0); }
		public TerminalNode QUOT() { return getToken(CSSParser.QUOT, 0); }
		public TerminalNode APOS() { return getToken(CSSParser.APOS, 0); }
		public NostatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nostatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterNostatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitNostatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitNostatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NostatementContext nostatement() throws RecognitionException {
		NostatementContext _localctx = new NostatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_nostatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 7169L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {

			    log.error("PARSING nostatement ERROR | should be empty");
			  
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NopropContext extends ParserRuleContext {
		public TerminalNode CLASSKEYWORD() { return getToken(CSSParser.CLASSKEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CSSParser.COMMA, 0); }
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public TerminalNode URI() { return getToken(CSSParser.URI, 0); }
		public TerminalNode UNCLOSED_URI() { return getToken(CSSParser.UNCLOSED_URI, 0); }
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(CSSParser.LESS, 0); }
		public TerminalNode QUESTION() { return getToken(CSSParser.QUESTION, 0); }
		public TerminalNode PERCENT() { return getToken(CSSParser.PERCENT, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode SLASH() { return getToken(CSSParser.SLASH, 0); }
		public TerminalNode EXCLAMATION() { return getToken(CSSParser.EXCLAMATION, 0); }
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode ASTERISK() { return getToken(CSSParser.ASTERISK, 0); }
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TerminalNode STRING_CHAR() { return getToken(CSSParser.STRING_CHAR, 0); }
		public TerminalNode CTRL() { return getToken(CSSParser.CTRL, 0); }
		public TerminalNode INVALID_TOKEN() { return getToken(CSSParser.INVALID_TOKEN, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public NopropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noprop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterNoprop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitNoprop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitNoprop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NopropContext noprop() throws RecognitionException {
		NopropContext _localctx = new NopropContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_noprop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASSKEYWORD:
				{
				setState(966);
				match(CLASSKEYWORD);
				}
				break;
			case NUMBER:
				{
				setState(967);
				match(NUMBER);
				}
				break;
			case PERCENTAGE:
				{
				setState(968);
				match(PERCENTAGE);
				}
				break;
			case DIMENSION:
				{
				setState(969);
				match(DIMENSION);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
				{
				setState(970);
				string();
				}
				break;
			case COMMA:
				{
				setState(971);
				match(COMMA);
				}
				break;
			case HASH:
				{
				setState(972);
				match(HASH);
				}
				break;
			case URI:
				{
				setState(973);
				match(URI);
				}
				break;
			case UNCLOSED_URI:
				{
				setState(974);
				match(UNCLOSED_URI);
				}
				break;
			case GREATER:
				{
				setState(975);
				match(GREATER);
				}
				break;
			case LESS:
				{
				setState(976);
				match(LESS);
				}
				break;
			case QUESTION:
				{
				setState(977);
				match(QUESTION);
				}
				break;
			case PERCENT:
				{
				setState(978);
				match(PERCENT);
				}
				break;
			case EQUALS:
				{
				setState(979);
				match(EQUALS);
				}
				break;
			case SLASH:
				{
				setState(980);
				match(SLASH);
				}
				break;
			case EXCLAMATION:
				{
				setState(981);
				match(EXCLAMATION);
				}
				break;
			case PLUS:
				{
				setState(982);
				match(PLUS);
				}
				break;
			case ASTERISK:
				{
				setState(983);
				match(ASTERISK);
				}
				break;
			case DASHMATCH:
				{
				setState(984);
				match(DASHMATCH);
				}
				break;
			case INCLUDES:
				{
				setState(985);
				match(INCLUDES);
				}
				break;
			case COLON:
				{
				setState(986);
				match(COLON);
				}
				break;
			case STRING_CHAR:
				{
				setState(987);
				match(STRING_CHAR);
				}
				break;
			case CTRL:
				{
				setState(988);
				match(CTRL);
				}
				break;
			case INVALID_TOKEN:
				{
				setState(989);
				match(INVALID_TOKEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(992);
				match(S);
				}
				}
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING noprop ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoruleContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode URI() { return getToken(CSSParser.URI, 0); }
		public TerminalNode UNCLOSED_URI() { return getToken(CSSParser.UNCLOSED_URI, 0); }
		public TerminalNode UNIRANGE() { return getToken(CSSParser.UNIRANGE, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public TerminalNode COMMA() { return getToken(CSSParser.COMMA, 0); }
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(CSSParser.LESS, 0); }
		public TerminalNode QUESTION() { return getToken(CSSParser.QUESTION, 0); }
		public TerminalNode PERCENT() { return getToken(CSSParser.PERCENT, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode SLASH() { return getToken(CSSParser.SLASH, 0); }
		public TerminalNode EXCLAMATION() { return getToken(CSSParser.EXCLAMATION, 0); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TerminalNode CTRL() { return getToken(CSSParser.CTRL, 0); }
		public TerminalNode POUND() { return getToken(CSSParser.POUND, 0); }
		public TerminalNode HAT() { return getToken(CSSParser.HAT, 0); }
		public TerminalNode AMPERSAND() { return getToken(CSSParser.AMPERSAND, 0); }
		public TerminalNode INVALID_TOKEN() { return getToken(CSSParser.INVALID_TOKEN, 0); }
		public NoruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_norule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterNorule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitNorule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitNorule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoruleContext norule() throws RecognitionException {
		NoruleContext _localctx = new NoruleContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_norule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(998);
				match(NUMBER);
				}
				break;
			case PERCENTAGE:
				{
				setState(999);
				match(PERCENTAGE);
				}
				break;
			case DIMENSION:
				{
				setState(1000);
				match(DIMENSION);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
				{
				setState(1001);
				string();
				}
				break;
			case URI:
				{
				setState(1002);
				match(URI);
				}
				break;
			case UNCLOSED_URI:
				{
				setState(1003);
				match(UNCLOSED_URI);
				}
				break;
			case UNIRANGE:
				{
				setState(1004);
				match(UNIRANGE);
				}
				break;
			case INCLUDES:
				{
				setState(1005);
				match(INCLUDES);
				}
				break;
			case COMMA:
				{
				setState(1006);
				match(COMMA);
				}
				break;
			case GREATER:
				{
				setState(1007);
				match(GREATER);
				}
				break;
			case LESS:
				{
				setState(1008);
				match(LESS);
				}
				break;
			case QUESTION:
				{
				setState(1009);
				match(QUESTION);
				}
				break;
			case PERCENT:
				{
				setState(1010);
				match(PERCENT);
				}
				break;
			case EQUALS:
				{
				setState(1011);
				match(EQUALS);
				}
				break;
			case SLASH:
				{
				setState(1012);
				match(SLASH);
				}
				break;
			case EXCLAMATION:
				{
				setState(1013);
				match(EXCLAMATION);
				}
				break;
			case MINUS:
				{
				setState(1014);
				match(MINUS);
				}
				break;
			case PLUS:
				{
				setState(1015);
				match(PLUS);
				}
				break;
			case DASHMATCH:
				{
				setState(1016);
				match(DASHMATCH);
				}
				break;
			case RPAREN:
				{
				setState(1017);
				match(RPAREN);
				}
				break;
			case CTRL:
				{
				setState(1018);
				match(CTRL);
				}
				break;
			case POUND:
				{
				setState(1019);
				match(POUND);
				}
				break;
			case HAT:
				{
				setState(1020);
				match(HAT);
				}
				break;
			case AMPERSAND:
				{
				setState(1021);
				match(AMPERSAND);
				}
				break;
			case INVALID_TOKEN:
				{
				setState(1022);
				match(INVALID_TOKEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING norule ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NomediaqueryContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode URI() { return getToken(CSSParser.URI, 0); }
		public TerminalNode UNCLOSED_URI() { return getToken(CSSParser.UNCLOSED_URI, 0); }
		public TerminalNode UNIRANGE() { return getToken(CSSParser.UNIRANGE, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(CSSParser.LESS, 0); }
		public TerminalNode QUESTION() { return getToken(CSSParser.QUESTION, 0); }
		public TerminalNode PERCENT() { return getToken(CSSParser.PERCENT, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode SLASH() { return getToken(CSSParser.SLASH, 0); }
		public TerminalNode EXCLAMATION() { return getToken(CSSParser.EXCLAMATION, 0); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TerminalNode CTRL() { return getToken(CSSParser.CTRL, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TerminalNode ASTERISK() { return getToken(CSSParser.ASTERISK, 0); }
		public TerminalNode FUNCTION() { return getToken(CSSParser.FUNCTION, 0); }
		public TerminalNode POUND() { return getToken(CSSParser.POUND, 0); }
		public TerminalNode HAT() { return getToken(CSSParser.HAT, 0); }
		public TerminalNode AMPERSAND() { return getToken(CSSParser.AMPERSAND, 0); }
		public NomediaqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomediaquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterNomediaquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitNomediaquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitNomediaquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomediaqueryContext nomediaquery() throws RecognitionException {
		NomediaqueryContext _localctx = new NomediaqueryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_nomediaquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(1025);
				match(NUMBER);
				}
				break;
			case PERCENTAGE:
				{
				setState(1026);
				match(PERCENTAGE);
				}
				break;
			case DIMENSION:
				{
				setState(1027);
				match(DIMENSION);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
				{
				setState(1028);
				string();
				}
				break;
			case URI:
				{
				setState(1029);
				match(URI);
				}
				break;
			case UNCLOSED_URI:
				{
				setState(1030);
				match(UNCLOSED_URI);
				}
				break;
			case UNIRANGE:
				{
				setState(1031);
				match(UNIRANGE);
				}
				break;
			case INCLUDES:
				{
				setState(1032);
				match(INCLUDES);
				}
				break;
			case GREATER:
				{
				setState(1033);
				match(GREATER);
				}
				break;
			case LESS:
				{
				setState(1034);
				match(LESS);
				}
				break;
			case QUESTION:
				{
				setState(1035);
				match(QUESTION);
				}
				break;
			case PERCENT:
				{
				setState(1036);
				match(PERCENT);
				}
				break;
			case EQUALS:
				{
				setState(1037);
				match(EQUALS);
				}
				break;
			case SLASH:
				{
				setState(1038);
				match(SLASH);
				}
				break;
			case EXCLAMATION:
				{
				setState(1039);
				match(EXCLAMATION);
				}
				break;
			case MINUS:
				{
				setState(1040);
				match(MINUS);
				}
				break;
			case PLUS:
				{
				setState(1041);
				match(PLUS);
				}
				break;
			case DASHMATCH:
				{
				setState(1042);
				match(DASHMATCH);
				}
				break;
			case RPAREN:
				{
				setState(1043);
				match(RPAREN);
				}
				break;
			case CTRL:
				{
				setState(1044);
				match(CTRL);
				}
				break;
			case COLON:
				{
				setState(1045);
				match(COLON);
				}
				break;
			case ASTERISK:
				{
				setState(1046);
				match(ASTERISK);
				}
				break;
			case FUNCTION:
				{
				setState(1047);
				match(FUNCTION);
				}
				break;
			case POUND:
				{
				setState(1048);
				match(POUND);
				}
				break;
			case HAT:
				{
				setState(1049);
				match(HAT);
				}
				break;
			case AMPERSAND:
				{
				setState(1050);
				match(AMPERSAND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING nomediaquery ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\\\u041e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0005\u0000X\b\u0000"+
		"\n\u0000\f\u0000[\t\u0000\u0001\u0000\u0001\u0000\u0004\u0000_\b\u0000"+
		"\u000b\u0000\f\u0000`\u0003\u0000c\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001j\b\u0001\n\u0001\f\u0001m\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0003\u0002q\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003v\b\u0003\n\u0003\f\u0003y\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003}\b\u0003\n\u0003\f\u0003\u0080\t\u0003"+
		"\u0001\u0003\u0003\u0003\u0083\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u008a\b\u0003\n\u0003\f\u0003\u008d"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0091\b\u0003\n\u0003\f\u0003"+
		"\u0094\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u009b\b\u0003\n\u0003\f\u0003\u009e\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u00a2\b\u0003\n\u0003\f\u0003\u00a5\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00ac\b\u0003"+
		"\n\u0003\f\u0003\u00af\t\u0003\u0001\u0003\u0003\u0003\u00b2\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u00b6\b\u0003\n\u0003\f\u0003\u00b9\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u00bd\b\u0003\n\u0003\f\u0003\u00c0"+
		"\t\u0003\u0005\u0003\u00c2\b\u0003\n\u0003\f\u0003\u00c5\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00ca\b\u0003\n\u0003\f\u0003"+
		"\u00cd\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00d1\b\u0003\n\u0003"+
		"\f\u0003\u00d4\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00d8\b\u0003"+
		"\n\u0003\f\u0003\u00db\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00df"+
		"\b\u0003\n\u0003\f\u0003\u00e2\t\u0003\u0005\u0003\u00e4\b\u0003\n\u0003"+
		"\f\u0003\u00e7\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00ec\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00f2\b\u0005\n\u0005\f\u0005\u00f5\t\u0005\u0001\u0005\u0003\u0005\u00f8"+
		"\b\u0005\u0001\u0005\u0003\u0005\u00fb\b\u0005\u0001\u0005\u0005\u0005"+
		"\u00fe\b\u0005\n\u0005\f\u0005\u0101\t\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u0105\b\u0005\n\u0005\f\u0005\u0108\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u010c\b\u0005\n\u0005\f\u0005\u010f\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u0115\b\u0006\n\u0006\f\u0006"+
		"\u0118\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u011c\b\u0006\n\u0006"+
		"\f\u0006\u011f\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0124\b\u0006\n\u0006\f\u0006\u0127\t\u0006\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u012b\b\u0007\n\u0007\f\u0007\u012e\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0132\b\u0007\n\u0007\f\u0007\u0135\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0139\b\u0007\n\u0007\f\u0007\u013c\t\u0007\u0005\u0007"+
		"\u013e\b\u0007\n\u0007\f\u0007\u0141\t\u0007\u0003\u0007\u0143\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u014c\b\b\n\b\f\b\u014f\t\b\u0001\b\u0005\b\u0152\b\b\n\b\f"+
		"\b\u0155\t\b\u0001\t\u0001\t\u0005\t\u0159\b\t\n\t\f\t\u015c\t\t\u0004"+
		"\t\u015e\b\t\u000b\t\f\t\u015f\u0001\n\u0001\n\u0003\n\u0164\b\n\u0001"+
		"\n\u0003\n\u0167\b\n\u0001\u000b\u0001\u000b\u0005\u000b\u016b\b\u000b"+
		"\n\u000b\f\u000b\u016e\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0172"+
		"\b\u000b\n\u000b\f\u000b\u0175\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0179\b\u000b\n\u000b\f\u000b\u017c\t\u000b\u0001\u000b\u0003\u000b\u017f"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u0185\b\f\u0001"+
		"\r\u0001\r\u0003\r\u0189\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u018e\b\u000e\n\u000e\f\u000e\u0191\t\u000e\u0001\u000e\u0005\u000e"+
		"\u0194\b\u000e\n\u000e\f\u000e\u0197\t\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u019b\b\u000e\n\u000e\f\u000e\u019e\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u01a5\b\u000f\n\u000f"+
		"\f\u000f\u01a8\t\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u01ac\b\u000f"+
		"\n\u000f\f\u000f\u01af\t\u000f\u0003\u000f\u01b1\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u01b5\b\u0010\n\u0010\f\u0010\u01b8\t\u0010\u0001\u0010"+
		"\u0005\u0010\u01bb\b\u0010\n\u0010\f\u0010\u01be\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u01c3\b\u0010\n\u0010\f\u0010\u01c6\t\u0010"+
		"\u0001\u0010\u0005\u0010\u01c9\b\u0010\n\u0010\f\u0010\u01cc\t\u0010\u0001"+
		"\u0010\u0003\u0010\u01cf\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u01d3"+
		"\b\u0011\n\u0011\f\u0011\u01d6\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u01dd\b\u0012\n\u0012\f\u0012\u01e0"+
		"\t\u0012\u0001\u0012\u0005\u0012\u01e3\b\u0012\n\u0012\f\u0012\u01e6\t"+
		"\u0012\u0003\u0012\u01e8\b\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01ec"+
		"\b\u0012\n\u0012\f\u0012\u01ef\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01f7\b\u0012\u0001\u0013"+
		"\u0003\u0013\u01fa\b\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01fe\b"+
		"\u0013\n\u0013\f\u0013\u0201\t\u0013\u0001\u0013\u0003\u0013\u0204\b\u0013"+
		"\u0005\u0013\u0206\b\u0013\n\u0013\f\u0013\u0209\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u020e\b\u0014\n\u0014\f\u0014\u0211\t\u0014"+
		"\u0001\u0014\u0003\u0014\u0214\b\u0014\u0001\u0014\u0003\u0014\u0217\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u021b\b\u0014\n\u0014\f\u0014"+
		"\u021e\t\u0014\u0003\u0014\u0220\b\u0014\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0224\b\u0015\n\u0015\f\u0015\u0227\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u022b\b\u0015\n\u0015\f\u0015\u022e\t\u0015\u0001\u0016\u0003"+
		"\u0016\u0231\b\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0235\b\u0016"+
		"\n\u0016\f\u0016\u0238\t\u0016\u0001\u0017\u0004\u0017\u023b\b\u0017\u000b"+
		"\u0017\f\u0017\u023c\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0242"+
		"\b\u0018\n\u0018\f\u0018\u0245\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u024a\b\u0018\n\u0018\f\u0018\u024d\t\u0018\u0005\u0018\u024f"+
		"\b\u0018\n\u0018\f\u0018\u0252\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0257\b\u0018\n\u0018\f\u0018\u025a\t\u0018\u0003\u0018\u025c"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u0260\b\u0019\n\u0019\f\u0019"+
		"\u0263\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0268\b"+
		"\u0019\n\u0019\f\u0019\u026b\t\u0019\u0005\u0019\u026d\b\u0019\n\u0019"+
		"\f\u0019\u0270\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0275\b\u0019\n\u0019\f\u0019\u0278\t\u0019\u0001\u0019\u0003\u0019\u027b"+
		"\b\u0019\u0001\u0019\u0003\u0019\u027e\b\u0019\u0001\u001a\u0003\u001a"+
		"\u0281\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0285\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0289\b\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u028d\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0295\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u02a8\b\u001a\n\u001a\f\u001a"+
		"\u02ab\t\u001a\u0001\u001a\u0003\u001a\u02ae\b\u001a\u0001\u001a\u0005"+
		"\u001a\u02b1\b\u001a\n\u001a\f\u001a\u02b4\t\u001a\u0001\u001b\u0004\u001b"+
		"\u02b7\b\u001b\u000b\u001b\f\u001b\u02b8\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u02d3\b\u001c\u0001"+
		"\u001c\u0005\u001c\u02d6\b\u001c\n\u001c\f\u001c\u02d9\t\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u02df\b\u001d\n\u001d"+
		"\f\u001d\u02e2\t\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u02e6\b\u001e"+
		"\n\u001e\f\u001e\u02e9\t\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u02ed"+
		"\b\u001e\n\u001e\f\u001e\u02f0\t\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u02f4\b\u001e\n\u001e\f\u001e\u02f7\t\u001e\u0001\u001e\u0003\u001e\u02fa"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0005\u001f\u02fe\b\u001f\n\u001f\f\u001f"+
		"\u0301\t\u001f\u0001\u001f\u0005\u001f\u0304\b\u001f\n\u001f\f\u001f\u0307"+
		"\t\u001f\u0001\u001f\u0004\u001f\u030a\b\u001f\u000b\u001f\f\u001f\u030b"+
		"\u0001\u001f\u0005\u001f\u030f\b\u001f\n\u001f\f\u001f\u0312\t\u001f\u0003"+
		"\u001f\u0314\b\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u031a\b \n \f"+
		" \u031d\t \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0324\b \u0001!\u0001"+
		"!\u0005!\u0328\b!\n!\f!\u032b\t!\u0001!\u0001!\u0005!\u032f\b!\n!\f!\u0332"+
		"\t!\u0001!\u0001!\u0003!\u0336\b!\u0001!\u0005!\u0339\b!\n!\f!\u033c\t"+
		"!\u0003!\u033e\b!\u0001\"\u0001\"\u0003\"\u0342\b\"\u0001\"\u0003\"\u0345"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0005\"\u034a\b\"\n\"\f\"\u034d\t\"\u0001"+
		"\"\u0003\"\u0350\b\"\u0001\"\u0001\"\u0003\"\u0354\b\"\u0001\"\u0001\""+
		"\u0003\"\u0358\b\"\u0001\"\u0001\"\u0003\"\u035c\b\"\u0001\"\u0005\"\u035f"+
		"\b\"\n\"\f\"\u0362\t\"\u0001\"\u0003\"\u0365\b\"\u0001#\u0001#\u0001$"+
		"\u0001$\u0005$\u036b\b$\n$\f$\u036e\t$\u0001$\u0005$\u0371\b$\n$\f$\u0374"+
		"\t$\u0001$\u0001$\u0003$\u0378\b$\u0001%\u0003%\u037b\b%\u0001%\u0001"+
		"%\u0005%\u037f\b%\n%\f%\u0382\t%\u0001%\u0003%\u0385\b%\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0005&\u03a0\b&\n&\f&\u03a3\t&\u0001&\u0005&\u03a6"+
		"\b&\n&\f&\u03a9\t&\u0001&\u0001&\u0001&\u0001&\u0005&\u03af\b&\n&\f&\u03b2"+
		"\t&\u0001&\u0001&\u0001&\u0005&\u03b7\b&\n&\f&\u03ba\t&\u0001&\u0003&"+
		"\u03bd\b&\u0001&\u0005&\u03c0\b&\n&\f&\u03c3\t&\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u03df\b(\u0001(\u0005(\u03e2\b(\n(\f(\u03e5"+
		"\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0400\b)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u041c\b*\u0001*\u0000\u0000+\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRT\u0000\u0006\u0002\u0000)*01\u0001\u0000H"+
		"I\u0002\u0000\u001e\u001eJJ\u0002\u0000::SW\u0002\u0000\u0015\u0015)*"+
		"\u0002\u000055?A\u0520\u0000Y\u0001\u0000\u0000\u0000\u0002k\u0001\u0000"+
		"\u0000\u0000\u0004p\u0001\u0000\u0000\u0000\u0006\u00eb\u0001\u0000\u0000"+
		"\u0000\b\u00ed\u0001\u0000\u0000\u0000\n\u00ef\u0001\u0000\u0000\u0000"+
		"\f\u0112\u0001\u0000\u0000\u0000\u000e\u0142\u0001\u0000\u0000\u0000\u0010"+
		"\u0148\u0001\u0000\u0000\u0000\u0012\u015d\u0001\u0000\u0000\u0000\u0014"+
		"\u0166\u0001\u0000\u0000\u0000\u0016\u0168\u0001\u0000\u0000\u0000\u0018"+
		"\u0184\u0001\u0000\u0000\u0000\u001a\u0188\u0001\u0000\u0000\u0000\u001c"+
		"\u018a\u0001\u0000\u0000\u0000\u001e\u01b0\u0001\u0000\u0000\u0000 \u01ce"+
		"\u0001\u0000\u0000\u0000\"\u01d0\u0001\u0000\u0000\u0000$\u01f6\u0001"+
		"\u0000\u0000\u0000&\u01f9\u0001\u0000\u0000\u0000(\u021f\u0001\u0000\u0000"+
		"\u0000*\u0221\u0001\u0000\u0000\u0000,\u0230\u0001\u0000\u0000\u0000."+
		"\u023a\u0001\u0000\u0000\u00000\u025b\u0001\u0000\u0000\u00002\u027d\u0001"+
		"\u0000\u0000\u00004\u02ad\u0001\u0000\u0000\u00006\u02b6\u0001\u0000\u0000"+
		"\u00008\u02d2\u0001\u0000\u0000\u0000:\u02da\u0001\u0000\u0000\u0000<"+
		"\u02f9\u0001\u0000\u0000\u0000>\u0313\u0001\u0000\u0000\u0000@\u0323\u0001"+
		"\u0000\u0000\u0000B\u0325\u0001\u0000\u0000\u0000D\u033f\u0001\u0000\u0000"+
		"\u0000F\u0366\u0001\u0000\u0000\u0000H\u0377\u0001\u0000\u0000\u0000J"+
		"\u0384\u0001\u0000\u0000\u0000L\u03bc\u0001\u0000\u0000\u0000N\u03c4\u0001"+
		"\u0000\u0000\u0000P\u03de\u0001\u0000\u0000\u0000R\u03ff\u0001\u0000\u0000"+
		"\u0000T\u041b\u0001\u0000\u0000\u0000VX\u0005N\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Zb\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\c\u0003&\u0013\u0000]_\u0003\u000e\u0007\u0000^]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ac\u0001\u0000\u0000\u0000b\\\u0001\u0000\u0000\u0000b^\u0001\u0000"+
		"\u0000\u0000c\u0001\u0001\u0000\u0000\u0000dj\u00053\u0000\u0000ej\u0005"+
		"4\u0000\u0000fj\u0005N\u0000\u0000gj\u0003N\'\u0000hj\u0003\u0004\u0002"+
		"\u0000id\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000if\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"l\u0003\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000nq\u0003$\u0012"+
		"\u0000oq\u0003\u0006\u0003\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000q\u0005\u0001\u0000\u0000\u0000r\u00ec\u0005\u001f\u0000\u0000"+
		"sw\u0005 \u0000\u0000tv\u0005N\u0000\u0000ut\u0001\u0000\u0000\u0000v"+
		"y\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z~\u0003\b\u0004"+
		"\u0000{}\u0005N\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0003\u0010\b\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u00055\u0000\u0000\u0085\u00ec\u0001\u0000\u0000\u0000\u0086\u00ec\u0003"+
		"\n\u0005\u0000\u0087\u008b\u0005%\u0000\u0000\u0088\u008a\u0005N\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u0092\u0005>\u0000\u0000\u008f\u0091\u0005N\u0000\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0003&\u0013\u0000\u0096\u0097\u0005?\u0000\u0000\u0097\u00ec\u0001"+
		"\u0000\u0000\u0000\u0098\u009c\u0005&\u0000\u0000\u0099\u009b\u0005N\u0000"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a3\u0005>\u0000\u0000\u00a0\u00a2\u0005N\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0003&\u0013\u0000\u00a7\u00a8\u0005?\u0000\u0000\u00a8\u00ec\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ad\u0005\"\u0000\u0000\u00aa\u00ac\u0005N"+
		"\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b2\u0003\u0010\b\u0000\u00b1\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b7\u0005>\u0000\u0000\u00b4\u00b6\u0005N\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8"+
		"\u00c3\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba"+
		"\u00be\u0003\u0018\f\u0000\u00bb\u00bd\u0005N\u0000\u0000\u00bc\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00ba"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00ec"+
		"\u0005?\u0000\u0000\u00c7\u00cb\u0005!\u0000\u0000\u00c8\u00ca\u0005N"+
		"\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d2\u0003\u001a\r\u0000\u00cf\u00d1\u0005N\u0000"+
		"\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d9\u0005>\u0000\u0000\u00d6\u00d8\u0005N\u0000\u0000\u00d7"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"\u00e5\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc"+
		"\u00e0\u0003\u001c\u000e\u0000\u00dd\u00df\u0005N\u0000\u0000\u00de\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005?\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003"+
		" \u0010\u0000\u00ebr\u0001\u0000\u0000\u0000\u00ebs\u0001\u0000\u0000"+
		"\u0000\u00eb\u0086\u0001\u0000\u0000\u0000\u00eb\u0087\u0001\u0000\u0000"+
		"\u0000\u00eb\u0098\u0001\u0000\u0000\u0000\u00eb\u00a9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00c7\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u0007\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0000\u0000"+
		"\u0000\u00ee\t\u0001\u0000\u0000\u0000\u00ef\u00f3\u0005#\u0000\u0000"+
		"\u00f0\u00f2\u0005N\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f8\u0005\u001e\u0000\u0000\u00f7"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f9\u00fb\u0003D\"\u0000\u00fa\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fe\u0005N\u0000\u0000\u00fd\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0106\u0005"+
		">\u0000\u0000\u0103\u0105\u0005N\u0000\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000"+
		"\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010d\u0003&\u0013\u0000"+
		"\u010a\u010c\u0003\f\u0006\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c"+
		"\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0005?\u0000\u0000\u0111\u000b"+
		"\u0001\u0000\u0000\u0000\u0112\u0116\u0005$\u0000\u0000\u0113\u0115\u0005"+
		"N\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000"+
		"\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000"+
		"\u0000\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0119\u011d\u0005>\u0000\u0000\u011a\u011c\u0005N\u0000\u0000"+
		"\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0003&\u0013\u0000\u0121\u0125\u0005?\u0000\u0000\u0122\u0124"+
		"\u0005N\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0127\u0001"+
		"\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\r\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0128\u012c\u0003D\"\u0000\u0129\u012b\u0005N\u0000\u0000"+
		"\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000"+
		"\u012d\u013f\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000"+
		"\u012f\u0133\u00057\u0000\u0000\u0130\u0132\u0005N\u0000\u0000\u0131\u0130"+
		"\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136"+
		"\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u013a"+
		"\u0003D\"\u0000\u0137\u0139\u0005N\u0000\u0000\u0138\u0137\u0001\u0000"+
		"\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000"+
		"\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u012f\u0001\u0000"+
		"\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0128\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0005>\u0000\u0000\u0145\u0146\u0003&\u0013\u0000"+
		"\u0146\u0147\u0005?\u0000\u0000\u0147\u000f\u0001\u0000\u0000\u0000\u0148"+
		"\u0153\u0003\u0012\t\u0000\u0149\u014d\u00057\u0000\u0000\u014a\u014c"+
		"\u0005N\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014f\u0001"+
		"\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001"+
		"\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u014d\u0001"+
		"\u0000\u0000\u0000\u0150\u0152\u0003\u0012\t\u0000\u0151\u0149\u0001\u0000"+
		"\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0011\u0001\u0000"+
		"\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u015a\u0003\u0014"+
		"\n\u0000\u0157\u0159\u0005N\u0000\u0000\u0158\u0157\u0001\u0000\u0000"+
		"\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u0156\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0013\u0001\u0000\u0000"+
		"\u0000\u0161\u0164\u0005\u001e\u0000\u0000\u0162\u0164\u0003\u0016\u000b"+
		"\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0162\u0001\u0000\u0000"+
		"\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0167\u0003T*\u0000\u0166"+
		"\u0163\u0001\u0000\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0015\u0001\u0000\u0000\u0000\u0168\u016c\u0005B\u0000\u0000\u0169\u016b"+
		"\u0005N\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b\u016e\u0001"+
		"\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001"+
		"\u0000\u0000\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u016c\u0001"+
		"\u0000\u0000\u0000\u016f\u0173\u0005\u001e\u0000\u0000\u0170\u0172\u0005"+
		"N\u0000\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000"+
		"\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u017e\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0176\u017a\u00056\u0000\u0000\u0177\u0179\u0005N\u0000\u0000"+
		"\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000"+
		"\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000"+
		"\u017d\u017f\u0003.\u0017\u0000\u017e\u0176\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180"+
		"\u0181\u0005C\u0000\u0000\u0181\u0017\u0001\u0000\u0000\u0000\u0182\u0185"+
		"\u0003$\u0012\u0000\u0183\u0185\u0003\u0006\u0003\u0000\u0184\u0182\u0001"+
		"\u0000\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0019\u0001"+
		"\u0000\u0000\u0000\u0186\u0189\u0005\u001e\u0000\u0000\u0187\u0189\u0003"+
		"F#\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0187\u0001\u0000\u0000"+
		"\u0000\u0189\u001b\u0001\u0000\u0000\u0000\u018a\u0195\u0003\u001e\u000f"+
		"\u0000\u018b\u018f\u00057\u0000\u0000\u018c\u018e\u0005N\u0000\u0000\u018d"+
		"\u018c\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f"+
		"\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190"+
		"\u0192\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192"+
		"\u0194\u0003\u001e\u000f\u0000\u0193\u018b\u0001\u0000\u0000\u0000\u0194"+
		"\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0198\u019c\u0005>\u0000\u0000\u0199\u019b"+
		"\u0005N\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b\u019e\u0001"+
		"\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u019c\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0003&\u0013\u0000\u01a0\u01a1\u0005?\u0000"+
		"\u0000\u01a1\u001d\u0001\u0000\u0000\u0000\u01a2\u01a6\u0005\u001e\u0000"+
		"\u0000\u01a3\u01a5\u0005N\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01b1\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01ad\u0005.\u0000\u0000\u01aa"+
		"\u01ac\u0005N\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac\u01af"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b0\u01a2\u0001\u0000\u0000\u0000\u01b0\u01a9"+
		"\u0001\u0000\u0000\u0000\u01b1\u001f\u0001\u0000\u0000\u0000\u01b2\u01b6"+
		"\u0005\'\u0000\u0000\u01b3\u01b5\u0005N\u0000\u0000\u01b4\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01bc\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bb\u0003"+
		"L&\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01be\u0001\u0000\u0000"+
		"\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bf\u01cf\u0003\"\u0011\u0000\u01c0\u01c4\u0005\'\u0000\u0000"+
		"\u01c1\u01c3\u0005N\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c5\u01ca\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c9\u0003L&\u0000\u01c8\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cd\u0001"+
		"\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cd\u01cf\u0005"+
		"5\u0000\u0000\u01ce\u01b2\u0001\u0000\u0000\u0000\u01ce\u01c0\u0001\u0000"+
		"\u0000\u0000\u01cf!\u0001\u0000\u0000\u0000\u01d0\u01d4\u0005>\u0000\u0000"+
		"\u01d1\u01d3\u0005N\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005?\u0000\u0000\u01d8#\u0001"+
		"\u0000\u0000\u0000\u01d9\u01e4\u0003:\u001d\u0000\u01da\u01de\u00057\u0000"+
		"\u0000\u01db\u01dd\u0005N\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000"+
		"\u01dd\u01e0\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000"+
		"\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e3\u0003:\u001d\u0000\u01e2"+
		"\u01da\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7"+
		"\u01d9\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ed\u0005>\u0000\u0000\u01ea\u01ec"+
		"\u0005N\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001"+
		"\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0003&\u0013\u0000\u01f1\u01f2\u0005?\u0000"+
		"\u0000\u01f2\u01f7\u0001\u0000\u0000\u0000\u01f3\u01f4\u0003R)\u0000\u01f4"+
		"\u01f5\u0006\u0012\uffff\uffff\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f6\u01e7\u0001\u0000\u0000\u0000\u01f6\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f7%\u0001\u0000\u0000\u0000\u01f8\u01fa\u0003(\u0014\u0000\u01f9\u01f8"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u0207"+
		"\u0001\u0000\u0000\u0000\u01fb\u01ff\u00055\u0000\u0000\u01fc\u01fe\u0005"+
		"N\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fe\u0201\u0001\u0000"+
		"\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000"+
		"\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000"+
		"\u0000\u0000\u0202\u0204\u0003(\u0014\u0000\u0203\u0202\u0001\u0000\u0000"+
		"\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0206\u0001\u0000\u0000"+
		"\u0000\u0205\u01fb\u0001\u0000\u0000\u0000\u0206\u0209\u0001\u0000\u0000"+
		"\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000"+
		"\u0000\u0208\'\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000"+
		"\u020a\u020b\u0003,\u0016\u0000\u020b\u020f\u00056\u0000\u0000\u020c\u020e"+
		"\u0005N\u0000\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020e\u0211\u0001"+
		"\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001"+
		"\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001"+
		"\u0000\u0000\u0000\u0212\u0214\u0003.\u0017\u0000\u0213\u0212\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0216\u0001\u0000"+
		"\u0000\u0000\u0215\u0217\u0003*\u0015\u0000\u0216\u0215\u0001\u0000\u0000"+
		"\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0220\u0001\u0000\u0000"+
		"\u0000\u0218\u021c\u0003P(\u0000\u0219\u021b\u0003L&\u0000\u021a\u0219"+
		"\u0001\u0000\u0000\u0000\u021b\u021e\u0001\u0000\u0000\u0000\u021c\u021a"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u0220"+
		"\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021f\u020a"+
		"\u0001\u0000\u0000\u0000\u021f\u0218\u0001\u0000\u0000\u0000\u0220)\u0001"+
		"\u0000\u0000\u0000\u0221\u0225\u0005F\u0000\u0000\u0222\u0224\u0005N\u0000"+
		"\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000"+
		"\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000"+
		"\u0000\u0226\u0228\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000"+
		"\u0000\u0228\u022c\u0005\u001d\u0000\u0000\u0229\u022b\u0005N\u0000\u0000"+
		"\u022a\u0229\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000\u0000\u0000"+
		"\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000"+
		"\u022d+\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022f"+
		"\u0231\u0005H\u0000\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0236"+
		"\u0005\u001e\u0000\u0000\u0233\u0235\u0005N\u0000\u0000\u0234\u0233\u0001"+
		"\u0000\u0000\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237-\u0001\u0000"+
		"\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023b\u00030\u0018"+
		"\u0000\u023a\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000"+
		"\u0000\u023d/\u0001\u0000\u0000\u0000\u023e\u025c\u00034\u001a\u0000\u023f"+
		"\u0243\u0005>\u0000\u0000\u0240\u0242\u0005N\u0000\u0000\u0241\u0240\u0001"+
		"\u0000\u0000\u0000\u0242\u0245\u0001\u0000\u0000\u0000\u0243\u0241\u0001"+
		"\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0250\u0001"+
		"\u0000\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0246\u024f\u0003"+
		"L&\u0000\u0247\u024b\u00055\u0000\u0000\u0248\u024a\u0005N\u0000\u0000"+
		"\u0249\u0248\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000\u0000\u0000"+
		"\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000"+
		"\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000"+
		"\u024e\u0246\u0001\u0000\u0000\u0000\u024e\u0247\u0001\u0000\u0000\u0000"+
		"\u024f\u0252\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0253\u0001\u0000\u0000\u0000"+
		"\u0252\u0250\u0001\u0000\u0000\u0000\u0253\u025c\u0005?\u0000\u0000\u0254"+
		"\u0258\u0005\'\u0000\u0000\u0255\u0257\u0005N\u0000\u0000\u0256\u0255"+
		"\u0001\u0000\u0000\u0000\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025c"+
		"\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025b\u023e"+
		"\u0001\u0000\u0000\u0000\u025b\u023f\u0001\u0000\u0000\u0000\u025b\u0254"+
		"\u0001\u0000\u0000\u0000\u025c1\u0001\u0000\u0000\u0000\u025d\u0261\u0005"+
		"Q\u0000\u0000\u025e\u0260\u0005N\u0000\u0000\u025f\u025e\u0001\u0000\u0000"+
		"\u0000\u0260\u0263\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000"+
		"\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u026e\u0001\u0000\u0000"+
		"\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0264\u026d\u0003L&\u0000\u0265"+
		"\u0269\u00055\u0000\u0000\u0266\u0268\u0005N\u0000\u0000\u0267\u0266\u0001"+
		"\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001"+
		"\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026d\u0001"+
		"\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u0264\u0001"+
		"\u0000\u0000\u0000\u026c\u0265\u0001\u0000\u0000\u0000\u026d\u0270\u0001"+
		"\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026e\u026f\u0001"+
		"\u0000\u0000\u0000\u026f\u0271\u0001\u0000\u0000\u0000\u0270\u026e\u0001"+
		"\u0000\u0000\u0000\u0271\u027e\u0005C\u0000\u0000\u0272\u0276\u0005R\u0000"+
		"\u0000\u0273\u0275\u0005N\u0000\u0000\u0274\u0273\u0001\u0000\u0000\u0000"+
		"\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u027a\u0001\u0000\u0000\u0000"+
		"\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027b\u00036\u001b\u0000\u027a"+
		"\u0279\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u0001\u0000\u0000\u0000\u027c\u027e\u0005C\u0000\u0000\u027d\u025d"+
		"\u0001\u0000\u0000\u0000\u027d\u0272\u0001\u0000\u0000\u0000\u027e3\u0001"+
		"\u0000\u0000\u0000\u027f\u0281\u0005H\u0000\u0000\u0280\u027f\u0001\u0000"+
		"\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000"+
		"\u0000\u0000\u0282\u02ae\u0005\u001e\u0000\u0000\u0283\u0285\u0007\u0001"+
		"\u0000\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000"+
		"\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u02ae\u0005-\u0000"+
		"\u0000\u0287\u0289\u0007\u0001\u0000\u0000\u0288\u0287\u0001\u0000\u0000"+
		"\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000"+
		"\u0000\u028a\u02ae\u0005.\u0000\u0000\u028b\u028d\u0007\u0001\u0000\u0000"+
		"\u028c\u028b\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000"+
		"\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u02ae\u0005/\u0000\u0000\u028f"+
		"\u02ae\u0003F#\u0000\u0290\u02ae\u00050\u0000\u0000\u0291\u02ae\u0005"+
		"1\u0000\u0000\u0292\u02ae\u0005+\u0000\u0000\u0293\u0295\u0007\u0001\u0000"+
		"\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000"+
		"\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u02ae\u00032\u0019\u0000"+
		"\u0297\u02ae\u00057\u0000\u0000\u0298\u02ae\u0005;\u0000\u0000\u0299\u02ae"+
		"\u0003H$\u0000\u029a\u02ae\u0005(\u0000\u0000\u029b\u02ae\u00052\u0000"+
		"\u0000\u029c\u02ae\u0005S\u0000\u0000\u029d\u02ae\u00056\u0000\u0000\u029e"+
		"\u02ae\u0005<\u0000\u0000\u029f\u02ae\u0005=\u0000\u0000\u02a0\u02ae\u0005"+
		"8\u0000\u0000\u02a1\u02ae\u00059\u0000\u0000\u02a2\u02ae\u0005:\u0000"+
		"\u0000\u02a3\u02ae\u0005J\u0000\u0000\u02a4\u02ae\u0005T\u0000\u0000\u02a5"+
		"\u02a9\u0005B\u0000\u0000\u02a6\u02a8\u00034\u001a\u0000\u02a7\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ac\u0001"+
		"\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02ae\u0005"+
		"C\u0000\u0000\u02ad\u0280\u0001\u0000\u0000\u0000\u02ad\u0284\u0001\u0000"+
		"\u0000\u0000\u02ad\u0288\u0001\u0000\u0000\u0000\u02ad\u028c\u0001\u0000"+
		"\u0000\u0000\u02ad\u028f\u0001\u0000\u0000\u0000\u02ad\u0290\u0001\u0000"+
		"\u0000\u0000\u02ad\u0291\u0001\u0000\u0000\u0000\u02ad\u0292\u0001\u0000"+
		"\u0000\u0000\u02ad\u0294\u0001\u0000\u0000\u0000\u02ad\u0297\u0001\u0000"+
		"\u0000\u0000\u02ad\u0298\u0001\u0000\u0000\u0000\u02ad\u0299\u0001\u0000"+
		"\u0000\u0000\u02ad\u029a\u0001\u0000\u0000\u0000\u02ad\u029b\u0001\u0000"+
		"\u0000\u0000\u02ad\u029c\u0001\u0000\u0000\u0000\u02ad\u029d\u0001\u0000"+
		"\u0000\u0000\u02ad\u029e\u0001\u0000\u0000\u0000\u02ad\u029f\u0001\u0000"+
		"\u0000\u0000\u02ad\u02a0\u0001\u0000\u0000\u0000\u02ad\u02a1\u0001\u0000"+
		"\u0000\u0000\u02ad\u02a2\u0001\u0000\u0000\u0000\u02ad\u02a3\u0001\u0000"+
		"\u0000\u0000\u02ad\u02a4\u0001\u0000\u0000\u0000\u02ad\u02a5\u0001\u0000"+
		"\u0000\u0000\u02ae\u02b2\u0001\u0000\u0000\u0000\u02af\u02b1\u0005N\u0000"+
		"\u0000\u02b0\u02af\u0001\u0000\u0000\u0000\u02b1\u02b4\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b35\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b7\u00038\u001c\u0000\u02b6\u02b5\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8"+
		"\u02b9\u0001\u0000\u0000\u0000\u02b97\u0001\u0000\u0000\u0000\u02ba\u02d3"+
		"\u0005\u001e\u0000\u0000\u02bb\u02d3\u0005I\u0000\u0000\u02bc\u02d3\u0005"+
		"H\u0000\u0000\u02bd\u02d3\u0005J\u0000\u0000\u02be\u02d3\u0005;\u0000"+
		"\u0000\u02bf\u02d3\u0005B\u0000\u0000\u02c0\u02d3\u0005C\u0000\u0000\u02c1"+
		"\u02d3\u0005-\u0000\u0000\u02c2\u02d3\u0005.\u0000\u0000\u02c3\u02d3\u0005"+
		"/\u0000\u0000\u02c4\u02d3\u0005+\u0000\u0000\u02c5\u02d3\u0003F#\u0000"+
		"\u02c6\u02d3\u00032\u0019\u0000\u02c7\u02d3\u00057\u0000\u0000\u02c8\u02d3"+
		"\u0005(\u0000\u0000\u02c9\u02d3\u00052\u0000\u0000\u02ca\u02d3\u0005S"+
		"\u0000\u0000\u02cb\u02d3\u00056\u0000\u0000\u02cc\u02d3\u0005<\u0000\u0000"+
		"\u02cd\u02d3\u0005=\u0000\u0000\u02ce\u02d3\u00058\u0000\u0000\u02cf\u02d3"+
		"\u00059\u0000\u0000\u02d0\u02d3\u0005:\u0000\u0000\u02d1\u02d3\u0005T"+
		"\u0000\u0000\u02d2\u02ba\u0001\u0000\u0000\u0000\u02d2\u02bb\u0001\u0000"+
		"\u0000\u0000\u02d2\u02bc\u0001\u0000\u0000\u0000\u02d2\u02bd\u0001\u0000"+
		"\u0000\u0000\u02d2\u02be\u0001\u0000\u0000\u0000\u02d2\u02bf\u0001\u0000"+
		"\u0000\u0000\u02d2\u02c0\u0001\u0000\u0000\u0000\u02d2\u02c1\u0001\u0000"+
		"\u0000\u0000\u02d2\u02c2\u0001\u0000\u0000\u0000\u02d2\u02c3\u0001\u0000"+
		"\u0000\u0000\u02d2\u02c4\u0001\u0000\u0000\u0000\u02d2\u02c5\u0001\u0000"+
		"\u0000\u0000\u02d2\u02c6\u0001\u0000\u0000\u0000\u02d2\u02c7\u0001\u0000"+
		"\u0000\u0000\u02d2\u02c8\u0001\u0000\u0000\u0000\u02d2\u02c9\u0001\u0000"+
		"\u0000\u0000\u02d2\u02ca\u0001\u0000\u0000\u0000\u02d2\u02cb\u0001\u0000"+
		"\u0000\u0000\u02d2\u02cc\u0001\u0000\u0000\u0000\u02d2\u02cd\u0001\u0000"+
		"\u0000\u0000\u02d2\u02ce\u0001\u0000\u0000\u0000\u02d2\u02cf\u0001\u0000"+
		"\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d1\u0001\u0000"+
		"\u0000\u0000\u02d3\u02d7\u0001\u0000\u0000\u0000\u02d4\u02d6\u0005N\u0000"+
		"\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d9\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000"+
		"\u0000\u02d89\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000"+
		"\u02da\u02e0\u0003>\u001f\u0000\u02db\u02dc\u0003<\u001e\u0000\u02dc\u02dd"+
		"\u0003>\u001f\u0000\u02dd\u02df\u0001\u0000\u0000\u0000\u02de\u02db\u0001"+
		"\u0000\u0000\u0000\u02df\u02e2\u0001\u0000\u0000\u0000\u02e0\u02de\u0001"+
		"\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1;\u0001\u0000"+
		"\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e7\u0005<\u0000"+
		"\u0000\u02e4\u02e6\u0005N\u0000\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e9\u0001\u0000\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000"+
		"\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02fa\u0001\u0000\u0000\u0000"+
		"\u02e9\u02e7\u0001\u0000\u0000\u0000\u02ea\u02ee\u0005I\u0000\u0000\u02eb"+
		"\u02ed\u0005N\u0000\u0000\u02ec\u02eb\u0001\u0000\u0000\u0000\u02ed\u02f0"+
		"\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ef"+
		"\u0001\u0000\u0000\u0000\u02ef\u02fa\u0001\u0000\u0000\u0000\u02f0\u02ee"+
		"\u0001\u0000\u0000\u0000\u02f1\u02f5\u0005G\u0000\u0000\u02f2\u02f4\u0005"+
		"N\u0000\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f7\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000"+
		"\u0000\u0000\u02f6\u02fa\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f8\u02fa\u0005N\u0000\u0000\u02f9\u02e3\u0001\u0000\u0000"+
		"\u0000\u02f9\u02ea\u0001\u0000\u0000\u0000\u02f9\u02f1\u0001\u0000\u0000"+
		"\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02fa=\u0001\u0000\u0000\u0000"+
		"\u02fb\u02ff\u0007\u0002\u0000\u0000\u02fc\u02fe\u0003@ \u0000\u02fd\u02fc"+
		"\u0001\u0000\u0000\u0000\u02fe\u0301\u0001\u0000\u0000\u0000\u02ff\u02fd"+
		"\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0305"+
		"\u0001\u0000\u0000\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0302\u0304"+
		"\u0005N\u0000\u0000\u0303\u0302\u0001\u0000\u0000\u0000\u0304\u0307\u0001"+
		"\u0000\u0000\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0305\u0306\u0001"+
		"\u0000\u0000\u0000\u0306\u0314\u0001\u0000\u0000\u0000\u0307\u0305\u0001"+
		"\u0000\u0000\u0000\u0308\u030a\u0003@ \u0000\u0309\u0308\u0001\u0000\u0000"+
		"\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000"+
		"\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u0310\u0001\u0000\u0000"+
		"\u0000\u030d\u030f\u0005N\u0000\u0000\u030e\u030d\u0001\u0000\u0000\u0000"+
		"\u030f\u0312\u0001\u0000\u0000\u0000\u0310\u030e\u0001\u0000\u0000\u0000"+
		"\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0314\u0001\u0000\u0000\u0000"+
		"\u0312\u0310\u0001\u0000\u0000\u0000\u0313\u02fb\u0001\u0000\u0000\u0000"+
		"\u0313\u0309\u0001\u0000\u0000\u0000\u0314?\u0001\u0000\u0000\u0000\u0315"+
		"\u0324\u0005+\u0000\u0000\u0316\u0324\u0005(\u0000\u0000\u0317\u031b\u0005"+
		"D\u0000\u0000\u0318\u031a\u0005N\u0000\u0000\u0319\u0318\u0001\u0000\u0000"+
		"\u0000\u031a\u031d\u0001\u0000\u0000\u0000\u031b\u0319\u0001\u0000\u0000"+
		"\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031e\u0001\u0000\u0000"+
		"\u0000\u031d\u031b\u0001\u0000\u0000\u0000\u031e\u031f\u0003B!\u0000\u031f"+
		"\u0320\u0005E\u0000\u0000\u0320\u0324\u0001\u0000\u0000\u0000\u0321\u0324"+
		"\u0003D\"\u0000\u0322\u0324\u0005\u0017\u0000\u0000\u0323\u0315\u0001"+
		"\u0000\u0000\u0000\u0323\u0316\u0001\u0000\u0000\u0000\u0323\u0317\u0001"+
		"\u0000\u0000\u0000\u0323\u0321\u0001\u0000\u0000\u0000\u0323\u0322\u0001"+
		"\u0000\u0000\u0000\u0324A\u0001\u0000\u0000\u0000\u0325\u0329\u0005\u001e"+
		"\u0000\u0000\u0326\u0328\u0005N\u0000\u0000\u0327\u0326\u0001\u0000\u0000"+
		"\u0000\u0328\u032b\u0001\u0000\u0000\u0000\u0329\u0327\u0001\u0000\u0000"+
		"\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u033d\u0001\u0000\u0000"+
		"\u0000\u032b\u0329\u0001\u0000\u0000\u0000\u032c\u0330\u0007\u0003\u0000"+
		"\u0000\u032d\u032f\u0005N\u0000\u0000\u032e\u032d\u0001\u0000\u0000\u0000"+
		"\u032f\u0332\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000"+
		"\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0335\u0001\u0000\u0000\u0000"+
		"\u0332\u0330\u0001\u0000\u0000\u0000\u0333\u0336\u0005\u001e\u0000\u0000"+
		"\u0334\u0336\u0003F#\u0000\u0335\u0333\u0001\u0000\u0000\u0000\u0335\u0334"+
		"\u0001\u0000\u0000\u0000\u0336\u033a\u0001\u0000\u0000\u0000\u0337\u0339"+
		"\u0005N\u0000\u0000\u0338\u0337\u0001\u0000\u0000\u0000\u0339\u033c\u0001"+
		"\u0000\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033a\u033b\u0001"+
		"\u0000\u0000\u0000\u033b\u033e\u0001\u0000\u0000\u0000\u033c\u033a\u0001"+
		"\u0000\u0000\u0000\u033d\u032c\u0001\u0000\u0000\u0000\u033d\u033e\u0001"+
		"\u0000\u0000\u0000\u033eC\u0001\u0000\u0000\u0000\u033f\u0341\u00056\u0000"+
		"\u0000\u0340\u0342\u00056\u0000\u0000\u0341\u0340\u0001\u0000\u0000\u0000"+
		"\u0341\u0342\u0001\u0000\u0000\u0000\u0342\u0364\u0001\u0000\u0000\u0000"+
		"\u0343\u0345\u0005H\u0000\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u0344"+
		"\u0345\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346"+
		"\u0365\u0005\u001e\u0000\u0000\u0347\u034b\u0005R\u0000\u0000\u0348\u034a"+
		"\u0005N\u0000\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u034a\u034d\u0001"+
		"\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034b\u034c\u0001"+
		"\u0000\u0000\u0000\u034c\u035b\u0001\u0000\u0000\u0000\u034d\u034b\u0001"+
		"\u0000\u0000\u0000\u034e\u0350\u0005H\u0000\u0000\u034f\u034e\u0001\u0000"+
		"\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0351\u0001\u0000"+
		"\u0000\u0000\u0351\u035c\u0005\u001e\u0000\u0000\u0352\u0354\u0005H\u0000"+
		"\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0353\u0354\u0001\u0000\u0000"+
		"\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355\u035c\u0005-\u0000\u0000"+
		"\u0356\u0358\u0005H\u0000\u0000\u0357\u0356\u0001\u0000\u0000\u0000\u0357"+
		"\u0358\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000\u0359"+
		"\u035c\u0005,\u0000\u0000\u035a\u035c\u0003>\u001f\u0000\u035b\u034f\u0001"+
		"\u0000\u0000\u0000\u035b\u0353\u0001\u0000\u0000\u0000\u035b\u0357\u0001"+
		"\u0000\u0000\u0000\u035b\u035a\u0001\u0000\u0000\u0000\u035c\u0360\u0001"+
		"\u0000\u0000\u0000\u035d\u035f\u0005N\u0000\u0000\u035e\u035d\u0001\u0000"+
		"\u0000\u0000\u035f\u0362\u0001\u0000\u0000\u0000\u0360\u035e\u0001\u0000"+
		"\u0000\u0000\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0363\u0001\u0000"+
		"\u0000\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0363\u0365\u0005C\u0000"+
		"\u0000\u0364\u0344\u0001\u0000\u0000\u0000\u0364\u0347\u0001\u0000\u0000"+
		"\u0000\u0365E\u0001\u0000\u0000\u0000\u0366\u0367\u0007\u0004\u0000\u0000"+
		"\u0367G\u0001\u0000\u0000\u0000\u0368\u036c\u0005D\u0000\u0000\u0369\u036b"+
		"\u0005N\u0000\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036b\u036e\u0001"+
		"\u0000\u0000\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036c\u036d\u0001"+
		"\u0000\u0000\u0000\u036d\u0372\u0001\u0000\u0000\u0000\u036e\u036c\u0001"+
		"\u0000\u0000\u0000\u036f\u0371\u0003J%\u0000\u0370\u036f\u0001\u0000\u0000"+
		"\u0000\u0371\u0374\u0001\u0000\u0000\u0000\u0372\u0370\u0001\u0000\u0000"+
		"\u0000\u0372\u0373\u0001\u0000\u0000\u0000\u0373\u0375\u0001\u0000\u0000"+
		"\u0000\u0374\u0372\u0001\u0000\u0000\u0000\u0375\u0378\u0005E\u0000\u0000"+
		"\u0376\u0378\u0005\u0019\u0000\u0000\u0377\u0368\u0001\u0000\u0000\u0000"+
		"\u0377\u0376\u0001\u0000\u0000\u0000\u0378I\u0001\u0000\u0000\u0000\u0379"+
		"\u037b\u0005H\u0000\u0000\u037a\u0379\u0001\u0000\u0000\u0000\u037a\u037b"+
		"\u0001\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u0380"+
		"\u0005\u001e\u0000\u0000\u037d\u037f\u0005N\u0000\u0000\u037e\u037d\u0001"+
		"\u0000\u0000\u0000\u037f\u0382\u0001\u0000\u0000\u0000\u0380\u037e\u0001"+
		"\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381\u0385\u0001"+
		"\u0000\u0000\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0383\u0385\u0005"+
		"\u0019\u0000\u0000\u0384\u037a\u0001\u0000\u0000\u0000\u0384\u0383\u0001"+
		"\u0000\u0000\u0000\u0385K\u0001\u0000\u0000\u0000\u0386\u03bd\u0005\u001e"+
		"\u0000\u0000\u0387\u03bd\u0005(\u0000\u0000\u0388\u03bd\u0005-\u0000\u0000"+
		"\u0389\u03bd\u0005.\u0000\u0000\u038a\u03bd\u0005/\u0000\u0000\u038b\u03bd"+
		"\u0003F#\u0000\u038c\u03bd\u00050\u0000\u0000\u038d\u03bd\u00051\u0000"+
		"\u0000\u038e\u03bd\u0005+\u0000\u0000\u038f\u03bd\u00052\u0000\u0000\u0390"+
		"\u03bd\u0005S\u0000\u0000\u0391\u03bd\u00056\u0000\u0000\u0392\u03bd\u0005"+
		"7\u0000\u0000\u0393\u03bd\u0005<\u0000\u0000\u0394\u03bd\u0005=\u0000"+
		"\u0000\u0395\u03bd\u00058\u0000\u0000\u0396\u03bd\u00059\u0000\u0000\u0397"+
		"\u03bd\u0005:\u0000\u0000\u0398\u03bd\u0005;\u0000\u0000\u0399\u03bd\u0005"+
		"F\u0000\u0000\u039a\u03bd\u0005H\u0000\u0000\u039b\u03bd\u0005I\u0000"+
		"\u0000\u039c\u03bd\u0005J\u0000\u0000\u039d\u03a1\u0005R\u0000\u0000\u039e"+
		"\u03a0\u0005N\u0000\u0000\u039f\u039e\u0001\u0000\u0000\u0000\u03a0\u03a3"+
		"\u0001\u0000\u0000\u0000\u03a1\u039f\u0001\u0000\u0000\u0000\u03a1\u03a2"+
		"\u0001\u0000\u0000\u0000\u03a2\u03a7\u0001\u0000\u0000\u0000\u03a3\u03a1"+
		"\u0001\u0000\u0000\u0000\u03a4\u03a6\u0003L&\u0000\u03a5\u03a4\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a9\u0001\u0000\u0000\u0000\u03a7\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03aa\u0001\u0000"+
		"\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03aa\u03bd\u0005C\u0000"+
		"\u0000\u03ab\u03bd\u0005T\u0000\u0000\u03ac\u03b0\u0005B\u0000\u0000\u03ad"+
		"\u03af\u0003L&\u0000\u03ae\u03ad\u0001\u0000\u0000\u0000\u03af\u03b2\u0001"+
		"\u0000\u0000\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001"+
		"\u0000\u0000\u0000\u03b1\u03b3\u0001\u0000\u0000\u0000\u03b2\u03b0\u0001"+
		"\u0000\u0000\u0000\u03b3\u03bd\u0005C\u0000\u0000\u03b4\u03b8\u0005D\u0000"+
		"\u0000\u03b5\u03b7\u0003L&\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7"+
		"\u03ba\u0001\u0000\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b8"+
		"\u03b9\u0001\u0000\u0000\u0000\u03b9\u03bb\u0001\u0000\u0000\u0000\u03ba"+
		"\u03b8\u0001\u0000\u0000\u0000\u03bb\u03bd\u0005E\u0000\u0000\u03bc\u0386"+
		"\u0001\u0000\u0000\u0000\u03bc\u0387\u0001\u0000\u0000\u0000\u03bc\u0388"+
		"\u0001\u0000\u0000\u0000\u03bc\u0389\u0001\u0000\u0000\u0000\u03bc\u038a"+
		"\u0001\u0000\u0000\u0000\u03bc\u038b\u0001\u0000\u0000\u0000\u03bc\u038c"+
		"\u0001\u0000\u0000\u0000\u03bc\u038d\u0001\u0000\u0000\u0000\u03bc\u038e"+
		"\u0001\u0000\u0000\u0000\u03bc\u038f\u0001\u0000\u0000\u0000\u03bc\u0390"+
		"\u0001\u0000\u0000\u0000\u03bc\u0391\u0001\u0000\u0000\u0000\u03bc\u0392"+
		"\u0001\u0000\u0000\u0000\u03bc\u0393\u0001\u0000\u0000\u0000\u03bc\u0394"+
		"\u0001\u0000\u0000\u0000\u03bc\u0395\u0001\u0000\u0000\u0000\u03bc\u0396"+
		"\u0001\u0000\u0000\u0000\u03bc\u0397\u0001\u0000\u0000\u0000\u03bc\u0398"+
		"\u0001\u0000\u0000\u0000\u03bc\u0399\u0001\u0000\u0000\u0000\u03bc\u039a"+
		"\u0001\u0000\u0000\u0000\u03bc\u039b\u0001\u0000\u0000\u0000\u03bc\u039c"+
		"\u0001\u0000\u0000\u0000\u03bc\u039d\u0001\u0000\u0000\u0000\u03bc\u03ab"+
		"\u0001\u0000\u0000\u0000\u03bc\u03ac\u0001\u0000\u0000\u0000\u03bc\u03b4"+
		"\u0001\u0000\u0000\u0000\u03bd\u03c1\u0001\u0000\u0000\u0000\u03be\u03c0"+
		"\u0005N\u0000\u0000\u03bf\u03be\u0001\u0000\u0000\u0000\u03c0\u03c3\u0001"+
		"\u0000\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001"+
		"\u0000\u0000\u0000\u03c2M\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c5\u0007\u0005\u0000\u0000\u03c5O\u0001\u0000\u0000"+
		"\u0000\u03c6\u03df\u0005(\u0000\u0000\u03c7\u03df\u0005-\u0000\u0000\u03c8"+
		"\u03df\u0005.\u0000\u0000\u03c9\u03df\u0005/\u0000\u0000\u03ca\u03df\u0003"+
		"F#\u0000\u03cb\u03df\u00057\u0000\u0000\u03cc\u03df\u0005+\u0000\u0000"+
		"\u03cd\u03df\u00050\u0000\u0000\u03ce\u03df\u00051\u0000\u0000\u03cf\u03df"+
		"\u0005<\u0000\u0000\u03d0\u03df\u0005=\u0000\u0000\u03d1\u03df\u00058"+
		"\u0000\u0000\u03d2\u03df\u00059\u0000\u0000\u03d3\u03df\u0005:\u0000\u0000"+
		"\u03d4\u03df\u0005;\u0000\u0000\u03d5\u03df\u0005F\u0000\u0000\u03d6\u03df"+
		"\u0005I\u0000\u0000\u03d7\u03df\u0005J\u0000\u0000\u03d8\u03df\u0005T"+
		"\u0000\u0000\u03d9\u03df\u0005S\u0000\u0000\u03da\u03df\u00056\u0000\u0000"+
		"\u03db\u03df\u0005\\\u0000\u0000\u03dc\u03df\u0005X\u0000\u0000\u03dd"+
		"\u03df\u0005Y\u0000\u0000\u03de\u03c6\u0001\u0000\u0000\u0000\u03de\u03c7"+
		"\u0001\u0000\u0000\u0000\u03de\u03c8\u0001\u0000\u0000\u0000\u03de\u03c9"+
		"\u0001\u0000\u0000\u0000\u03de\u03ca\u0001\u0000\u0000\u0000\u03de\u03cb"+
		"\u0001\u0000\u0000\u0000\u03de\u03cc\u0001\u0000\u0000\u0000\u03de\u03cd"+
		"\u0001\u0000\u0000\u0000\u03de\u03ce\u0001\u0000\u0000\u0000\u03de\u03cf"+
		"\u0001\u0000\u0000\u0000\u03de\u03d0\u0001\u0000\u0000\u0000\u03de\u03d1"+
		"\u0001\u0000\u0000\u0000\u03de\u03d2\u0001\u0000\u0000\u0000\u03de\u03d3"+
		"\u0001\u0000\u0000\u0000\u03de\u03d4\u0001\u0000\u0000\u0000\u03de\u03d5"+
		"\u0001\u0000\u0000\u0000\u03de\u03d6\u0001\u0000\u0000\u0000\u03de\u03d7"+
		"\u0001\u0000\u0000\u0000\u03de\u03d8\u0001\u0000\u0000\u0000\u03de\u03d9"+
		"\u0001\u0000\u0000\u0000\u03de\u03da\u0001\u0000\u0000\u0000\u03de\u03db"+
		"\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000\u0000\u03de\u03dd"+
		"\u0001\u0000\u0000\u0000\u03df\u03e3\u0001\u0000\u0000\u0000\u03e0\u03e2"+
		"\u0005N\u0000\u0000\u03e1\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e5\u0001"+
		"\u0000\u0000\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001"+
		"\u0000\u0000\u0000\u03e4Q\u0001\u0000\u0000\u0000\u03e5\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e6\u0400\u0005-\u0000\u0000\u03e7\u0400\u0005.\u0000\u0000"+
		"\u03e8\u0400\u0005/\u0000\u0000\u03e9\u0400\u0003F#\u0000\u03ea\u0400"+
		"\u00050\u0000\u0000\u03eb\u0400\u00051\u0000\u0000\u03ec\u0400\u00052"+
		"\u0000\u0000\u03ed\u0400\u0005S\u0000\u0000\u03ee\u0400\u00057\u0000\u0000"+
		"\u03ef\u0400\u0005<\u0000\u0000\u03f0\u0400\u0005=\u0000\u0000\u03f1\u0400"+
		"\u00058\u0000\u0000\u03f2\u0400\u00059\u0000\u0000\u03f3\u0400\u0005:"+
		"\u0000\u0000\u03f4\u0400\u0005;\u0000\u0000\u03f5\u0400\u0005F\u0000\u0000"+
		"\u03f6\u0400\u0005H\u0000\u0000\u03f7\u0400\u0005I\u0000\u0000\u03f8\u0400"+
		"\u0005T\u0000\u0000\u03f9\u0400\u0005C\u0000\u0000\u03fa\u0400\u0005X"+
		"\u0000\u0000\u03fb\u0400\u0005K\u0000\u0000\u03fc\u0400\u0005M\u0000\u0000"+
		"\u03fd\u0400\u0005L\u0000\u0000\u03fe\u0400\u0005Y\u0000\u0000\u03ff\u03e6"+
		"\u0001\u0000\u0000\u0000\u03ff\u03e7\u0001\u0000\u0000\u0000\u03ff\u03e8"+
		"\u0001\u0000\u0000\u0000\u03ff\u03e9\u0001\u0000\u0000\u0000\u03ff\u03ea"+
		"\u0001\u0000\u0000\u0000\u03ff\u03eb\u0001\u0000\u0000\u0000\u03ff\u03ec"+
		"\u0001\u0000\u0000\u0000\u03ff\u03ed\u0001\u0000\u0000\u0000\u03ff\u03ee"+
		"\u0001\u0000\u0000\u0000\u03ff\u03ef\u0001\u0000\u0000\u0000\u03ff\u03f0"+
		"\u0001\u0000\u0000\u0000\u03ff\u03f1\u0001\u0000\u0000\u0000\u03ff\u03f2"+
		"\u0001\u0000\u0000\u0000\u03ff\u03f3\u0001\u0000\u0000\u0000\u03ff\u03f4"+
		"\u0001\u0000\u0000\u0000\u03ff\u03f5\u0001\u0000\u0000\u0000\u03ff\u03f6"+
		"\u0001\u0000\u0000\u0000\u03ff\u03f7\u0001\u0000\u0000\u0000\u03ff\u03f8"+
		"\u0001\u0000\u0000\u0000\u03ff\u03f9\u0001\u0000\u0000\u0000\u03ff\u03fa"+
		"\u0001\u0000\u0000\u0000\u03ff\u03fb\u0001\u0000\u0000\u0000\u03ff\u03fc"+
		"\u0001\u0000\u0000\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000\u03ff\u03fe"+
		"\u0001\u0000\u0000\u0000\u0400S\u0001\u0000\u0000\u0000\u0401\u041c\u0005"+
		"-\u0000\u0000\u0402\u041c\u0005.\u0000\u0000\u0403\u041c\u0005/\u0000"+
		"\u0000\u0404\u041c\u0003F#\u0000\u0405\u041c\u00050\u0000\u0000\u0406"+
		"\u041c\u00051\u0000\u0000\u0407\u041c\u00052\u0000\u0000\u0408\u041c\u0005"+
		"S\u0000\u0000\u0409\u041c\u0005<\u0000\u0000\u040a\u041c\u0005=\u0000"+
		"\u0000\u040b\u041c\u00058\u0000\u0000\u040c\u041c\u00059\u0000\u0000\u040d"+
		"\u041c\u0005:\u0000\u0000\u040e\u041c\u0005;\u0000\u0000\u040f\u041c\u0005"+
		"F\u0000\u0000\u0410\u041c\u0005H\u0000\u0000\u0411\u041c\u0005I\u0000"+
		"\u0000\u0412\u041c\u0005T\u0000\u0000\u0413\u041c\u0005C\u0000\u0000\u0414"+
		"\u041c\u0005X\u0000\u0000\u0415\u041c\u00056\u0000\u0000\u0416\u041c\u0005"+
		"J\u0000\u0000\u0417\u041c\u0005R\u0000\u0000\u0418\u041c\u0005K\u0000"+
		"\u0000\u0419\u041c\u0005M\u0000\u0000\u041a\u041c\u0005L\u0000\u0000\u041b"+
		"\u0401\u0001\u0000\u0000\u0000\u041b\u0402\u0001\u0000\u0000\u0000\u041b"+
		"\u0403\u0001\u0000\u0000\u0000\u041b\u0404\u0001\u0000\u0000\u0000\u041b"+
		"\u0405\u0001\u0000\u0000\u0000\u041b\u0406\u0001\u0000\u0000\u0000\u041b"+
		"\u0407\u0001\u0000\u0000\u0000\u041b\u0408\u0001\u0000\u0000\u0000\u041b"+
		"\u0409\u0001\u0000\u0000\u0000\u041b\u040a\u0001\u0000\u0000\u0000\u041b"+
		"\u040b\u0001\u0000\u0000\u0000\u041b\u040c\u0001\u0000\u0000\u0000\u041b"+
		"\u040d\u0001\u0000\u0000\u0000\u041b\u040e\u0001\u0000\u0000\u0000\u041b"+
		"\u040f\u0001\u0000\u0000\u0000\u041b\u0410\u0001\u0000\u0000\u0000\u041b"+
		"\u0411\u0001\u0000\u0000\u0000\u041b\u0412\u0001\u0000\u0000\u0000\u041b"+
		"\u0413\u0001\u0000\u0000\u0000\u041b\u0414\u0001\u0000\u0000\u0000\u041b"+
		"\u0415\u0001\u0000\u0000\u0000\u041b\u0416\u0001\u0000\u0000\u0000\u041b"+
		"\u0417\u0001\u0000\u0000\u0000\u041b\u0418\u0001\u0000\u0000\u0000\u041b"+
		"\u0419\u0001\u0000\u0000\u0000\u041b\u041a\u0001\u0000\u0000\u0000\u041c"+
		"U\u0001\u0000\u0000\u0000\u0093Y`bikpw~\u0082\u008b\u0092\u009c\u00a3"+
		"\u00ad\u00b1\u00b7\u00be\u00c3\u00cb\u00d2\u00d9\u00e0\u00e5\u00eb\u00f3"+
		"\u00f7\u00fa\u00ff\u0106\u010d\u0116\u011d\u0125\u012c\u0133\u013a\u013f"+
		"\u0142\u014d\u0153\u015a\u015f\u0163\u0166\u016c\u0173\u017a\u017e\u0184"+
		"\u0188\u018f\u0195\u019c\u01a6\u01ad\u01b0\u01b6\u01bc\u01c4\u01ca\u01ce"+
		"\u01d4\u01de\u01e4\u01e7\u01ed\u01f6\u01f9\u01ff\u0203\u0207\u020f\u0213"+
		"\u0216\u021c\u021f\u0225\u022c\u0230\u0236\u023c\u0243\u024b\u024e\u0250"+
		"\u0258\u025b\u0261\u0269\u026c\u026e\u0276\u027a\u027d\u0280\u0284\u0288"+
		"\u028c\u0294\u02a9\u02ad\u02b2\u02b8\u02d2\u02d7\u02e0\u02e7\u02ee\u02f5"+
		"\u02f9\u02ff\u0305\u030b\u0310\u0313\u031b\u0323\u0329\u0330\u0335\u033a"+
		"\u033d\u0341\u0344\u034b\u034f\u0353\u0357\u035b\u0360\u0364\u036c\u0372"+
		"\u0377\u037a\u0380\u0384\u03a1\u03a7\u03b0\u03b8\u03bc\u03c1\u03de\u03e3"+
		"\u03ff\u041b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}