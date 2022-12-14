// Generated from /home/tomas/FACULTAD/TC/tpf/src/main/java/tpf/tpf.g4 by ANTLR 4.9.2

    package tpf;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tpfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LA=3, LC=4, PA=5, PC=6, CA=7, CC=8, COMA=9, PYCOMA=10, 
		SUMA=11, RESTA=12, MULT=13, DIV=14, MOD=15, AND=16, OR=17, IF=18, CMP=19, 
		VCHAR=20, FOR=21, INT=22, CHAR=23, ELSE=24, DOUBLE=25, WHILE=26, VOID=27, 
		STRING=28, RETURN=29, ENTERO=30, DOBLE=31, ID=32, VSTRING=33, BCOMENTARIO=34, 
		COMENTARIO=35, PRAGMA=36, WS=37, OTRO=38;
	public static final int
		RULE_si = 0, RULE_ieof = 1, RULE_opciones = 2, RULE_funcion = 3, RULE_dec_func = 4, 
		RULE_parametros = 5, RULE_parametro = 6, RULE_tipo = 7, RULE_t_simple = 8, 
		RULE_puntero = 9, RULE_p_lista = 10, RULE_def_func = 11, RULE_params = 12, 
		RULE_defp_lista = 13, RULE_bloque = 14, RULE_instrucciones = 15, RULE_instruccion = 16, 
		RULE_inst_simple = 17, RULE_declaraciones = 18, RULE_declaracion = 19, 
		RULE_d_lista = 20, RULE_asignacion = 21, RULE_opal = 22, RULE_negacion = 23, 
		RULE_logic = 24, RULE_relacional = 25, RULE_rel = 26, RULE_opar = 27, 
		RULE_term = 28, RULE_menos = 29, RULE_mult = 30, RULE_ovalor = 31, RULE_valor = 32, 
		RULE_numero = 33, RULE_llam_func = 34, RULE_argumentos = 35, RULE_argumento = 36, 
		RULE_a_lista = 37, RULE_operacion = 38, RULE_ireturn = 39, RULE_est_control = 40, 
		RULE_iwhile = 41, RULE_acciones = 42, RULE_iif = 43, RULE_ielse = 44, 
		RULE_ifor = 45, RULE_comienzos_f = 46, RULE_opcion = 47, RULE_cf_lista = 48, 
		RULE_fin_f = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"si", "ieof", "opciones", "funcion", "dec_func", "parametros", "parametro", 
			"tipo", "t_simple", "puntero", "p_lista", "def_func", "params", "defp_lista", 
			"bloque", "instrucciones", "instruccion", "inst_simple", "declaraciones", 
			"declaracion", "d_lista", "asignacion", "opal", "negacion", "logic", 
			"relacional", "rel", "opar", "term", "menos", "mult", "ovalor", "valor", 
			"numero", "llam_func", "argumentos", "argumento", "a_lista", "operacion", 
			"ireturn", "est_control", "iwhile", "acciones", "iif", "ielse", "ifor", 
			"comienzos_f", "opcion", "cf_lista", "fin_f"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'!'", "'{'", "'}'", "'('", "')'", "'['", "']'", "','", 
			"';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'if'", null, 
			null, "'for'", "'int'", "'char'", "'else'", "'double'", "'while'", "'void'", 
			"'string'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "LA", "LC", "PA", "PC", "CA", "CC", "COMA", "PYCOMA", 
			"SUMA", "RESTA", "MULT", "DIV", "MOD", "AND", "OR", "IF", "CMP", "VCHAR", 
			"FOR", "INT", "CHAR", "ELSE", "DOUBLE", "WHILE", "VOID", "STRING", "RETURN", 
			"ENTERO", "DOBLE", "ID", "VSTRING", "BCOMENTARIO", "COMENTARIO", "PRAGMA", 
			"WS", "OTRO"
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

	@Override
	public String getGrammarFileName() { return "tpf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tpfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SiContext extends ParserRuleContext {
		public OpcionesContext opciones() {
			return getRuleContext(OpcionesContext.class,0);
		}
		public IeofContext ieof() {
			return getRuleContext(IeofContext.class,0);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			opciones();
			setState(101);
			ieof();
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

	public static class IeofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(tpfParser.EOF, 0); }
		public IeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ieof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterIeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitIeof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitIeof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IeofContext ieof() throws RecognitionException {
		IeofContext _localctx = new IeofContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ieof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(EOF);
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

	public static class OpcionesContext extends ParserRuleContext {
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public OpcionesContext opciones() {
			return getRuleContext(OpcionesContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode PYCOMA() { return getToken(tpfParser.PYCOMA, 0); }
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public OpcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterOpciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitOpciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitOpciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcionesContext opciones() throws RecognitionException {
		OpcionesContext _localctx = new OpcionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opciones);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				funcion();
				setState(106);
				opciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				asignacion();
				setState(109);
				match(PYCOMA);
				setState(110);
				opciones();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				declaraciones();
				setState(113);
				match(PYCOMA);
				setState(114);
				opciones();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class FuncionContext extends ParserRuleContext {
		public Dec_funcContext dec_func() {
			return getRuleContext(Dec_funcContext.class,0);
		}
		public TerminalNode PYCOMA() { return getToken(tpfParser.PYCOMA, 0); }
		public Def_funcContext def_func() {
			return getRuleContext(Def_funcContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcion);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				dec_func();
				setState(120);
				match(PYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				def_func();
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

	public static class Dec_funcContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(tpfParser.ID, 0); }
		public TerminalNode PA() { return getToken(tpfParser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(tpfParser.PC, 0); }
		public Dec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterDec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitDec_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitDec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_funcContext dec_func() throws RecognitionException {
		Dec_funcContext _localctx = new Dec_funcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dec_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			tipo();
			setState(126);
			match(ID);
			setState(127);
			match(PA);
			setState(128);
			parametros();
			setState(129);
			match(PC);
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

	public static class ParametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public P_listaContext p_lista() {
			return getRuleContext(P_listaContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			parametro();
			setState(132);
			p_lista();
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

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(tpfParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametro);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				tipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				tipo();
				setState(136);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TipoContext extends ParserRuleContext {
		public T_simpleContext t_simple() {
			return getRuleContext(T_simpleContext.class,0);
		}
		public PunteroContext puntero() {
			return getRuleContext(PunteroContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				t_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				puntero();
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

	public static class T_simpleContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(tpfParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(tpfParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(tpfParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(tpfParser.VOID, 0); }
		public T_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterT_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitT_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitT_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_simpleContext t_simple() throws RecognitionException {
		T_simpleContext _localctx = new T_simpleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_t_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << DOUBLE) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PunteroContext extends ParserRuleContext {
		public T_simpleContext t_simple() {
			return getRuleContext(T_simpleContext.class,0);
		}
		public TerminalNode MULT() { return getToken(tpfParser.MULT, 0); }
		public TerminalNode CA() { return getToken(tpfParser.CA, 0); }
		public TerminalNode CC() { return getToken(tpfParser.CC, 0); }
		public PunteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterPuntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitPuntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitPuntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PunteroContext puntero() throws RecognitionException {
		PunteroContext _localctx = new PunteroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_puntero);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				t_simple();
				setState(148);
				match(MULT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				t_simple();
				setState(151);
				match(CA);
				setState(152);
				match(CC);
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

	public static class P_listaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(tpfParser.COMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public P_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterP_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitP_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitP_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_listaContext p_lista() throws RecognitionException {
		P_listaContext _localctx = new P_listaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_p_lista);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(COMA);
				setState(157);
				parametros();
				}
				break;
			case PC:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Def_funcContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(tpfParser.ID, 0); }
		public TerminalNode PA() { return getToken(tpfParser.PA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode PC() { return getToken(tpfParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Def_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterDef_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitDef_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitDef_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_funcContext def_func() throws RecognitionException {
		Def_funcContext _localctx = new Def_funcContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_def_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			tipo();
			setState(162);
			match(ID);
			setState(163);
			match(PA);
			setState(164);
			params();
			setState(165);
			match(PC);
			setState(166);
			bloque();
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

	public static class ParamsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(tpfParser.ID, 0); }
		public Defp_listaContext defp_lista() {
			return getRuleContext(Defp_listaContext.class,0);
		}
		public TerminalNode VOID() { return getToken(tpfParser.VOID, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_params);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				tipo();
				setState(169);
				match(ID);
				setState(170);
				defp_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(VOID);
				setState(173);
				defp_lista();
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

	public static class Defp_listaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(tpfParser.COMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Defp_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defp_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterDefp_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitDefp_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitDefp_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defp_listaContext defp_lista() throws RecognitionException {
		Defp_listaContext _localctx = new Defp_listaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defp_lista);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(COMA);
				setState(177);
				params();
				}
				break;
			case PC:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(tpfParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(tpfParser.LC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LA);
			setState(182);
			instrucciones();
			setState(183);
			match(LC);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instrucciones);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case PA:
			case RESTA:
			case IF:
			case VCHAR:
			case FOR:
			case INT:
			case CHAR:
			case DOUBLE:
			case WHILE:
			case VOID:
			case RETURN:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				instruccion();
				setState(186);
				instrucciones();
				}
				break;
			case LC:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InstruccionContext extends ParserRuleContext {
		public Inst_simpleContext inst_simple() {
			return getRuleContext(Inst_simpleContext.class,0);
		}
		public TerminalNode PYCOMA() { return getToken(tpfParser.PYCOMA, 0); }
		public Est_controlContext est_control() {
			return getRuleContext(Est_controlContext.class,0);
		}
		public IreturnContext ireturn() {
			return getRuleContext(IreturnContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_instruccion);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case PA:
			case RESTA:
			case VCHAR:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				inst_simple();
				setState(192);
				match(PYCOMA);
				}
				break;
			case IF:
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				est_control();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				ireturn();
				setState(196);
				match(PYCOMA);
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

	public static class Inst_simpleContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public Dec_funcContext dec_func() {
			return getRuleContext(Dec_funcContext.class,0);
		}
		public Inst_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterInst_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitInst_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitInst_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_simpleContext inst_simple() throws RecognitionException {
		Inst_simpleContext _localctx = new Inst_simpleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inst_simple);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				declaraciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				opal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				dec_func();
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public D_listaContext d_lista() {
			return getRuleContext(D_listaContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaraciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			tipo();
			setState(207);
			declaracion();
			setState(208);
			d_lista();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tpfParser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaracion);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				asignacion();
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

	public static class D_listaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(tpfParser.COMA, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public D_listaContext d_lista() {
			return getRuleContext(D_listaContext.class,0);
		}
		public D_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterD_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitD_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitD_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final D_listaContext d_lista() throws RecognitionException {
		D_listaContext _localctx = new D_listaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_d_lista);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(COMA);
				setState(215);
				declaracion();
				setState(216);
				d_lista();
				}
				break;
			case PYCOMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tpfParser.ID, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ID);
			setState(222);
			match(T__0);
			setState(223);
			opal();
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

	public static class OpalContext extends ParserRuleContext {
		public NegacionContext negacion() {
			return getRuleContext(NegacionContext.class,0);
		}
		public RelacionalContext relacional() {
			return getRuleContext(RelacionalContext.class,0);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public OpalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterOpal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitOpal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitOpal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			negacion();
			setState(226);
			relacional();
			setState(227);
			logic();
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

	public static class NegacionContext extends ParserRuleContext {
		public NegacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterNegacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitNegacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitNegacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegacionContext negacion() throws RecognitionException {
		NegacionContext _localctx = new NegacionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_negacion);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(T__1);
				}
				break;
			case PA:
			case RESTA:
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LogicContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(tpfParser.AND, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode OR() { return getToken(tpfParser.OR, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logic);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(AND);
				setState(234);
				opal();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(OR);
				setState(236);
				opal();
				}
				break;
			case PC:
			case COMA:
			case PYCOMA:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class RelacionalContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(tpfParser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(tpfParser.PC, 0); }
		public OparContext opar() {
			return getRuleContext(OparContext.class,0);
		}
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public RelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relacional);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(PA);
				setState(241);
				opal();
				setState(242);
				match(PC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				opar();
				setState(245);
				rel();
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

	public static class RelContext extends ParserRuleContext {
		public TerminalNode CMP() { return getToken(tpfParser.CMP, 0); }
		public OparContext opar() {
			return getRuleContext(OparContext.class,0);
		}
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_rel);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(CMP);
				setState(250);
				opar();
				}
				break;
			case PC:
			case COMA:
			case PYCOMA:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OparContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public OparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterOpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitOpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitOpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OparContext opar() throws RecognitionException {
		OparContext _localctx = new OparContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_opar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			term();
			setState(255);
			operacion();
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

	public static class TermContext extends ParserRuleContext {
		public MenosContext menos() {
			return getRuleContext(MenosContext.class,0);
		}
		public OvalorContext ovalor() {
			return getRuleContext(OvalorContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			menos();
			setState(258);
			ovalor();
			setState(259);
			mult();
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

	public static class MenosContext extends ParserRuleContext {
		public TerminalNode RESTA() { return getToken(tpfParser.RESTA, 0); }
		public MenosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterMenos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitMenos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitMenos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenosContext menos() throws RecognitionException {
		MenosContext _localctx = new MenosContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_menos);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESTA:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(RESTA);
				}
				break;
			case PA:
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MultContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(tpfParser.MULT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(tpfParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(tpfParser.MOD, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mult);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(MULT);
				setState(266);
				term();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(DIV);
				setState(268);
				term();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(MOD);
				setState(270);
				term();
				}
				break;
			case PC:
			case COMA:
			case PYCOMA:
			case SUMA:
			case RESTA:
			case AND:
			case OR:
			case CMP:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class OvalorContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PA() { return getToken(tpfParser.PA, 0); }
		public OparContext opar() {
			return getRuleContext(OparContext.class,0);
		}
		public TerminalNode PC() { return getToken(tpfParser.PC, 0); }
		public OvalorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ovalor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterOvalor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitOvalor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitOvalor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OvalorContext ovalor() throws RecognitionException {
		OvalorContext _localctx = new OvalorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ovalor);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				valor();
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(PA);
				setState(276);
				opar();
				setState(277);
				match(PC);
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

	public static class ValorContext extends ParserRuleContext {
		public Llam_funcContext llam_func() {
			return getRuleContext(Llam_funcContext.class,0);
		}
		public TerminalNode ID() { return getToken(tpfParser.ID, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode VCHAR() { return getToken(tpfParser.VCHAR, 0); }
		public TerminalNode VSTRING() { return getToken(tpfParser.VSTRING, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_valor);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				llam_func();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				numero();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(VCHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				match(VSTRING);
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(tpfParser.ENTERO, 0); }
		public TerminalNode DOBLE() { return getToken(tpfParser.DOBLE, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==DOBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Llam_funcContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tpfParser.ID, 0); }
		public TerminalNode PA() { return getToken(tpfParser.PA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PC() { return getToken(tpfParser.PC, 0); }
		public Llam_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llam_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterLlam_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitLlam_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitLlam_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llam_funcContext llam_func() throws RecognitionException {
		Llam_funcContext _localctx = new Llam_funcContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_llam_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(ID);
			setState(291);
			match(PA);
			setState(292);
			argumentos();
			setState(293);
			match(PC);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public A_listaContext a_lista() {
			return getRuleContext(A_listaContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_argumentos);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case PA:
			case RESTA:
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				argumento();
				setState(296);
				a_lista();
				}
				break;
			case PC:
			case PYCOMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitArgumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_argumento);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				opal();
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

	public static class A_listaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(tpfParser.COMA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public A_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterA_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitA_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitA_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_listaContext a_lista() throws RecognitionException {
		A_listaContext _localctx = new A_listaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_a_lista);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(COMA);
				setState(306);
				argumentos();
				}
				break;
			case PC:
			case PYCOMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OperacionContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(tpfParser.SUMA, 0); }
		public OparContext opar() {
			return getRuleContext(OparContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(tpfParser.RESTA, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_operacion);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(SUMA);
				setState(311);
				opar();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(RESTA);
				setState(313);
				opar();
				}
				break;
			case PC:
			case COMA:
			case PYCOMA:
			case AND:
			case OR:
			case CMP:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class IreturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(tpfParser.RETURN, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public IreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ireturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterIreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitIreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitIreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IreturnContext ireturn() throws RecognitionException {
		IreturnContext _localctx = new IreturnContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ireturn);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(RETURN);
				setState(318);
				opal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(RETURN);
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

	public static class Est_controlContext extends ParserRuleContext {
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public IforContext ifor() {
			return getRuleContext(IforContext.class,0);
		}
		public Est_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_est_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterEst_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitEst_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitEst_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Est_controlContext est_control() throws RecognitionException {
		Est_controlContext _localctx = new Est_controlContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_est_control);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				iwhile();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				iif();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				ifor();
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(tpfParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(tpfParser.PA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PC() { return getToken(tpfParser.PC, 0); }
		public AccionesContext acciones() {
			return getRuleContext(AccionesContext.class,0);
		}
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterIwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitIwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitIwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(WHILE);
			setState(328);
			match(PA);
			setState(329);
			argumentos();
			setState(330);
			match(PC);
			setState(331);
			acciones();
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

	public static class AccionesContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode PYCOMA() { return getToken(tpfParser.PYCOMA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public AccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterAcciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitAcciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitAcciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccionesContext acciones() throws RecognitionException {
		AccionesContext _localctx = new AccionesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_acciones);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				asignacion();
				setState(334);
				match(PYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				opal();
				setState(337);
				match(PYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				bloque();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class IifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(tpfParser.IF, 0); }
		public TerminalNode PA() { return getToken(tpfParser.PA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PC() { return getToken(tpfParser.PC, 0); }
		public AccionesContext acciones() {
			return getRuleContext(AccionesContext.class,0);
		}
		public IelseContext ielse() {
			return getRuleContext(IelseContext.class,0);
		}
		public IifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterIif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitIif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitIif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IifContext iif() throws RecognitionException {
		IifContext _localctx = new IifContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(IF);
			setState(344);
			match(PA);
			setState(345);
			argumentos();
			setState(346);
			match(PC);
			setState(347);
			acciones();
			setState(348);
			ielse();
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

	public static class IelseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(tpfParser.ELSE, 0); }
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public AccionesContext acciones() {
			return getRuleContext(AccionesContext.class,0);
		}
		public IelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ielse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterIelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitIelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitIelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IelseContext ielse() throws RecognitionException {
		IelseContext _localctx = new IelseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ielse);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(ELSE);
				setState(351);
				iif();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(ELSE);
				setState(353);
				acciones();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class IforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(tpfParser.FOR, 0); }
		public TerminalNode PA() { return getToken(tpfParser.PA, 0); }
		public Comienzos_fContext comienzos_f() {
			return getRuleContext(Comienzos_fContext.class,0);
		}
		public List<TerminalNode> PYCOMA() { return getTokens(tpfParser.PYCOMA); }
		public TerminalNode PYCOMA(int i) {
			return getToken(tpfParser.PYCOMA, i);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Fin_fContext fin_f() {
			return getRuleContext(Fin_fContext.class,0);
		}
		public TerminalNode PC() { return getToken(tpfParser.PC, 0); }
		public AccionesContext acciones() {
			return getRuleContext(AccionesContext.class,0);
		}
		public IforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterIfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitIfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitIfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IforContext ifor() throws RecognitionException {
		IforContext _localctx = new IforContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(FOR);
			setState(358);
			match(PA);
			setState(359);
			comienzos_f();
			setState(360);
			match(PYCOMA);
			setState(361);
			argumentos();
			setState(362);
			match(PYCOMA);
			setState(363);
			fin_f();
			setState(364);
			match(PC);
			setState(365);
			acciones();
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

	public static class Comienzos_fContext extends ParserRuleContext {
		public OpcionContext opcion() {
			return getRuleContext(OpcionContext.class,0);
		}
		public Cf_listaContext cf_lista() {
			return getRuleContext(Cf_listaContext.class,0);
		}
		public Comienzos_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comienzos_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterComienzos_f(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitComienzos_f(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitComienzos_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comienzos_fContext comienzos_f() throws RecognitionException {
		Comienzos_fContext _localctx = new Comienzos_fContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_comienzos_f);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case PA:
			case RESTA:
			case VCHAR:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				opcion();
				setState(368);
				cf_lista();
				}
				break;
			case PYCOMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OpcionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public OpcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterOpcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitOpcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitOpcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcionContext opcion() throws RecognitionException {
		OpcionContext _localctx = new OpcionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_opcion);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				tipo();
				setState(374);
				declaracion();
				}
				break;
			case T__1:
			case PA:
			case RESTA:
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				argumento();
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

	public static class Cf_listaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(tpfParser.COMA, 0); }
		public OpcionContext opcion() {
			return getRuleContext(OpcionContext.class,0);
		}
		public Cf_listaContext cf_lista() {
			return getRuleContext(Cf_listaContext.class,0);
		}
		public Cf_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cf_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterCf_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitCf_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitCf_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cf_listaContext cf_lista() throws RecognitionException {
		Cf_listaContext _localctx = new Cf_listaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_cf_lista);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(COMA);
				setState(380);
				opcion();
				setState(381);
				cf_lista();
				}
				break;
			case PYCOMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Fin_fContext extends ParserRuleContext {
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Fin_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).enterFin_f(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpfListener ) ((tpfListener)listener).exitFin_f(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpfVisitor ) return ((tpfVisitor<? extends T>)visitor).visitFin_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fin_fContext fin_f() throws RecognitionException {
		Fin_fContext _localctx = new Fin_fContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fin_f);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			argumentos();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0187\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4x\n\4"+
		"\3\5\3\5\3\5\3\5\5\5~\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u008e\n\b\3\t\3\t\5\t\u0092\n\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u009d\n\13\3\f\3\f\3\f\5\f\u00a2\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b1\n\16\3\17"+
		"\3\17\3\17\5\17\u00b6\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21"+
		"\u00c0\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c9\n\22\3\23\3"+
		"\23\3\23\3\23\5\23\u00cf\n\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00d7"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u00de\n\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\5\31\u00ea\n\31\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u00f1\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00fa\n\33\3\34\3"+
		"\34\3\34\5\34\u00ff\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\5\37\u010a\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u0113\n \3!\3!\3!\3!\3!\5!\u011a"+
		"\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0121\n\"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\5%\u012e\n%\3&\3&\5&\u0132\n&\3\'\3\'\3\'\5\'\u0137\n\'\3(\3(\3(\3("+
		"\3(\5(\u013e\n(\3)\3)\3)\5)\u0143\n)\3*\3*\3*\5*\u0148\n*\3+\3+\3+\3+"+
		"\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0158\n,\3-\3-\3-\3-\3-\3-\3-\3.\3."+
		"\3.\3.\3.\5.\u0166\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\5\60\u0176\n\60\3\61\3\61\3\61\3\61\5\61\u017c\n\61\3\62\3\62\3\62\3"+
		"\62\3\62\5\62\u0183\n\62\3\63\3\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\4\5\2\30"+
		"\31\33\33\35\35\3\2 !\2\u0185\2f\3\2\2\2\4i\3\2\2\2\6w\3\2\2\2\b}\3\2"+
		"\2\2\n\177\3\2\2\2\f\u0085\3\2\2\2\16\u008d\3\2\2\2\20\u0091\3\2\2\2\22"+
		"\u0093\3\2\2\2\24\u009c\3\2\2\2\26\u00a1\3\2\2\2\30\u00a3\3\2\2\2\32\u00b0"+
		"\3\2\2\2\34\u00b5\3\2\2\2\36\u00b7\3\2\2\2 \u00bf\3\2\2\2\"\u00c8\3\2"+
		"\2\2$\u00ce\3\2\2\2&\u00d0\3\2\2\2(\u00d6\3\2\2\2*\u00dd\3\2\2\2,\u00df"+
		"\3\2\2\2.\u00e3\3\2\2\2\60\u00e9\3\2\2\2\62\u00f0\3\2\2\2\64\u00f9\3\2"+
		"\2\2\66\u00fe\3\2\2\28\u0100\3\2\2\2:\u0103\3\2\2\2<\u0109\3\2\2\2>\u0112"+
		"\3\2\2\2@\u0119\3\2\2\2B\u0120\3\2\2\2D\u0122\3\2\2\2F\u0124\3\2\2\2H"+
		"\u012d\3\2\2\2J\u0131\3\2\2\2L\u0136\3\2\2\2N\u013d\3\2\2\2P\u0142\3\2"+
		"\2\2R\u0147\3\2\2\2T\u0149\3\2\2\2V\u0157\3\2\2\2X\u0159\3\2\2\2Z\u0165"+
		"\3\2\2\2\\\u0167\3\2\2\2^\u0175\3\2\2\2`\u017b\3\2\2\2b\u0182\3\2\2\2"+
		"d\u0184\3\2\2\2fg\5\6\4\2gh\5\4\3\2h\3\3\2\2\2ij\7\2\2\3j\5\3\2\2\2kl"+
		"\5\b\5\2lm\5\6\4\2mx\3\2\2\2no\5,\27\2op\7\f\2\2pq\5\6\4\2qx\3\2\2\2r"+
		"s\5&\24\2st\7\f\2\2tu\5\6\4\2ux\3\2\2\2vx\3\2\2\2wk\3\2\2\2wn\3\2\2\2"+
		"wr\3\2\2\2wv\3\2\2\2x\7\3\2\2\2yz\5\n\6\2z{\7\f\2\2{~\3\2\2\2|~\5\30\r"+
		"\2}y\3\2\2\2}|\3\2\2\2~\t\3\2\2\2\177\u0080\5\20\t\2\u0080\u0081\7\"\2"+
		"\2\u0081\u0082\7\7\2\2\u0082\u0083\5\f\7\2\u0083\u0084\7\b\2\2\u0084\13"+
		"\3\2\2\2\u0085\u0086\5\16\b\2\u0086\u0087\5\26\f\2\u0087\r\3\2\2\2\u0088"+
		"\u008e\5\20\t\2\u0089\u008a\5\20\t\2\u008a\u008b\7\"\2\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\17\3\2\2\2\u008f\u0092\5\22\n\2\u0090\u0092\5\24"+
		"\13\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\21\3\2\2\2\u0093\u0094"+
		"\t\2\2\2\u0094\23\3\2\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7\17\2\2\u0097"+
		"\u009d\3\2\2\2\u0098\u0099\5\22\n\2\u0099\u009a\7\t\2\2\u009a\u009b\7"+
		"\n\2\2\u009b\u009d\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0098\3\2\2\2\u009d"+
		"\25\3\2\2\2\u009e\u009f\7\13\2\2\u009f\u00a2\5\f\7\2\u00a0\u00a2\3\2\2"+
		"\2\u00a1\u009e\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\27\3\2\2\2\u00a3\u00a4"+
		"\5\20\t\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\5\32\16"+
		"\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9\5\36\20\2\u00a9\31\3\2\2\2\u00aa\u00ab"+
		"\5\20\t\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\5\34\17\2\u00ad\u00b1\3\2\2"+
		"\2\u00ae\u00af\7\35\2\2\u00af\u00b1\5\34\17\2\u00b0\u00aa\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\33\3\2\2\2\u00b2\u00b3\7\13\2\2\u00b3\u00b6\5\32"+
		"\16\2\u00b4\u00b6\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\35\3\2\2\2\u00b7\u00b8\7\5\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba\7\6\2"+
		"\2\u00ba\37\3\2\2\2\u00bb\u00bc\5\"\22\2\u00bc\u00bd\5 \21\2\u00bd\u00c0"+
		"\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"!\3\2\2\2\u00c1\u00c2\5$\23\2\u00c2\u00c3\7\f\2\2\u00c3\u00c9\3\2\2\2"+
		"\u00c4\u00c9\5R*\2\u00c5\u00c6\5P)\2\u00c6\u00c7\7\f\2\2\u00c7\u00c9\3"+
		"\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9"+
		"#\3\2\2\2\u00ca\u00cf\5&\24\2\u00cb\u00cf\5,\27\2\u00cc\u00cf\5.\30\2"+
		"\u00cd\u00cf\5\n\6\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf%\3\2\2\2\u00d0\u00d1\5\20\t\2\u00d1"+
		"\u00d2\5(\25\2\u00d2\u00d3\5*\26\2\u00d3\'\3\2\2\2\u00d4\u00d7\7\"\2\2"+
		"\u00d5\u00d7\5,\27\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7)\3"+
		"\2\2\2\u00d8\u00d9\7\13\2\2\u00d9\u00da\5(\25\2\u00da\u00db\5*\26\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00dc\3\2"+
		"\2\2\u00de+\3\2\2\2\u00df\u00e0\7\"\2\2\u00e0\u00e1\7\3\2\2\u00e1\u00e2"+
		"\5.\30\2\u00e2-\3\2\2\2\u00e3\u00e4\5\60\31\2\u00e4\u00e5\5\64\33\2\u00e5"+
		"\u00e6\5\62\32\2\u00e6/\3\2\2\2\u00e7\u00ea\7\4\2\2\u00e8\u00ea\3\2\2"+
		"\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\61\3\2\2\2\u00eb\u00ec"+
		"\7\22\2\2\u00ec\u00f1\5.\30\2\u00ed\u00ee\7\23\2\2\u00ee\u00f1\5.\30\2"+
		"\u00ef\u00f1\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\63\3\2\2\2\u00f2\u00f3\7\7\2\2\u00f3\u00f4\5.\30\2\u00f4"+
		"\u00f5\7\b\2\2\u00f5\u00fa\3\2\2\2\u00f6\u00f7\58\35\2\u00f7\u00f8\5\66"+
		"\34\2\u00f8\u00fa\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa"+
		"\65\3\2\2\2\u00fb\u00fc\7\25\2\2\u00fc\u00ff\58\35\2\u00fd\u00ff\3\2\2"+
		"\2\u00fe\u00fb\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\67\3\2\2\2\u0100\u0101"+
		"\5:\36\2\u0101\u0102\5N(\2\u01029\3\2\2\2\u0103\u0104\5<\37\2\u0104\u0105"+
		"\5@!\2\u0105\u0106\5> \2\u0106;\3\2\2\2\u0107\u010a\7\16\2\2\u0108\u010a"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a=\3\2\2\2\u010b"+
		"\u010c\7\17\2\2\u010c\u0113\5:\36\2\u010d\u010e\7\20\2\2\u010e\u0113\5"+
		":\36\2\u010f\u0110\7\21\2\2\u0110\u0113\5:\36\2\u0111\u0113\3\2\2\2\u0112"+
		"\u010b\3\2\2\2\u0112\u010d\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0111\3\2"+
		"\2\2\u0113?\3\2\2\2\u0114\u011a\5B\"\2\u0115\u0116\7\7\2\2\u0116\u0117"+
		"\58\35\2\u0117\u0118\7\b\2\2\u0118\u011a\3\2\2\2\u0119\u0114\3\2\2\2\u0119"+
		"\u0115\3\2\2\2\u011aA\3\2\2\2\u011b\u0121\5F$\2\u011c\u0121\7\"\2\2\u011d"+
		"\u0121\5D#\2\u011e\u0121\7\26\2\2\u011f\u0121\7#\2\2\u0120\u011b\3\2\2"+
		"\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f"+
		"\3\2\2\2\u0121C\3\2\2\2\u0122\u0123\t\3\2\2\u0123E\3\2\2\2\u0124\u0125"+
		"\7\"\2\2\u0125\u0126\7\7\2\2\u0126\u0127\5H%\2\u0127\u0128\7\b\2\2\u0128"+
		"G\3\2\2\2\u0129\u012a\5J&\2\u012a\u012b\5L\'\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012e\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012c\3\2\2\2\u012eI\3\2\2\2"+
		"\u012f\u0132\5,\27\2\u0130\u0132\5.\30\2\u0131\u012f\3\2\2\2\u0131\u0130"+
		"\3\2\2\2\u0132K\3\2\2\2\u0133\u0134\7\13\2\2\u0134\u0137\5H%\2\u0135\u0137"+
		"\3\2\2\2\u0136\u0133\3\2\2\2\u0136\u0135\3\2\2\2\u0137M\3\2\2\2\u0138"+
		"\u0139\7\r\2\2\u0139\u013e\58\35\2\u013a\u013b\7\16\2\2\u013b\u013e\5"+
		"8\35\2\u013c\u013e\3\2\2\2\u013d\u0138\3\2\2\2\u013d\u013a\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013eO\3\2\2\2\u013f\u0140\7\37\2\2\u0140\u0143\5.\30\2"+
		"\u0141\u0143\7\37\2\2\u0142\u013f\3\2\2\2\u0142\u0141\3\2\2\2\u0143Q\3"+
		"\2\2\2\u0144\u0148\5T+\2\u0145\u0148\5X-\2\u0146\u0148\5\\/\2\u0147\u0144"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148S\3\2\2\2\u0149"+
		"\u014a\7\34\2\2\u014a\u014b\7\7\2\2\u014b\u014c\5H%\2\u014c\u014d\7\b"+
		"\2\2\u014d\u014e\5V,\2\u014eU\3\2\2\2\u014f\u0150\5,\27\2\u0150\u0151"+
		"\7\f\2\2\u0151\u0158\3\2\2\2\u0152\u0153\5.\30\2\u0153\u0154\7\f\2\2\u0154"+
		"\u0158\3\2\2\2\u0155\u0158\5\36\20\2\u0156\u0158\3\2\2\2\u0157\u014f\3"+
		"\2\2\2\u0157\u0152\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158"+
		"W\3\2\2\2\u0159\u015a\7\24\2\2\u015a\u015b\7\7\2\2\u015b\u015c\5H%\2\u015c"+
		"\u015d\7\b\2\2\u015d\u015e\5V,\2\u015e\u015f\5Z.\2\u015fY\3\2\2\2\u0160"+
		"\u0161\7\32\2\2\u0161\u0166\5X-\2\u0162\u0163\7\32\2\2\u0163\u0166\5V"+
		",\2\u0164\u0166\3\2\2\2\u0165\u0160\3\2\2\2\u0165\u0162\3\2\2\2\u0165"+
		"\u0164\3\2\2\2\u0166[\3\2\2\2\u0167\u0168\7\27\2\2\u0168\u0169\7\7\2\2"+
		"\u0169\u016a\5^\60\2\u016a\u016b\7\f\2\2\u016b\u016c\5H%\2\u016c\u016d"+
		"\7\f\2\2\u016d\u016e\5d\63\2\u016e\u016f\7\b\2\2\u016f\u0170\5V,\2\u0170"+
		"]\3\2\2\2\u0171\u0172\5`\61\2\u0172\u0173\5b\62\2\u0173\u0176\3\2\2\2"+
		"\u0174\u0176\3\2\2\2\u0175\u0171\3\2\2\2\u0175\u0174\3\2\2\2\u0176_\3"+
		"\2\2\2\u0177\u0178\5\20\t\2\u0178\u0179\5(\25\2\u0179\u017c\3\2\2\2\u017a"+
		"\u017c\5J&\2\u017b\u0177\3\2\2\2\u017b\u017a\3\2\2\2\u017ca\3\2\2\2\u017d"+
		"\u017e\7\13\2\2\u017e\u017f\5`\61\2\u017f\u0180\5b\62\2\u0180\u0183\3"+
		"\2\2\2\u0181\u0183\3\2\2\2\u0182\u017d\3\2\2\2\u0182\u0181\3\2\2\2\u0183"+
		"c\3\2\2\2\u0184\u0185\5H%\2\u0185e\3\2\2\2\"w}\u008d\u0091\u009c\u00a1"+
		"\u00b0\u00b5\u00bf\u00c8\u00ce\u00d6\u00dd\u00e9\u00f0\u00f9\u00fe\u0109"+
		"\u0112\u0119\u0120\u012d\u0131\u0136\u013d\u0142\u0147\u0157\u0165\u0175"+
		"\u017b\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}