
grammar Expr;

WS
   : [ \t\r\n] -> skip
   ;


COMMENT_1
   : '(*' .*? '*)' -> skip
   ;


COMMENT_2
   : '{' .*? '}' -> skip
   ;


IDENT
   : ('A' .. 'Z') ('A' .. 'Z' | '0' .. '9' | '_')*
   ;


STRING_LITERAL
   : '\'' ('\'\'' | ~ ('\''))* '\''
   ;


PROGRAM
   : 'program'
   ;

COLON
   : ':'
   ;
SEMI
   : ';'
   ;
ASSIGN
   : ':='
   ;

GREATHERTHAN
   : '>'
   ;

LESSTHAN
   : '<'
   ;
EQUALS
   : '='
   ;

COMMA
   : ','
   ;

DOT
   : '.'
   ;

OPENPARENTHESIS
   : '('
   ;

CLOSEPARENTHESIS
   : ')'
   ;

VAR
   : 'var'
   ;

FUNCTION
   : 'function'
   ;

BEGIN
   : 'begin'
   ;

END
   : 'end'
   ;

IDENTIFIER
   : ('A' .. 'Z') ('A' .. 'Z' | '0' .. '9' | '_')*
   ;

THEN
   : 'then'
   ;
DO
   : 'do'
   ;
IF
   : 'if'
   ;
ELSE
   : 'else'
   ;

WHILE
   : 'while'
   ;
READ
   : 'read'
   ;
PRINT
   : 'print'
   ;

PLUS
   : '+'
   ;

MINUS
   : '-'
   ;

OR
   : 'or'
   ;
ASTERISK
   : '*'
   ;
SLASH
   : '/'
   ;
AND
   : 'and'
   ;
NOT
   : 'not'
   ;
NUM_INT
   : ('0' .. '9') +
   ;
STRING_TYPE
   : 'string'
   ;
INTEGER_TYPE
   : 'integer'
   ;
TYPE
   : STRING_TYPE | INTEGER_TYPE
   ;

program: PROGRAM IDENTIFIER SEMI block DOT;
block: (VAR varblock)? (funcblock)? statements;
var_declaration: IDENTIFIER (COMMA IDENTIFIER)* COLON TYPE;
varblock: var_declaration (SEMI var_declaration)*;
funcblock: FUNCTION IDENTIFIER OPENPARENTHESIS (var_declaration)* CLOSEPARENTHESIS COLON TYPE SEMI block;
statements: BEGIN statement (SEMI statement)* (SEMI)? END;
statement: attribution | statements | print | IF | WHILE;
if: IF expression THEN statement (ELSE statement)?;
while: WHILE expression DO statement;
attribution: IDENTIFIER ASSIGN expression | read;
read: READ OPENPARENTHESIS CLOSEPARENTHESIS;
print: PRINT OPENPARENTHESIS expression CLOSEPARENTHESIS;
expression: simple_expression ((LESSTHAN | GREATHERTHAN | EQUALS) simple_expression)*;
simple_expression: term ((PLUS | MINUS | OR) term)*;
term: factor ((ASTERISK SLASH AND) factor)*;
factor: ((PLUS | MINUS | NOT) factor)? | NUM_INT | (OPENPARENTHESIS expression CLOSEPARENTHESIS) | IDENTIFIER | funccall;
funccall: IDENTIFIER OPENPARENTHESIS (expression (SEMI expression)*)? CLOSEPARENTHESIS;
