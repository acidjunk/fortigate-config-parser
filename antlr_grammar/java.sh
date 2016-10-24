#java.sh
echo "Warning: this will only create lexer and parser in this folder; suitable for experimenting..."
echo "Use the java.sh from the parent folder to create a distributable parser"
shopt -s expand_aliases
source ~/.bash_profile
antlr4 FortiGate.g4
javac *.java
sleep 3
grun FortiGate file -gui ../conf_examples/example.conf
