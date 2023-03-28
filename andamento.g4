grammar pascal;

options { caseInsensitive = true; }

program
   : programHeading block DOT EOF
   ;

programHeading
   : PROGRAM identifier (LPAREN identifierList RPAREN)? SEMI
   ;

identifier
   : IDENT
   ;

block
   : (constantDefinitionPart | typeDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart)* compoundStatement
   ;

constantDefinitionPart
   : CONST (constantDefinition SEMI) +
   ;

constantDefinition
   : identifier EQUAL constant
   ;

constant
   : unsignedNumber
   | sign unsignedNumber
   | identifier
   | sign identifier
   | string
   ;

unsignedNumber
   : unsignedInteger
   | unsignedReal
   ;

unsignedInteger
   : NUM_INT
   ;

unsignedReal
   : NUM_REAL
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

typeDefinitionPart
   : TYPE (typeDefinition SEMI) +
   ;

typeDefinition
   : identifier EQUAL (type_ | functionType )
   ;

functionType
   : FUNCTION (formalParameterList)? COLON resultType
   ;

type_
   : simpleType
   ;

simpleType
   : scalarType
   | typeIdentifier
   ;

scalarType
   : LPAREN identifierList RPAREN
   ;

typeIdentifier
   : identifier
   | (CHAR | BOOLEAN | INTEGER | REAL | STRING)
   ;


typeList
   : indexType (COMMA indexType)*
   ;

indexType
   : simpleType
   ;

componentType
   : type_
   ;

fixedPart
   : recordSection (SEMI recordSection)*
   ;

recordSection
   : identifierList COLON type_
   ;

tag
   : identifier COLON typeIdentifier
   | typeIdentifier
   ;

baseType
   : simpleType
   ;

variableDeclarationPart
   : VAR variableDeclaration (SEMI variableDeclaration)* SEMI
   ;

variableDeclaration
   : identifierList COLON type_
   ;

procedureAndFunctionDeclarationPart
   : procedureOrFunctionDeclaration SEMI
   ;

procedureOrFunctionDeclaration
   :  functionDeclaration
   ;

formalParameterList
   : LPAREN formalParameterSection (SEMI formalParameterSection)* RPAREN
   ;

formalParameterSection
   : parameterGroup
   | VAR parameterGroup
   | FUNCTION parameterGroup
   ;

parameterGroup
   : identifierList COLON typeIdentifier
   ;

identifierList
   : identifier (COMMA identifier)*
   ;

constList
   : constant (COMMA constant)*
   ;

functionDeclaration
   : FUNCTION identifier (formalParameterList)? COLON resultType SEMI block
   ;

resultType
   : typeIdentifier
   ;

statement
   
   : unlabelledStatement
   ;

unlabelledStatement
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
   : identifier (LBRACK expression (COMMA expression)* RBRACK | LBRACK2 expression (COMMA expression)* RBRACK2 | DOT identifier)*
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
   : identifier LPAREN parameterList RPAREN
   ;

parameterList
   : actualParameter (COMMA actualParameter)*
   ;


procedureStatement
   : identifier (LPAREN parameterList RPAREN)?
   ;

actualParameter
   : expression parameterwidth*
   ;

parameterwidth
   : COLON expression
   ;

emptyStatement_
   :
   ;

empty_
   :
   /* empty */
   ;

structuredStatement
   : compoundStatement
   | conditionalStatement
   | repetetiveStatement
   ;

compoundStatement
   : BEGIN statements END
   ;

statements
   : statement (SEMI statement)*
   ;

conditionalStatement
   : ifStatement
   ;

ifStatement
   : IF expression THEN statement (: ELSE statement)?
   ;

caseListElement
   : constList COLON statement
   ;

repetetiveStatement
   : whileStatement
   ;

whileStatement
   : WHILE expression DO statement
   ;

initialValue
   : expression
   ;

finalValue
   : expression
   ;

recordVariableList
   : variable (COMMA variable)*
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


IDENT
   : ('A' .. 'Z') ('A' .. 'Z' | '0' .. '9' | '_')*
   ;


STRING_LITERAL
   : '\'' ('\'\'' | ~ ('\''))* '\''
   ;


NUM_INT
   : ('0' .. '9') +
   ;


NUM_REAL
   : ('0' .. '9') + (('.' ('0' .. '9') + (EXPONENT)?)? | EXPONENT)
   ;


fragment EXPONENT
   : ('E') ('+' | '-')? ('0' .. '9') +
   ;
