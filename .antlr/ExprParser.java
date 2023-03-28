// Generated from c:\Users\Jefeson\Desktop\jubiladores\Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT_1=2, COMMENT_2=3, IDENT=4, STRING_LITERAL=5, PROGRAM=6, 
		COLON=7, SEMI=8, ASSIGN=9, GREATHERTHAN=10, LESSTHAN=11, EQUALS=12, COMMA=13, 
		DOT=14, OPENPARENTHESIS=15, CLOSEPARENTHESIS=16, VAR=17, FUNCTION=18, 
		BEGIN=19, END=20, IDENTIFIER=21, THEN=22, DO=23, IF=24, ELSE=25, WHILE=26, 
		READ=27, PRINT=28, PLUS=29, MINUS=30, OR=31, ASTERISK=32, SLASH=33, AND=34, 
		NOT=35, NUM_INT=36, STRING_TYPE=37, INTEGER_TYPE=38, TYPE=39;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_var_declaration = 2, RULE_varblock = 3, 
		RULE_funcblock = 4, RULE_statements = 5, RULE_statement = 6, RULE_if = 7, 
		RULE_while = 8, RULE_attribution = 9, RULE_read = 10, RULE_print = 11, 
		RULE_expression = 12, RULE_simple_expression = 13, RULE_term = 14, RULE_factor = 15, 
		RULE_funccall = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "var_declaration", "varblock", "funcblock", "statements", 
			"statement", "if", "while", "attribution", "read", "print", "expression", 
			"simple_expression", "term", "factor", "funccall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'program'", "':'", "';'", "':='", 
			"'>'", "'<'", "'='", "','", "'.'", "'('", "')'", "'var'", "'function'", 
			"'begin'", "'end'", null, "'then'", "'do'", "'if'", "'else'", "'while'", 
			"'read'", "'print'", "'+'", "'-'", "'or'", "'*'", "'/'", "'and'", "'not'", 
			null, "'string'", "'integer'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", "PROGRAM", 
			"COLON", "SEMI", "ASSIGN", "GREATHERTHAN", "LESSTHAN", "EQUALS", "COMMA", 
			"DOT", "OPENPARENTHESIS", "CLOSEPARENTHESIS", "VAR", "FUNCTION", "BEGIN", 
			"END", "IDENTIFIER", "THEN", "DO", "IF", "ELSE", "WHILE", "READ", "PRINT", 
			"PLUS", "MINUS", "OR", "ASTERISK", "SLASH", "AND", "NOT", "NUM_INT", 
			"STRING_TYPE", "INTEGER_TYPE", "TYPE"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(ExprParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExprParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ExprParser.DOT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(PROGRAM);
			setState(35);
			match(IDENTIFIER);
			setState(36);
			match(SEMI);
			setState(37);
			block();
			setState(38);
			match(DOT);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public VarblockContext varblock() {
			return getRuleContext(VarblockContext.class,0);
		}
		public FuncblockContext funcblock() {
			return getRuleContext(FuncblockContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(40);
				match(VAR);
				setState(41);
				varblock();
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(44);
				funcblock();
				}
			}

			setState(47);
			statements();
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

	public static class Var_declarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExprParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExprParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(ExprParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(ExprParser.TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(IDENTIFIER);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(50);
				match(COMMA);
				setState(51);
				match(IDENTIFIER);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(COLON);
			setState(58);
			match(TYPE);
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

	public static class VarblockContext extends ParserRuleContext {
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ExprParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ExprParser.SEMI, i);
		}
		public VarblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varblock; }
	}

	public final VarblockContext varblock() throws RecognitionException {
		VarblockContext _localctx = new VarblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			var_declaration();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(61);
				match(SEMI);
				setState(62);
				var_declaration();
				}
				}
				setState(67);
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

	public static class FuncblockContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ExprParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExprParser.IDENTIFIER, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(ExprParser.OPENPARENTHESIS, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(ExprParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode COLON() { return getToken(ExprParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(ExprParser.TYPE, 0); }
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public FuncblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcblock; }
	}

	public final FuncblockContext funcblock() throws RecognitionException {
		FuncblockContext _localctx = new FuncblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(FUNCTION);
			setState(69);
			match(IDENTIFIER);
			setState(70);
			match(OPENPARENTHESIS);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(71);
				var_declaration();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(CLOSEPARENTHESIS);
			setState(78);
			match(COLON);
			setState(79);
			match(TYPE);
			setState(80);
			match(SEMI);
			setState(81);
			block();
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

	public static class StatementsContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ExprParser.BEGIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(ExprParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ExprParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ExprParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(BEGIN);
			setState(84);
			statement();
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					match(SEMI);
					setState(86);
					statement();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(92);
				match(SEMI);
				}
			}

			setState(95);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				attribution();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				statements();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				print();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(IF);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				match(WHILE);
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

	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ExprParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ExprParser.ELSE, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	}

	public final IfContext if() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IF);
			setState(105);
			expression();
			setState(106);
			match(THEN);
			setState(107);
			statement();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(108);
				match(ELSE);
				setState(109);
				statement();
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

	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(ExprParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
	}

	public final WhileContext while() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(WHILE);
			setState(113);
			expression();
			setState(114);
			match(DO);
			setState(115);
			statement();
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

	public static class AttributionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ExprParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribution);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(IDENTIFIER);
				setState(118);
				match(ASSIGN);
				setState(119);
				expression();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				read();
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(ExprParser.READ, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(ExprParser.OPENPARENTHESIS, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(ExprParser.CLOSEPARENTHESIS, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(READ);
			setState(124);
			match(OPENPARENTHESIS);
			setState(125);
			match(CLOSEPARENTHESIS);
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
		public TerminalNode PRINT() { return getToken(ExprParser.PRINT, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(ExprParser.OPENPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(ExprParser.CLOSEPARENTHESIS, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(PRINT);
			setState(128);
			match(OPENPARENTHESIS);
			setState(129);
			expression();
			setState(130);
			match(CLOSEPARENTHESIS);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<TerminalNode> LESSTHAN() { return getTokens(ExprParser.LESSTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(ExprParser.LESSTHAN, i);
		}
		public List<TerminalNode> GREATHERTHAN() { return getTokens(ExprParser.GREATHERTHAN); }
		public TerminalNode GREATHERTHAN(int i) {
			return getToken(ExprParser.GREATHERTHAN, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(ExprParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(ExprParser.EQUALS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			simple_expression();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATHERTHAN) | (1L << LESSTHAN) | (1L << EQUALS))) != 0)) {
				{
				{
				setState(133);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATHERTHAN) | (1L << LESSTHAN) | (1L << EQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				simple_expression();
				}
				}
				setState(139);
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

	public static class Simple_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ExprParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ExprParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ExprParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ExprParser.MINUS, i);
		}
		public List<TerminalNode> OR() { return getTokens(ExprParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ExprParser.OR, i);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simple_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			term();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << OR))) != 0)) {
				{
				{
				setState(141);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << OR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(142);
				term();
				}
				}
				setState(147);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(ExprParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(ExprParser.ASTERISK, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(ExprParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(ExprParser.SLASH, i);
		}
		public List<TerminalNode> AND() { return getTokens(ExprParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ExprParser.AND, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			factor();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASTERISK) {
				{
				{
				{
				setState(149);
				match(ASTERISK);
				setState(150);
				match(SLASH);
				setState(151);
				match(AND);
				}
				setState(153);
				factor();
				}
				}
				setState(158);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ExprParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExprParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public TerminalNode NUM_INT() { return getToken(ExprParser.NUM_INT, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(ExprParser.OPENPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(ExprParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExprParser.IDENTIFIER, 0); }
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(159);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(160);
					factor();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(NUM_INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(164);
				match(OPENPARENTHESIS);
				setState(165);
				expression();
				setState(166);
				match(CLOSEPARENTHESIS);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				funccall();
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

	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprParser.IDENTIFIER, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(ExprParser.OPENPARENTHESIS, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(ExprParser.CLOSEPARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ExprParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ExprParser.SEMI, i);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(IDENTIFIER);
			setState(173);
			match(OPENPARENTHESIS);
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(174);
				expression();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(175);
					match(SEMI);
					setState(176);
					expression();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(184);
			match(CLOSEPARENTHESIS);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00bd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3-\n\3\3\3\5\3\60\n\3\3\3\3\3\3\4\3"+
		"\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5B\n\5\f\5"+
		"\16\5E\13\5\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\5\7`\n\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13|\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\7\16\u008a\n\16\f\16\16\16\u008d\13\16\3\17\3"+
		"\17\3\17\7\17\u0092\n\17\f\17\16\17\u0095\13\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\7\20\u009d\n\20\f\20\16\20\u00a0\13\20\3\21\3\21\5\21\u00a4\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ad\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00b4\n\22\f\22\16\22\u00b7\13\22\5\22\u00b9\n\22\3\22"+
		"\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\f"+
		"\16\3\2\37!\4\2\37 %%\2\u00c2\2$\3\2\2\2\4,\3\2\2\2\6\63\3\2\2\2\b>\3"+
		"\2\2\2\nF\3\2\2\2\fU\3\2\2\2\16h\3\2\2\2\20j\3\2\2\2\22r\3\2\2\2\24{\3"+
		"\2\2\2\26}\3\2\2\2\30\u0081\3\2\2\2\32\u0086\3\2\2\2\34\u008e\3\2\2\2"+
		"\36\u0096\3\2\2\2 \u00ac\3\2\2\2\"\u00ae\3\2\2\2$%\7\b\2\2%&\7\27\2\2"+
		"&\'\7\n\2\2\'(\5\4\3\2()\7\20\2\2)\3\3\2\2\2*+\7\23\2\2+-\5\b\5\2,*\3"+
		"\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\5\n\6\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2"+
		"\2\2\61\62\5\f\7\2\62\5\3\2\2\2\638\7\27\2\2\64\65\7\17\2\2\65\67\7\27"+
		"\2\2\66\64\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2"+
		"\2;<\7\t\2\2<=\7)\2\2=\7\3\2\2\2>C\5\6\4\2?@\7\n\2\2@B\5\6\4\2A?\3\2\2"+
		"\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\t\3\2\2\2EC\3\2\2\2FG\7\24\2\2GH\7\27"+
		"\2\2HL\7\21\2\2IK\5\6\4\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3"+
		"\2\2\2NL\3\2\2\2OP\7\22\2\2PQ\7\t\2\2QR\7)\2\2RS\7\n\2\2ST\5\4\3\2T\13"+
		"\3\2\2\2UV\7\25\2\2V[\5\16\b\2WX\7\n\2\2XZ\5\16\b\2YW\3\2\2\2Z]\3\2\2"+
		"\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^`\7\n\2\2_^\3\2\2\2_`\3\2"+
		"\2\2`a\3\2\2\2ab\7\26\2\2b\r\3\2\2\2ci\5\24\13\2di\5\f\7\2ei\5\30\r\2"+
		"fi\7\32\2\2gi\7\34\2\2hc\3\2\2\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2"+
		"\2i\17\3\2\2\2jk\7\32\2\2kl\5\32\16\2lm\7\30\2\2mp\5\16\b\2no\7\33\2\2"+
		"oq\5\16\b\2pn\3\2\2\2pq\3\2\2\2q\21\3\2\2\2rs\7\34\2\2st\5\32\16\2tu\7"+
		"\31\2\2uv\5\16\b\2v\23\3\2\2\2wx\7\27\2\2xy\7\13\2\2y|\5\32\16\2z|\5\26"+
		"\f\2{w\3\2\2\2{z\3\2\2\2|\25\3\2\2\2}~\7\35\2\2~\177\7\21\2\2\177\u0080"+
		"\7\22\2\2\u0080\27\3\2\2\2\u0081\u0082\7\36\2\2\u0082\u0083\7\21\2\2\u0083"+
		"\u0084\5\32\16\2\u0084\u0085\7\22\2\2\u0085\31\3\2\2\2\u0086\u008b\5\34"+
		"\17\2\u0087\u0088\t\2\2\2\u0088\u008a\5\34\17\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\33\3\2\2"+
		"\2\u008d\u008b\3\2\2\2\u008e\u0093\5\36\20\2\u008f\u0090\t\3\2\2\u0090"+
		"\u0092\5\36\20\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\35\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u009e\5 \21\2\u0097\u0098\7\"\2\2\u0098\u0099\7#\2\2\u0099\u009a\7$\2"+
		"\2\u009a\u009b\3\2\2\2\u009b\u009d\5 \21\2\u009c\u0097\3\2\2\2\u009d\u00a0"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\37\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a2\t\4\2\2\u00a2\u00a4\5 \21\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ad\3\2\2\2\u00a5\u00ad\7&\2\2\u00a6"+
		"\u00a7\7\21\2\2\u00a7\u00a8\5\32\16\2\u00a8\u00a9\7\22\2\2\u00a9\u00ad"+
		"\3\2\2\2\u00aa\u00ad\7\27\2\2\u00ab\u00ad\5\"\22\2\u00ac\u00a3\3\2\2\2"+
		"\u00ac\u00a5\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad!\3\2\2\2\u00ae\u00af\7\27\2\2\u00af\u00b8\7\21\2\2\u00b0"+
		"\u00b5\5\32\16\2\u00b1\u00b2\7\n\2\2\u00b2\u00b4\5\32\16\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\22\2\2\u00bb#\3\2\2\2\23,/8CL["+
		"_hp{\u008b\u0093\u009e\u00a3\u00ac\u00b5\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}