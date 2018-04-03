grammar aRay;

global : (mdChilds+=matrixDeclaration | msChilds+=matrixScope | asChild+=awaitScope | fdChild+=functionDeclaration)*;

body : LC (statement SEMI | selection | iteration | matrixDeclaration | matrixScope)* RC;
functionBody : LC ((statement SEMI | selection | iteration | matrixDeclaration )*) RC;

matrixDeclaration : EXTENDEDTYPE varName=ID ASSIGN LP (numbers+=NUM COMMA)+ lastNumber=NUM SEMI rows=NUM SEMI collums=NUM RP #MatrixStandardDcl
                 | EXTENDEDTYPE varName=ID ASSIGN                                           #MatrixDcl
                 | EXTENDEDTYPE varName=ID ASSIGN LP STRING SEMI NUM SEMI NUM RP            #MatrixDclWithNamePara
                 ;

matrixScope : varName=ID body
           | AWAIT varName=ID body
           ;

awaitScope :  AWAIT LC matrixScope RC;

functionDeclaration : FUNC returnType=(TYPE | EXTENDEDTYPE) functionName=ID LP parameters=parameter RP FuncBody=functionBody #FunctionDcl;

declaration : type=TYPE leftId=ID ASSIGN rightExpr=expression                                             #StandardDcl;

parameter : (paramTypes+=(TYPE | EXTENDEDTYPE) paramNamesInOrder+=ID COMMA)* (lastParamType=(TYPE | EXTENDEDTYPE) lastParamName=ID)? ;

statement : declaration #Dcl
         | varName=(THIS | ID) operator=(ASSIGNMENTOPERATOR | ASSIGN) rightExpr=expression                 #IDAssignExp
         | (RETURN expr=expression)?                                                 #ReturnExp
         ;


expression : invocation #ExpInvocation
          | value=NUM                                                                     #ExpNum
          | varName=ID                                                                      #ExpId
          | THIS                                                                    #ExpThis
          | leftIdOrNumber=(ID | THIS | NUM) operator=(OPERATOR | MATRIXOPERATOR) rightExpr=expression                #ExpOperator
          | LP expr=expression RP                                                        #ExpParenthesis
          | leftVar=ID DOT rightVar=ID                                                               #ExpDotPro
          ;

logicalExpression : expression                                                      #LogOnlyExp
                 | LP logicalExpression RP                                              #LogExpParenthesis
                 | leftexpr=expression operator=LOGICALOPERATOR rightLogicalexp=logicalExpression #LogExpExp
                 | leftLogicalexp=logicalExpression operator=CONDITIONALOPERATOR rightLogicalexp=logicalExpression              #LogExpCondit
                 ;

invocation : (leftSideAssignVarNameOptional=ID assignOperator=ASSIGNMENTOPERATOR)? functionId=ID LP (parameters+=expression COMMA)* lastOrSingleParameter=expression? RP ;

selection : ifStatement | switchStatement;

iteration : forIteration | whileIteration;

ifStatement : IF LP exprToEvaluate=logicalExpression RP ifBody=body elseIfs+=elseIfStatement* optionalElse=elseStatement?       #IfStmt;

elseIfStatement : ELSEIF LP expressionToEvaluate=logicalExpression RP elsifBody=body?           ;

elseStatement : ELSE elseBody=body                                                           #ElseStmt;

switchStatement : SWITCH LP expToEvaluate=expression RP LC cases+=caseBody* defaultBod=defaultBody RC        #SwitchStmt;

caseBody : CASE number=NUM COL (stmts+=statement SEMI)* BREAK SEMI ;

defaultBody : DEFAULT COL (stmts+=statement SEMI)* BREAK;

forIteration : FOR LP (dcl=declaration | varId=ID) (COMMA (dcls+=declaration | ids+=ID ))* SEMI expToEval=logicalExpression SEMI varToAlter=ID inOrDecre=INORDECREMENT (COMMA idsToAlter+=ID howToAlterIds+=INORDECREMENT)* RP forBody=body #ForIte;

whileIteration : WHILE LP expToEval=logicalExpression RP whileBody=body                               #WhileIte;


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
