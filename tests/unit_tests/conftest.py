import pytest
import os
from tests.unit_tests.helpers import config_examples_dir, config_snippets_dir

@pytest.fixture
def complete_config():
    with open(os.path.join(config_examples_dir(), 'example.conf')) as f:
        config = f.read()
    return config

@pytest.fixture
def address_objects_snippet():
    with open(os.path.join(config_snippets_dir(), 'address_objects.conf')) as f:
        config = f.read()
    return config

@pytest.fixture
def address_groups_snippet():
    with open(os.path.join(config_snippets_dir(), 'address_groups.conf')) as f:
        config = f.read()
    return config

@pytest.fixture
def policies_snippet():
    with open(os.path.join(config_snippets_dir(), 'policies.conf')) as f:
        config = f.read()
    return config