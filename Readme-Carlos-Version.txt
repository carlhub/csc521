CSC521 
Homework #1

Create New languages

carlos, Im going to figure this out soon.

git *commonly used commands
git status
git log
git init
git add .
git commit -m "new comment added"
git push -u origin master


Carlos, I'm checking to see if I can do procedure bymyself.

February 9 2017
	JT good job! Lets put our ideas in here and keep working on it.
	I've heard good things about "Java ANTLR". I'll check it out later.
	
2/9/17
	Themes/Subjects
	War
		Dates
		Title/Names
		Combatants
		.
		.
		.
	Computer Evolution
		Date
		Title/Names
		Company
		.
		.
		.
	Look into "Java ANTLR"
	James Taylor
CSC521


Homework 1
•	Due: 2/27 -- late homework not accepted
•	Up to two students may collaborate; please be prepared to discuss individual contributions
Details
The objective of this homework assignment is to define your own language or DSL and to write a matching lexical analyzer. It is possible that your DSL may be incomplete at this stage. This is Ok. We just need to get started.
•	You should pick a domain (area) that is of interest to your team. Once the domain is defined, you will need to identify key features of the domain. For example, if you were to pick stock market/financial domain, some key features would include trading rules, conditions, calculating moving average, etc.
•	Next you should come up with a simple grammar rule for your language and corresponding examples. For example, you might have something like the following to represent definition of a variable, update the variable, and printing the variable:
i = new SYM(ibm);
UPDATE(i);
print(i);
Obviously the above example is fairly limited. Your DSL should be much more complete and comprehensive. Tip: you should spend at least 2 to 3 hours thinking about the domain and studying up on it; unless, of course, it's something that you are intimately familiar with.
•	Finally, you will write a lexical analyzer. The goal of this task is to read in various code examples and build tokens. Your program should also print out othe tokens.
In the above example, the output would be
STATEMENT: 
   ID 
   T_ASSIGNMENT
   T_OP
   T_FN
   T_DELIM
STATEMENT:
   T_FN
   T_LPAREN
   ID
   T_RPAREN
   T_DELIM
STATEMENT:
   T_FN
   T_LPAREN
   ID
   T_RPAREN
   T_DELIM
Note that the above example is not the only way to represent your symbol table. It's a way and you are free to represent the symbol table in any other fashion, as long as it's clear and correspond correctly to the language specification.
Grading Scale/Criteria
•	5 completed correctly + enhancements
•	4 all requirements are met
•	3 all but a few requirements are met
•	2 significant number of requires are missing
•	0 not completed
Submission
Students will need to demonstrate their homework assignment in class.
  
Proposal for the project 

History Date Learner
Example of date
1942 “the start of WWII”
1963 “the United states enter in the Vietnam Conflict in has police action. 
This Program will allow user to enter a year, and upon entering a year the program will display a historical event that occurred in that year.  After displaying the year and the event, the program will display the tokens of the output using the lexical analyzer.  Also the program will be able to list add and subtract year and list them in chronological order corresponding lexical analyzer output displayed. 
Input -> 1963
Output -> in 1963 the United States of America enter into the Vietnam conflict has Police Action. 
Lexical analyzer output ->  int- int – int  - string  or  int – int – int – char- char- char – char – char 
I’m not really sure of the output of the lexical analyzer. Im following the example from class


Step in doing the project 
1.	Design a DSL 
2.	Organize datum for the demonstration 
3.	Find, write or use a lexical analyzer 
4.	Create source code for the project 
Java lexical analyzer
http://www.antlr.org/download.html

C++ code Here is some sample code to work, but we need still clearly understand the problem 
#include<iostream>
#include<process.h>
#include<conio.h>
#include<string>
using namespace std;

struct node
{
	string data;
	node* next;
};

class source_code
{
	node* head;
public:
	source_code()
	{
		head = NULL;
	}
	void display();
	void add_lexeme(string);
	~source_code();
};

void source_code::add_lexeme(string lexeme)
{
	node* p = new node;
	p->next = NULL;
	p->data = token;

	if (head = NULL)
		head = p;
	else
	{
		node* q = NULL;
		for (q=head ; q->next != NULL ; q = q->next);
		q->next = p;
		p->next = NULL;
	}
}

source_code::~source_code()
{
	node* p;
	while (head != NULL)
	{
		p = head;
		head = head->next;
		delete p;
	}
	head = NULL;
}

void source_code::display()
{
	cout<<" ";
	for (node* p = head ; p != NULL ; p = p->next)
	{
		cout << p->data;
		cout << endl;
	}
	cout << endl;
}

class symbol_table
{
	node* head;
public:
	symbol_table()
	{
		head = NULL;
	}
	void display();
	void add_token(string);
	symbol_table add_premitives(symbol_table &);
	bool lexical_analysis(string input);
	~symbol_table();
};

bool symbol_table::lexical_analysis(string input)
{
	source_code sc;
void symbol_table::add_token(string token)
{
	node* p = new node;
	p->next = NULL;
	p->data = token;

	if (head = NULL)
		head = p;
	else
	{
		node* q = NULL;
		for (q=head ; q->next != NULL ; q = q->next);
		q->next = p;
		p->next = NULL;
	}
}

symbol_table::~symbol_table()
{
	node* p;
	while (head != NULL)
	{
		p = head;
		head = head->next;
		delete p;
	}
	head = NULL;
}

void symbol_table::display()
{
	cout<<" ";
	for (node* p = head ; p != NULL ; p = p->next)
	{
		cout << p->data;
		cout << endl;
	}
	cout << endl;
}

symbol_table symbol_table::add_premitives(symbol_table &st)
{
	symbol_table::add_token("int	DT");
	symbol_table::add_token("char   DT");
	symbol_table::add_token("float  DT");
	symbol_table::add_token("double DT");
	symbol_table::add_token("bool   DT");
	symbol_table::add_token("+     MOP");
	symbol_table::add_token("-	   MOP");
	symbol_table::add_token("*	   MOP");
	symbol_table::add_token("/     MOP");
	symbol_table::add_token("<     ROP");
	symbol_table::add_token(">	   ROP");
	symbol_table::add_token("==    ROP");
	symbol_table::add_token("!=    ROP");
	symbol_table::add_token("<=    ROP");
	symbol_table::add_token(">=    ROP");
	symbol_table::add_token("&&    LOP");
	symbol_table::add_token("||    LOP");
	symbol_table::add_token("if    CSS");
	symbol_table::add_token("for   CSS");
	symbol_table::add_token("0   const");
	symbol_table::add_token("1   const");
	symbol_table::add_token("2   const");
	symbol_table::add_token("3   const");
	symbol_table::add_token("4   const");
	symbol_table::add_token("5   const");
	symbol_table::add_token("6   const");
	symbol_table::add_token("7   const");
	symbol_table::add_token("8   const");
	symbol_table::add_token("9   const"); 
	return st;
}

void main()
{
	symbol_table st;
	st.display();
	//st = st.add_premitives(st);
	cout <<"Done successfully";
	string input;
	cin >> input;
	while ( input != "exit")
	{
		// checking
		cin >> input;
	}
}
}


===========================================================================================================
Here are some ideas on the grammer as well as a list and dates since 1980.

Possible Grammar
=====================
int_primitive		->	0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
int_year			->	1 8 [8-9] int_primitive
int_year_range		->	1889 | 1890 | 1891 | 1892 | ... | 2015 | 2016
int_year_range_form	->	int_year - int_year

char				->	char* | [A-Z] | [a-z]
char_statement		->	" char* | "


War Title/Years (From 1890 until present)
=============================================
Pine Ridge Campaign 
(1890–1891)
Garza Revolution 
(1891–1893)
Rio de Janeiro Affair 
(1894)
Yaqui Wars 
(1896-1918)
Second Samoan Civil War 
(1898–1899)
Spanish–American War 
(1898)
Philippine–American War 
(1899–1902)
Boxer Rebellion 
(1899–1901)
Crazy Snake Rebellion 
(1909)
Border War 
(1910–1919)#
Negro Rebellion 
(1912)#
Occupation of Nicaragua. 
(1912–1933)#
Bluff War 
(1914–1915)
Occupation of Haiti. 
(1915–1934)#
Sugar Intervention 
(1916–1918)#
Occupation of the Dominican Republic 
(1916–1924)#
World War I 
(1917–1918)
Russian Civil War 
(1918–1920)#
Posey War 
(1923)
World War II 
(1941–1945)
Korean War 
(1950–1953)#
Lebanon Crisis 
(1958)#
Bay of Pigs Invasion 
(1961)#
Simba Rebellion 
(1964)#
Dominican Civil War 
(1965–1966)#
Vietnam War 
(1965–1975)
Communist insurgency in Thailand 
(1965–1983)
Shaba II 
(1978)
Multinational Force in Lebanon 
(1982-1984)#
Invasion of Grenada 
(1983)#
Tanker War 
(1987–1988)
Invasion of Panama 
(1989–1990)
Gulf War 
(1990–1991)
Somali Civil War 
(1992–1995)#
Intervention in Haiti 
(1994–1995)
Bosnian War 
(1994–1995)#
Kosovo War 
(1998–1999)#
War in Afghanistan 
(2001–2014)#
Iraq War 
(2003–2011)#
War in North-West Pakistan 
(2004–present)#
2011 military intervention in Libya 
(2011)#
War on ISIL: Operation Inherent Resolve
(2014–present)#