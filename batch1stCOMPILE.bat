rem Batch File for Running ANTLR
rem
echo Files: antlr4.bat, grun.bat
echo []

echo Executing: antlr4.bat==java org.antlr.v4.Tool %*
java org.antlr.v4.Tool History.g4

echo Executing: javac History*.java
javac History*.java

echo Executing: grun.bat History history -gui input-for-grammar.txt
rem grun.bat History history -gui input-for-grammar.txt