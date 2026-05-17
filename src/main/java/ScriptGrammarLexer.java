// Generated from /home/rmpgm/Documents/ELP/Praticas/Projeto/src/main/ScriptGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ScriptGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, END=3, EQUAL=4, OPERATORMUL=5, ADD=6, MINUS=7, NUMBER=8, 
		STRING=9, ID=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "END", "EQUAL", "OPERATORMUL", "ADD", "MINUS", "NUMBER", 
			"STRING", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'end'", "'='", null, "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "END", "EQUAL", "OPERATORMUL", "ADD", "MINUS", "NUMBER", 
			"STRING", "ID", "WS"
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


	public ScriptGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ScriptGrammar.g4"; }

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
		"\u0004\u0000\u000bQ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0003\u0007-\b\u0007\u0001\u0007\u0004\u0007"+
		"0\b\u0007\u000b\u0007\f\u00071\u0001\u0007\u0001\u0007\u0004\u00076\b"+
		"\u0007\u000b\u0007\f\u00077\u0003\u0007:\b\u0007\u0001\b\u0001\b\u0005"+
		"\b>\b\b\n\b\f\bA\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004\tG\b\t\u000b"+
		"\t\f\tH\u0001\n\u0004\nL\b\n\u000b\n\f\nM\u0001\n\u0001\n\u0000\u0000"+
		"\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000\u0006\u0002\u0000"+
		"**//\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0003\u0000\t\n\r\r  W\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001"+
		"\u0000\u0000\u0000\u0003\u001a\u0001\u0000\u0000\u0000\u0005\u001f\u0001"+
		"\u0000\u0000\u0000\u0007#\u0001\u0000\u0000\u0000\t%\u0001\u0000\u0000"+
		"\u0000\u000b\'\u0001\u0000\u0000\u0000\r)\u0001\u0000\u0000\u0000\u000f"+
		",\u0001\u0000\u0000\u0000\u0011;\u0001\u0000\u0000\u0000\u0013D\u0001"+
		"\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017\u0018\u0005i\u0000"+
		"\u0000\u0018\u0019\u0005f\u0000\u0000\u0019\u0002\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0005e\u0000\u0000\u001b\u001c\u0005l\u0000\u0000\u001c\u001d"+
		"\u0005s\u0000\u0000\u001d\u001e\u0005e\u0000\u0000\u001e\u0004\u0001\u0000"+
		"\u0000\u0000\u001f \u0005e\u0000\u0000 !\u0005n\u0000\u0000!\"\u0005d"+
		"\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#$\u0005=\u0000\u0000$\b\u0001"+
		"\u0000\u0000\u0000%&\u0007\u0000\u0000\u0000&\n\u0001\u0000\u0000\u0000"+
		"\'(\u0005+\u0000\u0000(\f\u0001\u0000\u0000\u0000)*\u0005-\u0000\u0000"+
		"*\u000e\u0001\u0000\u0000\u0000+-\u0003\r\u0006\u0000,+\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.0\u0007\u0001"+
		"\u0000\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000029\u0001\u0000\u0000\u0000"+
		"35\u0005.\u0000\u000046\u0007\u0001\u0000\u000054\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008:\u0001\u0000\u0000\u000093\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:\u0010\u0001\u0000\u0000\u0000;?\u0005\"\u0000\u0000<>\b"+
		"\u0002\u0000\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000BC\u0005\"\u0000\u0000C\u0012\u0001\u0000"+
		"\u0000\u0000DF\u0007\u0003\u0000\u0000EG\u0007\u0004\u0000\u0000FE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JL\u0007\u0005"+
		"\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OP\u0006\n\u0000\u0000P\u0016\u0001\u0000\u0000\u0000\b\u0000,179?HM\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}