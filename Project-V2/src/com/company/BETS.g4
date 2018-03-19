grammar BETS;

global : (matrixDeclaration | matrixScope | awaitScope | functionDeclaration)*;

body : LC (statement SEMI | selection | iteration )* RC;
functionBody : LC ((functionStatement SEMI | selection | iteration )*) RC;

matrixDeclaration : EXTENDEDTYPE ID ASSIGN LP (NUM COMMA)* NUM SEMI NUM SEMI NUM RP
                  | EXTENDEDTYPE ID ASSIGN matrixExpression
                  | EXTENDEDTYPE ID ASSIGN LP STRING SEMI NUM SEMI NUM RP
                  ;

matrixScope : ID body
            | AWAIT ID body
            ;

matrixExpression: ID DOT ID;

awaitScope :  AWAIT LC matrixScope RC;

functionDeclaration : FUNC TYPE ID LP parameter RP functionBody;

declaration : TYPE ID ASSIGN expression;

parameter : ((TYPE | EXTENDEDTYPE) ID COMMA)* ((TYPE | EXTENDEDTYPE) ID)? ;


statement : declaration
          | (THIS | ID) (ASSIGNMENTOPERATOR | ASSIGN) expression
          | (RETURN expression)?
          ;

functionStatement : declaration
                  | RETURN expression
                  ;


expression : invocation
           | NUM
           | ID
           | THIS
           | (ID | THIS | NUM) (OPERATOR | MATRIXOPERATOR) expression
           ;
logicalExpression : ID
                  | ID LOGICALOPERATOR ( ID | NUM )
                  | LP logicalExpression RP
                  | LP logicalExpression RP CONDITIONALOPERATOR logicalExpression
                  | expression CONDITIONALOPERATOR  logicalExpression
                  | expression  LOGICALOPERATOR  expression ( CONDITIONALOPERATOR logicalExpression )?  ;


invocation : (ID ASSIGNMENTOPERATOR)? ID LP (expression COMMA)* expression? RP ;


selection : ifStatement | switchStatement;

iteration : forIteration | whileIteration;

ifStatement : IF LP logicalExpression RP body elseIfStatement* elseStatement?;

elseIfStatement : ELSEIF LP logicalExpression RP body?;

elseStatement : ELSE body ;

switchStatement : SWITCH LP expression RP LC (caseBody)* defaultBody? RC ;

caseBody : CASE NUM COL (statement SEMI)* BREAK SEMI ;

defaultBody : DEFAULT COL (statement SEMI)* ;

forIteration : FOR LP (declaration | ID) (COMMA (declaration | ID ))* SEMI logicalExpression SEMI ID INORDECREMENT (COMMA ( ID INORDECREMENT))* RP body;

whileIteration : WHILE LP logicalExpression RP body ;


TYPE : 'num' | 'int' | 'bool';
EXTENDEDTYPE : 'matrix' ;
BOOL: 'true' | 'false';
NUM : ('0' | '-'? [1-9] [0-9]* ('.' [0-9]* [1-9] )?);
STRING:     '"' (~["\\\r\n])* '"';
OPERATOR : '*' | '+' | '-' | '/' | '%';
LOGICALOPERATOR : '==' | '!=' | '<' | '>' | '=<' | '=>' ;
ASSIGN: '=';
ASSIGNMENTOPERATOR : '+=' | '*=' | '-=' | '/=' ;
CONDITIONALOPERATOR : 'and' | 'or' | '||' | '&&' ;
INORDECREMENT : '++' | '--' ;

MATRIXOPERATOR: ':o' | ':x' | ':*';

THIS : 'this';
AWAIT : 'await';
IF : 'if';
ELSEIF : 'elseif';
ELSE : 'else';
SWITCH : 'switch';
DEFAULT : 'default';
CASE : 'case';
BREAK : 'break';
RETURN : 'return';
FUNC : 'func';
FOR : 'for';
WHILE: 'while';

LP : '(';
RP : ')';
LC : '{';
RC : '}';

SEMI: ';';
COL: ':';

DOT: '.';
COMMA: ',';

QUOTES: '"';

ID : [a-zA-Z]+ ;
WS: [ \n\t\r]+ -> skip;