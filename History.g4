//Carlos Ontiveros, James Taylor 
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
		"Event "[_]" took place on "[_]" and it involved "[_]" and "[_]" and " ...
		
		LIFE
			Past
			Present
			Future
		
	II. Other
		events
			history
			news
			other
		LIFE
			Past
			Present
			Future
													
		"	event	"	[_]	"	is taking place on	"	[_]		"	and it involves		"	[_] " and "	[_] " and " ...
		"	event	"	[_]	"	will take place on	"	[_]		"	and it will involve	"	[_] " and "	[_] " and " ...

*/
// Define a grammar called Hello
/*
	events
	are

	prog	:	'history' event  date ';'
			|	event  date  actors ';'
			|	event  date  actors  history* ';'
			;
	
	Example:
	=============================================================
	Date dateCarlos = 1987;
	Date d2 = 19870925;
	Actor a1 = "Carlos";
	DESCRIPTION des1 = "This is a birthday";
	DESCRIPTION des_type = "birthday";
	DESCRIPTION desType2 = "war";
	DESCRIPTION desType3 = "marriage";
	DESCRIPTION desType4 = "wedding";
	Event CarlosBDay = new Event();
	Event charlieBday = new Event(1987,"Carlos","the birthday of");
	Print(charlieBday);
	
	Code 2:
		Date d1 = 20170515;
		Actors a1 = new Actors("Carlos","james");
		DESCRIPTION des_e1 = new DESCRIPTION("Graduation");		
		Event GradParty = new Event(d1,a1,des_e1);		
		Print()// "On" d1 there is a "des_e1" for "a1"
				// On 20170515 there is a graduation for Carlos and James
				// On [May 5, 2017] there is a graduation for Carlos and James.
				//
	Code 3:
		//sample
		//On 1944 there is a war for USA and Japan
		//Event [war] took place on [1994] and it involved [USA and Japan].
*/

//grammar Hello;
grammar History;

prog : r r*;
//prog2: DD ';' ;
r  : 'hello' ID r* ';' ;         // match keyword hello followed by an identifier
ID : [a-z]+ ;             // match lower-case identifiers
//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines


			/*	history language	*/
			/* Language				*/
			
//			history		"describe the event"	date	(actor1) (actor2)

history	:	event+ ;
event	:	'event'	DESCRIPTION 			date	actors				';'
		;

DESCRIPTION	: '"' [a-zA-Z_]+ [0-9]* '"' 			//+ one or more; DESCRIPTION must be in quotes
			| '"'	[a-z] 
			//:	'"' '"'
			| 	'"' WS* DESCRIPTION* WS* '"'
		//	|	'"' WS* [a-zA-Z_]+ [a-zA-Z_]* '"'
		//	|	'"' WS* [a-zA-Z_]+ WS* [a-zA-Z_]* '"'
		//	|	'"' WS* [a-zA-Z_]+ WS* [a-zA-Z_]* WS* '"'
			
		//	//:	'"' [a-zA-Z_]+ WS [a-zA-Z_]* '"'	//+ one or more
			;
		
date	:	YEAR
		|	YEAR '-' MM
		|	YEAR '-' MM '-' DD		
		;

YEAR	:	[1-2] ([0] | [8-9]) DIGIT DIGIT	//1 ('8'..'9') digit digit
		;
		
MM		:	[0] [1-9]						//'0' ('1'..'9')
		|	[1] [0-2]						//'1' ('0'..'2')
		;

DD		:	[0-2] DIGIT	
		|	[3] [0-1]
		;





DIGIT	:	[0-9] //('0'..'9')	//0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
		;

actors	:	actor 
		|	actor actor*
		;

actor	:	NAME
		;


		
NAME	:	'(' [a-zA-Z_]+ ')'	// NAME is NOT in quotes, it's in Parenthesis
		;
		
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines		
