grammar pascal;

options { caseInsensitive = true; }

program
   : programHeading block DOT EOF
   ;

programHeading
   : RESERVED_PROGRAM IDENTIFIER (OPEN_PARENTHESIS identifierList CLOSE_PARENTHESIS)? SEMI
   ;

block
   : ( constantDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart)* compoundStatement
   ;


constantDefinitionPart
   : RESERVED_CONST (constantDefinition SEMI) +
   ;

constantDefinition
   : IDENTIFIER EQUALS constant
   ;

constant
   : unsignedNumber
   | sign unsignedNumber
   | IDENTIFIER
   | sign IDENTIFIER
   | string
   ;

unsignedNumber
   : UNSIGNED_INTEGER
   | UNSIGNED_REAL
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
   : CHARACTER_STRING
   ;

type_
   : simpleType
   | arrayType
   ;

simpleType
   : scalarType
   | subrangeType
   | typeIdentifier
   | stringType
   ;

scalarType
   : OPEN_PARENTHESIS identifierList CLOSE_PARENTHESIS
   ;

subrangeType
   : constant DOTDOT constant
   ;

typeIdentifier
   : IDENTIFIER
   | (CHAR | RESERVED_BOOLEAN | RESERVED_INTEGER | RESERVED_REAL | RESERVED_STRING)
   ;

stringType
   : RESERVED_STRING OPEN_BRACKETS (IDENTIFIER | unsignedNumber) CLOSE_BRACKETS
   ;

arrayType
   : RESERVED_ARRAY OPEN_BRACKETS typeList CLOSE_BRACKETS RESERVED_OF typeIdentifier (EQUALS OPEN_PARENTHESIS parameterList CLOSE_PARENTHESIS)?
   | RESERVED_ARRAY OPEN_PARENTHESIS_DOT typeList DOT_CLOSE_PARENTHESIS RESERVED_OF typeIdentifier (EQUALS OPEN_PARENTHESIS parameterList CLOSE_PARENTHESIS)?
   ;

typeList
   : indexType (COMMA indexType)*
   ;

indexType
   : simpleType
   ;

variableDeclarationPart
   : RESERVED_VAR variableDeclaration (SEMI variableDeclaration)* SEMI
   ;

variableDeclaration
   : identifierList COLON type_
   ;

procedureAndFunctionDeclarationPart
   : (procedureDeclaration
   | functionDeclaration) SEMI
   ;

procedureDeclaration
   : RESERVED_PROCEDURE IDENTIFIER (formalParameterList)? SEMI block
   ;

formalParameterList
   : OPEN_PARENTHESIS formalParameterSection? (SEMI formalParameterSection)* CLOSE_PARENTHESIS
   ;

formalParameterSection
   : parameterGroup
   | RESERVED_VAR parameterGroup
   | RESERVED_FUNCTION parameterGroup
   | RESERVED_PROCEDURE parameterGroup
   ;

parameterGroup
   : identifierList COLON typeIdentifier
   ;

identifierList
   : IDENTIFIER (COMMA IDENTIFIER)*
   ;

functionDeclaration
   : RESERVED_FUNCTION IDENTIFIER (formalParameterList)? COLON resultType SEMI block
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
   : variable ASSIGNMENT expression
   ;

variable
   : (IDENTIFIER) (OPEN_BRACKETS expression (COMMA expression)* CLOSE_BRACKETS | OPEN_PARENTHESIS_DOT expression (COMMA expression)* DOT_CLOSE_PARENTHESIS | DOT IDENTIFIER)*
   ;

expression
   : simpleExpression (relationalOperator expression)?
   ;

relationalOperator
   : EQUALS
   | NOT_EQUALS
   | LESS_THAN
   | LESS_THAN_OR_EQUALS
   | GREATHER_THAN_OR_EQUALS
   | GREATER_THAN
   | RESERVED_IN
   ;

simpleExpression
   : term (additiveOperator simpleExpression)?
   ;

additiveOperator
   : PLUS
   | MINUS
   | RESERVED_OR
   ;

term
   : signedFactor (multiplicativeOperator term)?
   ;

multiplicativeOperator
   : ASTERISK
   | SLASH
   | RESERVED_DIV
   | RESERVED_MOD
   | RESERVED_AND
   ;

signedFactor
   : (PLUS | MINUS)? factor
   ;

factor
   : variable
   | OPEN_PARENTHESIS expression CLOSE_PARENTHESIS
   | functionDesignator
   | unsignedConstant
   | RESERVED_NOT factor
   | bool_
   ;

unsignedConstant
   : unsignedNumber
   | string
   | RESERVED_NIL
   ;

functionDesignator
   : IDENTIFIER OPEN_PARENTHESIS parameterList CLOSE_PARENTHESIS
   ;

parameterList
   : actualParameter (COMMA actualParameter)*
   ;

procedureStatement
   : IDENTIFIER (OPEN_PARENTHESIS parameterList CLOSE_PARENTHESIS)?
   ;

actualParameter
   : expression? parameterWidth*
   ;

parameterWidth
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
   : RESERVED_BEGIN statements RESERVED_END
   ;

statements
   : statement (SEMI statement)*
   ;

ifStatement
   : RESERVED_IF expression RESERVED_THEN statement (: RESERVED_ELSE statement)?
   ;

whileStatement
   : RESERVED_WHILE expression RESERVED_DO statement
   ;

RESERVED_AND
   : 'AND'
   ;


RESERVED_ARRAY
   : 'ARRAY'
   ;


RESERVED_BEGIN
   : 'BEGIN'
   ;


RESERVED_BOOLEAN
   : 'BOOLEAN'
   ;


CHAR
   : 'CHAR'
   ;


RESERVED_CONST
   : 'CONST'
   ;


RESERVED_DIV
   : 'DIV'
   ;


RESERVED_DO
   : 'DO'
   ;


RESERVED_ELSE
   : 'ELSE'
   ;


RESERVED_END
   : 'END'
   ;


RESERVED_FUNCTION
   : 'FUNCTION'
   ;


RESERVED_IF
   : 'IF'
   ;


RESERVED_IN
   : 'IN'
   ;


RESERVED_INTEGER
   : 'INTEGER'
   ;

RESERVED_REAL
   : 'REAL'
   ;


RESERVED_MOD
   : 'MOD'
   ;


RESERVED_NIL
   : 'NIL'
   ;


RESERVED_NOT
   : 'NOT'
   ;


RESERVED_OF
   : 'OF'
   ;


RESERVED_OR
   : 'OR'
   ;


RESERVED_PROCEDURE
   : 'PROCEDURE'
   ;


RESERVED_PROGRAM
   : 'PROGRAM'
   ;

RESERVED_THEN
   : 'THEN'
   ;


RESERVED_VAR
   : 'VAR'
   ;


RESERVED_WHILE
   : 'WHILE'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


ASTERISK
   : '*'
   ;


SLASH
   : '/'
   ;


ASSIGNMENT
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


EQUALS
   : '='
   ;


NOT_EQUALS
   : '<>'
   ;


LESS_THAN
   : '<'
   ;


LESS_THAN_OR_EQUALS
   : '<='
   ;


GREATHER_THAN_OR_EQUALS
   : '>='
   ;


GREATER_THAN
   : '>'
   ;


OPEN_PARENTHESIS
   : '('
   ;


CLOSE_PARENTHESIS
   : ')'
   ;


OPEN_BRACKETS
   : '['
   ;


OPEN_PARENTHESIS_DOT
   : '(.'
   ;


CLOSE_BRACKETS
   : ']'
   ;


DOT_CLOSE_PARENTHESIS
   : '.)'
   ;


DOT
   : '.'
   ;


DOTDOT
   : '..'
   ;

RESERVED_STRING
   : 'STRING'
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


CHARACTER_STRING
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