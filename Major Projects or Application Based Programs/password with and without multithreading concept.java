/*
A program to accept password using do - while loop.
Give 3 chance to the user and still after the 3 attempts if the password is incorrect,
exit the program.
*/

import java.lang.* ;
import java.util.* ;

class student 
{
public static void main(String args[])
{ 
String temp ;
int i, j, count = 0 ;
boolean b ;

String password = "abc" ;
Scanner S = new Scanner(System.in) ;

	do
	{
	System.out.println("enter the password") ;
	temp = S.nextLine() ;
	b = temp.equals(password) ;

	if(b)
	{
	System.out.println("correct password") ;break ;
	}

	

	else
	{
	System.out.println("incorrect password , retry entering again") ;
	++count ;
	}

	}while(count < 4) ;

	
}
}

//________________________________________________________________________________________

// Previous program using while & for loops

import java.lang.* ;
import java.util.* ;

class student 
{
public static void main(String args[])
{ 
String temp ;
int i, j, count = 0 ;
boolean b ;

String password = "abc" ;
Scanner S = new Scanner(System.in) ;

	while(count < 4)		
	// while using for loop, use for(i = 0; i<4; ++i) instead of while(count < 4)

	{
	System.out.println("enter the password") ;
	temp = S.nextLine() ;
	b = temp.equals(password) ;

	if(b)
	{
	System.out.println("Correct password") ;
	break ;
	}

	

	else
	{
	System.out.println("Incorrect password , retry entering again") ;
	++count ;
	}

	}

	
}
}

//________________________________________________________________________________________
/*
Extension of the previous program.

Previous program using multithreading.

If the user enters wrong password for 3 consecutive times, control to the
user is suspended for 10 seconds.
*/

import java.lang.* ;
import java.util.* ;

class pass extends Thread
{
public void run()
{
String temp ;
int i, j, count = 0 ;
boolean b ;

String password = "abc" ;
Scanner S = new Scanner(System.in) ;

	while(true)	
//Do not write while(1), gives error int cannot be converted to boolean

{
	System.out.println("enter the password") ;
	temp = S.nextLine() ;
	b = temp.equals(password) ;

	if(b)
	{
	System.out.println("Correct password") ;break ;
	}


	else
	{
	System.out.println("Incorrect password\n") ;
	++count ;
	}

	if(count%3==0)
	{
	try
		{
		System.out.println("Incorrect password for 3 consecutive times,
retry after some time\n") ;
		sleep(10000);
		}

	catch(Exception e){}
	}

}
}

}

class student extends pass
{
public static void main(String args[])
{ 
pass p = new pass() ;
p.start() ;
//no need to use inheritance if these 2 lines of code are to be used

//student s = new student() ;
//s.start() ;
//inheritance needed if these 2 lines are to be used
	
}
}
