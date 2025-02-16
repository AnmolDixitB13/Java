//Multilevel inheritance

import java.lang.* ;
import java.util.* ;

class a 
{
	void display()		//error if we use final void display, read below for details

	{
	  System.out.println("this is superclass a") ;
	}
}

class b extends a		//else, simply write ' class b ' instead of ' class b extends a '
{
	void display()

	{
	  System.out.println("this is subclass b") ;
	}
}

class c extends b		//else, simply write ' class c ' instead of ' class c extends b '
{
	void display()

	{
	  System.out.println("this is subclass c") ;
	  super.display() ;	//triggers display() function/method of the previous class i.e. class b
	}
}
class student extends c		
{
public static void main(String args[])
{ 

student s = new student() ;
s.display() ;

}
}


/*

O/P:
this is subclass c
this is subclass b

If the object of class STUDENT is created and if  ' extends a, b or c ' is not written i.e. class student ' extends a, b or c ' is not written,
the program throws error. We can still run the program by creating objects either of class a, b or c.

But if we write ' class student extends a,b or c ' , we can create objects of class student and run the program accordingly.

If we write ' class student extends a ' , the program executes the display() method which is defined in the class a.
Accordingly, if we write ' class student extends b or c ', the program executes the display() method defined in classes b/c respectively.

*/

//_______________________________________________________________________________________________

//use of super and final keyword keyword

import java.lang.* ;
import java.util.* ;

class a 
{ 
	public void display()

	{
	  System.out.println("this is superclass a") ;
	}
}

class b extends a
{
	public void display()

	{
	  System.out.println("this is subclass b") ;
	  super.display() ;	//gives O/P ' this is superclass a ' if ' class student extends b ' is used
	}
}

class c extends b
{
	public void display()

	{
	  System.out.println("this is subclass c") ;
	  super.display() ;
	}
}
class student extends c
{
public static void main(String args[])
{ 

student s = new student() ;
s.display() ;

}
}

/*

The O/P of this program is 

this is subclass c
this is subclass b
this is superclass a

as ' class student extends c ' , the execution starts from display() method defined in class c, and by using super.display() ; in display() method defined in class c,
the program executes display() method defined in class b & similarly with the super.display() ;in class b, the program executes the display() method defined in class a.

By using super keyword, method in the IMMEDIATE PARENT CLASS is executed, provided the parent class method is not declared as final.

If in class a, we write final void display() instead of void display(), we get the error ' cannot override parent method display() '.

*/
//_______________________________________________________________________________________________

// Program to demonstrate accessing of super & subclass values. 

import java.lang.* ;
import java.util.* ;

class a
{	
	 static int len = 5 ;		// error if we don't mention static keyword
}

class b extends a
{
	static int len = 10 ;		// error if we don't mention static keyword
}

class c extends b
{
	static int len = 15 ;		// error if we don't mention static keyword
}


class student extends c	
{
public static void main(String args[])
{ 

	System.out.println("length is "+len) ;	// 15 as class student ' extends c '

/* If we 'd 've written class student extends b, O/P 'd 've been 10 

and for ' extends a ', O/P 'd 've been 5 */

	System.out.println("length is "+a.len) ;	// 5
	System.out.println("length is "+b.len) ;	// 10
}
}

/*
System.out.println("length is "+super.len) ;	
ERROR : A non static variable cannot be reference from a static variable
	
System.out.println("length is "+super(len)) ;	
ERROR : Call to super must be first statement in the constructor
*/
