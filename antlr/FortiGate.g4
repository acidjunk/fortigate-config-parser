grammar FortiGate;

file : (config_sections '\n')* EOF ;

config_sections:(config_section '\nnext')* | (config_section '\nend')* ;

config_section: ('config'*) ;