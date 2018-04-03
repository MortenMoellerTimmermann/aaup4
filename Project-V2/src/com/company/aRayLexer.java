// Generated from C:/Users/Peter/Desktop/aaup4/aaup4/Project-V2/src/com/company\aRay.g4 by ANTLR 4.7
package com.company;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aRayLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, EXTENDEDTYPE=2, BOOL=3, NUM=4, STRING=5, OPERATOR=6, LOGICALOPERATOR=7, 
		ASSIGN=8, ASSIGNMENTOPERATOR=9, CONDITIONALOPERATOR=10, INORDECREMENT=11, 
		MATRIXOPERATOR=12, THIS=13, AWAIT=14, IF=15, ELSEIF=16, ELSE=17, SWITCH=18, 
		DEFAULT=19, CASE=20, BREAK=21, RETURN=22, FUNC=23, FOR=24, WHILE=25, LP=26, 
		RP=27, LC=28, RC=29, SEMI=30, COL=31, DOT=32, COMMA=33, QUOTES=34, ID=35, 
		WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TYPE", "EXTENDEDTYPE", "BOOL", "NUM", "STRING", "OPERATOR", "LOGICALOPERATOR", 
		"ASSIGN", "ASSIGNMENTOPERATOR", "CONDITIONALOPERATOR", "INORDECREMENT", 
		"MATRIXOPERATOR", "THIS", "AWAIT", "IF", "ELSEIF", "ELSE", "SWITCH", "DEFAULT", 
		"CASE", "BREAK", "RETURN", "FUNC", "FOR", "WHILE", "LP", "RP", "LC", "RC", 
		"SEMI", "COL", "DOT", "COMMA", "QUOTES", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'matrix'", null, null, null, null, null, "'='", null, null, 
		null, "':x'", "'this'", "'await'", "'if'", "'elseif'", "'else'", "'switch'", 
		"'default'", "'case'", "'break'", "'return'", "'func'", "'for'", "'while'", 
		"'('", "')'", "'{'", "'}'", "';'", "':'", "'.'", "','", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TYPE", "EXTENDEDTYPE", "BOOL", "NUM", "STRING", "OPERATOR", "LOGICALOPERATOR", 
		"ASSIGN", "ASSIGNMENTOPERATOR", "CONDITIONALOPERATOR", "INORDECREMENT", 
		"MATRIXOPERATOR", "THIS", "AWAIT", "IF", "ELSEIF", "ELSE", "SWITCH", "DEFAULT", 
		"CASE", "BREAK", "RETURN", "FUNC", "FOR", "WHILE", "LP", "RP", "LC", "RC", 
		"SEMI", "COL", "DOT", "COMMA", "QUOTES", "ID", "WS"
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


	public aRayLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "aRay.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2V\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4h\n\4\3\5\3\5\5\5l\n\5\3\5\3\5\7\5p\n\5\f\5\16\5s\13\5\3\5\3\5"+
		"\7\5w\n\5\f\5\16\5z\13\5\3\5\5\5}\n\5\5\5\177\n\5\3\6\3\6\7\6\u0083\n"+
		"\6\f\6\16\6\u0086\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0095\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a1\n"+
		"\n\3\13\3\13\3\13\3\13\5\13\u00a7\n\13\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\6$\u010f\n$\r$\16$\u0110\3%\6"+
		"%\u0114\n%\r%\16%\u0115\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\t\3\2\63;\3\2"+
		"\62;\6\2\f\f\17\17$$^^\6\2\'\',-//\61\61\4\2>>@@\4\2C\\c|\5\2\13\f\17"+
		"\17\"\"\2\u012c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7g\3\2\2\2\t~\3\2\2"+
		"\2\13\u0080\3\2\2\2\r\u0089\3\2\2\2\17\u0094\3\2\2\2\21\u0096\3\2\2\2"+
		"\23\u00a0\3\2\2\2\25\u00a6\3\2\2\2\27\u00ac\3\2\2\2\31\u00ae\3\2\2\2\33"+
		"\u00b1\3\2\2\2\35\u00b6\3\2\2\2\37\u00bc\3\2\2\2!\u00bf\3\2\2\2#\u00c6"+
		"\3\2\2\2%\u00cb\3\2\2\2\'\u00d2\3\2\2\2)\u00da\3\2\2\2+\u00df\3\2\2\2"+
		"-\u00e5\3\2\2\2/\u00ec\3\2\2\2\61\u00f1\3\2\2\2\63\u00f5\3\2\2\2\65\u00fb"+
		"\3\2\2\2\67\u00fd\3\2\2\29\u00ff\3\2\2\2;\u0101\3\2\2\2=\u0103\3\2\2\2"+
		"?\u0105\3\2\2\2A\u0107\3\2\2\2C\u0109\3\2\2\2E\u010b\3\2\2\2G\u010e\3"+
		"\2\2\2I\u0113\3\2\2\2KL\7p\2\2LM\7w\2\2MV\7o\2\2NO\7k\2\2OP\7p\2\2PV\7"+
		"v\2\2QR\7d\2\2RS\7q\2\2ST\7q\2\2TV\7n\2\2UK\3\2\2\2UN\3\2\2\2UQ\3\2\2"+
		"\2V\4\3\2\2\2WX\7o\2\2XY\7c\2\2YZ\7v\2\2Z[\7t\2\2[\\\7k\2\2\\]\7z\2\2"+
		"]\6\3\2\2\2^_\7v\2\2_`\7t\2\2`a\7w\2\2ah\7g\2\2bc\7h\2\2cd\7c\2\2de\7"+
		"n\2\2ef\7u\2\2fh\7g\2\2g^\3\2\2\2gb\3\2\2\2h\b\3\2\2\2i\177\7\62\2\2j"+
		"l\7/\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mq\t\2\2\2np\t\3\2\2on\3\2\2\2p"+
		"s\3\2\2\2qo\3\2\2\2qr\3\2\2\2r|\3\2\2\2sq\3\2\2\2tx\7\60\2\2uw\t\3\2\2"+
		"vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{}\t\2\2\2"+
		"|t\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~i\3\2\2\2~k\3\2\2\2\177\n\3\2\2\2\u0080"+
		"\u0084\7$\2\2\u0081\u0083\n\4\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7$\2\2\u0088\f\3\2\2\2\u0089\u008a\t\5\2\2"+
		"\u008a\16\3\2\2\2\u008b\u008c\7?\2\2\u008c\u0095\7?\2\2\u008d\u008e\7"+
		"#\2\2\u008e\u0095\7?\2\2\u008f\u0095\t\6\2\2\u0090\u0091\7?\2\2\u0091"+
		"\u0095\7>\2\2\u0092\u0093\7?\2\2\u0093\u0095\7@\2\2\u0094\u008b\3\2\2"+
		"\2\u0094\u008d\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0095\20\3\2\2\2\u0096\u0097\7?\2\2\u0097\22\3\2\2\2\u0098\u0099"+
		"\7-\2\2\u0099\u00a1\7?\2\2\u009a\u009b\7,\2\2\u009b\u00a1\7?\2\2\u009c"+
		"\u009d\7/\2\2\u009d\u00a1\7?\2\2\u009e\u009f\7\61\2\2\u009f\u00a1\7?\2"+
		"\2\u00a0\u0098\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\24\3\2\2\2\u00a2\u00a3\7~\2\2\u00a3\u00a7\7~\2\2\u00a4"+
		"\u00a5\7(\2\2\u00a5\u00a7\7(\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a4\3\2\2"+
		"\2\u00a7\26\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9\u00ad\7-\2\2\u00aa\u00ab"+
		"\7/\2\2\u00ab\u00ad\7/\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\30\3\2\2\2\u00ae\u00af\7<\2\2\u00af\u00b0\7z\2\2\u00b0\32\3\2\2\2\u00b1"+
		"\u00b2\7v\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7u\2\2"+
		"\u00b5\34\3\2\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\7"+
		"c\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7v\2\2\u00bb\36\3\2\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7h\2\2\u00be \3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1"+
		"\7n\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7k\2\2\u00c4"+
		"\u00c5\7h\2\2\u00c5\"\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7n\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7u\2\2\u00cc"+
		"\u00cd\7y\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7e\2\2"+
		"\u00d0\u00d1\7j\2\2\u00d1&\3\2\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7g\2"+
		"\2\u00d4\u00d5\7h\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8"+
		"\7n\2\2\u00d8\u00d9\7v\2\2\u00d9(\3\2\2\2\u00da\u00db\7e\2\2\u00db\u00dc"+
		"\7c\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7g\2\2\u00de*\3\2\2\2\u00df\u00e0"+
		"\7d\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7c\2\2\u00e3"+
		"\u00e4\7m\2\2\u00e4,\3\2\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7v\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7p\2\2"+
		"\u00eb.\3\2\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7p\2"+
		"\2\u00ef\u00f0\7e\2\2\u00f0\60\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3"+
		"\7q\2\2\u00f3\u00f4\7t\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6\u00f7"+
		"\7j\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7g\2\2\u00fa"+
		"\64\3\2\2\2\u00fb\u00fc\7*\2\2\u00fc\66\3\2\2\2\u00fd\u00fe\7+\2\2\u00fe"+
		"8\3\2\2\2\u00ff\u0100\7}\2\2\u0100:\3\2\2\2\u0101\u0102\7\177\2\2\u0102"+
		"<\3\2\2\2\u0103\u0104\7=\2\2\u0104>\3\2\2\2\u0105\u0106\7<\2\2\u0106@"+
		"\3\2\2\2\u0107\u0108\7\60\2\2\u0108B\3\2\2\2\u0109\u010a\7.\2\2\u010a"+
		"D\3\2\2\2\u010b\u010c\7$\2\2\u010cF\3\2\2\2\u010d\u010f\t\7\2\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111H\3\2\2\2\u0112\u0114\t\b\2\2\u0113\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\b%\2\2\u0118J\3\2\2\2\21\2Ugkqx|~\u0084\u0094\u00a0\u00a6\u00ac"+
		"\u0110\u0115\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}