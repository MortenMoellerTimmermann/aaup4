grammar aRay;

global : (matrixDeclaration | matrixScope | awaitScope | functionDeclaration)*;

body : LC (statement SEMI | selection | iteration | matrixDeclaration | matrixScope)* RC;
functionBody : LC ((statement SEMI | selection | iteration | matrixDeclaration )*) RC;

matrixDeclaration : EXTENDEDTYPE ID ASSIGN LP (NUM COMMA)+ NUM SEMI NUM SEMI NUM RP #MatrixStandardDcl
                 | EXTENDEDTYPE ID ASSIGN                                           #MatrixDcl
                 | EXTENDEDTYPE ID ASSIGN LP STRING SEMI NUM SEMI NUM RP            #MatrixDclWithNamePara
                 ;

matrixScope : ID body
           | AWAIT ID body
           ;

awaitScope :  AWAIT LC matrixScope RC;

functionDeclaration : FUNC (TYPE | EXTENDEDTYPE) ID LP parameter RP functionBody #FunctionDcl;

declaration : TYPE ID ASSIGN expression                                             #StandardDcl;

parameter : ((TYPE | EXTENDEDTYPE) ID COMMA)* ((TYPE | EXTENDEDTYPE) ID)? ;

statement : declaration #Dcl
         | (THIS | ID) (ASSIGNMENTOPERATOR | ASSIGN) expression                 #IDAssignExp
         | (RETURN expression)?                                                 #ReturnExp
         ;


expression : invocation #ExpInvocation
          | NUM                                                                     #ExpNum
          | ID                                                                      #ExpId
          | THIS                                                                    #ExpThis
          | (ID | THIS | NUM) (OPERATOR | MATRIXOPERATOR) expression                #ExpOperator
          | LP expression RP                                                        #ExpParenthesis
          | ID DOT ID                                                               #ExpDotPro
          ;

logicalExpression : expression                                                      #LogExpExp
                 | LP logicalExpression RP                                              #LogExpParenthesis
                 | expression (LOGICALOPERATOR | CONDITIONALOPERATOR) logicalExpression #LogExpExp
                 | logicalExpression CONDITIONALOPERATOR logicalExpression              #LogExpCondit
                 ;

invocation : (ID ASSIGNMENTOPERATOR)? ID LP (expression COMMA)* expression? RP ;

selection : ifStatement | switchStatement;

iteration : forIteration | whileIteration;

ifStatement : IF LP logicalExpression RP body elseIfStatement* elseStatement?       #IfStmt;

elseIfStatement : ELSEIF LP logicalExpression RP body? ElseIfStmt;

elseStatement : ELSE body                                                           #ElseStmt;

switchStatement : SWITCH LP expression RP LC (caseBody)* defaultBody? RC        #SwitchStmt;

caseBody : CASE NUM COL (statement SEMI)* BREAK SEMI ;

defaultBody : DEFAULT COL (statement SEMI)* ;

forIteration : FOR LP (declaration | ID) (COMMA (declaration | ID ))* SEMI logicalExpression SEMI ID INORDECREMENT (COMMA ( ID INORDECREMENT))* RP body #ForIte;

whileIteration : WHILE LP logicalExpression RP body                               #WhileIte;


TYPE : 'num' | 'int' | 'bool';
EXTENDEDTYPE : 'matrix' ;
BOOL: 'true' | 'false';
NUM : ('0' | '-'? [1-9] [0-9]* ('.' [0-9]* [1-9] )?);
STRING:     '"' (~["\\\r\n])* '"';
OPERATOR : '*' | '+' | '-' | '/' | '%';
LOGICALOPERATOR : '==' | '!=' | '<' | '>' | '=<' | '=>' ;
ASSIGN: '=';
ASSIGNMENTOPERATOR : '+=' | '*=' | '-=' | '/=' ;
CONDITIONALOPERATOR : '||' | '&&' ;
INORDECREMENT : '++' | '--' ;

MATRIXOPERATOR: ':x';

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
