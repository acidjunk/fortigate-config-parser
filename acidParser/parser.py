# The start of a Parser that can be used like a swiss army tool for Fortigate Config stuff.
# Todo: implement Pickle so we can save a project.

class Parser:
	content = None
	def parse(self):
		pass

	def unparse(self):
		pass


class FortigateConfigParser(Parser):
	sections = None # will contain {'global_section': FortigateGlobal, 'vdom_sections': FortigateVDOM }

	global_section = None # make sure users can use dot notation
	vdom_sections = None


	def parse(self): # will split config into FortigateGlobal and FortigateVDOM
		pass

	def unparse(self): # will output config in Fortigate Config format
		pass

	def init_subsections(self)
		# todo: implement vdom + glopal section splitter and give splitted results to global_section and vdom_sections
		pass

class FortigateGlobal(Parser):
	sections = None # will contain {'global_section': FortigateGlobal, 'vdom_section': FortigateVDOM }

	pass


class FortigateVDOM(Parser):
	pass