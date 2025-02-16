//Multithreading using interfaces (implements Runnable)

import java.lang.*;

class A implements Runnable		
{
	public void run()
	{for(int i = 1; i<=10; ++i)
	{System.out.println("Bonjour") ;
	try{Thread.sleep(2000) ;}		//use ONLY Thread.sleep(milli_seconds)
	catch(Exception e) {}}
	}
}
	
class B implements Runnable		
{
	public void run()
	{for(int i = 1; i<=10; ++i)
	{System.out.println("Bonsoir") ;
	try{Thread.sleep(2000) ;}		
	catch(Exception e) {}}
	}
}

class student
{
public static void main(String args[])
{
//student s1 = new student() ; s1.run() ;	GENERATES ERROR

A a = new A() ;
B b = new B() ;
Thread ta = new Thread(a) ;
Thread tb = new Thread(b) ;
ta.start() ;	
tb.start() ;

// b = new Thread(this) ; b.start() ;
//This generates error

System.out.println("Fin de main() fonction") ;
}
}

/*
sleep(milli_seconds) or classname.sleep(milli_seconds) or threadObject.sleep(milli_seconds) GENERATES ERROR.
catch(Exception e) ; throws error, use ONLY catch(Exception e) {},block can be empty but the braces are needed and no semicolon.
*/

//_____________________________________________________________________________________________

//Multithreading using inheritance (extends Thread)

import java.lang.*;

class A extends Thread
{
	public void run()
	{for(int i = 1; i<=10; ++i)
	{System.out.println("Bonjour") ;
	try{Thread.sleep(2000) ;}		//use ONLY Thread.sleep(milli_seconds)
	catch(Exception e) {}}
	}
}
	
class B extends Thread	
{
	public void run()
	{for(int i = 1; i<=10; ++i)
	{System.out.println("Bonsoir") ;
	try{Thread.sleep(1000) ;}		
	catch(Exception e) {}}
	}
}

class student 	// class student 'extends b' generates error 'bad class type' .
{
public static void main(String args[])
{
//student s1 = new student() ;	GENERATES ERROR

A a = new A() ;
B b = new B() ;
//Thread ta = new Thread(a) ;	// NO NEED to write these statements if we use extends Thread
//Thread tb = new Thread(b) ;	// These statements are required with implements Runnable
a.start() ;
b.start() ;


System.out.println("Fin de main() fonction") ;
}
}


//_____________________________________________________________________________________________


//Multithreading using both - inheritance (extends Thread) & interfaces (implements Runnable)

import java.lang.* ;

class A extends Thread
{
	public void run()
	{for(int i = 1; i<=10; ++i)
	{System.out.println("Bonjour") ;
	try{Thread.sleep(2000) ;}		//use ONLY Thread.sleep(milli_seconds)
	catch(Exception e) {}}
	}
}
	
class B implements Runnable	
{
	public void run()
	{for(int i = 1; i<=10; ++i)
	{System.out.println("Bonsoir") ;
	try{Thread.sleep(1000) ;}		
	catch(Exception e) {}}
	}
}

class student 	// class student 'extends b' generates error 'bad class type' .
{
public static void main(String args[])
{
//student s1 = new student() ;	GENERATES ERROR

A a = new A() ;
B b = new B() ;
//Thread ta = new Thread(a) ;	// NO NEED to write these statements if we use extends Thread
Thread tb = new Thread(b) ;	// These statements are required with implements Runnable
a.start() ;
tb.start() ;


System.out.println("Fin de main() fonction") ;
}
}
