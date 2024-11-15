
/*
Accessing 2 static methods - 1 in the class containing main function & other static method
 in a separate class, with inheritance.
*/

class A
{
static void displayA()
	{
	System.out.println("This is class A") ;
	}
}

class TestStaticAccess extends A
{
static void displayB()
	{
	System.out.println("This is the class containing main function") ;
	}

public static void main(String args[])
{
displayA() ;
displayB() ;

}//end of main()

}//end of class TestStatic

/*
Code working as expected.

If extends A was not written at class TestStaticAccess extends A, in that case, to access the displayA()
method in class A, we had to use class name to access it's method i.e. A.displayA() ;
*/

//_____________________________________________________________________

/*
Accessing 2 static methods - 1 in the class containing main function & other static method
 in a separate class, without inheritance.
*/


class A
{
static void displayA()
	{
	System.out.println("This is class A") ;
	}
}

class TestStaticAccess 
{
static void displayB()
	{
	System.out.println("This is the class containing main function") ;
	}

public static void main(String args[])
{
//displayA() ;	//throws error ' cannot find symbol '
A.displayA() ;
displayB() ;

TestStaticAccess.displayB() ;	//no errors

}//end of main()

}//end of class TestStatic

//_______________________________________________________________________________

/*
Accessing static method of one class using the claasname of another class i.e. accessing static method 
of a class using a class name that does not contain the method being accessed. 
*/


class A
{
static void displayA()
	{
	System.out.println("This is class A") ;
	}
}

class TestStaticAccess extends A
{
static void displayB()
	{
	System.out.println("This is the class containing main function") ;
	}

public static void main(String args[])
{
A.displayA() ;
displayB() ;

TestStaticAccess.displayA() ;
/* throws error ' cannot find symbol ' if the keyword extends is not used i.e. if 
extends A is not written at class TestStaticAccess extends A */

}//end of main()

}//end of class TestStatic

/*
The code is working as expected. This is possible only with inheritance i.e. with ' extends ' keyword.
O/P:
This is class A
This is the class containing main function
This is class A
*/
//======================================================================================

Below 2 examples are related. 

import java.util.Scanner ;

class Initialization
{
static int m, n ;
	Initialization(int m, int n)
	{
	System.out.println("\nConstructor of Initialization class has been triggered.") ;
	this.m = m ;
	this.n = n ;
	System.out.println("Exiting the constructor of the Initialization class.\n") ;
	}
}//end of class Initialization

class Execution extends Initialization
{
	Execution(int a, int b)
	{
	//System.out.println("Constructor of Execution class triggered.") ;
	//error: call to super must be first statement in constructor
	super(a, b) ;
	System.out.println("Exiting the constructor of the Execution class.\n") ;
	}
public static void main(String args[])
{
int a, b, i ;
Scanner S = new Scanner(System.in) ;

System.out.print("Enter the value of a:\t") ;
a = S.nextInt() ;
System.out.print("Enter the value of b:\t") ;
b = S.nextInt() ;

Execution e = new Execution(a, b) ;

System.out.println("Value of a in Main() is "+m) ;
System.out.println("Value of b in Main() is "+n) ;
//works fine

}// end of main()
}//end of class Execution

/*
O/P:

Enter the value of a:   45
Enter the value of b:   90

Constructor of Initialization class has been triggered.
Exiting the constructor of the Initialization class.

Exiting the constructor of the Execution class.

Value of a in Main() is 45
Value of b in Main() is 90
*/

//______________________________________________________________________________

import java.util.Scanner ;

class Initialization
{
int m, n ;
	public Initialization(int m, int n)
	{
	System.out.println("\nConstructor of Initialization class has been triggered.") ;
	this.m = m ;
	this.n = n ;
	System.out.println("Exiting the constructor of the Initialization class.\n") ;
	}
}//end of class Initialization

class Execution extends Initialization
{
	Execution(int a, int b)
	{
	//System.out.println("Constructor of Execution class triggered.") ;
	//error: call to super must be first statement in constructor
	super(a, b) ;
	System.out.println("Exiting the constructor of the Execution class.\n") ;
	}
public static void main(String args[])
{
int a, b, i ;
Scanner S = new Scanner(System.in) ;

System.out.print("Enter the value of a:\t") ;
a = S.nextInt() ;
System.out.print("Enter the value of b:\t") ;
b = S.nextInt() ;

Execution e = new Execution(a, b) ;

System.out.println("Value of a in Main() is "+e.m) ;
System.out.println("Value of b in Main() is "+e.n) ;
//works fine

}// end of main()
}//end of class Execution

/*

Unlike previous example, if m,n are not static, as in this example, objects must be used to access them. 

extends keyword is necessary, else the code throws error w.r.t. the constructor triggering of the 
parent class.

O/P:

Enter the value of a:   5
Enter the value of b:   0

Constructor of Initialization class has been triggered.
Exiting the constructor of the Initialization class.

Exiting the constructor of the Execution class.

Value of a in Main() is 5
Value of b in Main() is 0
*/
