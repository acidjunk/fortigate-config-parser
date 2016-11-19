import os
from setuptools import setup, find_packages

from fortigate_parser import __version__

APPNAME = 'fortigate-config-parser'


setup(
    name=APPNAME,
    version='.'.join(map(str, __version__)),
    packages=find_packages(),
    include_package_data=True,
    license='GPLv3 License',
    description='A parser and unparser for fortigate config files.',
    keywords='fortigate config parser',
    url='https://github.com/acidjunk/fortigate-config-parser',
    author='Rene Dohmen',
    author_email='acidjunk@gmail.com',
    install_requires=[],
    classifiers=[
        'Development Status :: 2 - Pre-Alpha',
        'License :: OSI Approved :: GNU General Public License v3 (GPLv3)',
        'Intended Audience :: Developers',
        'Natural Language :: English',
        'Programming Language :: Python',
        'Programming Language :: Python :: 2.7',
        'Programming Language :: Python :: 3',
        'Programming Language :: Python :: 3.3',
        'Programming Language :: Python :: 3.4',
        'Programming Language :: Python :: 3.5',
    ],
)
