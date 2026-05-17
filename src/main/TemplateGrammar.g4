grammar TemplateGrammar;

template: part* EOF;

part: OPEN_SCRIPT scriptContent CLOSE_SCRIPT
      | TEXT;

scriptContent: SCRIPT_TEXT;

OPEN_SCRIPT: '{{';
CLOSE_SCRIPT: '}}';

SCRIPT_TEXT: ~[}]+;
TEXT: ~[({)+]+;

