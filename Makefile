SHELL = /bin/bash

java_parser:
    cd    

python2_parser:


acceptance:
    robot -d tests/acceptance_tests/results tests/acceptance_tests/tests

clean:
    rm -f antlr_grammar/*.py
    rm -f antlr_grammar/*.pyc
    rm -f antlr_grammar/*.lexer
    rm -f antlr_grammar/*.tokens
    rm -f antlr_grammar/*.java
    rm -f antlr_grammar/*.javac
