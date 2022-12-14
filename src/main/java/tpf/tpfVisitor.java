// Generated from /home/tomas/FACULTAD/TC/tpf/src/main/java/tpf/tpf.g4 by ANTLR 4.9.2

    package tpf;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tpfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tpfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tpfParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(tpfParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#ieof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIeof(tpfParser.IeofContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#opciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpciones(tpfParser.OpcionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(tpfParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#dec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_func(tpfParser.Dec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(tpfParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(tpfParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(tpfParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#t_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_simple(tpfParser.T_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#puntero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuntero(tpfParser.PunteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#p_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_lista(tpfParser.P_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#def_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_func(tpfParser.Def_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(tpfParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#defp_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefp_lista(tpfParser.Defp_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(tpfParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(tpfParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(tpfParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#inst_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_simple(tpfParser.Inst_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(tpfParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(tpfParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#d_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_lista(tpfParser.D_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(tpfParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(tpfParser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#negacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacion(tpfParser.NegacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(tpfParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(tpfParser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(tpfParser.RelContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#opar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpar(tpfParser.OparContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(tpfParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#menos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenos(tpfParser.MenosContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(tpfParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#ovalor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOvalor(tpfParser.OvalorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(tpfParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(tpfParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#llam_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlam_func(tpfParser.Llam_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(tpfParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(tpfParser.ArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#a_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_lista(tpfParser.A_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(tpfParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#ireturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIreturn(tpfParser.IreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#est_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEst_control(tpfParser.Est_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(tpfParser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#acciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcciones(tpfParser.AccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#iif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIif(tpfParser.IifContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#ielse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIelse(tpfParser.IelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#ifor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfor(tpfParser.IforContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#comienzos_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComienzos_f(tpfParser.Comienzos_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#opcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcion(tpfParser.OpcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#cf_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCf_lista(tpfParser.Cf_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfParser#fin_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFin_f(tpfParser.Fin_fContext ctx);
}