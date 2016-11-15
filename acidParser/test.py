import os, sys

from parser import ConfigParser

try:
    filename = sys.argv[1]
except:
    print("No filename specified, using default example.conf")
    filename = os.path.join('..', 'conf_examples', 'example.conf')


with open(filename) as f:
    content = f.read()

config_parser = ConfigParser(content)
config_parser.parse()

# print config_parser.global_section.content
# print config_parser.vdom_sections['root']



# Stats
print('\n\nSTATS\n------------------------------')
print('Lines in global section: {}'.format(len(config_parser.global_section.content_lines())))
print('Vdoms in vdom sectiosn: {}'.format(len(config_parser.vdom_sections)))



