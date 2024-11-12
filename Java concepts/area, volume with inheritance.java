import java.lang.* ;
import java.util.* ;

class Area
{
	void calarea(int a, int b)
	{
		System.out.println("area is "+(a*b)) ;
	}

}

class Volume extends Area
{
	void calvol(int a,int b,int c)
	{
		System.out.println("volume is "+(a*b*c)) ;
	}

}

class student extends Volume		//see 4th comment below
{
public static void main(String args[])
{ 

student a = new student() ;
a.calarea(10,10) ;
a.calvol(10,20,30) ;


}
}

/*

Here we created an object ' a ' of class STUDENT and not AREA and the program worked
because now the subclass STUDENT can access the methods of superclass AREA by using inheritance i.e. by using the term ' extends Area ' .

Program throws error if ' extends Area ' is missing.

We can still calculate area without using ' extends Area ' i.e. without using inheritance by creating objects that belong to class AREA & not belong to class STUDENT
i.e. use Area a = new Area() ; in place of student a = new student() ; .

If we use ' class student extends Area ' instead of ' class student extends Volume ' ,
the program gives error, ' cannot find method calvol.

*/

_____________________________________________________________________________________________


import java.lang.* ;
import java.util.* ;

class square
{	
	int len ;
	
	square(int len)
	{this.len = len ;}

	void sqarea()
	{System.out.println("Area of square is "+(len*len)) ;}
}

class rect extends square
{
	int bre ;

	rect(int len,int bre)
	{super(len) ;
	this.bre = bre ;}

	void rectarea()
	{System.out.println("Area of rectangle is "+(len*bre)) ;}
}

class cube extends rect
{
	int ht ;

	cube(int len,int bre,int ht)
	{super(len,bre) ;
	 this.ht = ht ;}

	void cubarea()
	{System.out.println("Area of cube is "+(len*bre*ht)) ;}

}



class student //extends cube		// generates error if class student extends cube is written	
{
public static void main(String args[])
{ 
	
Scanner S = new Scanner(System.in) ; 
System.out.println("Enter length,breadth & height") ;

//student s = new student(10,10,10) ;	
// generates error actual & formal argument lists differ in length

cube c = new cube(S.nextInt(),S.nextInt(),S.nextInt());

c.sqarea() ;
c.rectarea() ;
c.cubarea() ;
	
}
}

__________________________________________________________________________________________________________________

//Previous program's modification by accessing methods by the keyword 'super'.

import java.lang.* ;
import java.util.* ;

class square
{	
	int len ;
	
	square(int len)
	{this.len = len ;}

	void sqarea()
	{System.out.println("Area of square is "+(len*len)) ;}
}

class rect extends square
{
	int bre ;

	rect(int len,int bre)
	{super(len) ;
	this.bre = bre ;}

	void rectarea()
	{System.out.println("Area of rectangle is "+(len*bre)) ;
	super.sqarea() ; }
}

class cube extends rect
{
	int ht ;

	cube(int len,int bre,int ht)
	{super(len,bre) ;
	 this.ht = ht ;}

	void cubarea()
	{System.out.println("Area of cube is "+(len*bre*ht)) ;
	super.rectarea() ; }

}



class student //extends cube		// generates error if class student extends cube is written	
{
public static void main(String args[])
{ 
	
Scanner S = new Scanner(System.in) ; 
System.out.println("Enter length,breadth & height") ;

//student s = new student(10,10,10) ;	
// generates error actual & formal argument lists differ in length

cube c = new cube(S.nextInt(),S.nextInt(),S.nextInt());

//c.sqarea() ;
//c.rectarea() ;
c.cubarea() ;
	
}
}
/*

C:\Users\Anmol\Desktop>javac student.java

C:\Users\Anmol\Desktop>java student
Enter length,breadth & height
10
30
30
Area of cube is 9000
Area of rectangle is 300
Area of square is 100

*/
