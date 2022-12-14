grammar tpf;

@header {
    package tpf;
}

fragment DIGITO : [0-9] ;
fragment LETRA : [A-Za-z] ;

LA : '{' ;
LC : '}' ;
PA : '(' ;
PC : ')' ;
CA : '[' ;
CC : ']' ;
COMA : ',' ;
PYCOMA : ';' ;
SUMA : '+' ;
RESTA : '-' ;
MULT : '*' ;
DIV : '/' ;
MOD : '%' ;
AND : '&&' ;
OR : '||' ;
IF : 'if' ;
CMP : '==' | '<' | '>' | '>=' | '<=' | '!=' ;
VCHAR : '\'' ('\\'? LETRA)? '\'' ;
FOR : 'for' ;
INT : 'int' ;
CHAR : 'char' ;
ELSE : 'else' ;
DOUBLE : 'double' ;
WHILE : 'while' ;
VOID : 'void' ;
STRING : 'string' ;
RETURN : 'return' ;
ENTERO : DIGITO+ ;
DOBLE : ENTERO '.' DIGITO DIGITO? ;
ID : ( LETRA | '_' ) ( LETRA | DIGITO | '_' )* ;
VSTRING : '"' ( '\\"' | . )*? '"' ;
BCOMENTARIO : '/*' .*? '*/' -> skip;
COMENTARIO : '//' .*? ('\n' | '\r') -> skip;
PRAGMA : '#' .*? ('\n' | '\r') -> skip;
WS : [ \t\n\r] -> skip ;
OTRO : . ;

si : opciones ieof ;

ieof : EOF ;

opciones : funcion opciones | asignacion PYCOMA opciones | declaraciones PYCOMA opciones | ;

funcion : dec_func PYCOMA | def_func ; 	

dec_func : tipo ID PA parametros PC ;

parametros : parametro p_lista ;

parametro : tipo | tipo ID | ;

tipo : t_simple | puntero ;

t_simple : INT | DOUBLE | CHAR | VOID ;

puntero : t_simple MULT | t_simple CA CC;

p_lista : COMA parametros | ;

def_func : tipo ID PA params PC bloque ;

params : tipo ID defp_lista | VOID defp_lista ;

defp_lista : COMA params | ;

bloque : LA instrucciones LC ;

instrucciones : instruccion instrucciones | ;

instruccion : inst_simple PYCOMA | est_control | ireturn PYCOMA ;

inst_simple : declaraciones | asignacion | opal | dec_func ;

declaraciones: tipo declaracion d_lista ;

declaracion : ID | asignacion ;

d_lista : COMA declaracion d_lista | ;

asignacion : ID '=' opal ;

opal : negacion relacional logic ;

negacion : '!' | ;

logic : AND opal | OR opal | ;

relacional : PA opal PC | opar rel ;

rel : CMP opar | ;

opar : term operacion ;

term : menos ovalor mult ;

menos : RESTA | ;

mult : MULT term | DIV term | MOD term | ;

ovalor : valor | PA opar PC ;

valor : llam_func | ID | numero | VCHAR | VSTRING ;

numero : ENTERO | DOBLE ;

llam_func : ID PA argumentos PC ;

argumentos : argumento a_lista | ;

argumento : asignacion | opal ;

a_lista : COMA argumentos | ;

operacion : SUMA opar | RESTA opar | ;

ireturn : RETURN opal | RETURN;

est_control : iwhile | iif | ifor ;

iwhile : WHILE PA argumentos PC acciones ;

acciones : asignacion PYCOMA | opal PYCOMA | bloque | ;

iif : IF PA argumentos PC acciones ielse ;

ielse : ELSE iif | ELSE acciones | ;

ifor : FOR PA comienzos_f PYCOMA argumentos PYCOMA fin_f PC acciones ;

comienzos_f : opcion cf_lista | ;

opcion : tipo declaracion | argumento ;

cf_lista : COMA opcion cf_lista | ;

fin_f : argumentos ;