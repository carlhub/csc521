//Carlos Ontiveros, 
//James Taylor 
//CSC 521 Spring 2017
//History grammar
//Language Definition for "History Language"
//===========================================
/*
	I. Events
		Idea one is a languge called "events". The events can be either from history or current news. Historical event will be described in the past tense while "news" will be described in the present tense. This language can be used for writing stories or to write about current events taking place in the world.
	Events in History
	event:	what who when					
	when:				
		ex: the event occurred on, the event will occur on, the following event is occuring
				DESCRIPTION					DATE						ACTORS
		
		"	event	"	[_]	"	took place on		"	[_]		"	and involved		"	[_] " and "	[_] " and " ...
		
		//Event [war] took place on [1994] and it involved [USA and Japan].
*/




			/*	history language	*/
			/* Language				*/

grammar History;		
history	:	event+ ;

//event	:	'event' "describe the event"	date	(actor1) (actor2) ...
event	:	'event'	DESCRIPTION 			date 	actors	';'
		;

DESCRIPTION	: '"'  [a-zA-Z_]+ ( [0-9] | [a-zA-Z] | ' ')* 			//+ one or more; DESCRIPTION must be in quotes
			 '"'
			;
		
date	:	YEAR
		|	YEAR  MM
		|	YEAR  MM  DD				
		;

YEAR	:	[1-2] ([0] | [8-9]) DIGIT DIGIT	//1 ('8'..'9') digit digit
		;
		
MM		:	'-' [0] [1-9] '-'						//'0' ('1'..'9')
		|	'-' [1] [0-2] '-'						//'1' ('0'..'2')
		;

DD		:	[0-2] [0-9]
		|	[3] [0-1]
		;

DIGIT	:	[0-9] //('0'..'9')	//0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
		;

actors	:	actor 
		|	actor actor*
		;

actor	:	NAME
		;

		
NAME	:	'(' [a-zA-Z_]+ ([a-zA-Z] | [' '] )* ')'	// NAME is NOT in quotes, it's in Parenthesis
		
		;
		
WS 		: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines		

/*
WS		: ( ' '
		| '\t'
		| '\r'
		| '\n'
			)
		;
*/