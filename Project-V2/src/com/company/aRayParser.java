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
		RULE_global = 0, RULE_body = 1, RULE_matrixDeclaration = 2, RULE_matrixScope = 3, 
		RULE_awaitScope = 4, RULE_functionDeclaration = 5, RULE_declaration = 6, 
		RULE_parameter = 7, RULE_statement = 8, RULE_expression = 9, RULE_logicalExpression = 10, 
		RULE_invocation = 11, RULE_selection = 12, RULE_iteration = 13, RULE_ifStatement = 14, 
		RULE_elseIfStatement = 15, RULE_elseStatement = 16, RULE_switchStatement = 17, 
		RULE_caseBody = 18, RULE_defaultBody = 19, RULE_forIteration = 20, RULE_whileIteration = 21;
	public static final String[] ruleNames = {
		"global", "body", "matrixDeclaration", "matrixScope", "awaitScope", "functionDeclaration", 
		"declaration", "parameter", "statement", "expression", "logicalExpression", 
		"invocation", "selection", "iteration", "ifStatement", "elseIfStatement", 
		"elseStatement", "switchStatement", "caseBody", "defaultBody", "forIteration", 
		"whileIteration"
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
		public FunctionDeclarationContext functionDeclaration;
		public List<FunctionDeclarationContext> fdChild = new ArrayList<FunctionDeclarationContext>();
		public MatrixScopeContext matrixScope;
		public List<MatrixScopeContext> msChilds = new ArrayList<MatrixScopeContext>();
		public AwaitScopeContext awaitScope;
		public List<AwaitScopeContext> asChild = new ArrayList<AwaitScopeContext>();
		public MatrixDeclarationContext matrixDeclaration;
		public List<MatrixDeclarationContext> mdChilds = new ArrayList<MatrixDeclarationContext>();
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
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
		public List<MatrixDeclarationContext> matrixDeclaration() {
			return getRuleContexts(MatrixDeclarationContext.class);
		}
		public MatrixDeclarationContext matrixDeclaration(int i) {
			return getRuleContext(MatrixDeclarationContext.class,i);
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXTENDEDTYPE) | (1L << AWAIT) | (1L << FUNC) | (1L << ID))) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					((GlobalContext)_localctx).functionDeclaration = functionDeclaration();
					((GlobalContext)_localctx).fdChild.add(((GlobalContext)_localctx).functionDeclaration);
					}
					break;
				case 2:
					{
					setState(45);
					((GlobalContext)_localctx).matrixScope = matrixScope();
					((GlobalContext)_localctx).msChilds.add(((GlobalContext)_localctx).matrixScope);
					}
					break;
				case 3:
					{
					setState(46);
					((GlobalContext)_localctx).awaitScope = awaitScope();
					((GlobalContext)_localctx).asChild.add(((GlobalContext)_localctx).awaitScope);
					}
					break;
				case 4:
					{
					setState(47);
					((GlobalContext)_localctx).matrixDeclaration = matrixDeclaration();
					((GlobalContext)_localctx).mdChilds.add(((GlobalContext)_localctx).matrixDeclaration);
					}
					break;
				}
				}
				setState(52);
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
			setState(53);
			match(LC);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << EXTENDEDTYPE) | (1L << THIS) | (1L << AWAIT) | (1L << IF) | (1L << SWITCH) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(54);
					statement();
					setState(55);
					match(SEMI);
					}
					break;
				case 2:
					{
					setState(57);
					selection();
					}
					break;
				case 3:
					{
					setState(58);
					iteration();
					}
					break;
				case 4:
					{
					setState(59);
					matrixDeclaration();
					}
					break;
				case 5:
					{
					setState(60);
					matrixScope();
					}
					break;
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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
		public Token rows;
		public Token columns;
		public TerminalNode EXTENDEDTYPE() { return getToken(aRayParser.EXTENDEDTYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(aRayParser.ASSIGN, 0); }
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public List<TerminalNode> ID() { return getTokens(aRayParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aRayParser.ID, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(aRayParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(aRayParser.SEMI, i);
		}
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public List<TerminalNode> NUM() { return getTokens(aRayParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(aRayParser.NUM, i);
		}
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
		public Token columns;
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_matrixDeclaration);
		try {
			int _alt;
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new MatrixStandardDclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(EXTENDEDTYPE);
				setState(69);
				((MatrixStandardDclContext)_localctx).varName = match(ID);
				setState(70);
				match(ASSIGN);
				setState(71);
				match(LP);
				setState(74); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(72);
						((MatrixStandardDclContext)_localctx).NUM = match(NUM);
						((MatrixStandardDclContext)_localctx).numbers.add(((MatrixStandardDclContext)_localctx).NUM);
						setState(73);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(76); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(78);
				((MatrixStandardDclContext)_localctx).lastNumber = match(NUM);
				setState(79);
				match(SEMI);
				setState(80);
				((MatrixStandardDclContext)_localctx).rows = match(NUM);
				setState(81);
				match(SEMI);
				setState(82);
				((MatrixStandardDclContext)_localctx).columns = match(NUM);
				setState(83);
				match(RP);
				}
				break;
			case 2:
				_localctx = new MatrixDclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(EXTENDEDTYPE);
				setState(85);
				((MatrixDclContext)_localctx).varName = match(ID);
				setState(86);
				match(ASSIGN);
				setState(87);
				expression();
				}
				break;
			case 3:
				_localctx = new MatrixDclWithNameParaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(EXTENDEDTYPE);
				setState(89);
				((MatrixDclWithNameParaContext)_localctx).varName = match(ID);
				setState(90);
				match(ASSIGN);
				setState(91);
				match(LP);
				setState(92);
				match(ID);
				setState(93);
				match(SEMI);
				setState(94);
				((MatrixDclWithNameParaContext)_localctx).rows = match(NUM);
				setState(95);
				match(SEMI);
				setState(96);
				((MatrixDclWithNameParaContext)_localctx).columns = match(NUM);
				setState(97);
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
		enterRule(_localctx, 6, RULE_matrixScope);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				((MatrixScopeContext)_localctx).varName = match(ID);
				setState(101);
				body();
				}
				break;
			case AWAIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(AWAIT);
				setState(103);
				((MatrixScopeContext)_localctx).varName = match(ID);
				setState(104);
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
		public TerminalNode RC() { return getToken(aRayParser.RC, 0); }
		public List<MatrixScopeContext> matrixScope() {
			return getRuleContexts(MatrixScopeContext.class);
		}
		public MatrixScopeContext matrixScope(int i) {
			return getRuleContext(MatrixScopeContext.class,i);
		}
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
		enterRule(_localctx, 8, RULE_awaitScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(AWAIT);
			setState(108);
			match(LC);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				matrixScope();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AWAIT || _la==ID );
			setState(114);
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
		public BodyContext FuncBody;
		public TerminalNode FUNC() { return getToken(aRayParser.FUNC, 0); }
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			_localctx = new FunctionDclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(FUNC);
			setState(117);
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
			setState(118);
			((FunctionDclContext)_localctx).functionName = match(ID);
			setState(119);
			match(LP);
			setState(120);
			((FunctionDclContext)_localctx).parameters = parameter();
			setState(121);
			match(RP);
			setState(122);
			((FunctionDclContext)_localctx).FuncBody = body();
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
	public static class BoolDclContext extends DeclarationContext {
		public Token type;
		public Token leftId;
		public Token operator;
		public LogicalExpressionContext valueNode;
		public Token val;
		public TerminalNode TYPE() { return getToken(aRayParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(aRayParser.ASSIGN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(aRayParser.BOOL, 0); }
		public BoolDclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).enterBoolDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aRayListener ) ((aRayListener)listener).exitBoolDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aRayVisitor ) return ((aRayVisitor<? extends T>)visitor).visitBoolDcl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StandardDclContext extends DeclarationContext {
		public Token type;
		public Token leftId;
		public Token operator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(aRayParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(aRayParser.ASSIGN, 0); }
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
		enterRule(_localctx, 12, RULE_declaration);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new StandardDclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((StandardDclContext)_localctx).type = match(TYPE);
				setState(125);
				((StandardDclContext)_localctx).leftId = match(ID);
				setState(126);
				((StandardDclContext)_localctx).operator = match(ASSIGN);
				setState(127);
				expression();
				}
				break;
			case 2:
				_localctx = new BoolDclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				((BoolDclContext)_localctx).type = match(TYPE);
				setState(129);
				((BoolDclContext)_localctx).leftId = match(ID);
				setState(130);
				((BoolDclContext)_localctx).operator = match(ASSIGN);
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
				case THIS:
				case LP:
				case ID:
					{
					setState(131);
					((BoolDclContext)_localctx).valueNode = logicalExpression(0);
					}
					break;
				case BOOL:
					{
					setState(132);
					((BoolDclContext)_localctx).val = match(BOOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ParameterContext extends ParserRuleContext {
		public Token TYPE;
		public List<Token> paramTypes = new ArrayList<Token>();
		public Token EXTENDEDTYPE;
		public Token _tset291;
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
		enterRule(_localctx, 14, RULE_parameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					((ParameterContext)_localctx)._tset291 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TYPE || _la==EXTENDEDTYPE) ) {
						((ParameterContext)_localctx)._tset291 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ParameterContext)_localctx).paramTypes.add(((ParameterContext)_localctx)._tset291);
					setState(138);
					((ParameterContext)_localctx).ID = match(ID);
					((ParameterContext)_localctx).paramNamesInOrder.add(((ParameterContext)_localctx).ID);
					setState(139);
					match(COMMA);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE || _la==EXTENDEDTYPE) {
				{
				setState(145);
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
				setState(146);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new DclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				declaration();
				}
				break;
			case THIS:
			case ID:
				_localctx = new IDAssignExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
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
				setState(151);
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
				setState(152);
				((IDAssignExpContext)_localctx).rightExpr = expression();
				}
				break;
			case RETURN:
				_localctx = new ReturnExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(RETURN);
				setState(154);
				((ReturnExpContext)_localctx).expr = expression();
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
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ExpNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((ExpNumContext)_localctx).value = match(NUM);
				}
				break;
			case 2:
				_localctx = new ExpIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				((ExpIdContext)_localctx).varName = match(ID);
				}
				break;
			case 3:
				_localctx = new ExpThisContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(THIS);
				}
				break;
			case 4:
				_localctx = new ExpOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
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
				setState(161);
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
				setState(162);
				((ExpOperatorContext)_localctx).rightExpr = expression();
				}
				break;
			case 5:
				_localctx = new ExpParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(LP);
				setState(164);
				((ExpParenthesisContext)_localctx).expr = expression();
				setState(165);
				match(RP);
				}
				break;
			case 6:
				_localctx = new ExpDotProContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				((ExpDotProContext)_localctx).leftVar = match(ID);
				setState(168);
				match(DOT);
				setState(169);
				((ExpDotProContext)_localctx).rightVar = match(ID);
				}
				break;
			case 7:
				_localctx = new ExpInvocationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				invocation();
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_logicalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new LogOnlyExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(174);
				expression();
				}
				break;
			case 2:
				{
				_localctx = new LogExpParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(LP);
				setState(176);
				((LogExpParenthesisContext)_localctx).loexp = logicalExpression(0);
				setState(177);
				match(RP);
				}
				break;
			case 3:
				{
				_localctx = new LogExpExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				((LogExpExpContext)_localctx).leftexpr = expression();
				setState(180);
				((LogExpExpContext)_localctx).operator = match(LOGICALOPERATOR);
				setState(181);
				((LogExpExpContext)_localctx).rightLogicalexp = logicalExpression(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
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
					setState(185);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(186);
					((LogExpConditContext)_localctx).operator = match(CONDITIONALOPERATOR);
					setState(187);
					((LogExpConditContext)_localctx).rightLogicalexp = logicalExpression(2);
					}
					} 
				}
				setState(192);
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
		public Token functionId;
		public ExpressionContext expression;
		public List<ExpressionContext> parameters = new ArrayList<ExpressionContext>();
		public ExpressionContext lastOrSingleParameter;
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
		public TerminalNode ID() { return getToken(aRayParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(aRayParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(aRayParser.COMMA, i);
		}
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
		enterRule(_localctx, 22, RULE_invocation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((InvocationContext)_localctx).functionId = match(ID);
			setState(194);
			match(LP);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					((InvocationContext)_localctx).expression = expression();
					((InvocationContext)_localctx).parameters.add(((InvocationContext)_localctx).expression);
					setState(196);
					match(COMMA);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << THIS) | (1L << LP) | (1L << ID))) != 0)) {
				{
				setState(203);
				((InvocationContext)_localctx).lastOrSingleParameter = expression();
				}
			}

			setState(206);
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
		enterRule(_localctx, 24, RULE_selection);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				((SelectionContext)_localctx).ifstmt = ifStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
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
		enterRule(_localctx, 26, RULE_iteration);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				((IterationContext)_localctx).forite = forIteration();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
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
		enterRule(_localctx, 28, RULE_ifStatement);
		int _la;
		try {
			_localctx = new IfStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(IF);
			setState(217);
			match(LP);
			setState(218);
			((IfStmtContext)_localctx).exprToEvaluate = logicalExpression(0);
			setState(219);
			match(RP);
			setState(220);
			((IfStmtContext)_localctx).ifBody = body();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(221);
				((IfStmtContext)_localctx).elseIfStatement = elseIfStatement();
				((IfStmtContext)_localctx).elseIfs.add(((IfStmtContext)_localctx).elseIfStatement);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(227);
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
		enterRule(_localctx, 30, RULE_elseIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ELSEIF);
			setState(231);
			match(LP);
			setState(232);
			((ElseIfStatementContext)_localctx).expressionToEvaluate = logicalExpression(0);
			setState(233);
			match(RP);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LC) {
				{
				setState(234);
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
		enterRule(_localctx, 32, RULE_elseStatement);
		try {
			_localctx = new ElseStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ELSE);
			setState(238);
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
		enterRule(_localctx, 34, RULE_switchStatement);
		int _la;
		try {
			_localctx = new SwitchStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(SWITCH);
			setState(241);
			match(LP);
			setState(242);
			((SwitchStmtContext)_localctx).expToEvaluate = expression();
			setState(243);
			match(RP);
			setState(244);
			match(LC);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(245);
				((SwitchStmtContext)_localctx).caseBody = caseBody();
				((SwitchStmtContext)_localctx).cases.add(((SwitchStmtContext)_localctx).caseBody);
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			((SwitchStmtContext)_localctx).defaultBod = defaultBody();
			setState(252);
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
		public TerminalNode LP() { return getToken(aRayParser.LP, 0); }
		public TerminalNode RP() { return getToken(aRayParser.RP, 0); }
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
		enterRule(_localctx, 36, RULE_caseBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(CASE);
			setState(255);
			match(LP);
			setState(256);
			((CaseBodyContext)_localctx).number = match(NUM);
			setState(257);
			match(RP);
			setState(258);
			match(COL);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << THIS) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(259);
				((CaseBodyContext)_localctx).statement = statement();
				((CaseBodyContext)_localctx).stmts.add(((CaseBodyContext)_localctx).statement);
				setState(260);
				match(SEMI);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(BREAK);
			setState(268);
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
		enterRule(_localctx, 38, RULE_defaultBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(DEFAULT);
			setState(271);
			match(COL);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << THIS) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(272);
				((DefaultBodyContext)_localctx).statement = statement();
				((DefaultBodyContext)_localctx).stmts.add(((DefaultBodyContext)_localctx).statement);
				setState(273);
				match(SEMI);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
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
		enterRule(_localctx, 40, RULE_forIteration);
		int _la;
		try {
			_localctx = new ForIteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(FOR);
			setState(283);
			match(LP);
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(284);
				((ForIteContext)_localctx).dcl = declaration();
				}
				break;
			case ID:
				{
				setState(285);
				((ForIteContext)_localctx).varId = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(288);
				match(COMMA);
				setState(291);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(289);
					((ForIteContext)_localctx).declaration = declaration();
					((ForIteContext)_localctx).dcls.add(((ForIteContext)_localctx).declaration);
					}
					break;
				case ID:
					{
					setState(290);
					((ForIteContext)_localctx).ID = match(ID);
					((ForIteContext)_localctx).ids.add(((ForIteContext)_localctx).ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(SEMI);
			setState(299);
			((ForIteContext)_localctx).expToEval = logicalExpression(0);
			setState(300);
			match(SEMI);
			setState(301);
			((ForIteContext)_localctx).varToAlter = match(ID);
			setState(302);
			((ForIteContext)_localctx).inOrDecre = match(INORDECREMENT);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(303);
				match(COMMA);
				setState(304);
				((ForIteContext)_localctx).ID = match(ID);
				((ForIteContext)_localctx).idsToAlter.add(((ForIteContext)_localctx).ID);
				setState(305);
				((ForIteContext)_localctx).INORDECREMENT = match(INORDECREMENT);
				((ForIteContext)_localctx).howToAlterIds.add(((ForIteContext)_localctx).INORDECREMENT);
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(RP);
			setState(312);
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
		enterRule(_localctx, 42, RULE_whileIteration);
		try {
			_localctx = new WhileIteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(WHILE);
			setState(315);
			match(LP);
			setState(316);
			((WhileIteContext)_localctx).expToEval = logicalExpression(0);
			setState(317);
			match(RP);
			setState(318);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0143\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3"+
		"\16\3C\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4M\n\4\r\4\16\4N\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4e\n\4\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\6\6q\n\6\r\6\16\6"+
		"r\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u0088\n\b\5\b\u008a\n\b\3\t\3\t\3\t\7\t\u008f\n\t\f\t\16"+
		"\t\u0092\13\t\3\t\3\t\5\t\u0096\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00ae\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ba"+
		"\n\f\3\f\3\f\3\f\7\f\u00bf\n\f\f\f\16\f\u00c2\13\f\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u00c9\n\r\f\r\16\r\u00cc\13\r\3\r\5\r\u00cf\n\r\3\r\3\r\3\16\3\16"+
		"\5\16\u00d5\n\16\3\17\3\17\5\17\u00d9\n\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u00e1\n\20\f\20\16\20\u00e4\13\20\3\20\5\20\u00e7\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00ee\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00f9\n\23\f\23\16\23\u00fc\13\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0109\n\24\f\24\16\24\u010c\13"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0116\n\25\f\25\16\25"+
		"\u0119\13\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0121\n\26\3\26\3\26\3"+
		"\26\5\26\u0126\n\26\7\26\u0128\n\26\f\26\16\26\u012b\13\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\7\26\u0135\n\26\f\26\16\26\u0138\13\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\2\3\26\30\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,\2\7\3\2\3\4\4\2\17\17%%\3\2\n\13\5"+
		"\2\6\6\17\17%%\4\2\b\b\16\16\2\u0157\2\64\3\2\2\2\4\67\3\2\2\2\6d\3\2"+
		"\2\2\bk\3\2\2\2\nm\3\2\2\2\fv\3\2\2\2\16\u0089\3\2\2\2\20\u0090\3\2\2"+
		"\2\22\u009d\3\2\2\2\24\u00ad\3\2\2\2\26\u00b9\3\2\2\2\30\u00c3\3\2\2\2"+
		"\32\u00d4\3\2\2\2\34\u00d8\3\2\2\2\36\u00da\3\2\2\2 \u00e8\3\2\2\2\"\u00ef"+
		"\3\2\2\2$\u00f2\3\2\2\2&\u0100\3\2\2\2(\u0110\3\2\2\2*\u011c\3\2\2\2,"+
		"\u013c\3\2\2\2.\63\5\f\7\2/\63\5\b\5\2\60\63\5\n\6\2\61\63\5\6\4\2\62"+
		".\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\3\3\2\2\2\66\64\3\2\2\2\67A\7\36\2\289\5\22"+
		"\n\29:\7 \2\2:@\3\2\2\2;@\5\32\16\2<@\5\34\17\2=@\5\6\4\2>@\5\b\5\2?8"+
		"\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2A"+
		"B\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\37\2\2E\5\3\2\2\2FG\7\4\2\2GH\7%\2\2"+
		"HI\7\n\2\2IL\7\34\2\2JK\7\6\2\2KM\7#\2\2LJ\3\2\2\2MN\3\2\2\2NL\3\2\2\2"+
		"NO\3\2\2\2OP\3\2\2\2PQ\7\6\2\2QR\7 \2\2RS\7\6\2\2ST\7 \2\2TU\7\6\2\2U"+
		"e\7\35\2\2VW\7\4\2\2WX\7%\2\2XY\7\n\2\2Ye\5\24\13\2Z[\7\4\2\2[\\\7%\2"+
		"\2\\]\7\n\2\2]^\7\34\2\2^_\7%\2\2_`\7 \2\2`a\7\6\2\2ab\7 \2\2bc\7\6\2"+
		"\2ce\7\35\2\2dF\3\2\2\2dV\3\2\2\2dZ\3\2\2\2e\7\3\2\2\2fg\7%\2\2gl\5\4"+
		"\3\2hi\7\20\2\2ij\7%\2\2jl\5\4\3\2kf\3\2\2\2kh\3\2\2\2l\t\3\2\2\2mn\7"+
		"\20\2\2np\7\36\2\2oq\5\b\5\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s"+
		"t\3\2\2\2tu\7\37\2\2u\13\3\2\2\2vw\7\31\2\2wx\t\2\2\2xy\7%\2\2yz\7\34"+
		"\2\2z{\5\20\t\2{|\7\35\2\2|}\5\4\3\2}\r\3\2\2\2~\177\7\3\2\2\177\u0080"+
		"\7%\2\2\u0080\u0081\7\n\2\2\u0081\u008a\5\24\13\2\u0082\u0083\7\3\2\2"+
		"\u0083\u0084\7%\2\2\u0084\u0087\7\n\2\2\u0085\u0088\5\26\f\2\u0086\u0088"+
		"\7\5\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"~\3\2\2\2\u0089\u0082\3\2\2\2\u008a\17\3\2\2\2\u008b\u008c\t\2\2\2\u008c"+
		"\u008d\7%\2\2\u008d\u008f\7#\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0095\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0094\t\2\2\2\u0094\u0096\7%\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\21\3\2\2\2\u0097\u009e\5\16\b\2\u0098\u0099\t\3\2"+
		"\2\u0099\u009a\t\4\2\2\u009a\u009e\5\24\13\2\u009b\u009c\7\30\2\2\u009c"+
		"\u009e\5\24\13\2\u009d\u0097\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u009b\3"+
		"\2\2\2\u009e\23\3\2\2\2\u009f\u00ae\7\6\2\2\u00a0\u00ae\7%\2\2\u00a1\u00ae"+
		"\7\17\2\2\u00a2\u00a3\t\5\2\2\u00a3\u00a4\t\6\2\2\u00a4\u00ae\5\24\13"+
		"\2\u00a5\u00a6\7\34\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8\7\35\2\2\u00a8"+
		"\u00ae\3\2\2\2\u00a9\u00aa\7%\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ae\7%\2"+
		"\2\u00ac\u00ae\5\30\r\2\u00ad\u009f\3\2\2\2\u00ad\u00a0\3\2\2\2\u00ad"+
		"\u00a1\3\2\2\2\u00ad\u00a2\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a9\3\2"+
		"\2\2\u00ad\u00ac\3\2\2\2\u00ae\25\3\2\2\2\u00af\u00b0\b\f\1\2\u00b0\u00ba"+
		"\5\24\13\2\u00b1\u00b2\7\34\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4\7\35"+
		"\2\2\u00b4\u00ba\3\2\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\7\t\2\2\u00b7"+
		"\u00b8\5\26\f\4\u00b8\u00ba\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b1\3"+
		"\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\u00c0\3\2\2\2\u00bb\u00bc\f\3\2\2\u00bc"+
		"\u00bd\7\f\2\2\u00bd\u00bf\5\26\f\4\u00be\u00bb\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\27\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\7%\2\2\u00c4\u00ca\7\34\2\2\u00c5\u00c6\5\24"+
		"\13\2\u00c6\u00c7\7#\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\5\24\13\2\u00ce\u00cd\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\35\2\2\u00d1\31\3\2\2"+
		"\2\u00d2\u00d5\5\36\20\2\u00d3\u00d5\5$\23\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00d9\5*\26\2\u00d7\u00d9\5,\27"+
		"\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00db"+
		"\7\21\2\2\u00db\u00dc\7\34\2\2\u00dc\u00dd\5\26\f\2\u00dd\u00de\7\35\2"+
		"\2\u00de\u00e2\5\4\3\2\u00df\u00e1\5 \21\2\u00e0\u00df\3\2\2\2\u00e1\u00e4"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e7\5\"\22\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3"+
		"\2\2\2\u00e7\37\3\2\2\2\u00e8\u00e9\7\22\2\2\u00e9\u00ea\7\34\2\2\u00ea"+
		"\u00eb\5\26\f\2\u00eb\u00ed\7\35\2\2\u00ec\u00ee\5\4\3\2\u00ed\u00ec\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee!\3\2\2\2\u00ef\u00f0\7\23\2\2\u00f0\u00f1"+
		"\5\4\3\2\u00f1#\3\2\2\2\u00f2\u00f3\7\24\2\2\u00f3\u00f4\7\34\2\2\u00f4"+
		"\u00f5\5\24\13\2\u00f5\u00f6\7\35\2\2\u00f6\u00fa\7\36\2\2\u00f7\u00f9"+
		"\5&\24\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5("+
		"\25\2\u00fe\u00ff\7\37\2\2\u00ff%\3\2\2\2\u0100\u0101\7\26\2\2\u0101\u0102"+
		"\7\34\2\2\u0102\u0103\7\6\2\2\u0103\u0104\7\35\2\2\u0104\u010a\7!\2\2"+
		"\u0105\u0106\5\22\n\2\u0106\u0107\7 \2\2\u0107\u0109\3\2\2\2\u0108\u0105"+
		"\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\27\2\2\u010e\u010f\7"+
		" \2\2\u010f\'\3\2\2\2\u0110\u0111\7\25\2\2\u0111\u0117\7!\2\2\u0112\u0113"+
		"\5\22\n\2\u0113\u0114\7 \2\2\u0114\u0116\3\2\2\2\u0115\u0112\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7\27\2\2\u011b)\3\2\2\2\u011c\u011d"+
		"\7\32\2\2\u011d\u0120\7\34\2\2\u011e\u0121\5\16\b\2\u011f\u0121\7%\2\2"+
		"\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0129\3\2\2\2\u0122\u0125"+
		"\7#\2\2\u0123\u0126\5\16\b\2\u0124\u0126\7%\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0124\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0122\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\7 \2\2\u012d\u012e\5\26\f\2\u012e\u012f\7 "+
		"\2\2\u012f\u0130\7%\2\2\u0130\u0136\7\r\2\2\u0131\u0132\7#\2\2\u0132\u0133"+
		"\7%\2\2\u0133\u0135\7\r\2\2\u0134\u0131\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0139\u013a\7\35\2\2\u013a\u013b\5\4\3\2\u013b+\3\2\2\2\u013c\u013d"+
		"\7\33\2\2\u013d\u013e\7\34\2\2\u013e\u013f\5\26\f\2\u013f\u0140\7\35\2"+
		"\2\u0140\u0141\5\4\3\2\u0141-\3\2\2\2 \62\64?ANdkr\u0087\u0089\u0090\u0095"+
		"\u009d\u00ad\u00b9\u00c0\u00ca\u00ce\u00d4\u00d8\u00e2\u00e6\u00ed\u00fa"+
		"\u010a\u0117\u0120\u0125\u0129\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}