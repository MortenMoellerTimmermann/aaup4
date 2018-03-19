// Generated from D:/JavaProjects/Project-V2/src/com/company\BETS.g4 by ANTLR 4.7
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
public class BETSParser extends Parser {
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
		RULE_matrixScope = 4, RULE_matrixExpression = 5, RULE_awaitScope = 6, 
		RULE_functionDeclaration = 7, RULE_declaration = 8, RULE_parameter = 9, 
		RULE_statement = 10, RULE_functionStatement = 11, RULE_expression = 12, 
		RULE_logicalExpression = 13, RULE_invocation = 14, RULE_selection = 15, 
		RULE_iteration = 16, RULE_ifStatement = 17, RULE_elseIfStatement = 18, 
		RULE_elseStatement = 19, RULE_switchStatement = 20, RULE_caseBody = 21, 
		RULE_defaultBody = 22, RULE_forIteration = 23, RULE_whileIteration = 24;
	public static final String[] ruleNames = {
		"global", "body", "functionBody", "matrixDeclaration", "matrixScope", 
		"matrixExpression", "awaitScope", "functionDeclaration", "declaration", 
		"parameter", "statement", "functionStatement", "expression", "logicalExpression", 
		"invocation", "selection", "iteration", "ifStatement", "elseIfStatement", 
		"elseStatement", "switchStatement", "caseBody", "defaultBody", "forIteration", 
		"whileIteration"
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

	@Override
	public String getGrammarFileName() { return "BETS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BETSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GlobalContext extends ParserRuleContext {
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
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitGlobal(this);
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXTENDEDTYPE) | (1L << AWAIT) | (1L << FUNC) | (1L << ID))) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(50);
					matrixDeclaration();
					}
					break;
				case 2:
					{
					setState(51);
					matrixScope();
					}
					break;
				case 3:
					{
					setState(52);
					awaitScope();
					}
					break;
				case 4:
					{
					setState(53);
					functionDeclaration();
					}
					break;
				}
				}
				setState(58);
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
		public TerminalNode LC() { return getToken(BETSParser.LC, 0); }
		public TerminalNode RC() { return getToken(BETSParser.RC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BETSParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BETSParser.SEMI, i);
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
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitBody(this);
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
			setState(59);
			match(LC);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << THIS) | (1L << IF) | (1L << SWITCH) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << SEMI) | (1L << ID))) != 0)) {
				{
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
				case THIS:
				case RETURN:
				case SEMI:
				case ID:
					{
					setState(60);
					statement();
					setState(61);
					match(SEMI);
					}
					break;
				case IF:
				case SWITCH:
					{
					setState(63);
					selection();
					}
					break;
				case FOR:
				case WHILE:
					{
					setState(64);
					iteration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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
		public TerminalNode LC() { return getToken(BETSParser.LC, 0); }
		public TerminalNode RC() { return getToken(BETSParser.RC, 0); }
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BETSParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BETSParser.SEMI, i);
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
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitFunctionBody(this);
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
			setState(72);
			match(LC);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << IF) | (1L << SWITCH) | (1L << RETURN) | (1L << FOR) | (1L << WHILE))) != 0)) {
				{
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
				case RETURN:
					{
					setState(73);
					functionStatement();
					setState(74);
					match(SEMI);
					}
					break;
				case IF:
				case SWITCH:
					{
					setState(76);
					selection();
					}
					break;
				case FOR:
				case WHILE:
					{
					setState(77);
					iteration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(83);
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
		public TerminalNode EXTENDEDTYPE() { return getToken(BETSParser.EXTENDEDTYPE, 0); }
		public TerminalNode ID() { return getToken(BETSParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BETSParser.ASSIGN, 0); }
		public TerminalNode LP() { return getToken(BETSParser.LP, 0); }
		public List<TerminalNode> NUM() { return getTokens(BETSParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(BETSParser.NUM, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BETSParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BETSParser.SEMI, i);
		}
		public TerminalNode RP() { return getToken(BETSParser.RP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BETSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BETSParser.COMMA, i);
		}
		public MatrixExpressionContext matrixExpression() {
			return getRuleContext(MatrixExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BETSParser.STRING, 0); }
		public MatrixDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterMatrixDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitMatrixDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitMatrixDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixDeclarationContext matrixDeclaration() throws RecognitionException {
		MatrixDeclarationContext _localctx = new MatrixDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_matrixDeclaration);
		try {
			int _alt;
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(EXTENDEDTYPE);
				setState(86);
				match(ID);
				setState(87);
				match(ASSIGN);
				setState(88);
				match(LP);
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						match(NUM);
						setState(90);
						match(COMMA);
						}
						} 
					}
					setState(95);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(96);
				match(NUM);
				setState(97);
				match(SEMI);
				setState(98);
				match(NUM);
				setState(99);
				match(SEMI);
				setState(100);
				match(NUM);
				setState(101);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(EXTENDEDTYPE);
				setState(103);
				match(ID);
				setState(104);
				match(ASSIGN);
				setState(105);
				matrixExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(EXTENDEDTYPE);
				setState(107);
				match(ID);
				setState(108);
				match(ASSIGN);
				setState(109);
				match(LP);
				setState(110);
				match(STRING);
				setState(111);
				match(SEMI);
				setState(112);
				match(NUM);
				setState(113);
				match(SEMI);
				setState(114);
				match(NUM);
				setState(115);
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
		public TerminalNode ID() { return getToken(BETSParser.ID, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode AWAIT() { return getToken(BETSParser.AWAIT, 0); }
		public MatrixScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterMatrixScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitMatrixScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitMatrixScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixScopeContext matrixScope() throws RecognitionException {
		MatrixScopeContext _localctx = new MatrixScopeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matrixScope);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(ID);
				setState(119);
				body();
				}
				break;
			case AWAIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(AWAIT);
				setState(121);
				match(ID);
				setState(122);
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

	public static class MatrixExpressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BETSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BETSParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(BETSParser.DOT, 0); }
		public MatrixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterMatrixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitMatrixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitMatrixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixExpressionContext matrixExpression() throws RecognitionException {
		MatrixExpressionContext _localctx = new MatrixExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_matrixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(126);
			match(DOT);
			setState(127);
			match(ID);
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
		public TerminalNode AWAIT() { return getToken(BETSParser.AWAIT, 0); }
		public TerminalNode LC() { return getToken(BETSParser.LC, 0); }
		public MatrixScopeContext matrixScope() {
			return getRuleContext(MatrixScopeContext.class,0);
		}
		public TerminalNode RC() { return getToken(BETSParser.RC, 0); }
		public AwaitScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_awaitScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterAwaitScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitAwaitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitAwaitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AwaitScopeContext awaitScope() throws RecognitionException {
		AwaitScopeContext _localctx = new AwaitScopeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_awaitScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(AWAIT);
			setState(130);
			match(LC);
			setState(131);
			matrixScope();
			setState(132);
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
		public TerminalNode FUNC() { return getToken(BETSParser.FUNC, 0); }
		public TerminalNode TYPE() { return getToken(BETSParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(BETSParser.ID, 0); }
		public TerminalNode LP() { return getToken(BETSParser.LP, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode RP() { return getToken(BETSParser.RP, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(FUNC);
			setState(135);
			match(TYPE);
			setState(136);
			match(ID);
			setState(137);
			match(LP);
			setState(138);
			parameter();
			setState(139);
			match(RP);
			setState(140);
			functionBody();
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
		public TerminalNode TYPE() { return getToken(BETSParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(BETSParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BETSParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(TYPE);
			setState(143);
			match(ID);
			setState(144);
			match(ASSIGN);
			setState(145);
			expression();
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
		public List<TerminalNode> ID() { return getTokens(BETSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BETSParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BETSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BETSParser.COMMA, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(BETSParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(BETSParser.TYPE, i);
		}
		public List<TerminalNode> EXTENDEDTYPE() { return getTokens(BETSParser.EXTENDEDTYPE); }
		public TerminalNode EXTENDEDTYPE(int i) {
			return getToken(BETSParser.EXTENDEDTYPE, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					_la = _input.LA(1);
					if ( !(_la==TYPE || _la==EXTENDEDTYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(148);
					match(ID);
					setState(149);
					match(COMMA);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE || _la==EXTENDEDTYPE) {
				{
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==TYPE || _la==EXTENDEDTYPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				match(ID);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(BETSParser.THIS, 0); }
		public TerminalNode ID() { return getToken(BETSParser.ID, 0); }
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(BETSParser.ASSIGNMENTOPERATOR, 0); }
		public TerminalNode ASSIGN() { return getToken(BETSParser.ASSIGN, 0); }
		public TerminalNode RETURN() { return getToken(BETSParser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				declaration();
				}
				break;
			case THIS:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGNMENTOPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(162);
				expression();
				}
				break;
			case RETURN:
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(163);
					match(RETURN);
					setState(164);
					expression();
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

	public static class FunctionStatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(BETSParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionStatement);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				declaration();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(RETURN);
				setState(171);
				expression();
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
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public TerminalNode NUM() { return getToken(BETSParser.NUM, 0); }
		public TerminalNode ID() { return getToken(BETSParser.ID, 0); }
		public TerminalNode THIS() { return getToken(BETSParser.THIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(BETSParser.OPERATOR, 0); }
		public TerminalNode MATRIXOPERATOR() { return getToken(BETSParser.MATRIXOPERATOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				invocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << THIS) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==OPERATOR || _la==MATRIXOPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				expression();
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
		public List<TerminalNode> ID() { return getTokens(BETSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BETSParser.ID, i);
		}
		public TerminalNode LOGICALOPERATOR() { return getToken(BETSParser.LOGICALOPERATOR, 0); }
		public TerminalNode NUM() { return getToken(BETSParser.NUM, 0); }
		public TerminalNode LP() { return getToken(BETSParser.LP, 0); }
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode RP() { return getToken(BETSParser.RP, 0); }
		public TerminalNode CONDITIONALOPERATOR() { return getToken(BETSParser.CONDITIONALOPERATOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicalExpression);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(ID);
				setState(185);
				match(LOGICALOPERATOR);
				setState(186);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(LP);
				setState(188);
				logicalExpression();
				setState(189);
				match(RP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(LP);
				setState(192);
				logicalExpression();
				setState(193);
				match(RP);
				setState(194);
				match(CONDITIONALOPERATOR);
				setState(195);
				logicalExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				expression();
				setState(198);
				match(CONDITIONALOPERATOR);
				setState(199);
				logicalExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				expression();
				setState(202);
				match(LOGICALOPERATOR);
				setState(203);
				expression();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONDITIONALOPERATOR) {
					{
					setState(204);
					match(CONDITIONALOPERATOR);
					setState(205);
					logicalExpression();
					}
				}

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

	public static class InvocationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BETSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BETSParser.ID, i);
		}
		public TerminalNode LP() { return getToken(BETSParser.LP, 0); }
		public TerminalNode RP() { return getToken(BETSParser.RP, 0); }
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(BETSParser.ASSIGNMENTOPERATOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BETSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BETSParser.COMMA, i);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_invocation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(210);
				match(ID);
				setState(211);
				match(ASSIGNMENTOPERATOR);
				}
				break;
			}
			setState(214);
			match(ID);
			setState(215);
			match(LP);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					expression();
					setState(217);
					match(COMMA);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << THIS) | (1L << ID))) != 0)) {
				{
				setState(224);
				expression();
				}
			}

			setState(227);
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
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selection);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				ifStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				switchStatement();
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
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_iteration);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				forIteration();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				whileIteration();
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
		public TerminalNode IF() { return getToken(BETSParser.IF, 0); }
		public TerminalNode LP() { return getToken(BETSParser.LP, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(BETSParser.RP, 0); }
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
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(IF);
			setState(238);
			match(LP);
			setState(239);
			logicalExpression();
			setState(240);
			match(RP);
			setState(241);
			body();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(242);
				elseIfStatement();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(248);
				elseStatement();
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
		public TerminalNode ELSEIF() { return getToken(BETSParser.ELSEIF, 0); }
		public TerminalNode LP() { return getToken(BETSParser.LP, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(BETSParser.RP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ELSEIF);
			setState(252);
			match(LP);
			setState(253);
			logicalExpression();
			setState(254);
			match(RP);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LC) {
				{
				setState(255);
				body();
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
		public TerminalNode ELSE() { return getToken(BETSParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ELSE);
			setState(259);
			body();
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
		public TerminalNode SWITCH() { return getToken(BETSParser.SWITCH, 0); }
		public TerminalNode LP() { return getToken(BETSParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(BETSParser.RP, 0); }
		public TerminalNode LC() { return getToken(BETSParser.LC, 0); }
		public TerminalNode RC() { return getToken(BETSParser.RC, 0); }
		public List<CaseBodyContext> caseBody() {
			return getRuleContexts(CaseBodyContext.class);
		}
		public CaseBodyContext caseBody(int i) {
			return getRuleContext(CaseBodyContext.class,i);
		}
		public DefaultBodyContext defaultBody() {
			return getRuleContext(DefaultBodyContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(SWITCH);
			setState(262);
			match(LP);
			setState(263);
			expression();
			setState(264);
			match(RP);
			setState(265);
			match(LC);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(266);
				caseBody();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(272);
				defaultBody();
				}
			}

			setState(275);
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
		public TerminalNode CASE() { return getToken(BETSParser.CASE, 0); }
		public TerminalNode NUM() { return getToken(BETSParser.NUM, 0); }
		public TerminalNode COL() { return getToken(BETSParser.COL, 0); }
		public TerminalNode BREAK() { return getToken(BETSParser.BREAK, 0); }
		public List<TerminalNode> SEMI() { return getTokens(BETSParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BETSParser.SEMI, i);
		}
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
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterCaseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitCaseBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitCaseBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBodyContext caseBody() throws RecognitionException {
		CaseBodyContext _localctx = new CaseBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caseBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(CASE);
			setState(278);
			match(NUM);
			setState(279);
			match(COL);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << THIS) | (1L << RETURN) | (1L << SEMI) | (1L << ID))) != 0)) {
				{
				{
				setState(280);
				statement();
				setState(281);
				match(SEMI);
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(BREAK);
			setState(289);
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
		public TerminalNode DEFAULT() { return getToken(BETSParser.DEFAULT, 0); }
		public TerminalNode COL() { return getToken(BETSParser.COL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BETSParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BETSParser.SEMI, i);
		}
		public DefaultBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterDefaultBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitDefaultBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitDefaultBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultBodyContext defaultBody() throws RecognitionException {
		DefaultBodyContext _localctx = new DefaultBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_defaultBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(DEFAULT);
			setState(292);
			match(COL);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << THIS) | (1L << RETURN) | (1L << SEMI) | (1L << ID))) != 0)) {
				{
				{
				setState(293);
				statement();
				setState(294);
				match(SEMI);
				}
				}
				setState(300);
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

	public static class ForIterationContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BETSParser.FOR, 0); }
		public TerminalNode LP() { return getToken(BETSParser.LP, 0); }
		public List<TerminalNode> SEMI() { return getTokens(BETSParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BETSParser.SEMI, i);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(BETSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BETSParser.ID, i);
		}
		public List<TerminalNode> INORDECREMENT() { return getTokens(BETSParser.INORDECREMENT); }
		public TerminalNode INORDECREMENT(int i) {
			return getToken(BETSParser.INORDECREMENT, i);
		}
		public TerminalNode RP() { return getToken(BETSParser.RP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BETSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BETSParser.COMMA, i);
		}
		public ForIterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterForIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitForIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitForIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIterationContext forIteration() throws RecognitionException {
		ForIterationContext _localctx = new ForIterationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forIteration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(FOR);
			setState(302);
			match(LP);
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(303);
				declaration();
				}
				break;
			case ID:
				{
				setState(304);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(307);
				match(COMMA);
				setState(310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(308);
					declaration();
					}
					break;
				case ID:
					{
					setState(309);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(SEMI);
			setState(318);
			logicalExpression();
			setState(319);
			match(SEMI);
			setState(320);
			match(ID);
			setState(321);
			match(INORDECREMENT);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(322);
				match(COMMA);
				{
				setState(323);
				match(ID);
				setState(324);
				match(INORDECREMENT);
				}
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			match(RP);
			setState(331);
			body();
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
		public TerminalNode WHILE() { return getToken(BETSParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(BETSParser.LP, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(BETSParser.RP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileIterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileIteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).enterWhileIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BETSListener ) ((BETSListener)listener).exitWhileIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BETSVisitor ) return ((BETSVisitor<? extends T>)visitor).visitWhileIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileIterationContext whileIteration() throws RecognitionException {
		WhileIterationContext _localctx = new WhileIterationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileIteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(WHILE);
			setState(334);
			match(LP);
			setState(335);
			logicalExpression();
			setState(336);
			match(RP);
			setState(337);
			body();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0156\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n\4"+
		"\f\4\16\4T\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5w\n\5\3\6\3\6\3\6\3\6\3\6\5\6~\n\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3\13\3\13\5\13\u00a0"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a8\n\f\5\f\u00aa\n\f\3\r\3\r\3\r"+
		"\5\r\u00af\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b8\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d1\n\17\5\17\u00d3\n"+
		"\17\3\20\3\20\5\20\u00d7\n\20\3\20\3\20\3\20\3\20\3\20\7\20\u00de\n\20"+
		"\f\20\16\20\u00e1\13\20\3\20\5\20\u00e4\n\20\3\20\3\20\3\21\3\21\5\21"+
		"\u00ea\n\21\3\22\3\22\5\22\u00ee\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7"+
		"\23\u00f6\n\23\f\23\16\23\u00f9\13\23\3\23\5\23\u00fc\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u0103\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u010e\n\26\f\26\16\26\u0111\13\26\3\26\5\26\u0114\n\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u011e\n\27\f\27\16\27\u0121\13"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u012b\n\30\f\30\16\30"+
		"\u012e\13\30\3\31\3\31\3\31\3\31\5\31\u0134\n\31\3\31\3\31\3\31\5\31\u0139"+
		"\n\31\7\31\u013b\n\31\f\31\16\31\u013e\13\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u0148\n\31\f\31\16\31\u014b\13\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\2\b\3\2\3\4\4\2\17\17%%\3\2\n\13\5\2\6\6\17"+
		"\17%%\4\2\b\b\16\16\4\2\6\6%%\2\u016a\2:\3\2\2\2\4=\3\2\2\2\6J\3\2\2\2"+
		"\bv\3\2\2\2\n}\3\2\2\2\f\177\3\2\2\2\16\u0083\3\2\2\2\20\u0088\3\2\2\2"+
		"\22\u0090\3\2\2\2\24\u009a\3\2\2\2\26\u00a9\3\2\2\2\30\u00ae\3\2\2\2\32"+
		"\u00b7\3\2\2\2\34\u00d2\3\2\2\2\36\u00d6\3\2\2\2 \u00e9\3\2\2\2\"\u00ed"+
		"\3\2\2\2$\u00ef\3\2\2\2&\u00fd\3\2\2\2(\u0104\3\2\2\2*\u0107\3\2\2\2,"+
		"\u0117\3\2\2\2.\u0125\3\2\2\2\60\u012f\3\2\2\2\62\u014f\3\2\2\2\649\5"+
		"\b\5\2\659\5\n\6\2\669\5\16\b\2\679\5\20\t\28\64\3\2\2\28\65\3\2\2\28"+
		"\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\3\3\2\2\2<:\3\2"+
		"\2\2=E\7\36\2\2>?\5\26\f\2?@\7 \2\2@D\3\2\2\2AD\5 \21\2BD\5\"\22\2C>\3"+
		"\2\2\2CA\3\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3"+
		"\2\2\2HI\7\37\2\2I\5\3\2\2\2JR\7\36\2\2KL\5\30\r\2LM\7 \2\2MQ\3\2\2\2"+
		"NQ\5 \21\2OQ\5\"\22\2PK\3\2\2\2PN\3\2\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2"+
		"\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\37\2\2V\7\3\2\2\2WX\7\4\2\2XY\7%"+
		"\2\2YZ\7\n\2\2Z_\7\34\2\2[\\\7\6\2\2\\^\7#\2\2][\3\2\2\2^a\3\2\2\2_]\3"+
		"\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\6\2\2cd\7 \2\2de\7\6\2\2ef\7"+
		" \2\2fg\7\6\2\2gw\7\35\2\2hi\7\4\2\2ij\7%\2\2jk\7\n\2\2kw\5\f\7\2lm\7"+
		"\4\2\2mn\7%\2\2no\7\n\2\2op\7\34\2\2pq\7\7\2\2qr\7 \2\2rs\7\6\2\2st\7"+
		" \2\2tu\7\6\2\2uw\7\35\2\2vW\3\2\2\2vh\3\2\2\2vl\3\2\2\2w\t\3\2\2\2xy"+
		"\7%\2\2y~\5\4\3\2z{\7\20\2\2{|\7%\2\2|~\5\4\3\2}x\3\2\2\2}z\3\2\2\2~\13"+
		"\3\2\2\2\177\u0080\7%\2\2\u0080\u0081\7\"\2\2\u0081\u0082\7%\2\2\u0082"+
		"\r\3\2\2\2\u0083\u0084\7\20\2\2\u0084\u0085\7\36\2\2\u0085\u0086\5\n\6"+
		"\2\u0086\u0087\7\37\2\2\u0087\17\3\2\2\2\u0088\u0089\7\31\2\2\u0089\u008a"+
		"\7\3\2\2\u008a\u008b\7%\2\2\u008b\u008c\7\34\2\2\u008c\u008d\5\24\13\2"+
		"\u008d\u008e\7\35\2\2\u008e\u008f\5\6\4\2\u008f\21\3\2\2\2\u0090\u0091"+
		"\7\3\2\2\u0091\u0092\7%\2\2\u0092\u0093\7\n\2\2\u0093\u0094\5\32\16\2"+
		"\u0094\23\3\2\2\2\u0095\u0096\t\2\2\2\u0096\u0097\7%\2\2\u0097\u0099\7"+
		"#\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009f\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\t\2"+
		"\2\2\u009e\u00a0\7%\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\25\3\2\2\2\u00a1\u00aa\5\22\n\2\u00a2\u00a3\t\3\2\2\u00a3\u00a4\t\4\2"+
		"\2\u00a4\u00aa\5\32\16\2\u00a5\u00a6\7\30\2\2\u00a6\u00a8\5\32\16\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a1\3\2"+
		"\2\2\u00a9\u00a2\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\27\3\2\2\2\u00ab\u00af"+
		"\5\22\n\2\u00ac\u00ad\7\30\2\2\u00ad\u00af\5\32\16\2\u00ae\u00ab\3\2\2"+
		"\2\u00ae\u00ac\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b8\5\36\20\2\u00b1\u00b8"+
		"\7\6\2\2\u00b2\u00b8\7%\2\2\u00b3\u00b8\7\17\2\2\u00b4\u00b5\t\5\2\2\u00b5"+
		"\u00b6\t\6\2\2\u00b6\u00b8\5\32\16\2\u00b7\u00b0\3\2\2\2\u00b7\u00b1\3"+
		"\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8"+
		"\33\3\2\2\2\u00b9\u00d3\7%\2\2\u00ba\u00bb\7%\2\2\u00bb\u00bc\7\t\2\2"+
		"\u00bc\u00d3\t\7\2\2\u00bd\u00be\7\34\2\2\u00be\u00bf\5\34\17\2\u00bf"+
		"\u00c0\7\35\2\2\u00c0\u00d3\3\2\2\2\u00c1\u00c2\7\34\2\2\u00c2\u00c3\5"+
		"\34\17\2\u00c3\u00c4\7\35\2\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6\5\34\17"+
		"\2\u00c6\u00d3\3\2\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9\7\f\2\2\u00c9"+
		"\u00ca\5\34\17\2\u00ca\u00d3\3\2\2\2\u00cb\u00cc\5\32\16\2\u00cc\u00cd"+
		"\7\t\2\2\u00cd\u00d0\5\32\16\2\u00ce\u00cf\7\f\2\2\u00cf\u00d1\5\34\17"+
		"\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00b9"+
		"\3\2\2\2\u00d2\u00ba\3\2\2\2\u00d2\u00bd\3\2\2\2\u00d2\u00c1\3\2\2\2\u00d2"+
		"\u00c7\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d3\35\3\2\2\2\u00d4\u00d5\7%\2\2"+
		"\u00d5\u00d7\7\13\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d9\7%\2\2\u00d9\u00df\7\34\2\2\u00da\u00db\5\32\16\2"+
		"\u00db\u00dc\7#\2\2\u00dc\u00de\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00e1"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e4\5\32\16\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\35\2\2\u00e6\37\3\2\2\2\u00e7"+
		"\u00ea\5$\23\2\u00e8\u00ea\5*\26\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2"+
		"\2\2\u00ea!\3\2\2\2\u00eb\u00ee\5\60\31\2\u00ec\u00ee\5\62\32\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee#\3\2\2\2\u00ef\u00f0\7\21\2\2"+
		"\u00f0\u00f1\7\34\2\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\7\35\2\2\u00f3"+
		"\u00f7\5\4\3\2\u00f4\u00f6\5&\24\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fc\5(\25\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc%\3\2\2\2\u00fd\u00fe\7\22\2\2\u00fe\u00ff\7\34\2\2\u00ff\u0100"+
		"\5\34\17\2\u0100\u0102\7\35\2\2\u0101\u0103\5\4\3\2\u0102\u0101\3\2\2"+
		"\2\u0102\u0103\3\2\2\2\u0103\'\3\2\2\2\u0104\u0105\7\23\2\2\u0105\u0106"+
		"\5\4\3\2\u0106)\3\2\2\2\u0107\u0108\7\24\2\2\u0108\u0109\7\34\2\2\u0109"+
		"\u010a\5\32\16\2\u010a\u010b\7\35\2\2\u010b\u010f\7\36\2\2\u010c\u010e"+
		"\5,\27\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\5."+
		"\30\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\7\37\2\2\u0116+\3\2\2\2\u0117\u0118\7\26\2\2\u0118\u0119\7\6\2"+
		"\2\u0119\u011f\7!\2\2\u011a\u011b\5\26\f\2\u011b\u011c\7 \2\2\u011c\u011e"+
		"\3\2\2\2\u011d\u011a\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7\27"+
		"\2\2\u0123\u0124\7 \2\2\u0124-\3\2\2\2\u0125\u0126\7\25\2\2\u0126\u012c"+
		"\7!\2\2\u0127\u0128\5\26\f\2\u0128\u0129\7 \2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0127\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d/\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\32\2\2\u0130\u0133"+
		"\7\34\2\2\u0131\u0134\5\22\n\2\u0132\u0134\7%\2\2\u0133\u0131\3\2\2\2"+
		"\u0133\u0132\3\2\2\2\u0134\u013c\3\2\2\2\u0135\u0138\7#\2\2\u0136\u0139"+
		"\5\22\n\2\u0137\u0139\7%\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0135\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0140\7 \2\2\u0140\u0141\5\34\17\2\u0141\u0142\7 \2\2\u0142\u0143\7%"+
		"\2\2\u0143\u0149\7\r\2\2\u0144\u0145\7#\2\2\u0145\u0146\7%\2\2\u0146\u0148"+
		"\7\r\2\2\u0147\u0144\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7\35"+
		"\2\2\u014d\u014e\5\4\3\2\u014e\61\3\2\2\2\u014f\u0150\7\33\2\2\u0150\u0151"+
		"\7\34\2\2\u0151\u0152\5\34\17\2\u0152\u0153\7\35\2\2\u0153\u0154\5\4\3"+
		"\2\u0154\63\3\2\2\2#8:CEPR_v}\u009a\u009f\u00a7\u00a9\u00ae\u00b7\u00d0"+
		"\u00d2\u00d6\u00df\u00e3\u00e9\u00ed\u00f7\u00fb\u0102\u010f\u0113\u011f"+
		"\u012c\u0133\u0138\u013c\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}