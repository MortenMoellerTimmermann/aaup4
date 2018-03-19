// Generated from D:/JavaProjects/Project-V2/src/com/company\BETS.g4 by ANTLR 4.7
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
public class BETSLexer extends Lexer {
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
		null, null, "'this'", "'await'", "'if'", "'elseif'", "'else'", "'switch'", 
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


	public BETSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BETS.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0123\b\1\4\2\t"+
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
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ac\n\13\3\f\3"+
		"\f\3\f\3\f\5\f\u00b2\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ba\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\6$\u0119\n$\r$\16$\u011a\3%\6%\u011e\n%\r%\16"+
		"%\u011f\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\t\3\2\63;\3\2\62;\6\2\f\f\17\17"+
		"$$^^\6\2\'\',-//\61\61\4\2>>@@\4\2C\\c|\5\2\13\f\17\17\"\"\2\u013a\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7g\3\2\2\2\t~\3\2\2\2\13\u0080\3\2\2\2"+
		"\r\u0089\3\2\2\2\17\u0094\3\2\2\2\21\u0096\3\2\2\2\23\u00a0\3\2\2\2\25"+
		"\u00ab\3\2\2\2\27\u00b1\3\2\2\2\31\u00b9\3\2\2\2\33\u00bb\3\2\2\2\35\u00c0"+
		"\3\2\2\2\37\u00c6\3\2\2\2!\u00c9\3\2\2\2#\u00d0\3\2\2\2%\u00d5\3\2\2\2"+
		"\'\u00dc\3\2\2\2)\u00e4\3\2\2\2+\u00e9\3\2\2\2-\u00ef\3\2\2\2/\u00f6\3"+
		"\2\2\2\61\u00fb\3\2\2\2\63\u00ff\3\2\2\2\65\u0105\3\2\2\2\67\u0107\3\2"+
		"\2\29\u0109\3\2\2\2;\u010b\3\2\2\2=\u010d\3\2\2\2?\u010f\3\2\2\2A\u0111"+
		"\3\2\2\2C\u0113\3\2\2\2E\u0115\3\2\2\2G\u0118\3\2\2\2I\u011d\3\2\2\2K"+
		"L\7p\2\2LM\7w\2\2MV\7o\2\2NO\7k\2\2OP\7p\2\2PV\7v\2\2QR\7d\2\2RS\7q\2"+
		"\2ST\7q\2\2TV\7n\2\2UK\3\2\2\2UN\3\2\2\2UQ\3\2\2\2V\4\3\2\2\2WX\7o\2\2"+
		"XY\7c\2\2YZ\7v\2\2Z[\7t\2\2[\\\7k\2\2\\]\7z\2\2]\6\3\2\2\2^_\7v\2\2_`"+
		"\7t\2\2`a\7w\2\2ah\7g\2\2bc\7h\2\2cd\7c\2\2de\7n\2\2ef\7u\2\2fh\7g\2\2"+
		"g^\3\2\2\2gb\3\2\2\2h\b\3\2\2\2i\177\7\62\2\2jl\7/\2\2kj\3\2\2\2kl\3\2"+
		"\2\2lm\3\2\2\2mq\t\2\2\2np\t\3\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2"+
		"\2\2r|\3\2\2\2sq\3\2\2\2tx\7\60\2\2uw\t\3\2\2vu\3\2\2\2wz\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{}\t\2\2\2|t\3\2\2\2|}\3\2\2\2}\177"+
		"\3\2\2\2~i\3\2\2\2~k\3\2\2\2\177\n\3\2\2\2\u0080\u0084\7$\2\2\u0081\u0083"+
		"\n\4\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7$"+
		"\2\2\u0088\f\3\2\2\2\u0089\u008a\t\5\2\2\u008a\16\3\2\2\2\u008b\u008c"+
		"\7?\2\2\u008c\u0095\7?\2\2\u008d\u008e\7#\2\2\u008e\u0095\7?\2\2\u008f"+
		"\u0095\t\6\2\2\u0090\u0091\7?\2\2\u0091\u0095\7>\2\2\u0092\u0093\7?\2"+
		"\2\u0093\u0095\7@\2\2\u0094\u008b\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008f"+
		"\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0092\3\2\2\2\u0095\20\3\2\2\2\u0096"+
		"\u0097\7?\2\2\u0097\22\3\2\2\2\u0098\u0099\7-\2\2\u0099\u00a1\7?\2\2\u009a"+
		"\u009b\7,\2\2\u009b\u00a1\7?\2\2\u009c\u009d\7/\2\2\u009d\u00a1\7?\2\2"+
		"\u009e\u009f\7\61\2\2\u009f\u00a1\7?\2\2\u00a0\u0098\3\2\2\2\u00a0\u009a"+
		"\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\24\3\2\2\2\u00a2"+
		"\u00a3\7c\2\2\u00a3\u00a4\7p\2\2\u00a4\u00ac\7f\2\2\u00a5\u00a6\7q\2\2"+
		"\u00a6\u00ac\7t\2\2\u00a7\u00a8\7~\2\2\u00a8\u00ac\7~\2\2\u00a9\u00aa"+
		"\7(\2\2\u00aa\u00ac\7(\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab"+
		"\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\26\3\2\2\2\u00ad\u00ae\7-\2\2"+
		"\u00ae\u00b2\7-\2\2\u00af\u00b0\7/\2\2\u00b0\u00b2\7/\2\2\u00b1\u00ad"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7<\2\2\u00b4"+
		"\u00ba\7q\2\2\u00b5\u00b6\7<\2\2\u00b6\u00ba\7z\2\2\u00b7\u00b8\7<\2\2"+
		"\u00b8\u00ba\7,\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7j\2\2\u00bd"+
		"\u00be\7k\2\2\u00be\u00bf\7u\2\2\u00bf\34\3\2\2\2\u00c0\u00c1\7c\2\2\u00c1"+
		"\u00c2\7y\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7v\2\2"+
		"\u00c5\36\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7h\2\2\u00c8 \3\2\2\2"+
		"\u00c9\u00ca\7g\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7h\2\2\u00cf\"\3\2\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"$\3\2\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7y\2\2\u00d7\u00d8\7k\2\2\u00d8"+
		"\u00d9\7v\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7j\2\2\u00db&\3\2\2\2\u00dc"+
		"\u00dd\7f\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7c\2\2"+
		"\u00e0\u00e1\7w\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7v\2\2\u00e3(\3\2\2"+
		"\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8"+
		"\7g\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7d\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec"+
		"\7g\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7m\2\2\u00ee,\3\2\2\2\u00ef\u00f0"+
		"\7t\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7w\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4\u00f5\7p\2\2\u00f5.\3\2\2\2\u00f6\u00f7\7h\2\2\u00f7"+
		"\u00f8\7w\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7e\2\2\u00fa\60\3\2\2\2\u00fb"+
		"\u00fc\7h\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7t\2\2\u00fe\62\3\2\2\2\u00ff"+
		"\u0100\7y\2\2\u0100\u0101\7j\2\2\u0101\u0102\7k\2\2\u0102\u0103\7n\2\2"+
		"\u0103\u0104\7g\2\2\u0104\64\3\2\2\2\u0105\u0106\7*\2\2\u0106\66\3\2\2"+
		"\2\u0107\u0108\7+\2\2\u01088\3\2\2\2\u0109\u010a\7}\2\2\u010a:\3\2\2\2"+
		"\u010b\u010c\7\177\2\2\u010c<\3\2\2\2\u010d\u010e\7=\2\2\u010e>\3\2\2"+
		"\2\u010f\u0110\7<\2\2\u0110@\3\2\2\2\u0111\u0112\7\60\2\2\u0112B\3\2\2"+
		"\2\u0113\u0114\7.\2\2\u0114D\3\2\2\2\u0115\u0116\7$\2\2\u0116F\3\2\2\2"+
		"\u0117\u0119\t\7\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011bH\3\2\2\2\u011c\u011e\t\b\2\2\u011d"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b%\2\2\u0122J\3\2\2\2\22\2Ugkqx|"+
		"~\u0084\u0094\u00a0\u00ab\u00b1\u00b9\u011a\u011f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}