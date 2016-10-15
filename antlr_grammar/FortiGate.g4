/* 
FortiGate.g4: an ANTLR4 grammar to create parsers for Fortinet config files.
Copyright (C) 2016 R. Dohmen <acidjunk@gmail.com>

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

grammar FortiGate;
/*
CONFIG : 'config' ;
EDIT: 'edit' ;
END: 'end'
*/

config_section  : 'config' (statements)* 'end' ;

/* a statement can be either a nested config section or some statements */
statements	: config_section
			| 'edit' IDENTIFIER 'next'
			| IDENTIFIER+
			;


//LEXER RULES
IDENTIFIER 	: [a-z][A-Z][0-9]* ;
WS 			:	[ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out

/*

config_global : 'config global' * '\n' 'end' '\n' '\n' 'end' // config global end with empty line then end on a new line
config_system: 'config system'
config_user:
config_vdom: blaat \n end '\'

set: 
edit: 

NoneSpaceWhitespace: [\t\b \f\r\n]+ -> skip;
Space: [ ];

start: configs
*/


/*
file : (config_sections '\n')* EOF ;

config_sections:(config_section '\nnext')* | (config_section '\nend')* ;

config_section: ('config'*) ;*/