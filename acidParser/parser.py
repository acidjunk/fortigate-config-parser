# The start of a Parser that can be used like a swiss army tool for Fortigate Config stuff.
# Todo: implement Pickle so we can save a project.

class Parser:
    def __init__(self, content):
        self.content = content

    def parse(self):
        pass

    def unparse(self): # will output config in Fortigate Config format
        return self.content

    def content_lines(self):
        return self.content.split("\n")


class ConfigParser(Parser):
    header = None
    global_section = None  # make sure users can use dot notation
    vdom_sections = {}

    def parse(self):  # will split config into FortigateGlobal and FortigateVDOM
        #use the first 4 lines as header
        content = self.content
        self.header = self.content_lines()[:4]
        print("Found Header {0}".format(self.header))

        # find start of global section
        start = content.find('config global')
        end = content.find('end\n\nend\n')+10  # todo; formalize? we are always looking for start and end of sections...
        self.global_section = GlobalSection(content[start:end])

        # handle vdoms
        # iterate vdom's at top so search for details can be more explicit
        excluded_words = ['config', 'vdom', 'edit', 'next', 'end', '']
        global_vdom_section = set(content[content.find('config vdom'):content.find('end')].replace('\n',' ').split(' '))
        vdom_list = [l for l in global_vdom_section if l not in excluded_words]

        for vdom in vdom_list:
            vdom_content='test'
            start = content.find('config vdom\nedit {0}'.format(vdom))
            end = content.find('end\nend\n\n', start)+12
            self.vdom_sections[vdom] = content[start:end]

        print("Found VDOMS {0}".format(vdom_list))

    def init_subsections(self):
        # todo: implement vdom + glopal section splitter and give splitted results to global_section and vdom_sections
        pass


class GlobalSection(Parser):
    system_global_section = None
    system_accprofile_section = None
    system_np6_section = None

    system_replacemsg_section = None
    system_snmp_community = None



class VDOMSection(Parser):
    pass


class SystemGlobalSection(Parser):
    pass


class SystemAccprofileSection(Parser):
    pass
