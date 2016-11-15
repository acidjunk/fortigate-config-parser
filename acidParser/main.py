import os, sys

from parser import FortigateConfigParser

with open(os.path.join('..','conf_examples','example.conf')) as f:
    content = f.read()

fortigate_config_parser = FortigateConfigParser(content)
fortigate_config_parser.parse()
