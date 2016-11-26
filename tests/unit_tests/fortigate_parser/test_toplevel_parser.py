import pytest
from fortigate_parser.parser import ConfigParser

class TestToplevelParser(object):

    def test_config_parser_without_auto_parse(self, complete_config):
        config_parser = ConfigParser(complete_config, parse_sub_sections=False)
        config_parser.parse()
        # test if header is correct
        assert config_parser.header[0] == '#config-version=FGVM64-5.02-FW-build736-160907:opmode=0:vdom=1:user=admin'
        assert config_parser.header[1] == '#conf_file_ver=15442654067111466602'
        assert config_parser.header[2] == '#buildno=0736'
        assert config_parser.header[3] == '#global_vdom=1'
        # test if vdom and global section are found and filled
        assert config_parser.global_section
        assert 'root' in config_parser.vdom_sections
        # test that sub sections are not yet parsed
        assert not config_parser.global_section.parsed
        assert not config_parser.vdom_sections['root'].parsed

    def test_config_parser_with_auto_parse(self, complete_config):
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
        # test if the sub sections are also parsed
        assert config_parser.global_section.parsed
        assert config_parser.vdom_sections['root'].parsed

    def test_vdom_section_config_parser_without_auto_parse(self, complete_config):
        config_parser = ConfigParser(complete_config, parse_sub_sections=False)
        config_parser.parse()
        config_parser.vdom_sections['root'].parse()
        assert config_parser.vdom_sections['root'].name == 'root'
        assert config_parser.vdom_sections['root'].number_of_config_lines() == 1176

    def test_global_section_config_parser_without_auto_parse(self, complete_config):
        config_parser = ConfigParser(complete_config, parse_sub_sections=False)
        config_parser.parse()
        config_parser.global_section.parse()
        assert config_parser.global_section.number_of_config_lines() == 197