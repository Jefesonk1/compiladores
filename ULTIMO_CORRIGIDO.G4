grammar pascal;

options { caseInsensitive = true; }

program
   : programHeading block DOT EOF
   ;

programHeading
   : PROGRAM IDENTIFIER (LPAREN identifierList RPAREN)? SEMI
   ;

block
   : ( constantDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart)* compoundStatement
   ;


constantDefinitionPart
   : CONST (constantDefinition SEMI) +
   ;

constantDefinition
   : IDENTIFIER EQUAL constant
   ;

constant
   : unsignedNumber
   | sign unsignedNumber
   | IDENTIFIER
   | sign IDENTIFIER
   | string
   ;

unsignedNumber
   : NUM_INT
   | NUM_REAL
   ;

sign
   : PLUS
   | MINUS
   ;

bool_
   : TRUE
   | FALSE
   ;

string
   : STRING_LITERAL
   ;

type_
   : simpleType
   | arrayType
   ;

simpleType
   : scalarType
   | subrangeType
   | typeIdentifier
   | stringtype
   ;

scalarType
   : LPAREN identifierList RPAREN
   ;

subrangeType
   : constant DOTDOT constant
   ;

typeIdentifier
   : IDENTIFIER
   | (CHAR | BOOLEAN | INTEGER | REAL | STRING)
   ;

stringtype
   : STRING LBRACK (IDENTIFIER | unsignedNumber) RBRACK
   ;

arrayType
   : ARRAY LBRACK typeList RBRACK OF INTEGER (EQUAL LPAREN parameterList RPAREN)?
   | ARRAY LBRACK2 typeList RBRACK2 OF INTEGER (EQUAL LPAREN parameterList RPAREN)?
   ;

typeList
   : indexType (COMMA indexType)*
   ;

indexType
   : simpleType
   ;

variableDeclarationPart
   : VAR variableDeclaration (SEMI variableDeclaration)* SEMI
   ;

variableDeclaration
   : identifierList COLON type_
   ;

procedureAndFunctionDeclarationPart
   : (procedureDeclaration
   | functionDeclaration) SEMI
   ;

procedureDeclaration
   : PROCEDURE IDENTIFIER (formalParameterList)? SEMI block
   ;

formalParameterList
   : LPAREN formalParameterSection? (SEMI formalParameterSection)* RPAREN
   ;

formalParameterSection
   : parameterGroup
   | VAR parameterGroup
   | FUNCTION parameterGroup
   | PROCEDURE parameterGroup
   ;

parameterGroup
   : identifierList COLON typeIdentifier
   ;

identifierList
   : IDENTIFIER (COMMA IDENTIFIER)*
   ;

functionDeclaration
   : FUNCTION IDENTIFIER (formalParameterList)? COLON resultType SEMI block
   ;

resultType
   : typeIdentifier
   ;

statement
   : simpleStatement
   | structuredStatement
   ;

simpleStatement
   : assignmentStatement
   | procedureStatement
   | emptyStatement_
   ;

assignmentStatement
   : variable ASSIGN expression
   ;

variable
   : (IDENTIFIER) (LBRACK expression (COMMA expression)* RBRACK | LBRACK2 expression (COMMA expression)* RBRACK2 | DOT IDENTIFIER | POINTER)*
   ;

expression
   : simpleExpression (relationaloperator expression)?
   ;

relationaloperator
   : EQUAL
   | NOT_EQUAL
   | LT
   | LE
   | GE
   | GT
   | IN
   ;

simpleExpression
   : term (additiveoperator simpleExpression)?
   ;

additiveoperator
   : PLUS
   | MINUS
   | OR
   ;

term
   : signedFactor (multiplicativeoperator term)?
   ;

multiplicativeoperator
   : STAR
   | SLASH
   | DIV
   | MOD
   | AND
   ;

signedFactor
   : (PLUS | MINUS)? factor
   ;

factor
   : variable
   | LPAREN expression RPAREN
   | functionDesignator
   | unsignedConstant
   | NOT factor
   | bool_
   ;

unsignedConstant
   : unsignedNumber
   | string
   | NIL
   ;

functionDesignator
   : IDENTIFIER LPAREN parameterList RPAREN
   ;

parameterList
   : actualParameter (COMMA actualParameter)*
   ;

procedureStatement
   : IDENTIFIER (LPAREN parameterList RPAREN)?
   ;

actualParameter
   : expression? parameterwidth*
   ;

parameterwidth
   : COLON expression
   ;

emptyStatement_
   :
   ;

structuredStatement
   : compoundStatement
   | ifStatement
   | whileStatement
   ;

compoundStatement
   : BEGIN statements END
   ;

statements
   : statement (SEMI statement)*
   ;

ifStatement
   : IF expression THEN statement (: ELSE statement)?
   ;

whileStatement
   : WHILE expression DO statement
   ;

AND
   : 'AND'
   ;


ARRAY
   : 'ARRAY'
   ;


BEGIN
   : 'BEGIN'
   ;


BOOLEAN
   : 'BOOLEAN'
   ;


CASE
   : 'CASE'
   ;


CHAR
   : 'CHAR'
   ;


CHR
   : 'CHR'
   ;


CONST
   : 'CONST'
   ;


DIV
   : 'DIV'
   ;


DO
   : 'DO'
   ;


DOWNTO
   : 'DOWNTO'
   ;


ELSE
   : 'ELSE'
   ;


END
   : 'END'
   ;


FILE
   : 'FILE'
   ;


FOR
   : 'FOR'
   ;


FUNCTION
   : 'FUNCTION'
   ;


GOTO
   : 'GOTO'
   ;


IF
   : 'IF'
   ;


IN
   : 'IN'
   ;


INTEGER
   : 'INTEGER'
   ;


LABEL
   : 'LABEL'
   ;


MOD
   : 'MOD'
   ;


NIL
   : 'NIL'
   ;


NOT
   : 'NOT'
   ;


OF
   : 'OF'
   ;


OR
   : 'OR'
   ;


PACKED
   : 'PACKED'
   ;


PROCEDURE
   : 'PROCEDURE'
   ;


PROGRAM
   : 'PROGRAM'
   ;


REAL
   : 'REAL'
   ;


RECORD
   : 'RECORD'
   ;


REPEAT
   : 'REPEAT'
   ;


SET
   : 'SET'
   ;


THEN
   : 'THEN'
   ;


TO
   : 'TO'
   ;


TYPE
   : 'TYPE'
   ;


UNTIL
   : 'UNTIL'
   ;


VAR
   : 'VAR'
   ;


WHILE
   : 'WHILE'
   ;


WITH
   : 'WITH'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


STAR
   : '*'
   ;


SLASH
   : '/'
   ;


ASSIGN
   : ':='
   ;


COMMA
   : ','
   ;


SEMI
   : ';'
   ;


COLON
   : ':'
   ;


EQUAL
   : '='
   ;


NOT_EQUAL
   : '<>'
   ;


LT
   : '<'
   ;


LE
   : '<='
   ;


GE
   : '>='
   ;


GT
   : '>'
   ;


LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


LBRACK
   : '['
   ;


LBRACK2
   : '(.'
   ;


RBRACK
   : ']'
   ;


RBRACK2
   : '.)'
   ;


POINTER
   : '^'
   ;


AT
   : '@'
   ;


DOT
   : '.'
   ;


DOTDOT
   : '..'
   ;


LCURLY
   : '{'
   ;


RCURLY
   : '}'
   ;


UNIT
   : 'UNIT'
   ;


INTERFACE
   : 'INTERFACE'
   ;


USES
   : 'USES'
   ;


STRING
   : 'STRING'
   ;


IMPLEMENTATION
   : 'IMPLEMENTATION'
   ;


TRUE
   : 'TRUE'
   ;


FALSE
   : 'FALSE'
   ;


WS
   : [ \t\r\n] -> skip
   ;


COMMENT_1
   : '(*' .*? '*)' -> skip
   ;


COMMENT_2
   : '{' .*? '}' -> skip
   ;


IDENTIFIER
   : ('A' .. 'Z') ('A' .. 'Z' | '0' .. '9' | '_')*
   ;


STRING_LITERAL
   : '\'' ('\'\'' | ~ ('\''))* '\''
   ;


UNSIGNED_INTEGER
   : ('0' .. '9') +
   ;


UNSIGNED_REAL
   : ('0' .. '9') + (('.' ('0' .. '9') + (EXPONENT)?)? | EXPONENT)
   ;


fragment EXPONENT
   : ('E') ('+' | '-')? ('0' .. '9') +
   ;