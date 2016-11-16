import os, sys

from parser import ConfigParser

try:
    filename = sys.argv[1]
except:
    print("No filename specified, using default example.conf")
    filename = os.path.join('..', 'conf_examples', 'example.conf')


with open(filename) as f:
    config = f.read()

config_parser = ConfigParser(config)
config_parser.parse()

# print config_parser.global_section.config
# print config_parser.vdom_sections['root']

config_parser.vdom_sections['root'].parse()
print config_parser.vdom_sections['root'].name
config_parser.vdom_sections['root'].system_zone_section.parse()
print config_parser.vdom_sections['root'].system_zone_section.zones


# Stats
print('\n\nSTATS\n------------------------------')
print('Lines in global section: {}'.format(len(config_parser.global_section.config_lines())))
print('Vdoms in vdom sectiosn: {}'.format(len(config_parser.vdom_sections)))



