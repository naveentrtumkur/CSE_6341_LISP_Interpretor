##############################################
#			README FILE 					 #
##############################################


Requirements:
1. LispInterpreter requires java version 1.8( Specifically "1.8.0_181") for execution.
2. All teh files should be within the same directory.
3. Input is passed through command Line (STDIN).

Assumptions for Giving the Input:
1. You can enter SExpression (with whitespaces). Enter a '$' to indicate end of SExpression.
2. Enter '$$' to exit out of the program.
3. Symbolic atoms start with an alphabet, followed by alphanumeric characters. They can contain small or UpperCase letters.
4. Atoms have length restrictions.
   - Numeric atoms: Maximum length of 6 characters, if a '+' or '-' used then 7 is maximum. Null atom is not accepted.
   - Symbolic Atom: Maximum length of 10 characters.
5. '+' or '-' sign is used for numeric atom. There shouldn't be a space immediately following a '+' or '-'.
6. An SExpression can have ' ' or '\t' or '\n' as whitespace characters.
7. When first occurance of parsingFails, teh entire parseTree collapses and moves to accept the next input.
	Example: (AdditionFunctions (+4 -3)) The tree collapses as soon as it sees a symbolic atom length > 10.
8. A '+' sign is actually ignored and stored internally. A '-' sign would be retained.
	Example: +3 would be stored as 3, but -5 would be stored as -5.

Instructions for running interpreter:
1. Make sure the current directory contains all the .java files and Makefile.

2. Open terminal and move to project directory.
	$make
	This would compile all the .java files and create corresponding classes for them.

3. Below command would run the interpretor.
	a. $java LispInterpretor
		- Interpretor comes up and accepts input SExpression from user
	
4. Cleaning the current directory
    a. $make clean
		-Clean up the current directory and remove all the class files that were generated from compilation.

Output Screen:
1. After a '$' sign is placed after input, output will be displayed.
2. Sufficient error message will be printed if there's an Exception.
3. Whether the current SExpression is valid or exception is thrown, the interpretor goes to accept next input.
	- You can only break out if you press a '$$' key while inputting SExpression.

