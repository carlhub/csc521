//Carlos Ontiveros, James Taylor 
//CSC 521 Spring 2017
//History grammar
//Language Definition for "History Language"
//===========================================
grammar History;


history	:	event  date
		|	event  date  actors
		|	event  date  actors  history* 
		;

event	:	war 
		| languages 
		| birth 
		| marriage
		;

date	:	year 
		| year mm dd
		;

year	:	1 [8-9] digit digit
		;

mm		:	[0-1] [0-2] 
		| 0 [0-9]
		;

dd		:	[0-3] [0-9]
		;

digit	:	0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
		;

actors	:	actor 
		|	actor actor*
		;

actor	:	name
		;

name	:	a | .. |z
		|	[a-z]*
		;

WS		:	[ \t\r\n]+ -> skip //skip white space
		;