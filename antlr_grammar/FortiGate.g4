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


file: config_vdom config_global config_vdom+;

config_global	: 'config global' config_system+ NEWLINE NEWLINE 'end' ;
config_system	: 'config system' IDENTIFIER NEWLINE statements+ NEWLINE 'end' ;
config_vdom		: 'config vdom' (statements)* NEWLINE 'end' ;

edit_section	: 'edit' '"'IDENTIFIER'"' NEWLINE set_statement* 'next' ;

set_statement	: 'set' IDENTIFIER+ NEWLINE ;

/* a statement can be either a nested config section or some statements */
statements		: edit_section
				| set_statement
				| WORD+
				| CATCH_ALL+
				;


//LEXER RULES
WORD    	: ('a'..'z' | 'A'..'Z')+;
NEWLINE		: '\r'? '\n' ; // return newlines to parser: TODO; determine if we need this to determine END of section
WS 			: [ \t]+ -> skip ; // Define whitespace rule, toss it out
COMMENT		: '#' -> skip ;

CATCH_ALL : . ;

/* All distinct config tokens */
//Found in GLOBAL config part
CONFIG_GLOBAL 						: 'config global'
CONFIG_SYSTEM_GLOBAL 				: 'config system global'
CONFIG_SYSTEM_ACCPROFILE			: 'config system accprofile'
CONFIG_SYSTEM_INTERFACE				: 'config system interface'
CONFIG_SYSTEM_CUSTOM_LANGUAGE			: 'config system custom-language'
CONFIG_SYSTEM_ADMIN						: 'config system admin'
CONFIG_SYSTEM_HA						: 'config system ha'
CONFIG_SYSTEM_DNS						: 'config system dns'
CONFIG_SYSTEM_REPLACEMSG_IMAGE			: 'config system replacemsg-image'
CONFIG_SYSTEM_REPLACEMSG_MAIL			: 'config system replacemsg mail "email-block"'
CONFIG_VPN_CERTIFICATE_LOCAL			: 'config vpn certificate local'
CONFIG_USER_DEVICE_CATEGORY				: 'config user device-category'
CONFIG_SYSTEM_RESOURCE_LIMITS			: 'config system resource-limits'
CONFIG_SYSTEM_VDOM_PROPERTY				: 'config system vdom-property'
CONFIG_SYSTEM_SESSIONS_SYNC				: 'config system session-sync'
CONFIG_SYSTEM_SESSIONS_HELPER			: 'config system session-helper'

//Found in VDOM config part
CONFIG_VDOM 							: 'config vdom'
CONFIG_SYSTEM_SETTINGS					: 'config system settings'
CONFIG_SYSTEM_REPLACEMSG_GROUP			: 'config system replacemsg-group'
CONFIG_FIREWALL_ADDRESS					: 'config firewall address'
CONFIG_FIREWALL_MULTICAST_ADDRESS		: 'config firewall multicast-address'
CONFIG_FIREWALL_ADDRESS6				: 'config firewall address6'
CONFIG_FIREWALL_SERVICE_CATEGORY		: 'config firewall service category'
CONFIG_FIREWALL_SERVICE_CUSTOM			: 'config firewall service custom'
CONFIG_FIREWALL_SERVICE_GROUP			: 'config firewall service group'
CONFIG_WEBFILTER_FTGD_LOCAL_CAT			: 'config webfilter ftgd-local-cat'
CONFIG_IPS_SENSOR						: 'config ips sensor'
CONFIG_FIREWALL_SHAPER					: 'config firewall shaper traffic-shaper'
CONFIG_WEB_PROXY_GLOBAL					: 'config web-proxy global'
CONFIG_APPLICATION_LIST					: 'config application list'
CONFIG_DLP_FILEPATTERN					: 'config dlp filepattern'
CONFIG_DLP_FP_SENSITIVITY				: 'config dlp fp-sensitivity'
CONFIG_DLP_SENSOR						: 'config dlp sensor'
CONFIG_WEBFILTER_CONTENT				: 'config webfilter content'
CONFIG_WEBFILTER_URLFILTER				: 'config webfilter urlfilter'
CONFIG_SPAMFILTER_BWORD					: 'config spamfilter bword'
CONFIG_SPAMFILTER_BWL					: 'config spamfilter bwl'
CONFIG_SPAMFILTER_MHEADER				: 'config spamfilter mheader'
CONFIG_SPAMFILTER_DNSBL					: 'config spamfilter dnsbl'
CONFIG_SPAMFILTER_IPTRUST				: 'config spamfilter iptrust'
CONFIG_LOG_THREAT_WEIGHT				: 'config log threat-weight'
CONFIG_ICAP_PROFILE						: 'config icap profile'
CONFIG_USER_LOCAL						: 'config user local'
CONFIG_USER_GROUP						: 'config user group'
CONFIG_USER_DEVICE_GROUP				: 'config user device-group'
CONFIG_VPN_SSL_WEB_HOST_CHECK_SOFTWARE 	: 'config vpn ssl web host-check-software'
CONFIG_VPN_SSL_WEB_PORTAL				: 'config vpn ssl web portal'
CONFIG_VPN_SSL_SETTINGS					: 'config vpn ssl settings'
CONFIG_VOIP_PROFILE						: 'config voip profile'
CONFIG_WEBFILTER_PROFILe				: 'config webfilter profile'


//Found in nested constructions
CONFIG_ENTRIES							: 'config entries'
CONFIG_WEB 								: 'config web'
CONFIG_APPLICATION						: 'config application'
CONFIG_SIP 								: 'config sip'
CONFIG_FTGD_WF							: 'config ftgd-wf'
CONFIG_FILTERS 							: 'config filters'






END 							: 'end'
NEXT 							: 'next'





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