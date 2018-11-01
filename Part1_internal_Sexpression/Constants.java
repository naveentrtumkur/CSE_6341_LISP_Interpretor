//package osu.CSE6341.LISP;

// This class Defines all the constants that will be used by our program.
public class Constants {

	// Make the constants static so that they belong to class and can be reused in other class.
	public static int UNASSIGNED = 0; //Unassigned atom
    public static int NUMERIC = 1; // Numeric atom
    public static int SYMBOL = 2; //Symbolic atom (Identifier)
    public static int NONATOM = 3; // It's a non-atom.

    // Special Characters like bracket and operators are 
    public static  String TOK_LPAREN = "(";
    public static  String TOK_RPAREN = ")";
    public  static String TOK_DOT = ".";
}
