import java.lang.*;
import java.util.*;

class student

{	
	int length,breadth,height ;

	student(int length,int breadth,int height)

	{
	this.length = length ;
	this.breadth = breadth ;
	this.height = height ;
	}

	student()
	{
	length = breadth = height = 10 ;
	}

	int volume()
	{
	return(length*breadth*height);
	}

public static void main(String args[])
{	

	Scanner S = new Scanner(System.in);

	student s1 = new student();	//default constructor

	System.out.println("enter data");
	student s2 = new student(S.nextInt(),S.nextInt(),S.nextInt());//parametrized constructor
	
	System.out.println("volume of room1 is "+s1.volume());
	System.out.println("volume of room2 is "+s2.volume());

}
}


____________________________________________________________________


import java.lang.*;
import java.util.*;

class student

{	
	int length,breadth,height ;

	student(int length,int breadth,int height)

	{
	this.length = length ;
	this.breadth = breadth ;
	this.height = height ;
	}

	student()
	{
	length = breadth = height = 10 ;
	}

	int volume()
	{
	return(length*breadth*height);
	}

public static void main(String args[])
{	

	Scanner S = new Scanner(System.in);


	System.out.println("enter the no of rooms whose volume is to be calculated");
	int n = S.nextInt();

	for(int i=1;i<=n;++i)
	{
	System.out.println("enter data of "+i+" room");
	student s = new student(S.nextInt(),S.nextInt(),S.nextInt());
	
	System.out.println("volume of room "+i+" is "+s.volume());
	}

}
}


______________________________________________________________________


import java.lang.*;
import java.util.*;

class room

{	
	int length,breadth,height ;

	room(int length,int breadth,int height)	// parametrized constructor

	{
	this.length = length ;
	this.breadth = breadth ;
	this.height = height ;
	}

	room()				// default constructor
	{
	length = breadth = height = 10 ;
	}

	int volume()
	{
	return(length*breadth*height);
	}
}

class student
{

public static void main(String args[])
{	

	Scanner S = new Scanner(System.in);


	System.out.println("enter the no of rooms whose volume is to be calculated");
	int n = S.nextInt();

	for(int i=1;i<=n;++i)
	{
	System.out.println("enter data of "+i+" room");
	room r = new room(S.nextInt(),S.nextInt(),S.nextInt());
	
	System.out.println("volume of room "+i+" is "+r.volume());
	}

}
}

_______________________________________________________________________________________

/*How to trigger the constructor of the immediate parent class using the keyword  ' super '.*/

import java.util.Scanner ;

class Initialization
{
int m, n ;
	Initialization(int m, int n)
	{
	this.m = m ;
	this.n = n ;
	}

void display()
{
System.out.println() ;
/*To leave a line*/ 
System.out.println("Value of a from Main() is "+m) ;
System.out.println("Value of b from Main() is "+n) ;
}

}//end of class Initialization

class Execution extends Initialization
{
	Execution(int a, int b)
	{
	super(a, b) ;
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
e.display() ;

}// end of main()
}//end of class Execution

/*

The keyword ' super ' triggers the constructor of the immediate parent class, which is Initialization
in our case.

O/P:
Enter the value of a:   46
Enter the value of b:   89

Value of a from Main() is 46
Value of b from Main() is 89
*/
