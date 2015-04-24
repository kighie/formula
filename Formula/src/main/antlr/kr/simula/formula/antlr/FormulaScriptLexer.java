// Generated from FormulaScript.g4 by ANTLR 4.5
package kr.simula.formula.antlr;



//	package kr.simula.formula.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, END_OF_STMT=37, NUMBER=38, 
		STRING_LITERAL=39, NULL=40, BOOLEAN=41, IDENT=42, WS=43, MULTILINE_COMMENT=44, 
		LINE_COMMENT=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "END_OF_STMT", "DIGIT", "LETTER", "NUMBER", 
		"STRING_LITERAL", "NULL", "BOOLEAN", "IDENT", "WS", "MULTILINE_COMMENT", 
		"LINE_COMMENT", "EOL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'<-'", "'['", "']'", "'('", "')'", "'{'", "'}'", "','", 
		"'return'", "'if'", "'elseif'", "'else'", "'foreach'", "'in'", "'->'", 
		"'='", "'.'", "'is'", "'!='", "'<>'", "'not'", "'>'", "'>='", "'<'", "'<='", 
		"':'", "'-'", "'%'", "'^'", "'*'", "'/'", "'+'", "'&'", "'and'", "'or'", 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "END_OF_STMT", "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", "IDENT", 
		"WS", "MULTILINE_COMMENT", "LINE_COMMENT"
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


	public FormulaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FormulaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u0144\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\6)\u00d9"+
		"\n)\r)\16)\u00da\3)\3)\6)\u00df\n)\r)\16)\u00e0\5)\u00e3\n)\3*\3*\7*\u00e7"+
		"\n*\f*\16*\u00ea\13*\3*\3*\3*\7*\u00ef\n*\f*\16*\u00f2\13*\3*\5*\u00f5"+
		"\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0102\n+\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0116\n,\3-\3-\3-\7-\u011b\n-\f-"+
		"\16-\u011e\13-\3.\6.\u0121\n.\r.\16.\u0122\3.\3.\3/\3/\3/\3/\7/\u012b"+
		"\n/\f/\16/\u012e\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0139\n\60"+
		"\f\60\16\60\u013c\13\60\3\60\3\60\3\61\3\61\3\61\5\61\u0143\n\61\3\u012c"+
		"\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M\2O\2Q(S)U*W+Y,[-]._/a\2\3\2\7\b\2&&C\\aac|\u3132"+
		"\u3191\uac02\ud7b1\5\2\f\f\17\17$$\5\2\f\f\17\17))\5\2\13\f\16\17\"\""+
		"\4\2\f\f\17\17\u0151\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3c\3\2"+
		"\2\2\5j\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13q\3\2\2\2\rs\3\2\2\2\17u\3\2\2"+
		"\2\21w\3\2\2\2\23y\3\2\2\2\25{\3\2\2\2\27\u0082\3\2\2\2\31\u0085\3\2\2"+
		"\2\33\u008c\3\2\2\2\35\u0091\3\2\2\2\37\u0099\3\2\2\2!\u009c\3\2\2\2#"+
		"\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2)\u00a6\3\2\2\2+\u00a9\3"+
		"\2\2\2-\u00ac\3\2\2\2/\u00b0\3\2\2\2\61\u00b2\3\2\2\2\63\u00b5\3\2\2\2"+
		"\65\u00b7\3\2\2\2\67\u00ba\3\2\2\29\u00bc\3\2\2\2;\u00be\3\2\2\2=\u00c0"+
		"\3\2\2\2?\u00c2\3\2\2\2A\u00c4\3\2\2\2C\u00c6\3\2\2\2E\u00c8\3\2\2\2G"+
		"\u00ca\3\2\2\2I\u00ce\3\2\2\2K\u00d1\3\2\2\2M\u00d3\3\2\2\2O\u00d5\3\2"+
		"\2\2Q\u00d8\3\2\2\2S\u00f4\3\2\2\2U\u0101\3\2\2\2W\u0115\3\2\2\2Y\u0117"+
		"\3\2\2\2[\u0120\3\2\2\2]\u0126\3\2\2\2_\u0134\3\2\2\2a\u0142\3\2\2\2c"+
		"d\7k\2\2de\7o\2\2ef\7r\2\2fg\7q\2\2gh\7t\2\2hi\7v\2\2i\4\3\2\2\2jk\7>"+
		"\2\2kl\7/\2\2l\6\3\2\2\2mn\7]\2\2n\b\3\2\2\2op\7_\2\2p\n\3\2\2\2qr\7*"+
		"\2\2r\f\3\2\2\2st\7+\2\2t\16\3\2\2\2uv\7}\2\2v\20\3\2\2\2wx\7\177\2\2"+
		"x\22\3\2\2\2yz\7.\2\2z\24\3\2\2\2{|\7t\2\2|}\7g\2\2}~\7v\2\2~\177\7w\2"+
		"\2\177\u0080\7t\2\2\u0080\u0081\7p\2\2\u0081\26\3\2\2\2\u0082\u0083\7"+
		"k\2\2\u0083\u0084\7h\2\2\u0084\30\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7n\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u008b\7h\2\2\u008b\32\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e"+
		"\u008f\7u\2\2\u008f\u0090\7g\2\2\u0090\34\3\2\2\2\u0091\u0092\7h\2\2\u0092"+
		"\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095\u0096\7c\2\2"+
		"\u0096\u0097\7e\2\2\u0097\u0098\7j\2\2\u0098\36\3\2\2\2\u0099\u009a\7"+
		"k\2\2\u009a\u009b\7p\2\2\u009b \3\2\2\2\u009c\u009d\7/\2\2\u009d\u009e"+
		"\7@\2\2\u009e\"\3\2\2\2\u009f\u00a0\7?\2\2\u00a0$\3\2\2\2\u00a1\u00a2"+
		"\7\60\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7u\2\2\u00a5("+
		"\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7\u00a8\7?\2\2\u00a8*\3\2\2\2\u00a9\u00aa"+
		"\7>\2\2\u00aa\u00ab\7@\2\2\u00ab,\3\2\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae"+
		"\7q\2\2\u00ae\u00af\7v\2\2\u00af.\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1\60"+
		"\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4\7?\2\2\u00b4\62\3\2\2\2\u00b5"+
		"\u00b6\7>\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8\u00b9\7?\2\2\u00b9"+
		"\66\3\2\2\2\u00ba\u00bb\7<\2\2\u00bb8\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd"+
		":\3\2\2\2\u00be\u00bf\7\'\2\2\u00bf<\3\2\2\2\u00c0\u00c1\7`\2\2\u00c1"+
		">\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3@\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5"+
		"B\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7D\3\2\2\2\u00c8\u00c9\7(\2\2\u00c9F"+
		"\3\2\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7f\2\2\u00cd"+
		"H\3\2\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7t\2\2\u00d0J\3\2\2\2\u00d1\u00d2"+
		"\7=\2\2\u00d2L\3\2\2\2\u00d3\u00d4\4\62;\2\u00d4N\3\2\2\2\u00d5\u00d6"+
		"\t\2\2\2\u00d6P\3\2\2\2\u00d7\u00d9\5M\'\2\u00d8\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e2\3\2\2\2\u00dc"+
		"\u00de\7\60\2\2\u00dd\u00df\5M\'\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00dc\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3R\3\2\2\2\u00e4\u00e8\7$\2\2\u00e5"+
		"\u00e7\n\3\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00f5\7$\2\2\u00ec\u00f0\7)\2\2\u00ed\u00ef\n\4\2\2\u00ee\u00ed\3\2\2"+
		"\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\7)\2\2\u00f4\u00e4\3\2\2\2\u00f4"+
		"\u00ec\3\2\2\2\u00f5T\3\2\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7w\2\2\u00f8"+
		"\u00f9\7n\2\2\u00f9\u0102\7n\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7k\2\2"+
		"\u00fc\u0102\7n\2\2\u00fd\u00fe\7P\2\2\u00fe\u00ff\7W\2\2\u00ff\u0100"+
		"\7N\2\2\u0100\u0102\7N\2\2\u0101\u00f6\3\2\2\2\u0101\u00fa\3\2\2\2\u0101"+
		"\u00fd\3\2\2\2\u0102V\3\2\2\2\u0103\u0104\7v\2\2\u0104\u0105\7t\2\2\u0105"+
		"\u0106\7w\2\2\u0106\u0116\7g\2\2\u0107\u0108\7h\2\2\u0108\u0109\7c\2\2"+
		"\u0109\u010a\7n\2\2\u010a\u010b\7u\2\2\u010b\u0116\7g\2\2\u010c\u010d"+
		"\7V\2\2\u010d\u010e\7T\2\2\u010e\u010f\7W\2\2\u010f\u0116\7G\2\2\u0110"+
		"\u0111\7H\2\2\u0111\u0112\7C\2\2\u0112\u0113\7N\2\2\u0113\u0114\7U\2\2"+
		"\u0114\u0116\7G\2\2\u0115\u0103\3\2\2\2\u0115\u0107\3\2\2\2\u0115\u010c"+
		"\3\2\2\2\u0115\u0110\3\2\2\2\u0116X\3\2\2\2\u0117\u011c\5O(\2\u0118\u011b"+
		"\5O(\2\u0119\u011b\5M\'\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011dZ\3\2\2\2"+
		"\u011e\u011c\3\2\2\2\u011f\u0121\t\5\2\2\u0120\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\b.\2\2\u0125\\\3\2\2\2\u0126\u0127\7\61\2\2\u0127\u0128\7,\2\2"+
		"\u0128\u012c\3\2\2\2\u0129\u012b\13\2\2\2\u012a\u0129\3\2\2\2\u012b\u012e"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0130\7,\2\2\u0130\u0131\7\61\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0133\b/\2\2\u0133^\3\2\2\2\u0134\u0135\7\61\2\2\u0135\u0136"+
		"\7\61\2\2\u0136\u013a\3\2\2\2\u0137\u0139\n\6\2\2\u0138\u0137\3\2\2\2"+
		"\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\b\60\2\2\u013e`\3\2\2\2\u013f"+
		"\u0140\7\17\2\2\u0140\u0143\7\f\2\2\u0141\u0143\t\6\2\2\u0142\u013f\3"+
		"\2\2\2\u0142\u0141\3\2\2\2\u0143b\3\2\2\2\21\2\u00da\u00e0\u00e2\u00e8"+
		"\u00f0\u00f4\u0101\u0115\u011a\u011c\u0122\u012c\u013a\u0142\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}