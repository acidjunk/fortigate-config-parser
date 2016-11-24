from os.path import dirname, join as path_join


def config_examples_dir():
    return path_join(dirname(__file__), 'fortigate_parser', 'config_examples')


def config_snippets_dir():
    return path_join(dirname(__file__), 'fortigate_parser', 'config_examples')