/*
There is a jar containing candies for sale at a shop. Jar has the capacity, say n, i.e.
jar can contain maximum n candies when jar is full. When ever an order is processed,
the candy count in the jar is decreased suitably. A minimum number of candies must
always be present in the jar. If the no. of candies present in the jar goes below this 
threshold, then the jar must be refilled fully, upto n candies in it.


A situation can happen, eg the n value is 100, but the customer needs 200 candies and so
such also may also have to be processed.

Write a program suitably to implement the jar's working, and taking care that the situation, 
just mentioned should also be taken care of.
*/

import java.lang.* ;
import java.util.* ;

class myException extends Exception
{
	myException(String msg)
	{
	super(msg) ;
	}
}


class student
{
public static void main(String args[])
{
int n_max = 0 ;		//maximum no. of candies in jar when it is full
int n_total = 0 ;	//total no. of candies in jar at an instant
int n_min = 0 ;		//minimum no. of candies that should present in the jar
int input, temp ;
int excess ;		//to store input only if input > n_max
boolean flag1 = false ;
boolean flag2 = false ;
boolean flag3 = false ;

Scanner S = new Scanner(System.in) ;

System.out.println("\nStarting of program... Program booting...");
System.out.println("Operational info required. Please enter the operational info...\n");

	setup:while(flag3 != true)
{
	
	setup1 :while(flag1 != true)
{System.out.println("Please enter the maximum no. of candies present when the jar is full. Select a number between 30 & 1000.");

try
	{	
	temp = S.nextInt() ;
	if(temp < 30)
		{
		throw new myException("Too less candies to be distributed") ;
		}

	if(temp > 1000)
		{
		throw new myException("Too many candies to be handled") ;
		}

	n_max = temp ;
	flag1 = true ;
	}

catch(Exception e)
	{
	System.out.println(e) ;
	continue setup1 ;
	}

}//end of while loop

	setup2:while(flag2 != true)
{System.out.println("Please enter the minimum no. of candies that must be present in the jar as long as the program/system is operating. Select a number between 5 & 30.") ;

try
	{	
	temp = S.nextInt() ;
	if(temp < 5)
		{
		throw new myException("Threshold too low") ;
		}

	if(temp > 30)
		{
		throw new myException("Threshold too high") ;
		}

	n_min = temp ;
	flag2 = true ;
	}

catch(Exception e)
	{
	System.out.println(e) ;
	continue setup2 ;
	}
}//end of while loop

	
try
	{

	if(n_min != n_max)
	{
	flag3 = true ;
	}


	else if(n_min == n_max)
	{
	throw new myException("The 2 quantites can't be same. Please re-enter them. Directing you accordingly...") ;
	}

	}

catch(Exception e)
	{
	System.out.println(e) ;
	flag1 = flag2 = false ;
	}

}//end of outermost while()


System.out.println("\nSystem is set up and ready to work\n\n") ;

n_total = n_max ;

	while(true)
{
System.out.println("Total no. of candies present in the jar are "+n_total);
System.out.println("Enter the no of candies you want :");

	try	
	{	
		temp = S.nextInt() ;
		if(temp < 0)
		{
		throw new myException("Invalid input") ;
		}
	}

	catch(Exception e)
	{
	System.out.println(e) ;
	continue ;
	}

input = temp ;

	if(input <= n_total)
		{
		System.out.println("Please take your order of "+input+" candies\n") ;
		n_total = n_total - input ;
		}

	if(n_total < n_min)
		{
		System.out.println("Too less candies... Candies refilled to full\n\n") ;
		n_total = n_max ;
		}

	if(input > n_total && input < n_max)
	{
	n_total = n_max ;
	System.out.println("Please take your order of "+input+" candies\n") ;
	n_total = n_total - input ;
	}
//simply refill the entire container & distribute the candies

	if(input > n_total && input > n_max)
	{excess = input ;

	do
	{
		if(n_total < 100)
		{
		System.out.println("Too less candies... Candies refilled to full\n\n") ;
		n_total = 100 ;
		}
		
		System.out.println("Your order of 100 candies is here, next "+(excess-100)+" candies will be delivered shortly...") ;

		excess = excess - 100 ;

	}while(excess > 100);

	System.out.println("Please take your order of remaining "+excess+" candies\n\n") ;
	}//end of if statement
//distribute the candies in terms of 100 candies, so we wrote if(n_total < 100)
	
}

}
}
/*
Observations:

1. writing while(1) throws error.
error: incompatible types: int cannot be converted to boolean,
so write while(true) instead of while(1).

2. initialize the parameters to be used in if statements to 0 at the beginning of the code,
else compiler throws error 'value/parameter not initialized.

Other things:

I haven't used constructors in this code, but you may incorporate them into your program suitably.
*/
