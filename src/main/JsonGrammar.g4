grammar JsonGrammar;

json: value EOF;

value: object
| array
| STRING
| NUMBER
| BOOLEAN
| NULL;

object: LBRACE (field (COMMA field)*)? RBRACE;
field: STRING COLON value;
array: LBRACKET (value (COMMA value)*)? RBRACKET;

NULL: 'null';
BOOLEAN: 'true' | 'false';
NUMBER: '-'? [0-9]+ ('.' [0-9]+)?;
STRING: '"' ~["\\\r\n]* '"';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
COLON: ':';
COMMA: ',';
WS: [ \t\r\n]+ -> skip;