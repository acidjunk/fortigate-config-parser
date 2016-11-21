About the Fortigate config parser
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

It's main function is to save parts of the config in a Object Oriented way.

The goal of the design is to make sure users of the classes can use dot notation when the have loaded one or more
config file. It should feel comfortable for users that have experience with Fortigate configuration. A second goal is
the ability to facilitate fortigate config parser projects without having a complete parser implementation yet. As the
parser is a work in progress this will hopefully lead to a model were developers implement the (sub)parsers that they
need, resulting in a complete parser.

Features
--------
All parser classes inherit from Parser, which has the folowwing functionality:

- ability to store unparsed config
- ability to return the stored config in a Fortinet compliant way
- ability to return config as a list, splitted by \n
- ability to keep track of whether a sub parser is implemented
- some easy metrics

This makes it very easy to define Parser childs that 'sort of work' without really parsing the config.
Writing more specialised classes, that really parse config, can be delegated to classes that we are interested in.
This ensures a useful, and testable, parser at the start of the project which can gradually refined and enriched
during the project.

.. note::
    When self.parsed is set to True; the parser will return parsed content instead of the unhandled stored config file
    content.

An example
----------
A short example to demonstrate how to use it

.. code-block:: python

    with open('fortinet.conf') as f:
        config = f.read()
    fortigate = ConfigParser(config)
    fortigate.parse()
    # from here on you can use the dot notation
    zone_list = fortigate.global_section.
    zone_list = fortigate.vdom_sections['TEST_VDOM'].system_zone_section

