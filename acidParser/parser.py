# The start of a Parser that can be used like a swiss army tool for Fortigate Config stuff.
# Todo: implement Pickle so we can save a project.

class Parser:
	content = None
	def parse(self):
		pass

	def unparse(self):
		pass


class FortigateConfigParser(Parser):
	header = None
	global_section = None # make sure users can use dot notation
	vdom_sections = None

	def __init__(self, content):
		self.content = content

	def parse(self): # will split config into FortigateGlobal and FortigateVDOM
		splitted_content = self.content.split('\n')
		self.header = splitted_content[:4]

        # find start of global section

        global_section = GlobalSection(content)


		pass

	def unparse(self): # will output config in Fortigate Config format
		pass

	def init_subsections(self):
		# todo: implement vdom + glopal section splitter and give splitted results to global_section and vdom_sections
		pass

class GlobalSection(Parser):
	system_global_section = None
	system_accprofile_section = None
	system_np6_section = None


	system_replacemsg_section = None
	system_snmp_community = None


	def __init__(self, content):
		# todo: move to parse?
		self.system_replacemsg_section("mail", "email-block")
	pass


class FortigateVDOM(Parser):
	pass


class SystemGlobalSection(Parser):
	pass


class SystemAccprofileSection(Parser):
	pass