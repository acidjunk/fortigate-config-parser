#java.sh
shopt -s expand_aliases
source ~/.bash_profile
cp antlr_grammar/FortiGate.g4 parsers/java_parser/
cd parsers/java_parser
antlr4 FortiGate.g4
javac *.java
