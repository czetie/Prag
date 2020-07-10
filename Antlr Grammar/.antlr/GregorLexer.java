// Generated from d:\Users\czetie\Documents\GitHub\Prag\Antlr Grammar\GregorLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GregorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENUM=1, BREAK=2, DEFAULT=3, FUNC=4, INTERFACE=5, IMPLEMENT=6, DECLARE=7, 
		SELECT=8, CASE=9, ELSE=10, SWITCH=11, CONST=12, IF=13, RANGE=14, TYPE=15, 
		CONTINUE=16, FOR=17, IMPORT=18, RETURN=19, VAR=20, TRUE_LIT=21, FALSE_LIT=22, 
		NIL_LIT=23, IDENTIFIER=24, DEFINE_ID=25, DECLARE_ID=26, L_PAREN=27, R_PAREN=28, 
		L_CURLY=29, R_CURLY=30, L_BRACK=31, R_BRACK=32, ASSIGN=33, COMMA=34, SEMI=35, 
		COLON=36, DOT=37, DOT_DOT=38, ELLIPSIS=39, LOGICAL_OR=40, LOGICAL_AND=41, 
		EQUALS=42, NOT_EQUALS=43, NOT_EQUALS_TOO=44, LESS=45, LESS_OR_EQUALS=46, 
		GREATER=47, GREATER_OR_EQUALS=48, OR=49, LSHIFT=50, RSHIFT=51, AND=52, 
		XOR=53, NEG=54, PLUS_PLUS=55, MINUS_MINUS=56, PLUS=57, MINUS=58, POWER=59, 
		DIV=60, MOD=61, STAR=62, DECIMAL_LIT=63, OCTAL_LIT=64, HEX_LIT=65, BIN_LIT=66, 
		FLOAT_LIT=67, IMAGINARY_LIT=68, RUNE_LIT=69, RAW_STRING_LIT=70, INTERPRETED_STRING_LIT=71, 
		WS=72, COMMENT=73, TERMINATOR=74, LINE_COMMENT=75;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ENUM", "BREAK", "DEFAULT", "FUNC", "INTERFACE", "IMPLEMENT", "DECLARE", 
			"SELECT", "CASE", "ELSE", "SWITCH", "CONST", "IF", "RANGE", "TYPE", "CONTINUE", 
			"FOR", "IMPORT", "RETURN", "VAR", "TRUE_LIT", "FALSE_LIT", "NIL_LIT", 
			"IDENTIFIER", "DEFINE_ID", "DECLARE_ID", "L_PAREN", "R_PAREN", "L_CURLY", 
			"R_CURLY", "L_BRACK", "R_BRACK", "ASSIGN", "COMMA", "SEMI", "COLON", 
			"DOT", "DOT_DOT", "ELLIPSIS", "LOGICAL_OR", "LOGICAL_AND", "EQUALS", 
			"NOT_EQUALS", "NOT_EQUALS_TOO", "LESS", "LESS_OR_EQUALS", "GREATER", 
			"GREATER_OR_EQUALS", "OR", "LSHIFT", "RSHIFT", "AND", "XOR", "NEG", "PLUS_PLUS", 
			"MINUS_MINUS", "PLUS", "MINUS", "POWER", "DIV", "MOD", "STAR", "DECIMAL_LIT", 
			"OCTAL_LIT", "HEX_LIT", "BIN_LIT", "FLOAT_LIT", "IMAGINARY_LIT", "RUNE_LIT", 
			"RAW_STRING_LIT", "INTERPRETED_STRING_LIT", "WS", "COMMENT", "TERMINATOR", 
			"LINE_COMMENT", "ESCAPED_VALUE", "DECIMALS", "OCTAL_DIGIT", "HEX_DIGIT", 
			"BIN_DIGIT", "EXPONENT", "LETTER", "UC_LETTER", "LC_LETTER", "UNICODE_DIGIT", 
			"UNICODE_LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'enum'", "'break'", "'default'", "'func'", "'interface'", "'implement'", 
			"'declare'", "'select'", "'case'", "'else'", "'switch'", "'const'", "'if'", 
			"'range'", "'type'", "'continue'", "'for'", "'import'", "'return'", "'var'", 
			"'true'", "'false'", "'nil'", null, null, null, "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'='", "','", "';'", "':'", "'.'", "'..'", "'...'", 
			"'||'", "'&&'", "'=='", "'<>'", "'~='", "'<'", "'<='", "'>'", "'>='", 
			"'|'", "'<<'", "'>>'", "'&'", "'!'", "'~'", "'++'", "'--'", "'+'", "'-'", 
			"'^'", "'/'", "'%'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENUM", "BREAK", "DEFAULT", "FUNC", "INTERFACE", "IMPLEMENT", "DECLARE", 
			"SELECT", "CASE", "ELSE", "SWITCH", "CONST", "IF", "RANGE", "TYPE", "CONTINUE", 
			"FOR", "IMPORT", "RETURN", "VAR", "TRUE_LIT", "FALSE_LIT", "NIL_LIT", 
			"IDENTIFIER", "DEFINE_ID", "DECLARE_ID", "L_PAREN", "R_PAREN", "L_CURLY", 
			"R_CURLY", "L_BRACK", "R_BRACK", "ASSIGN", "COMMA", "SEMI", "COLON", 
			"DOT", "DOT_DOT", "ELLIPSIS", "LOGICAL_OR", "LOGICAL_AND", "EQUALS", 
			"NOT_EQUALS", "NOT_EQUALS_TOO", "LESS", "LESS_OR_EQUALS", "GREATER", 
			"GREATER_OR_EQUALS", "OR", "LSHIFT", "RSHIFT", "AND", "XOR", "NEG", "PLUS_PLUS", 
			"MINUS_MINUS", "PLUS", "MINUS", "POWER", "DIV", "MOD", "STAR", "DECIMAL_LIT", 
			"OCTAL_LIT", "HEX_LIT", "BIN_LIT", "FLOAT_LIT", "IMAGINARY_LIT", "RUNE_LIT", 
			"RAW_STRING_LIT", "INTERPRETED_STRING_LIT", "WS", "COMMENT", "TERMINATOR", 
			"LINE_COMMENT"
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


	public GregorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GregorLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2M\u025b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u0141\n\31\f\31\16\31\u0144"+
		"\13\31\3\32\3\32\3\32\7\32\u0149\n\32\f\32\16\32\u014c\13\32\3\33\3\33"+
		"\3\33\7\33\u0151\n\33\f\33\16\33\u0154\13\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\39\3:\3:\3;\3;\3<\3<\3="+
		"\3=\3>\3>\3?\3?\3@\3@\7@\u01ae\n@\f@\16@\u01b1\13@\3A\3A\3A\6A\u01b6\n"+
		"A\rA\16A\u01b7\3B\3B\3B\6B\u01bd\nB\rB\16B\u01be\3C\3C\3C\6C\u01c4\nC"+
		"\rC\16C\u01c5\3D\3D\3D\5D\u01cb\nD\3D\5D\u01ce\nD\3D\5D\u01d1\nD\3D\3"+
		"D\3D\5D\u01d6\nD\5D\u01d8\nD\3E\3E\5E\u01dc\nE\3E\3E\3F\3F\3F\5F\u01e3"+
		"\nF\3F\3F\3G\3G\7G\u01e9\nG\fG\16G\u01ec\13G\3G\3G\3H\3H\3H\7H\u01f3\n"+
		"H\fH\16H\u01f6\13H\3H\3H\3I\6I\u01fb\nI\rI\16I\u01fc\3I\3I\3J\3J\3J\3"+
		"J\7J\u0205\nJ\fJ\16J\u0208\13J\3J\3J\3J\3J\3J\3K\6K\u0210\nK\rK\16K\u0211"+
		"\3K\3K\3L\3L\3L\3L\7L\u021a\nL\fL\16L\u021d\13L\3L\3L\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u023b"+
		"\nM\3N\6N\u023e\nN\rN\16N\u023f\3O\3O\3P\3P\3Q\3Q\3R\3R\5R\u024a\nR\3"+
		"R\3R\3S\3S\5S\u0250\nS\3T\3T\3U\3U\3V\5V\u0257\nV\3W\5W\u025a\nW\3\u0206"+
		"\2X\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099\2\u009b\2\u009d\2\u009f\2\u00a1"+
		"\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\3\2\26\3\2\63;\3\2"+
		"\62;\4\2QQqq\4\2ZZzz\4\2DDdd\4\2\f\f^^\3\2bb\4\2$$^^\4\2\13\13\"\"\4\2"+
		"\f\f\17\17\13\2$$))^^cdhhppttvvxx\3\2\629\5\2\62;CHch\4\2\62\63aa\4\2"+
		"GGgg\4\2--//\3\2C\\\3\2c|\26\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971"+
		"\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71"+
		"\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u0f22\u0f2b\u1042\u104b"+
		"\u136b\u1373\u17e2\u17eb\u1812\u181b\uff12\uff1b\u0104\2C\\c|\u00ac\u00ac"+
		"\u00b7\u00b7\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa\u0221\u0224\u0235"+
		"\u0252\u02af\u02b2\u02ba\u02bd\u02c3\u02d2\u02d3\u02e2\u02e6\u02f0\u02f0"+
		"\u037c\u037c\u0388\u0388\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5\u03d0"+
		"\u03d2\u03d9\u03dc\u03f5\u0402\u0483\u048e\u04c6\u04c9\u04ca\u04cd\u04ce"+
		"\u04d2\u04f7\u04fa\u04fb\u0533\u0558\u055b\u055b\u0563\u0589\u05d2\u05ec"+
		"\u05f2\u05f4\u0623\u063c\u0642\u064c\u0673\u06d5\u06d7\u06d7\u06e7\u06e8"+
		"\u06fc\u06fe\u0712\u0712\u0714\u072e\u0782\u07a7\u0907\u093b\u093f\u093f"+
		"\u0952\u0952\u095a\u0963\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2"+
		"\u09b4\u09b4\u09b8\u09bb\u09de\u09df\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c"+
		"\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b"+
		"\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8d\u0a8f\u0a8f\u0a91\u0a93"+
		"\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2"+
		"\u0ae2\u0ae2\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35"+
		"\u0b38\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b87\u0b8c\u0b90\u0b92"+
		"\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac"+
		"\u0bb0\u0bb7\u0bb9\u0bbb\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35"+
		"\u0c37\u0c3b\u0c62\u0c63\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5"+
		"\u0cb7\u0cbb\u0ce0\u0ce0\u0ce2\u0ce3\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a"+
		"\u0d2c\u0d3b\u0d62\u0d63\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf"+
		"\u0dc2\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42\u0e48\u0e83\u0e84\u0e86\u0e86"+
		"\u0e89\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5"+
		"\u0ea7\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ec6"+
		"\u0ec8\u0ec8\u0ede\u0edf\u0f02\u0f02\u0f42\u0f6c\u0f8a\u0f8d\u1002\u1023"+
		"\u1025\u1029\u102b\u102c\u1052\u1057\u10a2\u10c7\u10d2\u10f8\u1102\u115b"+
		"\u1161\u11a4\u11aa\u11fb\u1202\u1208\u120a\u1248\u124a\u124a\u124c\u124f"+
		"\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u1288\u128a\u128a\u128c\u128f"+
		"\u1292\u12b0\u12b2\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7"+
		"\u12ca\u12d0\u12d2\u12d8\u12da\u12f0\u12f2\u1310\u1312\u1312\u1314\u1317"+
		"\u131a\u1320\u1322\u1348\u134a\u135c\u13a2\u13f6\u1403\u1678\u1683\u169c"+
		"\u16a2\u16ec\u1782\u17b5\u1822\u1879\u1882\u18aa\u1e02\u1e9d\u1ea2\u1efb"+
		"\u1f02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b"+
		"\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0"+
		"\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6"+
		"\u1ff8\u1ffe\u2081\u2081\u2104\u2104\u2109\u2109\u210c\u2115\u2117\u2117"+
		"\u211b\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c\u212f\u2131\u2133"+
		"\u2135\u213b\u2162\u2185\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303c"+
		"\u3043\u3096\u309f\u30a0\u30a3\u30fc\u30fe\u3100\u3107\u312e\u3133\u3190"+
		"\u31a2\u31b9\u3402\u3402\u4db7\u4db7\u4e02\u4e02\u9fa7\u9fa7\ua002\ua48e"+
		"\uac02\uac02\ud7a5\ud7a5\uf902\ufa2f\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f"+
		"\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46"+
		"\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe74"+
		"\ufe76\ufe76\ufe78\ufefe\uff23\uff3c\uff43\uff5c\uff68\uffc0\uffc4\uffc9"+
		"\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\2\u026e\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u00af\3\2\2"+
		"\2\5\u00b4\3\2\2\2\7\u00ba\3\2\2\2\t\u00c2\3\2\2\2\13\u00c7\3\2\2\2\r"+
		"\u00d1\3\2\2\2\17\u00db\3\2\2\2\21\u00e3\3\2\2\2\23\u00ea\3\2\2\2\25\u00ef"+
		"\3\2\2\2\27\u00f4\3\2\2\2\31\u00fb\3\2\2\2\33\u0101\3\2\2\2\35\u0104\3"+
		"\2\2\2\37\u010a\3\2\2\2!\u010f\3\2\2\2#\u0118\3\2\2\2%\u011c\3\2\2\2\'"+
		"\u0123\3\2\2\2)\u012a\3\2\2\2+\u012e\3\2\2\2-\u0133\3\2\2\2/\u0139\3\2"+
		"\2\2\61\u013d\3\2\2\2\63\u0145\3\2\2\2\65\u014d\3\2\2\2\67\u0155\3\2\2"+
		"\29\u0157\3\2\2\2;\u0159\3\2\2\2=\u015b\3\2\2\2?\u015d\3\2\2\2A\u015f"+
		"\3\2\2\2C\u0161\3\2\2\2E\u0163\3\2\2\2G\u0165\3\2\2\2I\u0167\3\2\2\2K"+
		"\u0169\3\2\2\2M\u016b\3\2\2\2O\u016e\3\2\2\2Q\u0172\3\2\2\2S\u0175\3\2"+
		"\2\2U\u0178\3\2\2\2W\u017b\3\2\2\2Y\u017e\3\2\2\2[\u0181\3\2\2\2]\u0183"+
		"\3\2\2\2_\u0186\3\2\2\2a\u0188\3\2\2\2c\u018b\3\2\2\2e\u018d\3\2\2\2g"+
		"\u0190\3\2\2\2i\u0193\3\2\2\2k\u0195\3\2\2\2m\u0197\3\2\2\2o\u0199\3\2"+
		"\2\2q\u019c\3\2\2\2s\u019f\3\2\2\2u\u01a1\3\2\2\2w\u01a3\3\2\2\2y\u01a5"+
		"\3\2\2\2{\u01a7\3\2\2\2}\u01a9\3\2\2\2\177\u01ab\3\2\2\2\u0081\u01b2\3"+
		"\2\2\2\u0083\u01b9\3\2\2\2\u0085\u01c0\3\2\2\2\u0087\u01d7\3\2\2\2\u0089"+
		"\u01db\3\2\2\2\u008b\u01df\3\2\2\2\u008d\u01e6\3\2\2\2\u008f\u01ef\3\2"+
		"\2\2\u0091\u01fa\3\2\2\2\u0093\u0200\3\2\2\2\u0095\u020f\3\2\2\2\u0097"+
		"\u0215\3\2\2\2\u0099\u0220\3\2\2\2\u009b\u023d\3\2\2\2\u009d\u0241\3\2"+
		"\2\2\u009f\u0243\3\2\2\2\u00a1\u0245\3\2\2\2\u00a3\u0247\3\2\2\2\u00a5"+
		"\u024f\3\2\2\2\u00a7\u0251\3\2\2\2\u00a9\u0253\3\2\2\2\u00ab\u0256\3\2"+
		"\2\2\u00ad\u0259\3\2\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2"+
		"\7w\2\2\u00b2\u00b3\7o\2\2\u00b3\4\3\2\2\2\u00b4\u00b5\7d\2\2\u00b5\u00b6"+
		"\7t\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7m\2\2\u00b9"+
		"\6\3\2\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7h\2\2\u00bd"+
		"\u00be\7c\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7v\2\2"+
		"\u00c1\b\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7p"+
		"\2\2\u00c5\u00c6\7e\2\2\u00c6\n\3\2\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9"+
		"\7p\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7t\2\2\u00cc"+
		"\u00cd\7h\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7g\2\2"+
		"\u00d0\f\3\2\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4\7r"+
		"\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8"+
		"\7g\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7v\2\2\u00da\16\3\2\2\2\u00db\u00dc"+
		"\7f\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7n\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\20\3\2\2\2\u00e3"+
		"\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7g\2\2"+
		"\u00e7\u00e8\7e\2\2\u00e8\u00e9\7v\2\2\u00e9\22\3\2\2\2\u00ea\u00eb\7"+
		"e\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7g\2\2\u00ee\24"+
		"\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7u\2\2\u00f2"+
		"\u00f3\7g\2\2\u00f3\26\3\2\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7y\2\2\u00f6"+
		"\u00f7\7k\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7j\2\2"+
		"\u00fa\30\3\2\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7"+
		"p\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7v\2\2\u0100\32\3\2\2\2\u0101\u0102"+
		"\7k\2\2\u0102\u0103\7h\2\2\u0103\34\3\2\2\2\u0104\u0105\7t\2\2\u0105\u0106"+
		"\7c\2\2\u0106\u0107\7p\2\2\u0107\u0108\7i\2\2\u0108\u0109\7g\2\2\u0109"+
		"\36\3\2\2\2\u010a\u010b\7v\2\2\u010b\u010c\7{\2\2\u010c\u010d\7r\2\2\u010d"+
		"\u010e\7g\2\2\u010e \3\2\2\2\u010f\u0110\7e\2\2\u0110\u0111\7q\2\2\u0111"+
		"\u0112\7p\2\2\u0112\u0113\7v\2\2\u0113\u0114\7k\2\2\u0114\u0115\7p\2\2"+
		"\u0115\u0116\7w\2\2\u0116\u0117\7g\2\2\u0117\"\3\2\2\2\u0118\u0119\7h"+
		"\2\2\u0119\u011a\7q\2\2\u011a\u011b\7t\2\2\u011b$\3\2\2\2\u011c\u011d"+
		"\7k\2\2\u011d\u011e\7o\2\2\u011e\u011f\7r\2\2\u011f\u0120\7q\2\2\u0120"+
		"\u0121\7t\2\2\u0121\u0122\7v\2\2\u0122&\3\2\2\2\u0123\u0124\7t\2\2\u0124"+
		"\u0125\7g\2\2\u0125\u0126\7v\2\2\u0126\u0127\7w\2\2\u0127\u0128\7t\2\2"+
		"\u0128\u0129\7p\2\2\u0129(\3\2\2\2\u012a\u012b\7x\2\2\u012b\u012c\7c\2"+
		"\2\u012c\u012d\7t\2\2\u012d*\3\2\2\2\u012e\u012f\7v\2\2\u012f\u0130\7"+
		"t\2\2\u0130\u0131\7w\2\2\u0131\u0132\7g\2\2\u0132,\3\2\2\2\u0133\u0134"+
		"\7h\2\2\u0134\u0135\7c\2\2\u0135\u0136\7n\2\2\u0136\u0137\7u\2\2\u0137"+
		"\u0138\7g\2\2\u0138.\3\2\2\2\u0139\u013a\7p\2\2\u013a\u013b\7k\2\2\u013b"+
		"\u013c\7n\2\2\u013c\60\3\2\2\2\u013d\u0142\5\u00a5S\2\u013e\u0141\5\u00a5"+
		"S\2\u013f\u0141\5\u00abV\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\62\3\2\2"+
		"\2\u0144\u0142\3\2\2\2\u0145\u014a\5\u00a7T\2\u0146\u0149\5\u00a5S\2\u0147"+
		"\u0149\5\u00abV\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014c"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\64\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u0152\5\u00a9U\2\u014e\u0151\5\u00a5S\2\u014f\u0151"+
		"\5\u00abV\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2"+
		"\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\66\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0155\u0156\7*\2\2\u01568\3\2\2\2\u0157\u0158\7+\2\2\u0158:\3"+
		"\2\2\2\u0159\u015a\7}\2\2\u015a<\3\2\2\2\u015b\u015c\7\177\2\2\u015c>"+
		"\3\2\2\2\u015d\u015e\7]\2\2\u015e@\3\2\2\2\u015f\u0160\7_\2\2\u0160B\3"+
		"\2\2\2\u0161\u0162\7?\2\2\u0162D\3\2\2\2\u0163\u0164\7.\2\2\u0164F\3\2"+
		"\2\2\u0165\u0166\7=\2\2\u0166H\3\2\2\2\u0167\u0168\7<\2\2\u0168J\3\2\2"+
		"\2\u0169\u016a\7\60\2\2\u016aL\3\2\2\2\u016b\u016c\7\60\2\2\u016c\u016d"+
		"\7\60\2\2\u016dN\3\2\2\2\u016e\u016f\7\60\2\2\u016f\u0170\7\60\2\2\u0170"+
		"\u0171\7\60\2\2\u0171P\3\2\2\2\u0172\u0173\7~\2\2\u0173\u0174\7~\2\2\u0174"+
		"R\3\2\2\2\u0175\u0176\7(\2\2\u0176\u0177\7(\2\2\u0177T\3\2\2\2\u0178\u0179"+
		"\7?\2\2\u0179\u017a\7?\2\2\u017aV\3\2\2\2\u017b\u017c\7>\2\2\u017c\u017d"+
		"\7@\2\2\u017dX\3\2\2\2\u017e\u017f\7\u0080\2\2\u017f\u0180\7?\2\2\u0180"+
		"Z\3\2\2\2\u0181\u0182\7>\2\2\u0182\\\3\2\2\2\u0183\u0184\7>\2\2\u0184"+
		"\u0185\7?\2\2\u0185^\3\2\2\2\u0186\u0187\7@\2\2\u0187`\3\2\2\2\u0188\u0189"+
		"\7@\2\2\u0189\u018a\7?\2\2\u018ab\3\2\2\2\u018b\u018c\7~\2\2\u018cd\3"+
		"\2\2\2\u018d\u018e\7>\2\2\u018e\u018f\7>\2\2\u018ff\3\2\2\2\u0190\u0191"+
		"\7@\2\2\u0191\u0192\7@\2\2\u0192h\3\2\2\2\u0193\u0194\7(\2\2\u0194j\3"+
		"\2\2\2\u0195\u0196\7#\2\2\u0196l\3\2\2\2\u0197\u0198\7\u0080\2\2\u0198"+
		"n\3\2\2\2\u0199\u019a\7-\2\2\u019a\u019b\7-\2\2\u019bp\3\2\2\2\u019c\u019d"+
		"\7/\2\2\u019d\u019e\7/\2\2\u019er\3\2\2\2\u019f\u01a0\7-\2\2\u01a0t\3"+
		"\2\2\2\u01a1\u01a2\7/\2\2\u01a2v\3\2\2\2\u01a3\u01a4\7`\2\2\u01a4x\3\2"+
		"\2\2\u01a5\u01a6\7\61\2\2\u01a6z\3\2\2\2\u01a7\u01a8\7\'\2\2\u01a8|\3"+
		"\2\2\2\u01a9\u01aa\7,\2\2\u01aa~\3\2\2\2\u01ab\u01af\t\2\2\2\u01ac\u01ae"+
		"\t\3\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u0080\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7\62"+
		"\2\2\u01b3\u01b5\t\4\2\2\u01b4\u01b6\5\u009dO\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u0082\3\2"+
		"\2\2\u01b9\u01ba\7\62\2\2\u01ba\u01bc\t\5\2\2\u01bb\u01bd\5\u009fP\2\u01bc"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\u0084\3\2\2\2\u01c0\u01c1\7\62\2\2\u01c1\u01c3\t\6\2\2\u01c2"+
		"\u01c4\5\u00a1Q\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u0086\3\2\2\2\u01c7\u01d0\5\u009bN"+
		"\2\u01c8\u01ca\7\60\2\2\u01c9\u01cb\5\u009bN\2\u01ca\u01c9\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ce\5\u00a3R\2\u01cd\u01cc"+
		"\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01d1\5\u00a3R"+
		"\2\u01d0\u01c8\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d8\3\2\2\2\u01d2\u01d3"+
		"\7\60\2\2\u01d3\u01d5\5\u009bN\2\u01d4\u01d6\5\u00a3R\2\u01d5\u01d4\3"+
		"\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01c7\3\2\2\2\u01d7"+
		"\u01d2\3\2\2\2\u01d8\u0088\3\2\2\2\u01d9\u01dc\5\u009bN\2\u01da\u01dc"+
		"\5\u0087D\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dc\u01dd\3\2\2"+
		"\2\u01dd\u01de\7k\2\2\u01de\u008a\3\2\2\2\u01df\u01e2\7)\2\2\u01e0\u01e3"+
		"\n\7\2\2\u01e1\u01e3\5\u0099M\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2"+
		"\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\7)\2\2\u01e5\u008c\3\2\2\2\u01e6\u01ea"+
		"\7b\2\2\u01e7\u01e9\n\b\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ed\u01ee\7b\2\2\u01ee\u008e\3\2\2\2\u01ef\u01f4\7$\2\2\u01f0\u01f3"+
		"\n\t\2\2\u01f1\u01f3\5\u0099M\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2"+
		"\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7"+
		"\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\7$\2\2\u01f8\u0090\3\2\2\2\u01f9"+
		"\u01fb\t\n\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fa\3\2"+
		"\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\bI\2\2\u01ff"+
		"\u0092\3\2\2\2\u0200\u0201\7\61\2\2\u0201\u0202\7,\2\2\u0202\u0206\3\2"+
		"\2\2\u0203\u0205\13\2\2\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0209\u020a\7,\2\2\u020a\u020b\7\61\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\bJ\2\2\u020d\u0094\3\2\2\2\u020e\u0210\t\13\2\2\u020f\u020e\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0214\bK\2\2\u0214\u0096\3\2\2\2\u0215\u0216\7\61"+
		"\2\2\u0216\u0217\7\61\2\2\u0217\u021b\3\2\2\2\u0218\u021a\n\13\2\2\u0219"+
		"\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\bL\2\2\u021f"+
		"\u0098\3\2\2\2\u0220\u023a\7^\2\2\u0221\u0222\7w\2\2\u0222\u0223\5\u009f"+
		"P\2\u0223\u0224\5\u009fP\2\u0224\u0225\5\u009fP\2\u0225\u0226\5\u009f"+
		"P\2\u0226\u023b\3\2\2\2\u0227\u0228\7W\2\2\u0228\u0229\5\u009fP\2\u0229"+
		"\u022a\5\u009fP\2\u022a\u022b\5\u009fP\2\u022b\u022c\5\u009fP\2\u022c"+
		"\u022d\5\u009fP\2\u022d\u022e\5\u009fP\2\u022e\u022f\5\u009fP\2\u022f"+
		"\u0230\5\u009fP\2\u0230\u023b\3\2\2\2\u0231\u023b\t\f\2\2\u0232\u0233"+
		"\5\u009dO\2\u0233\u0234\5\u009dO\2\u0234\u0235\5\u009dO\2\u0235\u023b"+
		"\3\2\2\2\u0236\u0237\7z\2\2\u0237\u0238\5\u009fP\2\u0238\u0239\5\u009f"+
		"P\2\u0239\u023b\3\2\2\2\u023a\u0221\3\2\2\2\u023a\u0227\3\2\2\2\u023a"+
		"\u0231\3\2\2\2\u023a\u0232\3\2\2\2\u023a\u0236\3\2\2\2\u023b\u009a\3\2"+
		"\2\2\u023c\u023e\t\3\2\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u009c\3\2\2\2\u0241\u0242\t\r"+
		"\2\2\u0242\u009e\3\2\2\2\u0243\u0244\t\16\2\2\u0244\u00a0\3\2\2\2\u0245"+
		"\u0246\t\17\2\2\u0246\u00a2\3\2\2\2\u0247\u0249\t\20\2\2\u0248\u024a\t"+
		"\21\2\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024c\5\u009bN\2\u024c\u00a4\3\2\2\2\u024d\u0250\5\u00adW\2\u024e\u0250"+
		"\7a\2\2\u024f\u024d\3\2\2\2\u024f\u024e\3\2\2\2\u0250\u00a6\3\2\2\2\u0251"+
		"\u0252\t\22\2\2\u0252\u00a8\3\2\2\2\u0253\u0254\t\23\2\2\u0254\u00aa\3"+
		"\2\2\2\u0255\u0257\t\24\2\2\u0256\u0255\3\2\2\2\u0257\u00ac\3\2\2\2\u0258"+
		"\u025a\t\25\2\2\u0259\u0258\3\2\2\2\u025a\u00ae\3\2\2\2!\2\u0140\u0142"+
		"\u0148\u014a\u0150\u0152\u01af\u01b7\u01be\u01c5\u01ca\u01cd\u01d0\u01d5"+
		"\u01d7\u01db\u01e2\u01ea\u01f2\u01f4\u01fc\u0206\u0211\u021b\u023a\u023f"+
		"\u0249\u024f\u0256\u0259\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}