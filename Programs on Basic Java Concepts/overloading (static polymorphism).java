/*
Static polymorphism / method overloading

overloaded methods defined in the same class
*/

import java.util.Scanner ;

class methods
{
void add(int a, int b)
	{System.out.println("Result from method 1 is "+(a+b)) ;}

void add(int a, int b, int c)
	{System.out.println("Result from method 2 is "+(a+b+c)) ;}
}

class overloading extends methods
{
int a, b, c ;

overloading(int a, int b)
	{
	this.a = a ;	this.b = b ;
	}

overloading(int a, int b, int c)
	{
	this.a = a ;	this.b = b ;	this.c = c ;
	}

public static void main(String args[])
{

Scanner S = new Scanner(System.in) ;

overloading o1 = new overloading(5,6) ;
overloading o2 = new overloading(5,8,10) ;

/* overloading o1 = new overloading(5,-1) ;
It throws error - variable o1 already defined in main() */

o1.add(5,6) ;
o2.add(5, 8, 10) ;

}
}
/*Code working without errors*/
______________________________________________________________________________________



/*
overloaded methods defined in the separate classes
*/

import java.util.Scanner ;

class methods1
{
void add(int a, int b)
	{System.out.println("Result from method 1 is "+(a+b)) ;}
}

class methods2 extends methods1
{
void add(int a, int b, int c)
	{System.out.println("Result from method 2 is "+(a+b+c)) ;}
}

class overloading extends methods2
{
int a, b, c ;

overloading(int a, int b)
	{
	this.a = a ;	this.b = b ;
	}

overloading(int a, int b, int c)
	{
	this.a = a ;	this.b = b ;	this.c = c ;
	}

public static void main(String args[])
{

Scanner S = new Scanner(System.in) ;

overloading o1 = new overloading(10, 23) ;
overloading o2 = new overloading(-5, 10) ;

/* overloading o1 = new overloading(5,-1) ;
It throws error - variable o1 already defined in main() */

o1.add(10, 23) ;
o2.add(-5, 10) ;

}
}

/*Code working without errors*/

_________________________________________________________________________________________

/*
overloading using interfaces
*/

import java.util.Scanner ;

interface methods1
{
void add(int a, int b) ;
}

class methods2 implements methods1
{
void add(int a, int b, int c)
	{System.out.println("Result from class method 2 is "+(a+b+c)) ;}

public void add(int a, int b)
	{System.out.println("Result from interface method 1 is "+(a+b)) ;}
}

class overloading extends methods2
{
int a, b, c ;

overloading(int a, int b)
	{
	this.a = a ;	this.b = b ;
	}

overloading(int a, int b, int c)
	{
	this.a = a ;	this.b = b ;	this.c = c ;
	}

public static void main(String args[])
{

Scanner S = new Scanner(System.in) ;

overloading o1 = new overloading(10, 3) ;
overloading o2 = new overloading(-5, -10, 3) ;

/* overloading o1 = new overloading(5,-1) ;
It throws error - variable o1 already defined in main() */

o1.add(10, 3) ;
o2.add(-5, -10, 3) ;

}
}

/*Code working without errors*/
