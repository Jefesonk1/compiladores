// Generated from c:\Users\serva\Desktop\jubiladores\compiladores\compiladores\xxxxxxxxxxxxxxxxxxx\pascal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RESERVED_AND=1, RESERVED_ARRAY=2, RESERVED_BEGIN=3, RESERVED_BOOLEAN=4, 
		CHAR=5, RESERVED_CONST=6, RESERVED_DIV=7, RESERVED_DO=8, RESERVED_ELSE=9, 
		RESERVED_END=10, RESERVED_FUNCTION=11, RESERVED_IF=12, RESERVED_IN=13, 
		RESERVED_INTEGER=14, RESERVED_REAL=15, RESERVED_MOD=16, RESERVED_NIL=17, 
		RESERVED_NOT=18, RESERVED_OF=19, RESERVED_OR=20, RESERVED_PROCEDURE=21, 
		RESERVED_PROGRAM=22, RESERVED_THEN=23, RESERVED_VAR=24, RESERVED_WHILE=25, 
		PLUS=26, MINUS=27, ASTERISK=28, SLASH=29, ASSIGNMENT=30, COMMA=31, SEMI=32, 
		COLON=33, EQUALS=34, NOT_EQUALS=35, LESS_THAN=36, LESS_THAN_OR_EQUALS=37, 
		GREATHER_THAN_OR_EQUALS=38, GREATER_THAN=39, OPEN_PARENTHESIS=40, CLOSE_PARENTHESIS=41, 
		OPEN_BRACKETS=42, OPEN_PARENTHESIS_DOT=43, CLOSE_BRACKETS=44, DOT_CLOSE_PARENTHESIS=45, 
		DOT=46, DOTDOT=47, RESERVED_STRING=48, TRUE=49, FALSE=50, WS=51, COMMENT_1=52, 
		COMMENT_2=53, IDENTIFIER=54, CHARACTER_STRING=55, UNSIGNED_INTEGER=56, 
		UNSIGNED_REAL=57;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_block = 2, RULE_constantDefinitionPart = 3, 
		RULE_constantDefinition = 4, RULE_constant = 5, RULE_unsignedNumber = 6, 
		RULE_sign = 7, RULE_bool_ = 8, RULE_string = 9, RULE_type_ = 10, RULE_simpleType = 11, 
		RULE_scalarType = 12, RULE_subrangeType = 13, RULE_typeIdentifier = 14, 
		RULE_stringType = 15, RULE_arrayType = 16, RULE_typeList = 17, RULE_indexType = 18, 
		RULE_variableDeclarationPart = 19, RULE_variableDeclaration = 20, RULE_procedureAndFunctionDeclarationPart = 21, 
		RULE_procedureDeclaration = 22, RULE_formalParameterList = 23, RULE_formalParameterSection = 24, 
		RULE_parameterGroup = 25, RULE_identifierList = 26, RULE_functionDeclaration = 27, 
		RULE_resultType = 28, RULE_statement = 29, RULE_simpleStatement = 30, 
		RULE_assignmentStatement = 31, RULE_variable = 32, RULE_expression = 33, 
		RULE_relationalOperator = 34, RULE_simpleExpression = 35, RULE_additiveOperator = 36, 
		RULE_term = 37, RULE_multiplicativeOperator = 38, RULE_signedFactor = 39, 
		RULE_factor = 40, RULE_unsignedConstant = 41, RULE_functionDesignator = 42, 
		RULE_parameterList = 43, RULE_procedureStatement = 44, RULE_actualParameter = 45, 
		RULE_parameterWidth = 46, RULE_emptyStatement_ = 47, RULE_structuredStatement = 48, 
		RULE_compoundStatement = 49, RULE_statements = 50, RULE_ifStatement = 51, 
		RULE_whileStatement = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeading", "block", "constantDefinitionPart", "constantDefinition", 
			"constant", "unsignedNumber", "sign", "bool_", "string", "type_", "simpleType", 
			"scalarType", "subrangeType", "typeIdentifier", "stringType", "arrayType", 
			"typeList", "indexType", "variableDeclarationPart", "variableDeclaration", 
			"procedureAndFunctionDeclarationPart", "procedureDeclaration", "formalParameterList", 
			"formalParameterSection", "parameterGroup", "identifierList", "functionDeclaration", 
			"resultType", "statement", "simpleStatement", "assignmentStatement", 
			"variable", "expression", "relationalOperator", "simpleExpression", "additiveOperator", 
			"term", "multiplicativeOperator", "signedFactor", "factor", "unsignedConstant", 
			"functionDesignator", "parameterList", "procedureStatement", "actualParameter", 
			"parameterWidth", "emptyStatement_", "structuredStatement", "compoundStatement", 
			"statements", "ifStatement", "whileStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AND'", "'ARRAY'", "'BEGIN'", "'BOOLEAN'", "'CHAR'", "'CONST'", 
			"'DIV'", "'DO'", "'ELSE'", "'END'", "'FUNCTION'", "'IF'", "'IN'", "'INTEGER'", 
			"'REAL'", "'MOD'", "'NIL'", "'NOT'", "'OF'", "'OR'", "'PROCEDURE'", "'PROGRAM'", 
			"'THEN'", "'VAR'", "'WHILE'", "'+'", "'-'", "'*'", "'/'", "':='", "','", 
			"';'", "':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", 
			"'['", "'(.'", "']'", "'.)'", "'.'", "'..'", "'STRING'", "'TRUE'", "'FALSE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RESERVED_AND", "RESERVED_ARRAY", "RESERVED_BEGIN", "RESERVED_BOOLEAN", 
			"CHAR", "RESERVED_CONST", "RESERVED_DIV", "RESERVED_DO", "RESERVED_ELSE", 
			"RESERVED_END", "RESERVED_FUNCTION", "RESERVED_IF", "RESERVED_IN", "RESERVED_INTEGER", 
			"RESERVED_REAL", "RESERVED_MOD", "RESERVED_NIL", "RESERVED_NOT", "RESERVED_OF", 
			"RESERVED_OR", "RESERVED_PROCEDURE", "RESERVED_PROGRAM", "RESERVED_THEN", 
			"RESERVED_VAR", "RESERVED_WHILE", "PLUS", "MINUS", "ASTERISK", "SLASH", 
			"ASSIGNMENT", "COMMA", "SEMI", "COLON", "EQUALS", "NOT_EQUALS", "LESS_THAN", 
			"LESS_THAN_OR_EQUALS", "GREATHER_THAN_OR_EQUALS", "GREATER_THAN", "OPEN_PARENTHESIS", 
			"CLOSE_PARENTHESIS", "OPEN_BRACKETS", "OPEN_PARENTHESIS_DOT", "CLOSE_BRACKETS", 
			"DOT_CLOSE_PARENTHESIS", "DOT", "DOTDOT", "RESERVED_STRING", "TRUE", 
			"FALSE", "WS", "COMMENT_1", "COMMENT_2", "IDENTIFIER", "CHARACTER_STRING", 
			"UNSIGNED_INTEGER", "UNSIGNED_REAL"
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
	public String getGrammarFileName() { return "pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(pascalParser.DOT, 0); }
		public TerminalNode EOF() { return getToken(pascalParser.EOF, 0); }
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
			setState(106);
			programHeading();
			setState(107);
			block();
			setState(108);
			match(DOT);
			setState(109);
			match(EOF);
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

	public static class ProgramHeadingContext extends ParserRuleContext {
		public TerminalNode RESERVED_PROGRAM() { return getToken(pascalParser.RESERVED_PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(pascalParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(pascalParser.OPEN_PARENTHESIS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(pascalParser.CLOSE_PARENTHESIS, 0); }
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeading);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(RESERVED_PROGRAM);
			setState(112);
			match(IDENTIFIER);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHESIS) {
				{
				setState(113);
				match(OPEN_PARENTHESIS);
				setState(114);
				identifierList();
				setState(115);
				match(CLOSE_PARENTHESIS);
				}
			}

			setState(119);
			match(SEMI);
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
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<ConstantDefinitionPartContext> constantDefinitionPart() {
			return getRuleContexts(ConstantDefinitionPartContext.class);
		}
		public ConstantDefinitionPartContext constantDefinitionPart(int i) {
			return getRuleContext(ConstantDefinitionPartContext.class,i);
		}
		public List<VariableDeclarationPartContext> variableDeclarationPart() {
			return getRuleContexts(VariableDeclarationPartContext.class);
		}
		public VariableDeclarationPartContext variableDeclarationPart(int i) {
			return getRuleContext(VariableDeclarationPartContext.class,i);
		}
		public List<ProcedureAndFunctionDeclarationPartContext> procedureAndFunctionDeclarationPart() {
			return getRuleContexts(ProcedureAndFunctionDeclarationPartContext.class);
		}
		public ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart(int i) {
			return getRuleContext(ProcedureAndFunctionDeclarationPartContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_CONST) | (1L << RESERVED_FUNCTION) | (1L << RESERVED_PROCEDURE) | (1L << RESERVED_VAR))) != 0)) {
				{
				setState(124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RESERVED_CONST:
					{
					setState(121);
					constantDefinitionPart();
					}
					break;
				case RESERVED_VAR:
					{
					setState(122);
					variableDeclarationPart();
					}
					break;
				case RESERVED_FUNCTION:
				case RESERVED_PROCEDURE:
					{
					setState(123);
					procedureAndFunctionDeclarationPart();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			compoundStatement();
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

	public static class ConstantDefinitionPartContext extends ParserRuleContext {
		public TerminalNode RESERVED_CONST() { return getToken(pascalParser.RESERVED_CONST, 0); }
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public ConstantDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionPart; }
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constantDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(RESERVED_CONST);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				constantDefinition();
				setState(133);
				match(SEMI);
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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

	public static class ConstantDefinitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(pascalParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(pascalParser.EQUALS, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IDENTIFIER);
			setState(140);
			match(EQUALS);
			setState(141);
			constant();
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

	public static class ConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(pascalParser.IDENTIFIER, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constant);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				sign();
				setState(145);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				sign();
				setState(149);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				string();
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

	public static class UnsignedNumberContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INTEGER() { return getToken(pascalParser.UNSIGNED_INTEGER, 0); }
		public TerminalNode UNSIGNED_REAL() { return getToken(pascalParser.UNSIGNED_REAL, 0); }
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unsignedNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==UNSIGNED_INTEGER || _la==UNSIGNED_REAL) ) {
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
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_Context extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(pascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pascalParser.FALSE, 0); }
		public Bool_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_; }
	}

	public final Bool_Context bool_() throws RecognitionException {
		Bool_Context _localctx = new Bool_Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
		public TerminalNode CHARACTER_STRING() { return getToken(pascalParser.CHARACTER_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(CHARACTER_STRING);
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

	public static class Type_Context extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESERVED_BOOLEAN:
			case CHAR:
			case RESERVED_INTEGER:
			case RESERVED_REAL:
			case PLUS:
			case MINUS:
			case OPEN_PARENTHESIS:
			case RESERVED_STRING:
			case IDENTIFIER:
			case CHARACTER_STRING:
			case UNSIGNED_INTEGER:
			case UNSIGNED_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				simpleType();
				}
				break;
			case RESERVED_ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				arrayType();
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public SubrangeTypeContext subrangeType() {
			return getRuleContext(SubrangeTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public StringTypeContext stringType() {
			return getRuleContext(StringTypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleType);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				scalarType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				stringType();
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

	public static class ScalarTypeContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(pascalParser.OPEN_PARENTHESIS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(pascalParser.CLOSE_PARENTHESIS, 0); }
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scalarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(OPEN_PARENTHESIS);
			setState(173);
			identifierList();
			setState(174);
			match(CLOSE_PARENTHESIS);
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

	public static class SubrangeTypeContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(pascalParser.DOTDOT, 0); }
		public SubrangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrangeType; }
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_subrangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			constant();
			setState(177);
			match(DOTDOT);
			setState(178);
			constant();
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

	public static class TypeIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(pascalParser.IDENTIFIER, 0); }
		public TerminalNode CHAR() { return getToken(pascalParser.CHAR, 0); }
		public TerminalNode RESERVED_BOOLEAN() { return getToken(pascalParser.RESERVED_BOOLEAN, 0); }
		public TerminalNode RESERVED_INTEGER() { return getToken(pascalParser.RESERVED_INTEGER, 0); }
		public TerminalNode RESERVED_REAL() { return getToken(pascalParser.RESERVED_REAL, 0); }
		public TerminalNode RESERVED_STRING() { return getToken(pascalParser.RESERVED_STRING, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeIdentifier);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(IDENTIFIER);
				}
				break;
			case RESERVED_BOOLEAN:
			case CHAR:
			case RESERVED_INTEGER:
			case RESERVED_REAL:
			case RESERVED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_BOOLEAN) | (1L << CHAR) | (1L << RESERVED_INTEGER) | (1L << RESERVED_REAL) | (1L << RESERVED_STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class StringTypeContext extends ParserRuleContext {
		public TerminalNode RESERVED_STRING() { return getToken(pascalParser.RESERVED_STRING, 0); }
		public TerminalNode OPEN_BRACKETS() { return getToken(pascalParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(pascalParser.CLOSE_BRACKETS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(pascalParser.IDENTIFIER, 0); }
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringType; }
	}

	public final StringTypeContext stringType() throws RecognitionException {
		StringTypeContext _localctx = new StringTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(RESERVED_STRING);
			setState(185);
			match(OPEN_BRACKETS);
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(186);
				match(IDENTIFIER);
				}
				break;
			case UNSIGNED_INTEGER:
			case UNSIGNED_REAL:
				{
				setState(187);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(190);
			match(CLOSE_BRACKETS);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode RESERVED_ARRAY() { return getToken(pascalParser.RESERVED_ARRAY, 0); }
		public TerminalNode OPEN_BRACKETS() { return getToken(pascalParser.OPEN_BRACKETS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode CLOSE_BRACKETS() { return getToken(pascalParser.CLOSE_BRACKETS, 0); }
		public TerminalNode RESERVED_OF() { return getToken(pascalParser.RESERVED_OF, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(pascalParser.EQUALS, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(pascalParser.OPEN_PARENTHESIS, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(pascalParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode OPEN_PARENTHESIS_DOT() { return getToken(pascalParser.OPEN_PARENTHESIS_DOT, 0); }
		public TerminalNode DOT_CLOSE_PARENTHESIS() { return getToken(pascalParser.DOT_CLOSE_PARENTHESIS, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayType);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(RESERVED_ARRAY);
				setState(193);
				match(OPEN_BRACKETS);
				setState(194);
				typeList();
				setState(195);
				match(CLOSE_BRACKETS);
				setState(196);
				match(RESERVED_OF);
				setState(197);
				typeIdentifier();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(198);
					match(EQUALS);
					setState(199);
					match(OPEN_PARENTHESIS);
					setState(200);
					parameterList();
					setState(201);
					match(CLOSE_PARENTHESIS);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(RESERVED_ARRAY);
				setState(206);
				match(OPEN_PARENTHESIS_DOT);
				setState(207);
				typeList();
				setState(208);
				match(DOT_CLOSE_PARENTHESIS);
				setState(209);
				match(RESERVED_OF);
				setState(210);
				typeIdentifier();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(211);
					match(EQUALS);
					setState(212);
					match(OPEN_PARENTHESIS);
					setState(213);
					parameterList();
					setState(214);
					match(CLOSE_PARENTHESIS);
					}
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

	public static class TypeListContext extends ParserRuleContext {
		public List<IndexTypeContext> indexType() {
			return getRuleContexts(IndexTypeContext.class);
		}
		public IndexTypeContext indexType(int i) {
			return getRuleContext(IndexTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			indexType();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				indexType();
				}
				}
				setState(227);
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

	public static class IndexTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			simpleType();
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

	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public TerminalNode RESERVED_VAR() { return getToken(pascalParser.RESERVED_VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(RESERVED_VAR);
			setState(231);
			variableDeclaration();
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(232);
					match(SEMI);
					setState(233);
					variableDeclaration();
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(239);
			match(SEMI);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			identifierList();
			setState(242);
			match(COLON);
			setState(243);
			type_();
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

	public static class ProcedureAndFunctionDeclarationPartContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ProcedureAndFunctionDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionDeclarationPart; }
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESERVED_PROCEDURE:
				{
				setState(245);
				procedureDeclaration();
				}
				break;
			case RESERVED_FUNCTION:
				{
				setState(246);
				functionDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(249);
			match(SEMI);
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

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode RESERVED_PROCEDURE() { return getToken(pascalParser.RESERVED_PROCEDURE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(pascalParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(RESERVED_PROCEDURE);
			setState(252);
			match(IDENTIFIER);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHESIS) {
				{
				setState(253);
				formalParameterList();
				}
			}

			setState(256);
			match(SEMI);
			setState(257);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(pascalParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(pascalParser.CLOSE_PARENTHESIS, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(OPEN_PARENTHESIS);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_FUNCTION) | (1L << RESERVED_PROCEDURE) | (1L << RESERVED_VAR) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(260);
				formalParameterSection();
				}
			}

			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(263);
				match(SEMI);
				setState(264);
				formalParameterSection();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(CLOSE_PARENTHESIS);
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

	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode RESERVED_VAR() { return getToken(pascalParser.RESERVED_VAR, 0); }
		public TerminalNode RESERVED_FUNCTION() { return getToken(pascalParser.RESERVED_FUNCTION, 0); }
		public TerminalNode RESERVED_PROCEDURE() { return getToken(pascalParser.RESERVED_PROCEDURE, 0); }
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_formalParameterSection);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				parameterGroup();
				}
				break;
			case RESERVED_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(RESERVED_VAR);
				setState(274);
				parameterGroup();
				}
				break;
			case RESERVED_FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(RESERVED_FUNCTION);
				setState(276);
				parameterGroup();
				}
				break;
			case RESERVED_PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(RESERVED_PROCEDURE);
				setState(278);
				parameterGroup();
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

	public static class ParameterGroupContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			identifierList();
			setState(282);
			match(COLON);
			setState(283);
			typeIdentifier();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(pascalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(pascalParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(IDENTIFIER);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(286);
				match(COMMA);
				setState(287);
				match(IDENTIFIER);
				}
				}
				setState(292);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode RESERVED_FUNCTION() { return getToken(pascalParser.RESERVED_FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(pascalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(RESERVED_FUNCTION);
			setState(294);
			match(IDENTIFIER);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHESIS) {
				{
				setState(295);
				formalParameterList();
				}
			}

			setState(298);
			match(COLON);
			setState(299);
			resultType();
			setState(300);
			match(SEMI);
			setState(301);
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

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			typeIdentifier();
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
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESERVED_ELSE:
			case RESERVED_END:
			case SEMI:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				simpleStatement();
				}
				break;
			case RESERVED_BEGIN:
			case RESERVED_IF:
			case RESERVED_WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				structuredStatement();
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_simpleStatement);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				emptyStatement_();
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(pascalParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			variable();
			setState(315);
			match(ASSIGNMENT);
			setState(316);
			expression();
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(pascalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(pascalParser.IDENTIFIER, i);
		}
		public List<TerminalNode> OPEN_BRACKETS() { return getTokens(pascalParser.OPEN_BRACKETS); }
		public TerminalNode OPEN_BRACKETS(int i) {
			return getToken(pascalParser.OPEN_BRACKETS, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACKETS() { return getTokens(pascalParser.CLOSE_BRACKETS); }
		public TerminalNode CLOSE_BRACKETS(int i) {
			return getToken(pascalParser.CLOSE_BRACKETS, i);
		}
		public List<TerminalNode> OPEN_PARENTHESIS_DOT() { return getTokens(pascalParser.OPEN_PARENTHESIS_DOT); }
		public TerminalNode OPEN_PARENTHESIS_DOT(int i) {
			return getToken(pascalParser.OPEN_PARENTHESIS_DOT, i);
		}
		public List<TerminalNode> DOT_CLOSE_PARENTHESIS() { return getTokens(pascalParser.DOT_CLOSE_PARENTHESIS); }
		public TerminalNode DOT_CLOSE_PARENTHESIS(int i) {
			return getToken(pascalParser.DOT_CLOSE_PARENTHESIS, i);
		}
		public List<TerminalNode> DOT() { return getTokens(pascalParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(pascalParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(318);
			match(IDENTIFIER);
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BRACKETS) | (1L << OPEN_PARENTHESIS_DOT) | (1L << DOT))) != 0)) {
				{
				setState(343);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACKETS:
					{
					setState(319);
					match(OPEN_BRACKETS);
					setState(320);
					expression();
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(321);
						match(COMMA);
						setState(322);
						expression();
						}
						}
						setState(327);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(328);
					match(CLOSE_BRACKETS);
					}
					break;
				case OPEN_PARENTHESIS_DOT:
					{
					setState(330);
					match(OPEN_PARENTHESIS_DOT);
					setState(331);
					expression();
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(332);
						match(COMMA);
						setState(333);
						expression();
						}
						}
						setState(338);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(339);
					match(DOT_CLOSE_PARENTHESIS);
					}
					break;
				case DOT:
					{
					setState(341);
					match(DOT);
					setState(342);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(347);
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

	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			simpleExpression();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_IN) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATHER_THAN_OR_EQUALS) | (1L << GREATER_THAN))) != 0)) {
				{
				setState(349);
				relationalOperator();
				setState(350);
				expression();
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

	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(pascalParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(pascalParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(pascalParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUALS() { return getToken(pascalParser.LESS_THAN_OR_EQUALS, 0); }
		public TerminalNode GREATHER_THAN_OR_EQUALS() { return getToken(pascalParser.GREATHER_THAN_OR_EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(pascalParser.GREATER_THAN, 0); }
		public TerminalNode RESERVED_IN() { return getToken(pascalParser.RESERVED_IN, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_IN) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATHER_THAN_OR_EQUALS) | (1L << GREATER_THAN))) != 0)) ) {
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
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			term();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(357);
				additiveOperator();
				setState(358);
				simpleExpression();
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public TerminalNode RESERVED_OR() { return getToken(pascalParser.RESERVED_OR, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
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
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public MultiplicativeOperatorContext multiplicativeOperator() {
			return getRuleContext(MultiplicativeOperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			signedFactor();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_AND) | (1L << RESERVED_DIV) | (1L << RESERVED_MOD) | (1L << ASTERISK) | (1L << SLASH))) != 0)) {
				{
				setState(365);
				multiplicativeOperator();
				setState(366);
				term();
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

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(pascalParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(pascalParser.SLASH, 0); }
		public TerminalNode RESERVED_DIV() { return getToken(pascalParser.RESERVED_DIV, 0); }
		public TerminalNode RESERVED_MOD() { return getToken(pascalParser.RESERVED_MOD, 0); }
		public TerminalNode RESERVED_AND() { return getToken(pascalParser.RESERVED_AND, 0); }
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_AND) | (1L << RESERVED_DIV) | (1L << RESERVED_MOD) | (1L << ASTERISK) | (1L << SLASH))) != 0)) ) {
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
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(372);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(375);
			factor();
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESIS() { return getToken(pascalParser.OPEN_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(pascalParser.CLOSE_PARENTHESIS, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public TerminalNode RESERVED_NOT() { return getToken(pascalParser.RESERVED_NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Bool_Context bool_() {
			return getRuleContext(Bool_Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_factor);
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(OPEN_PARENTHESIS);
				setState(379);
				expression();
				setState(380);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(384);
				match(RESERVED_NOT);
				setState(385);
				factor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(386);
				bool_();
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

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode RESERVED_NIL() { return getToken(pascalParser.RESERVED_NIL, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unsignedConstant);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNSIGNED_INTEGER:
			case UNSIGNED_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				unsignedNumber();
				}
				break;
			case CHARACTER_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				string();
				}
				break;
			case RESERVED_NIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				match(RESERVED_NIL);
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

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(pascalParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(pascalParser.OPEN_PARENTHESIS, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(pascalParser.CLOSE_PARENTHESIS, 0); }
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(IDENTIFIER);
			setState(395);
			match(OPEN_PARENTHESIS);
			setState(396);
			parameterList();
			setState(397);
			match(CLOSE_PARENTHESIS);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			actualParameter();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(400);
				match(COMMA);
				setState(401);
				actualParameter();
				}
				}
				setState(406);
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

	public static class ProcedureStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(pascalParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(pascalParser.OPEN_PARENTHESIS, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(pascalParser.CLOSE_PARENTHESIS, 0); }
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(IDENTIFIER);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHESIS) {
				{
				setState(408);
				match(OPEN_PARENTHESIS);
				setState(409);
				parameterList();
				setState(410);
				match(CLOSE_PARENTHESIS);
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

	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ParameterWidthContext> parameterWidth() {
			return getRuleContexts(ParameterWidthContext.class);
		}
		public ParameterWidthContext parameterWidth(int i) {
			return getRuleContext(ParameterWidthContext.class,i);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_actualParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_NIL) | (1L << RESERVED_NOT) | (1L << PLUS) | (1L << MINUS) | (1L << OPEN_PARENTHESIS) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER) | (1L << CHARACTER_STRING) | (1L << UNSIGNED_INTEGER) | (1L << UNSIGNED_REAL))) != 0)) {
				{
				setState(414);
				expression();
				}
			}

			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(417);
				parameterWidth();
				}
				}
				setState(422);
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

	public static class ParameterWidthContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterWidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterWidth; }
	}

	public final ParameterWidthContext parameterWidth() throws RecognitionException {
		ParameterWidthContext _localctx = new ParameterWidthContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parameterWidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(COLON);
			setState(424);
			expression();
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

	public static class EmptyStatement_Context extends ParserRuleContext {
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class StructuredStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_structuredStatement);
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESERVED_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				compoundStatement();
				}
				break;
			case RESERVED_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				ifStatement();
				}
				break;
			case RESERVED_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				whileStatement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode RESERVED_BEGIN() { return getToken(pascalParser.RESERVED_BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RESERVED_END() { return getToken(pascalParser.RESERVED_END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(RESERVED_BEGIN);
			setState(434);
			statements();
			setState(435);
			match(RESERVED_END);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			statement();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(438);
				match(SEMI);
				setState(439);
				statement();
				}
				}
				setState(444);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode RESERVED_IF() { return getToken(pascalParser.RESERVED_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RESERVED_THEN() { return getToken(pascalParser.RESERVED_THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RESERVED_ELSE() { return getToken(pascalParser.RESERVED_ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(RESERVED_IF);
			setState(446);
			expression();
			setState(447);
			match(RESERVED_THEN);
			setState(448);
			statement();
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(449);
				match(RESERVED_ELSE);
				setState(450);
				statement();
				}
				break;
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode RESERVED_WHILE() { return getToken(pascalParser.RESERVED_WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RESERVED_DO() { return getToken(pascalParser.RESERVED_DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(RESERVED_WHILE);
			setState(454);
			expression();
			setState(455);
			match(RESERVED_DO);
			setState(456);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u01cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3x\n\3\3\3\3\3\3\4\3\4\3\4\7\4\177\n\4\f\4\16\4\u0082\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\6\5\u008a\n\5\r\5\16\5\u008b\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009b\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\5\f\u00a7\n\f\3\r\3\r\3\r\3\r\5\r\u00ad\n\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u00b9\n\20\3\21\3\21\3\21"+
		"\3\21\5\21\u00bf\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00ce\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00db\n\22\5\22\u00dd\n\22\3\23\3\23\3\23\7\23\u00e2"+
		"\n\23\f\23\16\23\u00e5\13\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00ed"+
		"\n\25\f\25\16\25\u00f0\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\5"+
		"\27\u00fa\n\27\3\27\3\27\3\30\3\30\3\30\5\30\u0101\n\30\3\30\3\30\3\30"+
		"\3\31\3\31\5\31\u0108\n\31\3\31\3\31\7\31\u010c\n\31\f\31\16\31\u010f"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u011a\n\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u0123\n\34\f\34\16\34\u0126\13"+
		"\34\3\35\3\35\3\35\5\35\u012b\n\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\5\37\u0136\n\37\3 \3 \3 \5 \u013b\n \3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\7\"\u0146\n\"\f\"\16\"\u0149\13\"\3\"\3\"\3\"\3\"\3\"\3\"\7"+
		"\"\u0151\n\"\f\"\16\"\u0154\13\"\3\"\3\"\3\"\3\"\7\"\u015a\n\"\f\"\16"+
		"\"\u015d\13\"\3#\3#\3#\3#\5#\u0163\n#\3$\3$\3%\3%\3%\3%\5%\u016b\n%\3"+
		"&\3&\3\'\3\'\3\'\3\'\5\'\u0173\n\'\3(\3(\3)\5)\u0178\n)\3)\3)\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\5*\u0186\n*\3+\3+\3+\5+\u018b\n+\3,\3,\3,\3,\3"+
		",\3-\3-\3-\7-\u0195\n-\f-\16-\u0198\13-\3.\3.\3.\3.\3.\5.\u019f\n.\3/"+
		"\5/\u01a2\n/\3/\7/\u01a5\n/\f/\16/\u01a8\13/\3\60\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\62\5\62\u01b2\n\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\7\64"+
		"\u01bb\n\64\f\64\16\64\u01be\13\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u01c6\n\65\3\66\3\66\3\66\3\66\3\66\3\66\2\2\67\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\t"+
		"\3\2:;\3\2\34\35\3\2\63\64\5\2\6\7\20\21\62\62\4\2\17\17$)\4\2\26\26\34"+
		"\35\6\2\3\3\t\t\22\22\36\37\2\u01cf\2l\3\2\2\2\4q\3\2\2\2\6\u0080\3\2"+
		"\2\2\b\u0085\3\2\2\2\n\u008d\3\2\2\2\f\u009a\3\2\2\2\16\u009c\3\2\2\2"+
		"\20\u009e\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2\2\2\26\u00a6\3\2\2\2\30"+
		"\u00ac\3\2\2\2\32\u00ae\3\2\2\2\34\u00b2\3\2\2\2\36\u00b8\3\2\2\2 \u00ba"+
		"\3\2\2\2\"\u00dc\3\2\2\2$\u00de\3\2\2\2&\u00e6\3\2\2\2(\u00e8\3\2\2\2"+
		"*\u00f3\3\2\2\2,\u00f9\3\2\2\2.\u00fd\3\2\2\2\60\u0105\3\2\2\2\62\u0119"+
		"\3\2\2\2\64\u011b\3\2\2\2\66\u011f\3\2\2\28\u0127\3\2\2\2:\u0131\3\2\2"+
		"\2<\u0135\3\2\2\2>\u013a\3\2\2\2@\u013c\3\2\2\2B\u0140\3\2\2\2D\u015e"+
		"\3\2\2\2F\u0164\3\2\2\2H\u0166\3\2\2\2J\u016c\3\2\2\2L\u016e\3\2\2\2N"+
		"\u0174\3\2\2\2P\u0177\3\2\2\2R\u0185\3\2\2\2T\u018a\3\2\2\2V\u018c\3\2"+
		"\2\2X\u0191\3\2\2\2Z\u0199\3\2\2\2\\\u01a1\3\2\2\2^\u01a9\3\2\2\2`\u01ac"+
		"\3\2\2\2b\u01b1\3\2\2\2d\u01b3\3\2\2\2f\u01b7\3\2\2\2h\u01bf\3\2\2\2j"+
		"\u01c7\3\2\2\2lm\5\4\3\2mn\5\6\4\2no\7\60\2\2op\7\2\2\3p\3\3\2\2\2qr\7"+
		"\30\2\2rw\78\2\2st\7*\2\2tu\5\66\34\2uv\7+\2\2vx\3\2\2\2ws\3\2\2\2wx\3"+
		"\2\2\2xy\3\2\2\2yz\7\"\2\2z\5\3\2\2\2{\177\5\b\5\2|\177\5(\25\2}\177\5"+
		",\27\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084"+
		"\5d\63\2\u0084\7\3\2\2\2\u0085\u0089\7\b\2\2\u0086\u0087\5\n\6\2\u0087"+
		"\u0088\7\"\2\2\u0088\u008a\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\t\3\2\2\2\u008d\u008e"+
		"\78\2\2\u008e\u008f\7$\2\2\u008f\u0090\5\f\7\2\u0090\13\3\2\2\2\u0091"+
		"\u009b\5\16\b\2\u0092\u0093\5\20\t\2\u0093\u0094\5\16\b\2\u0094\u009b"+
		"\3\2\2\2\u0095\u009b\78\2\2\u0096\u0097\5\20\t\2\u0097\u0098\78\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u009b\5\24\13\2\u009a\u0091\3\2\2\2\u009a\u0092\3"+
		"\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\r\3\2\2\2\u009c\u009d\t\2\2\2\u009d\17\3\2\2\2\u009e\u009f\t\3\2\2\u009f"+
		"\21\3\2\2\2\u00a0\u00a1\t\4\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\79\2\2\u00a3"+
		"\25\3\2\2\2\u00a4\u00a7\5\30\r\2\u00a5\u00a7\5\"\22\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00ad\5\32\16\2\u00a9"+
		"\u00ad\5\34\17\2\u00aa\u00ad\5\36\20\2\u00ab\u00ad\5 \21\2\u00ac\u00a8"+
		"\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\31\3\2\2\2\u00ae\u00af\7*\2\2\u00af\u00b0\5\66\34\2\u00b0\u00b1\7+\2"+
		"\2\u00b1\33\3\2\2\2\u00b2\u00b3\5\f\7\2\u00b3\u00b4\7\61\2\2\u00b4\u00b5"+
		"\5\f\7\2\u00b5\35\3\2\2\2\u00b6\u00b9\78\2\2\u00b7\u00b9\t\5\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\7\62\2"+
		"\2\u00bb\u00be\7,\2\2\u00bc\u00bf\78\2\2\u00bd\u00bf\5\16\b\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7.\2\2\u00c1"+
		"!\3\2\2\2\u00c2\u00c3\7\4\2\2\u00c3\u00c4\7,\2\2\u00c4\u00c5\5$\23\2\u00c5"+
		"\u00c6\7.\2\2\u00c6\u00c7\7\25\2\2\u00c7\u00cd\5\36\20\2\u00c8\u00c9\7"+
		"$\2\2\u00c9\u00ca\7*\2\2\u00ca\u00cb\5X-\2\u00cb\u00cc\7+\2\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00dd\3\2\2\2\u00cf"+
		"\u00d0\7\4\2\2\u00d0\u00d1\7-\2\2\u00d1\u00d2\5$\23\2\u00d2\u00d3\7/\2"+
		"\2\u00d3\u00d4\7\25\2\2\u00d4\u00da\5\36\20\2\u00d5\u00d6\7$\2\2\u00d6"+
		"\u00d7\7*\2\2\u00d7\u00d8\5X-\2\u00d8\u00d9\7+\2\2\u00d9\u00db\3\2\2\2"+
		"\u00da\u00d5\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00c2"+
		"\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dd#\3\2\2\2\u00de\u00e3\5&\24\2\u00df"+
		"\u00e0\7!\2\2\u00e0\u00e2\5&\24\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4%\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e7\5\30\r\2\u00e7\'\3\2\2\2\u00e8\u00e9\7\32\2\2\u00e9"+
		"\u00ee\5*\26\2\u00ea\u00eb\7\"\2\2\u00eb\u00ed\5*\26\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\"\2\2\u00f2)\3\2\2\2"+
		"\u00f3\u00f4\5\66\34\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\5\26\f\2\u00f6+"+
		"\3\2\2\2\u00f7\u00fa\5.\30\2\u00f8\u00fa\58\35\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\"\2\2\u00fc-\3\2\2\2"+
		"\u00fd\u00fe\7\27\2\2\u00fe\u0100\78\2\2\u00ff\u0101\5\60\31\2\u0100\u00ff"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\"\2\2\u0103"+
		"\u0104\5\6\4\2\u0104/\3\2\2\2\u0105\u0107\7*\2\2\u0106\u0108\5\62\32\2"+
		"\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010d\3\2\2\2\u0109\u010a"+
		"\7\"\2\2\u010a\u010c\5\62\32\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2"+
		"\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u0110\u0111\7+\2\2\u0111\61\3\2\2\2\u0112\u011a\5\64\33\2\u0113"+
		"\u0114\7\32\2\2\u0114\u011a\5\64\33\2\u0115\u0116\7\r\2\2\u0116\u011a"+
		"\5\64\33\2\u0117\u0118\7\27\2\2\u0118\u011a\5\64\33\2\u0119\u0112\3\2"+
		"\2\2\u0119\u0113\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\63\3\2\2\2\u011b\u011c\5\66\34\2\u011c\u011d\7#\2\2\u011d\u011e\5\36"+
		"\20\2\u011e\65\3\2\2\2\u011f\u0124\78\2\2\u0120\u0121\7!\2\2\u0121\u0123"+
		"\78\2\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\67\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\r\2"+
		"\2\u0128\u012a\78\2\2\u0129\u012b\5\60\31\2\u012a\u0129\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7#\2\2\u012d\u012e\5:\36"+
		"\2\u012e\u012f\7\"\2\2\u012f\u0130\5\6\4\2\u01309\3\2\2\2\u0131\u0132"+
		"\5\36\20\2\u0132;\3\2\2\2\u0133\u0136\5> \2\u0134\u0136\5b\62\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136=\3\2\2\2\u0137\u013b\5@!\2\u0138"+
		"\u013b\5Z.\2\u0139\u013b\5`\61\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2"+
		"\2\u013a\u0139\3\2\2\2\u013b?\3\2\2\2\u013c\u013d\5B\"\2\u013d\u013e\7"+
		" \2\2\u013e\u013f\5D#\2\u013fA\3\2\2\2\u0140\u015b\78\2\2\u0141\u0142"+
		"\7,\2\2\u0142\u0147\5D#\2\u0143\u0144\7!\2\2\u0144\u0146\5D#\2\u0145\u0143"+
		"\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7.\2\2\u014b\u015a\3\2"+
		"\2\2\u014c\u014d\7-\2\2\u014d\u0152\5D#\2\u014e\u014f\7!\2\2\u014f\u0151"+
		"\5D#\2\u0150\u014e\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7/"+
		"\2\2\u0156\u015a\3\2\2\2\u0157\u0158\7\60\2\2\u0158\u015a\78\2\2\u0159"+
		"\u0141\3\2\2\2\u0159\u014c\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015d\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015cC\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015e\u0162\5H%\2\u015f\u0160\5F$\2\u0160\u0161\5D#\2\u0161\u0163"+
		"\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0163\3\2\2\2\u0163E\3\2\2\2\u0164"+
		"\u0165\t\6\2\2\u0165G\3\2\2\2\u0166\u016a\5L\'\2\u0167\u0168\5J&\2\u0168"+
		"\u0169\5H%\2\u0169\u016b\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u016b\3\2\2"+
		"\2\u016bI\3\2\2\2\u016c\u016d\t\7\2\2\u016dK\3\2\2\2\u016e\u0172\5P)\2"+
		"\u016f\u0170\5N(\2\u0170\u0171\5L\'\2\u0171\u0173\3\2\2\2\u0172\u016f"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173M\3\2\2\2\u0174\u0175\t\b\2\2\u0175"+
		"O\3\2\2\2\u0176\u0178\t\3\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2"+
		"\u0178\u0179\3\2\2\2\u0179\u017a\5R*\2\u017aQ\3\2\2\2\u017b\u0186\5B\""+
		"\2\u017c\u017d\7*\2\2\u017d\u017e\5D#\2\u017e\u017f\7+\2\2\u017f\u0186"+
		"\3\2\2\2\u0180\u0186\5V,\2\u0181\u0186\5T+\2\u0182\u0183\7\24\2\2\u0183"+
		"\u0186\5R*\2\u0184\u0186\5\22\n\2\u0185\u017b\3\2\2\2\u0185\u017c\3\2"+
		"\2\2\u0185\u0180\3\2\2\2\u0185\u0181\3\2\2\2\u0185\u0182\3\2\2\2\u0185"+
		"\u0184\3\2\2\2\u0186S\3\2\2\2\u0187\u018b\5\16\b\2\u0188\u018b\5\24\13"+
		"\2\u0189\u018b\7\23\2\2\u018a\u0187\3\2\2\2\u018a\u0188\3\2\2\2\u018a"+
		"\u0189\3\2\2\2\u018bU\3\2\2\2\u018c\u018d\78\2\2\u018d\u018e\7*\2\2\u018e"+
		"\u018f\5X-\2\u018f\u0190\7+\2\2\u0190W\3\2\2\2\u0191\u0196\5\\/\2\u0192"+
		"\u0193\7!\2\2\u0193\u0195\5\\/\2\u0194\u0192\3\2\2\2\u0195\u0198\3\2\2"+
		"\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197Y\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0199\u019e\78\2\2\u019a\u019b\7*\2\2\u019b\u019c\5X-\2\u019c"+
		"\u019d\7+\2\2\u019d\u019f\3\2\2\2\u019e\u019a\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f[\3\2\2\2\u01a0\u01a2\5D#\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a6\3\2\2\2\u01a3\u01a5\5^\60\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7]\3\2\2\2"+
		"\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7#\2\2\u01aa\u01ab\5D#\2\u01ab_\3\2\2"+
		"\2\u01ac\u01ad\3\2\2\2\u01ada\3\2\2\2\u01ae\u01b2\5d\63\2\u01af\u01b2"+
		"\5h\65\2\u01b0\u01b2\5j\66\2\u01b1\u01ae\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2c\3\2\2\2\u01b3\u01b4\7\5\2\2\u01b4\u01b5\5f\64\2"+
		"\u01b5\u01b6\7\f\2\2\u01b6e\3\2\2\2\u01b7\u01bc\5<\37\2\u01b8\u01b9\7"+
		"\"\2\2\u01b9\u01bb\5<\37\2\u01ba\u01b8\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bdg\3\2\2\2\u01be\u01bc\3\2\2\2"+
		"\u01bf\u01c0\7\16\2\2\u01c0\u01c1\5D#\2\u01c1\u01c2\7\31\2\2\u01c2\u01c5"+
		"\5<\37\2\u01c3\u01c4\7\13\2\2\u01c4\u01c6\5<\37\2\u01c5\u01c3\3\2\2\2"+
		"\u01c5\u01c6\3\2\2\2\u01c6i\3\2\2\2\u01c7\u01c8\7\33\2\2\u01c8\u01c9\5"+
		"D#\2\u01c9\u01ca\7\n\2\2\u01ca\u01cb\5<\37\2\u01cbk\3\2\2\2*w~\u0080\u008b"+
		"\u009a\u00a6\u00ac\u00b8\u00be\u00cd\u00da\u00dc\u00e3\u00ee\u00f9\u0100"+
		"\u0107\u010d\u0119\u0124\u012a\u0135\u013a\u0147\u0152\u0159\u015b\u0162"+
		"\u016a\u0172\u0177\u0185\u018a\u0196\u019e\u01a1\u01a6\u01b1\u01bc\u01c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}