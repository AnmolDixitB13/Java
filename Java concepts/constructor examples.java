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


//____________________________________________________________________


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


//______________________________________________________________________


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

/*
If we write student r = new room(S.nextInt(),S.nextInt(),S.nextInt()); 
instead of room r = new room(S.nextInt(),S.nextInt(),S.nextInt()); , 
we get this error: incompatible types: room cannot be converted to student
*/
