// Generated from c:\Users\Jefeson\Desktop\jubiladores\Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", "PROGRAM", 
			"COLON", "SEMI", "ASSIGN", "GREATHERTHAN", "LESSTHAN", "EQUALS", "COMMA", 
			"DOT", "OPENPARENTHESIS", "CLOSEPARENTHESIS", "VAR", "FUNCTION", "BEGIN", 
			"END", "IDENTIFIER", "THEN", "DO", "IF", "ELSE", "WHILE", "READ", "PRINT", 
			"PLUS", "MINUS", "OR", "ASTERISK", "SLASH", "AND", "NOT", "NUM_INT", 
			"STRING_TYPE", "INTEGER_TYPE", "TYPE"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0107\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4f"+
		"\n\4\f\4\16\4i\13\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5q\n\5\f\5\16\5t\13\5\3"+
		"\6\3\6\3\6\3\6\7\6z\n\6\f\6\16\6}\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\7\26\u00b7\n\26\f\26\16\26\u00ba\13\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3%\6%\u00f1\n%\r%\16%\u00f2\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\5(\u0106\n(\4[g\2)\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")\3\2\5\5\2\13\f\17\17\"\"\5\2\62;C\\aa\3\2))\2\u010e\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5U\3\2\2\2\7c\3\2\2\2\tn\3\2"+
		"\2\2\13u\3\2\2\2\r\u0080\3\2\2\2\17\u0088\3\2\2\2\21\u008a\3\2\2\2\23"+
		"\u008c\3\2\2\2\25\u008f\3\2\2\2\27\u0091\3\2\2\2\31\u0093\3\2\2\2\33\u0095"+
		"\3\2\2\2\35\u0097\3\2\2\2\37\u0099\3\2\2\2!\u009b\3\2\2\2#\u009d\3\2\2"+
		"\2%\u00a1\3\2\2\2\'\u00aa\3\2\2\2)\u00b0\3\2\2\2+\u00b4\3\2\2\2-\u00bb"+
		"\3\2\2\2/\u00c0\3\2\2\2\61\u00c3\3\2\2\2\63\u00c6\3\2\2\2\65\u00cb\3\2"+
		"\2\2\67\u00d1\3\2\2\29\u00d6\3\2\2\2;\u00dc\3\2\2\2=\u00de\3\2\2\2?\u00e0"+
		"\3\2\2\2A\u00e3\3\2\2\2C\u00e5\3\2\2\2E\u00e7\3\2\2\2G\u00eb\3\2\2\2I"+
		"\u00f0\3\2\2\2K\u00f4\3\2\2\2M\u00fb\3\2\2\2O\u0105\3\2\2\2QR\t\2\2\2"+
		"RS\3\2\2\2ST\b\2\2\2T\4\3\2\2\2UV\7*\2\2VW\7,\2\2W[\3\2\2\2XZ\13\2\2\2"+
		"YX\3\2\2\2Z]\3\2\2\2[\\\3\2\2\2[Y\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7,\2"+
		"\2_`\7+\2\2`a\3\2\2\2ab\b\3\2\2b\6\3\2\2\2cg\7}\2\2df\13\2\2\2ed\3\2\2"+
		"\2fi\3\2\2\2gh\3\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\177\2\2kl\3\2"+
		"\2\2lm\b\4\2\2m\b\3\2\2\2nr\4C\\\2oq\t\3\2\2po\3\2\2\2qt\3\2\2\2rp\3\2"+
		"\2\2rs\3\2\2\2s\n\3\2\2\2tr\3\2\2\2u{\7)\2\2vw\7)\2\2wz\7)\2\2xz\n\4\2"+
		"\2yv\3\2\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2"+
		"\2~\177\7)\2\2\177\f\3\2\2\2\u0080\u0081\7r\2\2\u0081\u0082\7t\2\2\u0082"+
		"\u0083\7q\2\2\u0083\u0084\7i\2\2\u0084\u0085\7t\2\2\u0085\u0086\7c\2\2"+
		"\u0086\u0087\7o\2\2\u0087\16\3\2\2\2\u0088\u0089\7<\2\2\u0089\20\3\2\2"+
		"\2\u008a\u008b\7=\2\2\u008b\22\3\2\2\2\u008c\u008d\7<\2\2\u008d\u008e"+
		"\7?\2\2\u008e\24\3\2\2\2\u008f\u0090\7@\2\2\u0090\26\3\2\2\2\u0091\u0092"+
		"\7>\2\2\u0092\30\3\2\2\2\u0093\u0094\7?\2\2\u0094\32\3\2\2\2\u0095\u0096"+
		"\7.\2\2\u0096\34\3\2\2\2\u0097\u0098\7\60\2\2\u0098\36\3\2\2\2\u0099\u009a"+
		"\7*\2\2\u009a \3\2\2\2\u009b\u009c\7+\2\2\u009c\"\3\2\2\2\u009d\u009e"+
		"\7x\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7t\2\2\u00a0$\3\2\2\2\u00a1\u00a2"+
		"\7h\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7e\2\2\u00a5"+
		"\u00a6\7v\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7p\2\2"+
		"\u00a9&\3\2\2\2\u00aa\u00ab\7d\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7i\2"+
		"\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af(\3\2\2\2\u00b0\u00b1\7"+
		"g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7f\2\2\u00b3*\3\2\2\2\u00b4\u00b8"+
		"\4C\\\2\u00b5\u00b7\t\3\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9,\3\2\2\2\u00ba\u00b8\3\2\2\2"+
		"\u00bb\u00bc\7v\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7g\2\2\u00be\u00bf"+
		"\7p\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2\7q\2\2\u00c2\60"+
		"\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7h\2\2\u00c5\62\3\2\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2"+
		"\u00ca\64\3\2\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd\7j\2\2\u00cd\u00ce\7"+
		"k\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7g\2\2\u00d0\66\3\2\2\2\u00d1\u00d2"+
		"\7t\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7f\2\2\u00d5"+
		"8\3\2\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7k\2\2\u00d9"+
		"\u00da\7p\2\2\u00da\u00db\7v\2\2\u00db:\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd"+
		"<\3\2\2\2\u00de\u00df\7/\2\2\u00df>\3\2\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2"+
		"\7t\2\2\u00e2@\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4B\3\2\2\2\u00e5\u00e6\7"+
		"\61\2\2\u00e6D\3\2\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea"+
		"\7f\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee"+
		"\7v\2\2\u00eeH\3\2\2\2\u00ef\u00f1\4\62;\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3J\3\2\2\2\u00f4"+
		"\u00f5\7u\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7k\2\2"+
		"\u00f8\u00f9\7p\2\2\u00f9\u00fa\7i\2\2\u00faL\3\2\2\2\u00fb\u00fc\7k\2"+
		"\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100"+
		"\7i\2\2\u0100\u0101\7g\2\2\u0101\u0102\7t\2\2\u0102N\3\2\2\2\u0103\u0106"+
		"\5K&\2\u0104\u0106\5M\'\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		"P\3\2\2\2\13\2[gry{\u00b8\u00f2\u0105\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}