// Generated from c:\Users\serva\Desktop\jubiladores\compiladores\compiladores\xxxxxxxxxxxxxxxxxxx\pascal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pascalLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RESERVED_AND", "RESERVED_ARRAY", "RESERVED_BEGIN", "RESERVED_BOOLEAN", 
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
			"UNSIGNED_INTEGER", "UNSIGNED_REAL", "EXPONENT"
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


	public pascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u018e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0147"+
		"\n\65\f\65\16\65\u014a\13\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\7\66\u0153"+
		"\n\66\f\66\16\66\u0156\13\66\3\66\3\66\3\66\3\66\3\67\3\67\7\67\u015e"+
		"\n\67\f\67\16\67\u0161\13\67\38\38\38\38\78\u0167\n8\f8\168\u016a\138"+
		"\38\38\39\69\u016f\n9\r9\169\u0170\3:\6:\u0174\n:\r:\16:\u0175\3:\3:\6"+
		":\u017a\n:\r:\16:\u017b\3:\5:\u017f\n:\5:\u0181\n:\3:\5:\u0184\n:\3;\3"+
		";\5;\u0188\n;\3;\6;\u018b\n;\r;\16;\u018c\4\u0148\u0154\2<\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u\2\3\2"+
		"\6\5\2\13\f\17\17\"\"\5\2\62;C\\aa\3\2))\4\2--//\2\u0199\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\3w\3\2\2\2\5{\3\2\2\2\7\u0081\3\2\2\2\t\u0087\3\2"+
		"\2\2\13\u008f\3\2\2\2\r\u0094\3\2\2\2\17\u009a\3\2\2\2\21\u009e\3\2\2"+
		"\2\23\u00a1\3\2\2\2\25\u00a6\3\2\2\2\27\u00aa\3\2\2\2\31\u00b3\3\2\2\2"+
		"\33\u00b6\3\2\2\2\35\u00b9\3\2\2\2\37\u00c1\3\2\2\2!\u00c6\3\2\2\2#\u00ca"+
		"\3\2\2\2%\u00ce\3\2\2\2\'\u00d2\3\2\2\2)\u00d5\3\2\2\2+\u00d8\3\2\2\2"+
		"-\u00e2\3\2\2\2/\u00ea\3\2\2\2\61\u00ef\3\2\2\2\63\u00f3\3\2\2\2\65\u00f9"+
		"\3\2\2\2\67\u00fb\3\2\2\29\u00fd\3\2\2\2;\u00ff\3\2\2\2=\u0101\3\2\2\2"+
		"?\u0104\3\2\2\2A\u0106\3\2\2\2C\u0108\3\2\2\2E\u010a\3\2\2\2G\u010c\3"+
		"\2\2\2I\u010f\3\2\2\2K\u0111\3\2\2\2M\u0114\3\2\2\2O\u0117\3\2\2\2Q\u0119"+
		"\3\2\2\2S\u011b\3\2\2\2U\u011d\3\2\2\2W\u011f\3\2\2\2Y\u0122\3\2\2\2["+
		"\u0124\3\2\2\2]\u0127\3\2\2\2_\u0129\3\2\2\2a\u012c\3\2\2\2c\u0133\3\2"+
		"\2\2e\u0138\3\2\2\2g\u013e\3\2\2\2i\u0142\3\2\2\2k\u0150\3\2\2\2m\u015b"+
		"\3\2\2\2o\u0162\3\2\2\2q\u016e\3\2\2\2s\u0173\3\2\2\2u\u0185\3\2\2\2w"+
		"x\7C\2\2xy\7P\2\2yz\7F\2\2z\4\3\2\2\2{|\7C\2\2|}\7T\2\2}~\7T\2\2~\177"+
		"\7C\2\2\177\u0080\7[\2\2\u0080\6\3\2\2\2\u0081\u0082\7D\2\2\u0082\u0083"+
		"\7G\2\2\u0083\u0084\7I\2\2\u0084\u0085\7K\2\2\u0085\u0086\7P\2\2\u0086"+
		"\b\3\2\2\2\u0087\u0088\7D\2\2\u0088\u0089\7Q\2\2\u0089\u008a\7Q\2\2\u008a"+
		"\u008b\7N\2\2\u008b\u008c\7G\2\2\u008c\u008d\7C\2\2\u008d\u008e\7P\2\2"+
		"\u008e\n\3\2\2\2\u008f\u0090\7E\2\2\u0090\u0091\7J\2\2\u0091\u0092\7C"+
		"\2\2\u0092\u0093\7T\2\2\u0093\f\3\2\2\2\u0094\u0095\7E\2\2\u0095\u0096"+
		"\7Q\2\2\u0096\u0097\7P\2\2\u0097\u0098\7U\2\2\u0098\u0099\7V\2\2\u0099"+
		"\16\3\2\2\2\u009a\u009b\7F\2\2\u009b\u009c\7K\2\2\u009c\u009d\7X\2\2\u009d"+
		"\20\3\2\2\2\u009e\u009f\7F\2\2\u009f\u00a0\7Q\2\2\u00a0\22\3\2\2\2\u00a1"+
		"\u00a2\7G\2\2\u00a2\u00a3\7N\2\2\u00a3\u00a4\7U\2\2\u00a4\u00a5\7G\2\2"+
		"\u00a5\24\3\2\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8\7P\2\2\u00a8\u00a9\7"+
		"F\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7H\2\2\u00ab\u00ac\7W\2\2\u00ac\u00ad"+
		"\7P\2\2\u00ad\u00ae\7E\2\2\u00ae\u00af\7V\2\2\u00af\u00b0\7K\2\2\u00b0"+
		"\u00b1\7Q\2\2\u00b1\u00b2\7P\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7K\2\2\u00b4"+
		"\u00b5\7H\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7K\2\2\u00b7\u00b8\7P\2\2\u00b8"+
		"\34\3\2\2\2\u00b9\u00ba\7K\2\2\u00ba\u00bb\7P\2\2\u00bb\u00bc\7V\2\2\u00bc"+
		"\u00bd\7G\2\2\u00bd\u00be\7I\2\2\u00be\u00bf\7G\2\2\u00bf\u00c0\7T\2\2"+
		"\u00c0\36\3\2\2\2\u00c1\u00c2\7T\2\2\u00c2\u00c3\7G\2\2\u00c3\u00c4\7"+
		"C\2\2\u00c4\u00c5\7N\2\2\u00c5 \3\2\2\2\u00c6\u00c7\7O\2\2\u00c7\u00c8"+
		"\7Q\2\2\u00c8\u00c9\7F\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7P\2\2\u00cb\u00cc"+
		"\7K\2\2\u00cc\u00cd\7N\2\2\u00cd$\3\2\2\2\u00ce\u00cf\7P\2\2\u00cf\u00d0"+
		"\7Q\2\2\u00d0\u00d1\7V\2\2\u00d1&\3\2\2\2\u00d2\u00d3\7Q\2\2\u00d3\u00d4"+
		"\7H\2\2\u00d4(\3\2\2\2\u00d5\u00d6\7Q\2\2\u00d6\u00d7\7T\2\2\u00d7*\3"+
		"\2\2\2\u00d8\u00d9\7R\2\2\u00d9\u00da\7T\2\2\u00da\u00db\7Q\2\2\u00db"+
		"\u00dc\7E\2\2\u00dc\u00dd\7G\2\2\u00dd\u00de\7F\2\2\u00de\u00df\7W\2\2"+
		"\u00df\u00e0\7T\2\2\u00e0\u00e1\7G\2\2\u00e1,\3\2\2\2\u00e2\u00e3\7R\2"+
		"\2\u00e3\u00e4\7T\2\2\u00e4\u00e5\7Q\2\2\u00e5\u00e6\7I\2\2\u00e6\u00e7"+
		"\7T\2\2\u00e7\u00e8\7C\2\2\u00e8\u00e9\7O\2\2\u00e9.\3\2\2\2\u00ea\u00eb"+
		"\7V\2\2\u00eb\u00ec\7J\2\2\u00ec\u00ed\7G\2\2\u00ed\u00ee\7P\2\2\u00ee"+
		"\60\3\2\2\2\u00ef\u00f0\7X\2\2\u00f0\u00f1\7C\2\2\u00f1\u00f2\7T\2\2\u00f2"+
		"\62\3\2\2\2\u00f3\u00f4\7Y\2\2\u00f4\u00f5\7J\2\2\u00f5\u00f6\7K\2\2\u00f6"+
		"\u00f7\7N\2\2\u00f7\u00f8\7G\2\2\u00f8\64\3\2\2\2\u00f9\u00fa\7-\2\2\u00fa"+
		"\66\3\2\2\2\u00fb\u00fc\7/\2\2\u00fc8\3\2\2\2\u00fd\u00fe\7,\2\2\u00fe"+
		":\3\2\2\2\u00ff\u0100\7\61\2\2\u0100<\3\2\2\2\u0101\u0102\7<\2\2\u0102"+
		"\u0103\7?\2\2\u0103>\3\2\2\2\u0104\u0105\7.\2\2\u0105@\3\2\2\2\u0106\u0107"+
		"\7=\2\2\u0107B\3\2\2\2\u0108\u0109\7<\2\2\u0109D\3\2\2\2\u010a\u010b\7"+
		"?\2\2\u010bF\3\2\2\2\u010c\u010d\7>\2\2\u010d\u010e\7@\2\2\u010eH\3\2"+
		"\2\2\u010f\u0110\7>\2\2\u0110J\3\2\2\2\u0111\u0112\7>\2\2\u0112\u0113"+
		"\7?\2\2\u0113L\3\2\2\2\u0114\u0115\7@\2\2\u0115\u0116\7?\2\2\u0116N\3"+
		"\2\2\2\u0117\u0118\7@\2\2\u0118P\3\2\2\2\u0119\u011a\7*\2\2\u011aR\3\2"+
		"\2\2\u011b\u011c\7+\2\2\u011cT\3\2\2\2\u011d\u011e\7]\2\2\u011eV\3\2\2"+
		"\2\u011f\u0120\7*\2\2\u0120\u0121\7\60\2\2\u0121X\3\2\2\2\u0122\u0123"+
		"\7_\2\2\u0123Z\3\2\2\2\u0124\u0125\7\60\2\2\u0125\u0126\7+\2\2\u0126\\"+
		"\3\2\2\2\u0127\u0128\7\60\2\2\u0128^\3\2\2\2\u0129\u012a\7\60\2\2\u012a"+
		"\u012b\7\60\2\2\u012b`\3\2\2\2\u012c\u012d\7U\2\2\u012d\u012e\7V\2\2\u012e"+
		"\u012f\7T\2\2\u012f\u0130\7K\2\2\u0130\u0131\7P\2\2\u0131\u0132\7I\2\2"+
		"\u0132b\3\2\2\2\u0133\u0134\7V\2\2\u0134\u0135\7T\2\2\u0135\u0136\7W\2"+
		"\2\u0136\u0137\7G\2\2\u0137d\3\2\2\2\u0138\u0139\7H\2\2\u0139\u013a\7"+
		"C\2\2\u013a\u013b\7N\2\2\u013b\u013c\7U\2\2\u013c\u013d\7G\2\2\u013df"+
		"\3\2\2\2\u013e\u013f\t\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b\64\2\2"+
		"\u0141h\3\2\2\2\u0142\u0143\7*\2\2\u0143\u0144\7,\2\2\u0144\u0148\3\2"+
		"\2\2\u0145\u0147\13\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u014c\7,\2\2\u014c\u014d\7+\2\2\u014d\u014e\3\2\2\2\u014e\u014f"+
		"\b\65\2\2\u014fj\3\2\2\2\u0150\u0154\7}\2\2\u0151\u0153\13\2\2\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0155\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7\177\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\b\66\2\2\u015al\3\2\2\2\u015b\u015f\4C\\\2"+
		"\u015c\u015e\t\3\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160n\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0168\7)\2\2\u0163\u0164\7)\2\2\u0164\u0167\7)\2\2\u0165\u0167\n\4\2"+
		"\2\u0166\u0163\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u016c\7)\2\2\u016cp\3\2\2\2\u016d\u016f\4\62;\2\u016e\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171r\3\2\2\2"+
		"\u0172\u0174\4\62;\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0183\3\2\2\2\u0177\u0179\7\60\2\2"+
		"\u0178\u017a\4\62;\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017f\5u;\2\u017e"+
		"\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u0177\3\2"+
		"\2\2\u0180\u0181\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0184\5u;\2\u0183\u0180"+
		"\3\2\2\2\u0183\u0182\3\2\2\2\u0184t\3\2\2\2\u0185\u0187\7G\2\2\u0186\u0188"+
		"\t\5\2\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189"+
		"\u018b\4\62;\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018dv\3\2\2\2\20\2\u0148\u0154\u015f\u0166\u0168"+
		"\u0170\u0175\u017b\u017e\u0180\u0183\u0187\u018c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}