// Generated from C:/Users/Peter/Desktop/aaup4/aaup4/Project-V2/src/com/company\aRay.g4 by ANTLR 4.7
package com.company;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aRayParser extends Parser {
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
	public static final int
		RULE_global = 0, RULE_body = 1, RULE_functionBody = 2, RULE_matrixDeclaration = 3, 
		RULE_matrixScope = 4, RULE_awaitScope = 5, RULE_functionDeclaration = 6, 
		RULE_declaration = 7, RULE_parameter = 8, RULE_statement = 9, RULE_expression = 10, 
		RULE_logicalExpression = 11, RULE_invocation = 12, RULE_selection = 13, 
		RULE_iteration = 14, RULE_ifStatement = 15, RULE_elseIfStatement = 16, 
		RULE_elseStatement = 17, RULE_switchStatement = 18, RULE_caseBody = 19, 
		RULE_defaultBody = 20, RULE_forIteration = 21, RULE_whileIteration = 22;
	public static final String[] ruleNames = {
		"global", "body", "functionBody", "matrixDeclaration", "matrixScope", 
		"awaitScope", "functionDeclaration", "declaration", "parameter", "statement", 
		"expression", "logicalExpression", "invocation", "selection", "iteration", 
		"ifStatement", "elseIfStatement", "elseStatement", "switchStatement", 
		"caseBody", "defaultBody", "forIteration", "whileIteration"
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

	@Override
	public String getGrammarFileName() { return "aRay.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public aRayParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GlobalContext extends ParserRuleContext {
		public MatrixDeclarationContext matrixDeclaration;
		public List<MatrixDeclarationContext> mdChilds = new ArrayList<MatrixDeclarationContext>();
		public MatrixScopeContext matrixScope;
		public List<MatrixScopeContext> msChilds = new ArrayList<MatrixScopeContext>();
		public AwaitScopeContext awaitScope;
		public List<AwaitScopeContext> asChild = new ArrayList<AwaitScopeContext>();
		public FunctionDeclarationContext functionDeclaration;
		public List<FunctionDeclarationContext> fdChild = new ArrayList<FunctionDeclarationContext>();
		public List<MatrixDeclarationContext> matrixDeclaration() {
			return getRuleContexts(MatrixDeclarationContext.class);
		}
		public MatrixDeclarationContext matrixDeclaration(int i) {
			return getRuleContext(MatrixDeclarationContext.class,i);
		}
		public List<MatrixScopeContext> matrixScope() {
			return getRuleContexts(MatrixScopeContext.class);
		}
		public MatrixScopeContext matrixScope(int i) {
			return getRuleContext(MatrixScopeContext.class,i);
		}
		public List<AwaitScopeContext> awaitScope() {
			return getRuleContexts(AwaitScopeContext.class);
		}
		public AwaitScopeContext awaitScope(int i) {
			return getRuleContext(AwaitScopeContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXTENDEDTYPE) | (1L << AWAIT) | (1L << FUNC) | (1L << ID))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(46);
					((GlobalContext)_localctx).matrixDeclaration = matrixDeclaration();
					((GlobalContext)_localctx).mdChilds.add(((GlobalContext)_localctx).matrixDeclaration);
					}
					break;
				case 2:
					{
					setState(47);
					((GlobalContext)_localctx).matrixScope = matrixScope();
					((GlobalContext)_localctx).msChilds.add(((GlobalContext)_localctx).matrixScope);
					}
					break;
				case 3:
					{
					setState(48);
					((GlobalContext)_localctx).awaitScope = awaitScope();
					((GlobalContext)_localctx).asChild.add(((GlobalContext)_localctx).awaitScope);
					}
					break;
				case 4:
					{
					setState(49);
					((GlobalContext)_localctx).functionDeclaration = functionDeclaration();
					((GlobalContext)_localctx).fdChild.add(((GlobalContext)_localctx).functionDeclaration);
					}
					break;
				}
				}
				setState(54);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(aRayParser.LC, 0); }
		public TerminalNode RC() { return getToken(aRayParser.RC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(aRayParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(aRayParser.SEMI, i);
		}
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public List<IterationContext> iteration() {
			return getRuleContexts(IterationContext.class);
		}
		public IterationContext iteration(int i) {
			return getRuleContext(IterationContext.class,i);
		}
		public List<MatrixDeclarationContext> matrixDeclaration() {
			return getRuleContexts(MatrixDeclarationContext.class);
		}
		public MatrixDeclarationContext matrixDeclaration(int i) {
			return getRuleContext(MatrixDeclarationContext.class,i);
		}
		public List<MatrixScopeContext> matrixScope() {
			return getRuleContexts(MatrixScopeContext.class);
		}
		public MatrixScopeContext matrixScope(int i) {
			return getRuleContext(MatrixScopeContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(LC);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << EXTENDEDTYPE) | (1L << THIS) | (1L << AWAIT) | (1L << IF) | (1L << SWITCH) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << SEMI) | (1L << ID))) != 0)) {
				{
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(56);
					statement();
					setState(57);
					match(SEMI);
					}
					break;
				case 2:
					{
					setState(59);
					selection();
					}
					break;
				case 3:
					{
					setState(60);
					iteration();
					}
					break;
				case 4:
					{
					setState(61);
					matrixDeclaration();
					}
					break;
				case 5:
					{
					setState(62);
					matrixScope();
					}
					break;
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(RC);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(aRayParser.LC, 0); }
		public TerminalNode RC() { return getToken(aRayParser.RC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(aRayParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(aRayParser.SEMI, i);
		}
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public List<IterationContext> iteration() {
			return getRuleContexts(IterationContext.class);
		}
		public IterationContext iteration(int i) {
			return getRuleContext(IterationContext.class,i);
		}
		public List<MatrixDeclarationContext> matrixDeclaration() {
			return getRuleContexts(MatrixDeclarationContext.class);
		}
		public MatrixDeclarationContext matrixDeclaration(int i) {
			return getRuleContext(MatrixDeclarationContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LC);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << EXTENDEDTYPE) | (1L << THIS) | (1L << IF) | (1L << SWITCH) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << SEMI) | (1L << ID))) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
				case THIS:
				case RETURN:
				case SEMI:
				case ID:
					{
					setState(71);
					statement();
					setState(72);
					match(SEMI);
					}
					break;
				case IF:
				case SWITCH:
					{
					setState(74);
					selection();
					}
					break;
				case FOR:
				case WHILE:
					{
					setState(75);
					iteration();
					}
					break;
				case EXTENDEDTYPE:
					{
					setState(76);
					matrixDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(82);
			match(RC);
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

	public static class MatrixDeclarationContext extends ParserRuleContext {
		public MatrixDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixDeclaration; }
	 
		public MatrixDeclarationContext() { }
		public void copyFrom(MatrixDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatrixDclWithNameParaContext extends MatrixDeclarationContext {
		public Token varName;
		public TerminalNode EXTENDEDTYPE() { return getToken(aRayParser.EXTENDEDTYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(aRayParser.ASSIGN, 0); }
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public TerminalNode STRING() { return getToken(aRayParser.STRING, 0); }
		public List<TerminalNode> SEMI() { return getTokens(aRayParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(aRayParser.SEMI, i);
		}
		public List<TerminalNode> NUM() { return getTokens(aRayParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(aRayParser.NUM, i);
		}
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public MatrixDclWithNameParaContext(MatrixDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterMatrixDclWithNamePara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitMatrixDclWithNamePara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitMatrixDclWithNamePara(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrixStandardDclContext extends MatrixDeclarationContext {
		public Token varName;
		public Token NUM;
		public List<Token> numbers = new ArrayList<Token>();
		public Token lastNumber;
		public Token rows;
		public Token collums;
		public TerminalNode EXTENDEDTYPE() { return getToken(aRayParser.EXTENDEDTYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(aRayParser.ASSIGN, 0); }
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public List<TerminalNode> SEMI() { return getTokens(aRayParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(aRayParser.SEMI, i);
		}
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public List<TerminalNode> NUM() { return getTokens(aRayParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(aRayParser.NUM, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(aRayParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(aRayParser.COMMA, i);
		}
		public MatrixStandardDclContext(MatrixDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterMatrixStandardDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitMatrixStandardDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitMatrixStandardDcl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrixDclContext extends MatrixDeclarationContext {
		public Token varName;
		public TerminalNode EXTENDEDTYPE() { return getToken(aRayParser.EXTENDEDTYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(aRayParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public MatrixDclContext(MatrixDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterMatrixDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitMatrixDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitMatrixDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixDeclarationContext matrixDeclaration() throws RecognitionException {
		MatrixDeclarationContext _localctx = new MatrixDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_matrixDeclaration);
		try {
			int _alt;
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new MatrixStandardDclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(EXTENDEDTYPE);
				setState(85);
				((MatrixStandardDclContext)_localctx).varName = match(ID);
				setState(86);
				match(ASSIGN);
				setState(87);
				match(LP);
				setState(90); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(88);
						((MatrixStandardDclContext)_localctx).NUM = match(NUM);
						((MatrixStandardDclContext)_localctx).numbers.add(((MatrixStandardDclContext)_localctx).NUM);
						setState(89);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(92); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(94);
				((MatrixStandardDclContext)_localctx).lastNumber = match(NUM);
				setState(95);
				match(SEMI);
				setState(96);
				((MatrixStandardDclContext)_localctx).rows = match(NUM);
				setState(97);
				match(SEMI);
				setState(98);
				((MatrixStandardDclContext)_localctx).collums = match(NUM);
				setState(99);
				match(RP);
				}
				break;
			case 2:
				_localctx = new MatrixDclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(EXTENDEDTYPE);
				setState(101);
				((MatrixDclContext)_localctx).varName = match(ID);
				setState(102);
				match(ASSIGN);
				}
				break;
			case 3:
				_localctx = new MatrixDclWithNameParaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(EXTENDEDTYPE);
				setState(104);
				((MatrixDclWithNameParaContext)_localctx).varName = match(ID);
				setState(105);
				match(ASSIGN);
				setState(106);
				match(LP);
				setState(107);
				match(STRING);
				setState(108);
				match(SEMI);
				setState(109);
				match(NUM);
				setState(110);
				match(SEMI);
				setState(111);
				match(NUM);
				setState(112);
				match(RP);
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

	public static class MatrixScopeContext extends ParserRuleContext {
		public Token varName;
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public TerminalNode AWAIT() { return getToken(aRayParser.AWAIT, 0); }
		public MatrixScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterMatrixScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitMatrixScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitMatrixScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixScopeContext matrixScope() throws RecognitionException {
		MatrixScopeContext _localctx = new MatrixScopeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matrixScope);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				((MatrixScopeContext)_localctx).varName = match(ID);
				setState(116);
				body();
				}
				break;
			case AWAIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(AWAIT);
				setState(118);
				((MatrixScopeContext)_localctx).varName = match(ID);
				setState(119);
				body();
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

	public static class AwaitScopeContext extends ParserRuleContext {
		public TerminalNode AWAIT() { return getToken(aRayParser.AWAIT, 0); }
		public TerminalNode LC() { return getToken(aRayParser.LC, 0); }
		public MatrixScopeContext matrixScope() {
			return getRuleContext(MatrixScopeContext.class,0);
		}
		public TerminalNode RC() { return getToken(aRayParser.RC, 0); }
		public AwaitScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_awaitScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterAwaitScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitAwaitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitAwaitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AwaitScopeContext awaitScope() throws RecognitionException {
		AwaitScopeContext _localctx = new AwaitScopeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_awaitScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(AWAIT);
			setState(123);
			match(LC);
			setState(124);
			matrixScope();
			setState(125);
			match(RC);
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
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDclContext extends FunctionDeclarationContext {
		public Token returnType;
		public Token functionName;
		public ParameterContext parameters;
		public FunctionBodyContext FuncBody;
		public TerminalNode FUNC() { return getToken(aRayParser.FUNC, 0); }
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(aRayParser.TYPE, 0); }
		public TerminalNode EXTENDEDTYPE() { return getToken(aRayParser.EXTENDEDTYPE, 0); }
		public FunctionDclContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterFunctionDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitFunctionDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitFunctionDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		int _la;
		try {
			_localctx = new FunctionDclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(FUNC);
			setState(128);
			((FunctionDclContext)_localctx).returnType = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==EXTENDEDTYPE) ) {
				((FunctionDclContext)_localctx).returnType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(129);
			((FunctionDclContext)_localctx).functionName = match(ID);
			setState(130);
			match(LP);
			setState(131);
			((FunctionDclContext)_localctx).parameters = parameter();
			setState(132);
			match(RP);
			setState(133);
			((FunctionDclContext)_localctx).FuncBody = functionBody();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StandardDclContext extends DeclarationContext {
		public Token type;
		public Token leftId;
		public ExpressionContext rightExpr;
		public TerminalNode ASSIGN() { return getToken(aRayParser.ASSIGN, 0); }
		public TerminalNode TYPE() { return getToken(aRayParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StandardDclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterStandardDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitStandardDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitStandardDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration);
		try {
			_localctx = new StandardDclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((StandardDclContext)_localctx).type = match(TYPE);
			setState(136);
			((StandardDclContext)_localctx).leftId = match(ID);
			setState(137);
			match(ASSIGN);
			setState(138);
			((StandardDclContext)_localctx).rightExpr = expression();
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

	public static class ParameterContext extends ParserRuleContext {
		public Token TYPE;
		public List<Token> paramTypes = new ArrayList<Token>();
		public Token EXTENDEDTYPE;
		public Token _tset284;
		public Token ID;
		public List<Token> paramNamesInOrder = new ArrayList<Token>();
		public Token lastParamType;
		public Token lastParamName;
		public List<TerminalNode> COMMA() { return getTokens(aRayParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(aRayParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(aRayParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aRayParser.ID, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(aRayParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(aRayParser.TYPE, i);
		}
		public List<TerminalNode> EXTENDEDTYPE() { return getTokens(aRayParser.EXTENDEDTYPE); }
		public TerminalNode EXTENDEDTYPE(int i) {
			return getToken(aRayParser.EXTENDEDTYPE, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					((ParameterContext)_localctx)._tset284 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TYPE || _la==EXTENDEDTYPE) ) {
						((ParameterContext)_localctx)._tset284 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ParameterContext)_localctx).paramTypes.add(((ParameterContext)_localctx)._tset284);
					setState(141);
					((ParameterContext)_localctx).ID = match(ID);
					((ParameterContext)_localctx).paramNamesInOrder.add(((ParameterContext)_localctx).ID);
					setState(142);
					match(COMMA);
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE || _la==EXTENDEDTYPE) {
				{
				setState(148);
				((ParameterContext)_localctx).lastParamType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TYPE || _la==EXTENDEDTYPE) ) {
					((ParameterContext)_localctx).lastParamType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				((ParameterContext)_localctx).lastParamName = match(ID);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnExpContext extends StatementContext {
		public ExpressionContext expr;
		public TerminalNode RETURN() { return getToken(aRayParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterReturnExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitReturnExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitReturnExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDAssignExpContext extends StatementContext {
		public Token varName;
		public Token operator;
		public ExpressionContext rightExpr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(aRayParser.THIS, 0); }
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(aRayParser.ASSIGNMENTOPERATOR, 0); }
		public TerminalNode ASSIGN() { return getToken(aRayParser.ASSIGN, 0); }
		public IDAssignExpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterIDAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitIDAssignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitIDAssignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DclContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new DclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				declaration();
				}
				break;
			case THIS:
			case ID:
				_localctx = new IDAssignExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				((IDAssignExpContext)_localctx).varName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==ID) ) {
					((IDAssignExpContext)_localctx).varName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(154);
				((IDAssignExpContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGNMENTOPERATOR) ) {
					((IDAssignExpContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				((IDAssignExpContext)_localctx).rightExpr = expression();
				}
				break;
			case RETURN:
			case SEMI:
				_localctx = new ReturnExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(156);
					match(RETURN);
					setState(157);
					((ReturnExpContext)_localctx).expr = expression();
					}
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpNumContext extends ExpressionContext {
		public Token value;
		public TerminalNode NUM() { return getToken(aRayParser.NUM, 0); }
		public ExpNumContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterExpNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitExpNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitExpNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpInvocationContext extends ExpressionContext {
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public ExpInvocationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterExpInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitExpInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitExpInvocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpDotProContext extends ExpressionContext {
		public Token leftVar;
		public Token rightVar;
		public TerminalNode DOT() { return getToken(aRayParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(aRayParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aRayParser.ID, i);
		}
		public ExpDotProContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterExpDotPro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitExpDotPro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitExpDotPro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpParenthesisContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterExpParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitExpParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitExpParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpOperatorContext extends ExpressionContext {
		public Token leftIdOrNumber;
		public Token operator;
		public ExpressionContext rightExpr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public TerminalNode THIS() { return getToken(aRayParser.THIS, 0); }
		public TerminalNode NUM() { return getToken(aRayParser.NUM, 0); }
		public TerminalNode OPERATOR() { return getToken(aRayParser.OPERATOR, 0); }
		public TerminalNode MATRIXOPERATOR() { return getToken(aRayParser.MATRIXOPERATOR, 0); }
		public ExpOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterExpOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitExpOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitExpOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpIdContext extends ExpressionContext {
		public Token varName;
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public ExpIdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterExpId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitExpId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitExpId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpThisContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(aRayParser.THIS, 0); }
		public ExpThisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterExpThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitExpThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitExpThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ExpInvocationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				invocation();
				}
				break;
			case 2:
				_localctx = new ExpNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				((ExpNumContext)_localctx).value = match(NUM);
				}
				break;
			case 3:
				_localctx = new ExpIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				((ExpIdContext)_localctx).varName = match(ID);
				}
				break;
			case 4:
				_localctx = new ExpThisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(THIS);
				}
				break;
			case 5:
				_localctx = new ExpOperatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				((ExpOperatorContext)_localctx).leftIdOrNumber = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << THIS) | (1L << ID))) != 0)) ) {
					((ExpOperatorContext)_localctx).leftIdOrNumber = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(167);
				((ExpOperatorContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OPERATOR || _la==MATRIXOPERATOR) ) {
					((ExpOperatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				((ExpOperatorContext)_localctx).rightExpr = expression();
				}
				break;
			case 6:
				_localctx = new ExpParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(LP);
				setState(170);
				((ExpParenthesisContext)_localctx).expr = expression();
				setState(171);
				match(RP);
				}
				break;
			case 7:
				_localctx = new ExpDotProContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				((ExpDotProContext)_localctx).leftVar = match(ID);
				setState(174);
				match(DOT);
				setState(175);
				((ExpDotProContext)_localctx).rightVar = match(ID);
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
	 
		public LogicalExpressionContext() { }
		public void copyFrom(LogicalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogOnlyExpContext extends LogicalExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogOnlyExpContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterLogOnlyExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitLogOnlyExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitLogOnlyExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogExpExpContext extends LogicalExpressionContext {
		public ExpressionContext leftexpr;
		public Token operator;
		public LogicalExpressionContext rightLogicalexp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LOGICALOPERATOR() { return getToken(aRayParser.LOGICALOPERATOR, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogExpExpContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterLogExpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitLogExpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitLogExpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogExpConditContext extends LogicalExpressionContext {
		public LogicalExpressionContext leftLogicalexp;
		public Token operator;
		public LogicalExpressionContext rightLogicalexp;
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode CONDITIONALOPERATOR() { return getToken(aRayParser.CONDITIONALOPERATOR, 0); }
		public LogExpConditContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterLogExpCondit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitLogExpCondit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitLogExpCondit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogExpParenthesisContext extends LogicalExpressionContext {
		public LogicalExpressionContext loexp;
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogExpParenthesisContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterLogExpParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitLogExpParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitLogExpParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_logicalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new LogOnlyExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(179);
				expression();
				}
				break;
			case 2:
				{
				_localctx = new LogExpParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(LP);
				setState(181);
				((LogExpParenthesisContext)_localctx).loexp = logicalExpression(0);
				setState(182);
				match(RP);
				}
				break;
			case 3:
				{
				_localctx = new LogExpExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				((LogExpExpContext)_localctx).leftexpr = expression();
				setState(185);
				((LogExpExpContext)_localctx).operator = match(LOGICALOPERATOR);
				setState(186);
				((LogExpExpContext)_localctx).rightLogicalexp = logicalExpression(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogExpConditContext(new LogicalExpressionContext(_parentctx, _parentState));
					((LogExpConditContext)_localctx).leftLogicalexp = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
					setState(190);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(191);
					((LogExpConditContext)_localctx).operator = match(CONDITIONALOPERATOR);
					setState(192);
					((LogExpConditContext)_localctx).rightLogicalexp = logicalExpression(2);
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InvocationContext extends ParserRuleContext {
		public Token leftSideAssignVarNameOptional;
		public Token assignOperator;
		public Token functionId;
		public ExpressionContext expression;
		public List<ExpressionContext> parameters = new ArrayList<ExpressionContext>();
		public ExpressionContext lastOrSingleParameter;
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public List<TerminalNode> ID() { return getTokens(aRayParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aRayParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(aRayParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(aRayParser.COMMA, i);
		}
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(aRayParser.ASSIGNMENTOPERATOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_invocation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(198);
				((InvocationContext)_localctx).leftSideAssignVarNameOptional = match(ID);
				setState(199);
				((InvocationContext)_localctx).assignOperator = match(ASSIGNMENTOPERATOR);
				}
				break;
			}
			setState(202);
			((InvocationContext)_localctx).functionId = match(ID);
			setState(203);
			match(LP);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					((InvocationContext)_localctx).expression = expression();
					((InvocationContext)_localctx).parameters.add(((InvocationContext)_localctx).expression);
					setState(205);
					match(COMMA);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << THIS) | (1L << LP) | (1L << ID))) != 0)) {
				{
				setState(212);
				((InvocationContext)_localctx).lastOrSingleParameter = expression();
				}
			}

			setState(215);
			match(RP);
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

	public static class SelectionContext extends ParserRuleContext {
		public IfStatementContext ifstmt;
		public SwitchStatementContext switchstmt;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selection);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				((SelectionContext)_localctx).ifstmt = ifStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				((SelectionContext)_localctx).switchstmt = switchStatement();
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

	public static class IterationContext extends ParserRuleContext {
		public ForIterationContext forite;
		public WhileIterationContext whileite;
		public ForIterationContext forIteration() {
			return getRuleContext(ForIterationContext.class,0);
		}
		public WhileIterationContext whileIteration() {
			return getRuleContext(WhileIterationContext.class,0);
		}
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_iteration);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				((IterationContext)_localctx).forite = forIteration();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				((IterationContext)_localctx).whileite = whileIteration();
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmtContext extends IfStatementContext {
		public LogicalExpressionContext exprToEvaluate;
		public BodyContext ifBody;
		public ElseIfStatementContext elseIfStatement;
		public List<ElseIfStatementContext> elseIfs = new ArrayList<ElseIfStatementContext>();
		public ElseStatementContext optionalElse;
		public TerminalNode IF() { return getToken(aRayParser.IF, 0); }
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStmtContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifStatement);
		int _la;
		try {
			_localctx = new IfStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(IF);
			setState(226);
			match(LP);
			setState(227);
			((IfStmtContext)_localctx).exprToEvaluate = logicalExpression(0);
			setState(228);
			match(RP);
			setState(229);
			((IfStmtContext)_localctx).ifBody = body();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(230);
				((IfStmtContext)_localctx).elseIfStatement = elseIfStatement();
				((IfStmtContext)_localctx).elseIfs.add(((IfStmtContext)_localctx).elseIfStatement);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(236);
				((IfStmtContext)_localctx).optionalElse = elseStatement();
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public LogicalExpressionContext expressionToEvaluate;
		public BodyContext elsifBody;
		public TerminalNode ELSEIF() { return getToken(aRayParser.ELSEIF, 0); }
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ELSEIF);
			setState(240);
			match(LP);
			setState(241);
			((ElseIfStatementContext)_localctx).expressionToEvaluate = logicalExpression(0);
			setState(242);
			match(RP);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LC) {
				{
				setState(243);
				((ElseIfStatementContext)_localctx).elsifBody = body();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	 
		public ElseStatementContext() { }
		public void copyFrom(ElseStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseStmtContext extends ElseStatementContext {
		public BodyContext elseBody;
		public TerminalNode ELSE() { return getToken(aRayParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseStmtContext(ElseStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elseStatement);
		try {
			_localctx = new ElseStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(ELSE);
			setState(247);
			((ElseStmtContext)_localctx).elseBody = body();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	 
		public SwitchStatementContext() { }
		public void copyFrom(SwitchStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SwitchStmtContext extends SwitchStatementContext {
		public ExpressionContext expToEvaluate;
		public CaseBodyContext caseBody;
		public List<CaseBodyContext> cases = new ArrayList<CaseBodyContext>();
		public DefaultBodyContext defaultBod;
		public TerminalNode SWITCH() { return getToken(aRayParser.SWITCH, 0); }
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public TerminalNode LC() { return getToken(aRayParser.LC, 0); }
		public TerminalNode RC() { return getToken(aRayParser.RC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultBodyContext defaultBody() {
			return getRuleContext(DefaultBodyContext.class,0);
		}
		public List<CaseBodyContext> caseBody() {
			return getRuleContexts(CaseBodyContext.class);
		}
		public CaseBodyContext caseBody(int i) {
			return getRuleContext(CaseBodyContext.class,i);
		}
		public SwitchStmtContext(SwitchStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitSwitchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switchStatement);
		int _la;
		try {
			_localctx = new SwitchStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(SWITCH);
			setState(250);
			match(LP);
			setState(251);
			((SwitchStmtContext)_localctx).expToEvaluate = expression();
			setState(252);
			match(RP);
			setState(253);
			match(LC);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(254);
				((SwitchStmtContext)_localctx).caseBody = caseBody();
				((SwitchStmtContext)_localctx).cases.add(((SwitchStmtContext)_localctx).caseBody);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			((SwitchStmtContext)_localctx).defaultBod = defaultBody();
			setState(261);
			match(RC);
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

	public static class CaseBodyContext extends ParserRuleContext {
		public Token number;
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public TerminalNode CASE() { return getToken(aRayParser.CASE, 0); }
		public TerminalNode COL() { return getToken(aRayParser.COL, 0); }
		public TerminalNode BREAK() { return getToken(aRayParser.BREAK, 0); }
		public List<TerminalNode> SEMI() { return getTokens(aRayParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(aRayParser.SEMI, i);
		}
		public TerminalNode NUM() { return getToken(aRayParser.NUM, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CaseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterCaseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitCaseBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitCaseBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBodyContext caseBody() throws RecognitionException {
		CaseBodyContext _localctx = new CaseBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_caseBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(CASE);
			setState(264);
			((CaseBodyContext)_localctx).number = match(NUM);
			setState(265);
			match(COL);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << THIS) | (1L << RETURN) | (1L << SEMI) | (1L << ID))) != 0)) {
				{
				{
				setState(266);
				((CaseBodyContext)_localctx).statement = statement();
				((CaseBodyContext)_localctx).stmts.add(((CaseBodyContext)_localctx).statement);
				setState(267);
				match(SEMI);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(BREAK);
			setState(275);
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

	public static class DefaultBodyContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public TerminalNode DEFAULT() { return getToken(aRayParser.DEFAULT, 0); }
		public TerminalNode COL() { return getToken(aRayParser.COL, 0); }
		public TerminalNode BREAK() { return getToken(aRayParser.BREAK, 0); }
		public List<TerminalNode> SEMI() { return getTokens(aRayParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(aRayParser.SEMI, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DefaultBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterDefaultBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitDefaultBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitDefaultBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultBodyContext defaultBody() throws RecognitionException {
		DefaultBodyContext _localctx = new DefaultBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_defaultBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(DEFAULT);
			setState(278);
			match(COL);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << THIS) | (1L << RETURN) | (1L << SEMI) | (1L << ID))) != 0)) {
				{
				{
				setState(279);
				((DefaultBodyContext)_localctx).statement = statement();
				((DefaultBodyContext)_localctx).stmts.add(((DefaultBodyContext)_localctx).statement);
				setState(280);
				match(SEMI);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(BREAK);
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

	public static class ForIterationContext extends ParserRuleContext {
		public ForIterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIteration; }
	 
		public ForIterationContext() { }
		public void copyFrom(ForIterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForIteContext extends ForIterationContext {
		public DeclarationContext dcl;
		public Token varId;
		public DeclarationContext declaration;
		public List<DeclarationContext> dcls = new ArrayList<DeclarationContext>();
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public LogicalExpressionContext expToEval;
		public Token varToAlter;
		public Token inOrDecre;
		public List<Token> idsToAlter = new ArrayList<Token>();
		public Token INORDECREMENT;
		public List<Token> howToAlterIds = new ArrayList<Token>();
		public BodyContext forBody;
		public TerminalNode FOR() { return getToken(aRayParser.FOR, 0); }
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public List<TerminalNode> SEMI() { return getTokens(aRayParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(aRayParser.SEMI, i);
		}
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(aRayParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aRayParser.ID, i);
		}
		public List<TerminalNode> INORDECREMENT() { return getTokens(aRayParser.INORDECREMENT); }
		public TerminalNode INORDECREMENT(int i) {
			return getToken(aRayParser.INORDECREMENT, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(aRayParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(aRayParser.COMMA, i);
		}
		public ForIteContext(ForIterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterForIte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitForIte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitForIte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIterationContext forIteration() throws RecognitionException {
		ForIterationContext _localctx = new ForIterationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forIteration);
		int _la;
		try {
			_localctx = new ForIteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(FOR);
			setState(290);
			match(LP);
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(291);
				((ForIteContext)_localctx).dcl = declaration();
				}
				break;
			case ID:
				{
				setState(292);
				((ForIteContext)_localctx).varId = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(295);
				match(COMMA);
				setState(298);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(296);
					((ForIteContext)_localctx).declaration = declaration();
					((ForIteContext)_localctx).dcls.add(((ForIteContext)_localctx).declaration);
					}
					break;
				case ID:
					{
					setState(297);
					((ForIteContext)_localctx).ID = match(ID);
					((ForIteContext)_localctx).ids.add(((ForIteContext)_localctx).ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(SEMI);
			setState(306);
			((ForIteContext)_localctx).expToEval = logicalExpression(0);
			setState(307);
			match(SEMI);
			setState(308);
			((ForIteContext)_localctx).varToAlter = match(ID);
			setState(309);
			((ForIteContext)_localctx).inOrDecre = match(INORDECREMENT);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(310);
				match(COMMA);
				setState(311);
				((ForIteContext)_localctx).ID = match(ID);
				((ForIteContext)_localctx).idsToAlter.add(((ForIteContext)_localctx).ID);
				setState(312);
				((ForIteContext)_localctx).INORDECREMENT = match(INORDECREMENT);
				((ForIteContext)_localctx).howToAlterIds.add(((ForIteContext)_localctx).INORDECREMENT);
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(RP);
			setState(319);
			((ForIteContext)_localctx).forBody = body();
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

	public static class WhileIterationContext extends ParserRuleContext {
		public WhileIterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileIteration; }
	 
		public WhileIterationContext() { }
		public void copyFrom(WhileIterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileIteContext extends WhileIterationContext {
		public LogicalExpressionContext expToEval;
		public BodyContext whileBody;
		public TerminalNode WHILE() { return getToken(aRayParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileIteContext(WhileIterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterWhileIte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitWhileIte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitWhileIte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileIterationContext whileIteration() throws RecognitionException {
		WhileIterationContext _localctx = new WhileIterationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileIteration);
		try {
			_localctx = new WhileIteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(WHILE);
			setState(322);
			match(LP);
			setState(323);
			((WhileIteContext)_localctx).expToEval = logicalExpression(0);
			setState(324);
			match(RP);
			setState(325);
			((WhileIteContext)_localctx).whileBody = body();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u014a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3B"+
		"\n\3\f\3\16\3E\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4P\n\4\f\4\16"+
		"\4S\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\6\5]\n\5\r\5\16\5^\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"t\n\5\3\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u0092\n\n\f\n\16"+
		"\n\u0095\13\n\3\n\3\n\5\n\u0099\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00a1\n\13\5\13\u00a3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00b3\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00bf\n\r\3\r\3\r\3\r\7\r\u00c4\n\r\f\r\16\r\u00c7\13\r\3\16\3\16\5"+
		"\16\u00cb\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d2\n\16\f\16\16\16\u00d5"+
		"\13\16\3\16\5\16\u00d8\n\16\3\16\3\16\3\17\3\17\5\17\u00de\n\17\3\20\3"+
		"\20\5\20\u00e2\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ea\n\21\f\21"+
		"\16\21\u00ed\13\21\3\21\5\21\u00f0\n\21\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00f7\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0102\n"+
		"\24\f\24\16\24\u0105\13\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0110\n\25\f\25\16\25\u0113\13\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u011d\n\26\f\26\16\26\u0120\13\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u0128\n\27\3\27\3\27\3\27\5\27\u012d\n\27\7\27\u012f\n"+
		"\27\f\27\16\27\u0132\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u013c\n\27\f\27\16\27\u013f\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\2\3\30\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\2\7\3\2\3\4\4\2\17\17%%\3\2\n\13\5\2\6\6\17\17%%\4\2\b\b\16\16\2"+
		"\u0160\2\66\3\2\2\2\49\3\2\2\2\6H\3\2\2\2\bs\3\2\2\2\nz\3\2\2\2\f|\3\2"+
		"\2\2\16\u0081\3\2\2\2\20\u0089\3\2\2\2\22\u0093\3\2\2\2\24\u00a2\3\2\2"+
		"\2\26\u00b2\3\2\2\2\30\u00be\3\2\2\2\32\u00ca\3\2\2\2\34\u00dd\3\2\2\2"+
		"\36\u00e1\3\2\2\2 \u00e3\3\2\2\2\"\u00f1\3\2\2\2$\u00f8\3\2\2\2&\u00fb"+
		"\3\2\2\2(\u0109\3\2\2\2*\u0117\3\2\2\2,\u0123\3\2\2\2.\u0143\3\2\2\2\60"+
		"\65\5\b\5\2\61\65\5\n\6\2\62\65\5\f\7\2\63\65\5\16\b\2\64\60\3\2\2\2\64"+
		"\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67"+
		"\3\2\2\2\67\3\3\2\2\28\66\3\2\2\29C\7\36\2\2:;\5\24\13\2;<\7 \2\2<B\3"+
		"\2\2\2=B\5\34\17\2>B\5\36\20\2?B\5\b\5\2@B\5\n\6\2A:\3\2\2\2A=\3\2\2\2"+
		"A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2"+
		"EC\3\2\2\2FG\7\37\2\2G\5\3\2\2\2HQ\7\36\2\2IJ\5\24\13\2JK\7 \2\2KP\3\2"+
		"\2\2LP\5\34\17\2MP\5\36\20\2NP\5\b\5\2OI\3\2\2\2OL\3\2\2\2OM\3\2\2\2O"+
		"N\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\37\2\2"+
		"U\7\3\2\2\2VW\7\4\2\2WX\7%\2\2XY\7\n\2\2Y\\\7\34\2\2Z[\7\6\2\2[]\7#\2"+
		"\2\\Z\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\6\2\2ab\7 "+
		"\2\2bc\7\6\2\2cd\7 \2\2de\7\6\2\2et\7\35\2\2fg\7\4\2\2gh\7%\2\2ht\7\n"+
		"\2\2ij\7\4\2\2jk\7%\2\2kl\7\n\2\2lm\7\34\2\2mn\7\7\2\2no\7 \2\2op\7\6"+
		"\2\2pq\7 \2\2qr\7\6\2\2rt\7\35\2\2sV\3\2\2\2sf\3\2\2\2si\3\2\2\2t\t\3"+
		"\2\2\2uv\7%\2\2v{\5\4\3\2wx\7\20\2\2xy\7%\2\2y{\5\4\3\2zu\3\2\2\2zw\3"+
		"\2\2\2{\13\3\2\2\2|}\7\20\2\2}~\7\36\2\2~\177\5\n\6\2\177\u0080\7\37\2"+
		"\2\u0080\r\3\2\2\2\u0081\u0082\7\31\2\2\u0082\u0083\t\2\2\2\u0083\u0084"+
		"\7%\2\2\u0084\u0085\7\34\2\2\u0085\u0086\5\22\n\2\u0086\u0087\7\35\2\2"+
		"\u0087\u0088\5\6\4\2\u0088\17\3\2\2\2\u0089\u008a\7\3\2\2\u008a\u008b"+
		"\7%\2\2\u008b\u008c\7\n\2\2\u008c\u008d\5\26\f\2\u008d\21\3\2\2\2\u008e"+
		"\u008f\t\2\2\2\u008f\u0090\7%\2\2\u0090\u0092\7#\2\2\u0091\u008e\3\2\2"+
		"\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0098"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\t\2\2\2\u0097\u0099\7%\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\23\3\2\2\2\u009a\u00a3\5\20\t"+
		"\2\u009b\u009c\t\3\2\2\u009c\u009d\t\4\2\2\u009d\u00a3\5\26\f\2\u009e"+
		"\u009f\7\30\2\2\u009f\u00a1\5\26\f\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\25\3\2\2\2\u00a4\u00b3\5\32\16\2\u00a5\u00b3\7\6"+
		"\2\2\u00a6\u00b3\7%\2\2\u00a7\u00b3\7\17\2\2\u00a8\u00a9\t\5\2\2\u00a9"+
		"\u00aa\t\6\2\2\u00aa\u00b3\5\26\f\2\u00ab\u00ac\7\34\2\2\u00ac\u00ad\5"+
		"\26\f\2\u00ad\u00ae\7\35\2\2\u00ae\u00b3\3\2\2\2\u00af\u00b0\7%\2\2\u00b0"+
		"\u00b1\7\"\2\2\u00b1\u00b3\7%\2\2\u00b2\u00a4\3\2\2\2\u00b2\u00a5\3\2"+
		"\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a7\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b2"+
		"\u00ab\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\27\3\2\2\2\u00b4\u00b5\b\r\1"+
		"\2\u00b5\u00bf\5\26\f\2\u00b6\u00b7\7\34\2\2\u00b7\u00b8\5\30\r\2\u00b8"+
		"\u00b9\7\35\2\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc\7"+
		"\t\2\2\u00bc\u00bd\5\30\r\4\u00bd\u00bf\3\2\2\2\u00be\u00b4\3\2\2\2\u00be"+
		"\u00b6\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\u00c5\3\2\2\2\u00c0\u00c1\f\3"+
		"\2\2\u00c1\u00c2\7\f\2\2\u00c2\u00c4\5\30\r\4\u00c3\u00c0\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\31\3\2\2"+
		"\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7%\2\2\u00c9\u00cb\7\13\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7%\2\2\u00cd"+
		"\u00d3\7\34\2\2\u00ce\u00cf\5\26\f\2\u00cf\u00d0\7#\2\2\u00d0\u00d2\3"+
		"\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\5\26"+
		"\f\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\7\35\2\2\u00da\33\3\2\2\2\u00db\u00de\5 \21\2\u00dc\u00de\5&\24"+
		"\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\35\3\2\2\2\u00df\u00e2"+
		"\5,\27\2\u00e0\u00e2\5.\30\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\37\3\2\2\2\u00e3\u00e4\7\21\2\2\u00e4\u00e5\7\34\2\2\u00e5\u00e6\5\30"+
		"\r\2\u00e6\u00e7\7\35\2\2\u00e7\u00eb\5\4\3\2\u00e8\u00ea\5\"\22\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\5$\23\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0!\3\2\2\2\u00f1\u00f2\7\22\2\2"+
		"\u00f2\u00f3\7\34\2\2\u00f3\u00f4\5\30\r\2\u00f4\u00f6\7\35\2\2\u00f5"+
		"\u00f7\5\4\3\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7#\3\2\2\2"+
		"\u00f8\u00f9\7\23\2\2\u00f9\u00fa\5\4\3\2\u00fa%\3\2\2\2\u00fb\u00fc\7"+
		"\24\2\2\u00fc\u00fd\7\34\2\2\u00fd\u00fe\5\26\f\2\u00fe\u00ff\7\35\2\2"+
		"\u00ff\u0103\7\36\2\2\u0100\u0102\5(\25\2\u0101\u0100\3\2\2\2\u0102\u0105"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0107\5*\26\2\u0107\u0108\7\37\2\2\u0108\'\3\2\2"+
		"\2\u0109\u010a\7\26\2\2\u010a\u010b\7\6\2\2\u010b\u0111\7!\2\2\u010c\u010d"+
		"\5\24\13\2\u010d\u010e\7 \2\2\u010e\u0110\3\2\2\2\u010f\u010c\3\2\2\2"+
		"\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\27\2\2\u0115\u0116\7 \2\2\u0116"+
		")\3\2\2\2\u0117\u0118\7\25\2\2\u0118\u011e\7!\2\2\u0119\u011a\5\24\13"+
		"\2\u011a\u011b\7 \2\2\u011b\u011d\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0122\7\27\2\2\u0122+\3\2\2\2\u0123\u0124\7\32\2"+
		"\2\u0124\u0127\7\34\2\2\u0125\u0128\5\20\t\2\u0126\u0128\7%\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0130\3\2\2\2\u0129\u012c\7#"+
		"\2\2\u012a\u012d\5\20\t\2\u012b\u012d\7%\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0129\3\2\2\2\u012f\u0132\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0134\7 \2\2\u0134\u0135\5\30\r\2\u0135\u0136\7 "+
		"\2\2\u0136\u0137\7%\2\2\u0137\u013d\7\r\2\2\u0138\u0139\7#\2\2\u0139\u013a"+
		"\7%\2\2\u013a\u013c\7\r\2\2\u013b\u0138\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u0140\u0141\7\35\2\2\u0141\u0142\5\4\3\2\u0142-\3\2\2\2\u0143\u0144"+
		"\7\33\2\2\u0144\u0145\7\34\2\2\u0145\u0146\5\30\r\2\u0146\u0147\7\35\2"+
		"\2\u0147\u0148\5\4\3\2\u0148/\3\2\2\2!\64\66ACOQ^sz\u0093\u0098\u00a0"+
		"\u00a2\u00b2\u00be\u00c5\u00ca\u00d3\u00d7\u00dd\u00e1\u00eb\u00ef\u00f6"+
		"\u0103\u0111\u011e\u0127\u012c\u0130\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}