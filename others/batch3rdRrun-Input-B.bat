rem Batch File for Running ANTLR
rem
rem echo Files: antlr4.bat, grun.bat
rem echo []

rem echo Executing: antlr4.bat==java org.antlr.v4.Tool %*
rem java org.antlr.v4.Tool History.g4

rem echo Executing: javac History*.java
rem javac History*.java


echo Executing: grun.bat History history -gui input-for-grammar.txt

grun.bat History prog -gui input-for-grammar-ver-2.txt

rem 
rem java Calc input LibExpr