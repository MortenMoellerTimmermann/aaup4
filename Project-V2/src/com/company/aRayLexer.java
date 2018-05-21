// Generated from /Users/steffenkrohnstorgaard/Desktop/AAU/aaup4/Project-V2/src/com/company/aRay.g4 by ANTLR 4.7
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
		RP=27, LC=28, RC=29, LB=30, RB=31, SEMI=32, COL=33, DOT=34, COMMA=35, 
		QUOTES=36, ID=37, WS=38;
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
		"LB", "RB", "SEMI", "COL", "DOT", "COMMA", "QUOTES", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'matrix'", null, null, null, null, null, "'='", null, null, 
		null, "':x'", "'this'", "'await'", "'if'", "'elseif'", "'else'", "'switch'", 
		"'default'", "'case'", "'break'", "'return'", "'func'", "'for'", "'while'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "':'", "'.'", "','", 
		"'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TYPE", "EXTENDEDTYPE", "BOOL", "NUM", "STRING", "OPERATOR", "LOGICALOPERATOR", 
		"ASSIGN", "ASSIGNMENTOPERATOR", "CONDITIONALOPERATOR", "INORDECREMENT", 
		"MATRIXOPERATOR", "THIS", "AWAIT", "IF", "ELSEIF", "ELSE", "SWITCH", "DEFAULT", 
		"CASE", "BREAK", "RETURN", "FUNC", "FOR", "WHILE", "LP", "RP", "LC", "RC", 
		"LB", "RB", "SEMI", "COL", "DOT", "COMMA", "QUOTES", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0125\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2\\\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\5\5r\n\5\3\5\3\5\7\5v\n\5"+
		"\f\5\16\5y\13\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\5\5\5\u0083\n\5"+
		"\5\5\u0085\n\5\3\6\3\6\7\6\u0089\n\6\f\6\16\6\u008c\13\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009b\n\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a7\n\n\3\13\3\13\3\13\3\13\5\13\u00ad\n"+
		"\13\3\f\3\f\3\f\3\f\5\f\u00b3\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\7&\u011a\n&\f&\16&\u011d\13&\3\'\6\'\u0120\n\'\r\'"+
		"\16\'\u0121\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\n\3\2\63;\3\2\62;\6\2"+
		"\f\f\17\17$$^^\6\2\'\',-//\61\61\4\2>>@@\4\2C\\c|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u0138\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3[\3\2\2\2\5]"+
		"\3\2\2\2\7m\3\2\2\2\t\u0084\3\2\2\2\13\u0086\3\2\2\2\r\u008f\3\2\2\2\17"+
		"\u009a\3\2\2\2\21\u009c\3\2\2\2\23\u00a6\3\2\2\2\25\u00ac\3\2\2\2\27\u00b2"+
		"\3\2\2\2\31\u00b4\3\2\2\2\33\u00b7\3\2\2\2\35\u00bc\3\2\2\2\37\u00c2\3"+
		"\2\2\2!\u00c5\3\2\2\2#\u00cc\3\2\2\2%\u00d1\3\2\2\2\'\u00d8\3\2\2\2)\u00e0"+
		"\3\2\2\2+\u00e5\3\2\2\2-\u00eb\3\2\2\2/\u00f2\3\2\2\2\61\u00f7\3\2\2\2"+
		"\63\u00fb\3\2\2\2\65\u0101\3\2\2\2\67\u0103\3\2\2\29\u0105\3\2\2\2;\u0107"+
		"\3\2\2\2=\u0109\3\2\2\2?\u010b\3\2\2\2A\u010d\3\2\2\2C\u010f\3\2\2\2E"+
		"\u0111\3\2\2\2G\u0113\3\2\2\2I\u0115\3\2\2\2K\u0117\3\2\2\2M\u011f\3\2"+
		"\2\2OP\7h\2\2PQ\7n\2\2QR\7q\2\2RS\7c\2\2S\\\7v\2\2TU\7k\2\2UV\7p\2\2V"+
		"\\\7v\2\2WX\7d\2\2XY\7q\2\2YZ\7q\2\2Z\\\7n\2\2[O\3\2\2\2[T\3\2\2\2[W\3"+
		"\2\2\2\\\4\3\2\2\2]^\7o\2\2^_\7c\2\2_`\7v\2\2`a\7t\2\2ab\7k\2\2bc\7z\2"+
		"\2c\6\3\2\2\2de\7v\2\2ef\7t\2\2fg\7w\2\2gn\7g\2\2hi\7h\2\2ij\7c\2\2jk"+
		"\7n\2\2kl\7u\2\2ln\7g\2\2md\3\2\2\2mh\3\2\2\2n\b\3\2\2\2o\u0085\7\62\2"+
		"\2pr\7/\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2sw\t\2\2\2tv\t\3\2\2ut\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u0082\3\2\2\2yw\3\2\2\2z~\7\60\2\2{"+
		"}\t\3\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3"+
		"\2\2\2\u0080~\3\2\2\2\u0081\u0083\t\2\2\2\u0082z\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\u0085\3\2\2\2\u0084o\3\2\2\2\u0084q\3\2\2\2\u0085\n\3\2\2"+
		"\2\u0086\u008a\7$\2\2\u0087\u0089\n\4\2\2\u0088\u0087\3\2\2\2\u0089\u008c"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7$\2\2\u008e\f\3\2\2\2\u008f\u0090\t\5\2\2"+
		"\u0090\16\3\2\2\2\u0091\u0092\7?\2\2\u0092\u009b\7?\2\2\u0093\u0094\7"+
		"#\2\2\u0094\u009b\7?\2\2\u0095\u009b\t\6\2\2\u0096\u0097\7?\2\2\u0097"+
		"\u009b\7>\2\2\u0098\u0099\7?\2\2\u0099\u009b\7@\2\2\u009a\u0091\3\2\2"+
		"\2\u009a\u0093\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\20\3\2\2\2\u009c\u009d\7?\2\2\u009d\22\3\2\2\2\u009e\u009f"+
		"\7-\2\2\u009f\u00a7\7?\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a7\7?\2\2\u00a2"+
		"\u00a3\7/\2\2\u00a3\u00a7\7?\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a7\7?\2"+
		"\2\u00a6\u009e\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7~\2\2\u00a9\u00ad\7~\2\2\u00aa"+
		"\u00ab\7(\2\2\u00ab\u00ad\7(\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00aa\3\2\2"+
		"\2\u00ad\26\3\2\2\2\u00ae\u00af\7-\2\2\u00af\u00b3\7-\2\2\u00b0\u00b1"+
		"\7/\2\2\u00b1\u00b3\7/\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\30\3\2\2\2\u00b4\u00b5\7<\2\2\u00b5\u00b6\7z\2\2\u00b6\32\3\2\2\2\u00b7"+
		"\u00b8\7v\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7u\2\2"+
		"\u00bb\34\3\2\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7y\2\2\u00be\u00bf\7"+
		"c\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7v\2\2\u00c1\36\3\2\2\2\u00c2\u00c3"+
		"\7k\2\2\u00c3\u00c4\7h\2\2\u00c4 \3\2\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7"+
		"\7n\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7k\2\2\u00ca"+
		"\u00cb\7h\2\2\u00cb\"\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7n\2\2\u00ce"+
		"\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0$\3\2\2\2\u00d1\u00d2\7u\2\2\u00d2"+
		"\u00d3\7y\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7e\2\2"+
		"\u00d6\u00d7\7j\2\2\u00d7&\3\2\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7g\2"+
		"\2\u00da\u00db\7h\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de"+
		"\7n\2\2\u00de\u00df\7v\2\2\u00df(\3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2"+
		"\7c\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7g\2\2\u00e4*\3\2\2\2\u00e5\u00e6"+
		"\7d\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u00ea\7m\2\2\u00ea,\3\2\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"\u00ee\7v\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7p\2\2"+
		"\u00f1.\3\2\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7p\2"+
		"\2\u00f5\u00f6\7e\2\2\u00f6\60\3\2\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9"+
		"\7q\2\2\u00f9\u00fa\7t\2\2\u00fa\62\3\2\2\2\u00fb\u00fc\7y\2\2\u00fc\u00fd"+
		"\7j\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7g\2\2\u0100"+
		"\64\3\2\2\2\u0101\u0102\7*\2\2\u0102\66\3\2\2\2\u0103\u0104\7+\2\2\u0104"+
		"8\3\2\2\2\u0105\u0106\7}\2\2\u0106:\3\2\2\2\u0107\u0108\7\177\2\2\u0108"+
		"<\3\2\2\2\u0109\u010a\7]\2\2\u010a>\3\2\2\2\u010b\u010c\7_\2\2\u010c@"+
		"\3\2\2\2\u010d\u010e\7=\2\2\u010eB\3\2\2\2\u010f\u0110\7<\2\2\u0110D\3"+
		"\2\2\2\u0111\u0112\7\60\2\2\u0112F\3\2\2\2\u0113\u0114\7.\2\2\u0114H\3"+
		"\2\2\2\u0115\u0116\7$\2\2\u0116J\3\2\2\2\u0117\u011b\t\7\2\2\u0118\u011a"+
		"\t\b\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011cL\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\t\t\2\2"+
		"\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b\'\2\2\u0124N\3\2\2\2\22\2["+
		"mqw~\u0082\u0084\u008a\u009a\u00a6\u00ac\u00b2\u0119\u011b\u0121\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}