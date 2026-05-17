grammar ScriptGrammar;

script: assign
        | if_
        | else_
        | end
        | shortcode
        | access;

assign: ID EQUAL expression;

if_: IF expression;
else_: ELSE;
end: END;

shortcode: ID arg+;
access: ID;

expression: left=expression operator=OPERATORMUL right=expression
            | left=expression operator=(ADD|MINUS) right=expression
            | NUMBER
            | ID;

arg: ID | STRING | NUMBER;

IF: 'if';
ELSE:  'else';
END: 'end';

EQUAL: '=';
OPERATORMUL: '*'|'/';
ADD:'+';
MINUS:'-';

NUMBER: MINUS?[0-9]+ ('.'[0-9]+)?;

STRING: '"' ~["\r\n]* '"';
ID: [a-zA-Z_][a-zA-Z0-9_]+;

WS: [ \t\r\n]+ -> skip;


