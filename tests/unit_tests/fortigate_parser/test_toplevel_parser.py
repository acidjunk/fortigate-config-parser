import pytest
from fortigate_parser.parser import ConfigParser

class TestToplevelParser(object):

    def test_config_parser(self, complete_config):
        config_parser = ConfigParser(complete_config)
        config_parser.parse()
        # test if header is correct
        assert config_parser.header[0] == '#config-version=FGVM64-5.02-FW-build736-160907:opmode=0:vdom=1:user=admin'
        assert config_parser.header[1] == '#conf_file_ver=15442654067111466602'
        assert config_parser.header[2] == '#buildno=0736'
        assert config_parser.header[3] == '#global_vdom=1'
        # test if vdom and global section are found and filled
        assert config_parser.global_section
        assert 'root' in config_parser.vdom_sections

    def test_vdom_section_config_parser(self, complete_config):
        config_parser = ConfigParser(complete_config)
        config_parser.parse()
        config_parser.vdom_sections['root'].parse()
        assert config_parser.vdom_sections['root'].name == 'root'
        assert config_parser.vdom_sections['root'].number_of_config_lines() == 1176

    def test_global_section_config_parser(self, complete_config):
        config_parser = ConfigParser(complete_config)
        config_parser.parse()
        config_parser.global_section.parse()
        assert config_parser.global_section.number_of_config_lines() == 197