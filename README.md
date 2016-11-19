# python-fortigate-config-parser
A attempt to write a fast and extendable parser for Fortigate Config Files in python. It will use custom python parser
to split the config into chunks that will get parsed by an antlr generated parser.

This program will, for now, only contain a parser; e.g. a way to read Fortigate config and split it into a nested
python dict. Which can be serialzed to a Fortigate config file again.