// Generated from /home/rmpgm/Documents/ELP/Praticas/Projeto/src/main/JsonGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JsonGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NULL=1, BOOLEAN=2, NUMBER=3, STRING=4, LBRACE=5, RBRACE=6, LBRACKET=7, 
		RBRACKET=8, COLON=9, COMMA=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NULL", "BOOLEAN", "NUMBER", "STRING", "LBRACE", "RBRACE", "LBRACKET", 
			"RBRACKET", "COLON", "COMMA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'null'", null, null, null, "'{'", "'}'", "'['", "']'", "':'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NULL", "BOOLEAN", "NUMBER", "STRING", "LBRACE", "RBRACE", "LBRACKET", 
			"RBRACKET", "COLON", "COMMA", "WS"
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


	public JsonGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonGrammar.g4"; }

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
		"\u0004\u0000\u000bS\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0002\u0003\u0002)\b\u0002\u0001"+
		"\u0002\u0004\u0002,\b\u0002\u000b\u0002\f\u0002-\u0001\u0002\u0001\u0002"+
		"\u0004\u00022\b\u0002\u000b\u0002\f\u00023\u0003\u00026\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0005\u0003:\b\u0003\n\u0003\f\u0003=\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0004\nN\b\n\u000b\n\f\nO\u0001\n\u0001\n\u0000\u0000\u000b"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000\u0003\u0001\u0000"+
		"09\u0004\u0000\n\n\r\r\"\"\\\\\u0003\u0000\t\n\r\r  Y\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000"+
		"\u0005(\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t@\u0001"+
		"\u0000\u0000\u0000\u000bB\u0001\u0000\u0000\u0000\rD\u0001\u0000\u0000"+
		"\u0000\u000fF\u0001\u0000\u0000\u0000\u0011H\u0001\u0000\u0000\u0000\u0013"+
		"J\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"n\u0000\u0000\u0018\u0019\u0005u\u0000\u0000\u0019\u001a\u0005l\u0000"+
		"\u0000\u001a\u001b\u0005l\u0000\u0000\u001b\u0002\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0005t\u0000\u0000\u001d\u001e\u0005r\u0000\u0000\u001e\u001f"+
		"\u0005u\u0000\u0000\u001f&\u0005e\u0000\u0000 !\u0005f\u0000\u0000!\""+
		"\u0005a\u0000\u0000\"#\u0005l\u0000\u0000#$\u0005s\u0000\u0000$&\u0005"+
		"e\u0000\u0000%\u001c\u0001\u0000\u0000\u0000% \u0001\u0000\u0000\u0000"+
		"&\u0004\u0001\u0000\u0000\u0000\')\u0005-\u0000\u0000(\'\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*,\u0007\u0000"+
		"\u0000\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.5\u0001\u0000\u0000\u0000"+
		"/1\u0005.\u0000\u000002\u0007\u0000\u0000\u000010\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000046\u0001\u0000\u0000\u00005/\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006\u0006\u0001\u0000\u0000\u00007;\u0005\"\u0000\u00008:\b"+
		"\u0001\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>?\u0005\"\u0000\u0000?\b\u0001\u0000"+
		"\u0000\u0000@A\u0005{\u0000\u0000A\n\u0001\u0000\u0000\u0000BC\u0005}"+
		"\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u0005[\u0000\u0000E\u000e\u0001"+
		"\u0000\u0000\u0000FG\u0005]\u0000\u0000G\u0010\u0001\u0000\u0000\u0000"+
		"HI\u0005:\u0000\u0000I\u0012\u0001\u0000\u0000\u0000JK\u0005,\u0000\u0000"+
		"K\u0014\u0001\u0000\u0000\u0000LN\u0007\u0002\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0006\n\u0000\u0000R\u0016"+
		"\u0001\u0000\u0000\u0000\b\u0000%(-35;O\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}