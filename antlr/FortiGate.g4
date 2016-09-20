grammar FortiGate;

filler: (comment | WS)*;
comment: (WS? '#' .*? '\r'? '\n')+;
config: filler section (filler section)* ;
section: 'edit' 
        *
    'next';
attribute: 'set' string value*;

name: ID | string;
string: double_quoted_string | single_quoted_string;
double_quoted_string : '"' ( '\\"' | . )*? '"' ;
single_quoted_string : '\'' ( . )*? '\'' ;
value: ID | string | number | array | hash;
number:
    '-'? DIGIT+ ('.' DIGIT*)?;
array:
    '['
    filler
    (
      value (filler ',' filler value)*
    )?
    filler
    ']';
hash:
    '{'
      filler
      hashentries?
      filler
    '}'
  ;

hashentries:
    hashentry (WS hashentry)*
  ;

hashentry:
    name filler '=>' filler value;

ID: [a-zA-Z_$] [a-zA-Z_$0-9]* ;
DIGIT: [0-9];
WS  : (' '|'\t'|'\r'|'\n')+;
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;
