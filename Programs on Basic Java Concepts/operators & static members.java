//import java.lang.* ;
//import java.util.* ;
class student
{
public static void main(String args[])
{


float len = 4.5f ;
System.out.println("ceil is "+Math.ceil(len)) ;		// 5
System.out.println("floor is "+Math.floor(len)) ;	// 4
System.out.println("rint is "+Math.rint(len)) ;		// 4
System.out.println("round is "+Math.round(len)) ;	// 5

}
}
//for len = 7.9f ; , O/P is 8.0 , 7.0 , 8.0 , 8

_____________________________________________________________________

//Addition using static members using only 1 class

import java.lang.* ;
import java.util.* ;

class student
{

static void add(int a, int b)
{
	System.out.println("addition is "+(a+b)) ;
}

public static void main(String args[])
{ 

	student.add(5,5) ;
}
}

______________________________________________________________________

//Addition using static members using 2 classes in the program

import java.lang.* ;
import java.util.* ;

class Add
{
	static void add(int a, int b)
	{
	System.out.println("addition is "+(a+b)) ;
	}

}

class student extends Add	// CAREFULL
{
public static void main(String args[])
	{ 

	Add.add(0,5) ;		// METHOD 1

	student s1 = new student() ;
	s1.add(10,2) ;		// METHOD 2
	}

}

/*
METHOD 1 : Accessing add() method directly by classname (as a static member).

METHOD 2 : Accessing add() method by creating objects.

CAREFULL : We have to write ' extends Add ' ONLY IF we are using METHOD 2 as the object s1 which is created
belongs to class student & does not belong to class Add.

CONCLUSION : static methods can be accessed by both the METHODS - using the classname directly AND also by creating objects.
*/

______________________________________________________________________
/*Accessing the Scanner class methods*/

import java.lang.*;
import java.util.*;

class student

{
public static void main(String args[])

	{
	int a ;
	System.out.print("Enter a no.\t");
	a = (new Scanner(System.in)).nextInt() ;
	System.out.println("Entered no. is "+a);

	//int b = Scanner.nextInt() ;
//gives error non-static method nextInt() cannot be referenced from a static context.
	}
}
