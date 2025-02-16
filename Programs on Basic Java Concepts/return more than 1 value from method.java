//Several ways of returning more than 1 value from a method

class Constants
{
float pi = 3.142f ;
float g = 9.81f ;

Object[] constants()
{
return new Object[] {pi, g} ;
}
}

class Execution extends Constants
{//int i ;
public static void main(String args[])
{
int i ;
Execution e = new Execution() ;
Object[] o ;
// writing Object o[] also works well

o = e.constants() ;

System.out.println("Here, in main().") ;

for(i=0; i<o.length; ++i)
	{
	System.out.println(o[i]) ;
	}
 
}
}

/*
if brackets are not put after Object in main()
error: array required, but Object found
*/
//_______________________________________________________________________

/* Previous program using static variable */

class Constants
{
float pi = 3.142f ;
float g = 9.81f ;

Object[] constants()
{
return new Object[] {pi, g} ;
}
}

class Execution extends Constants
{
static int i ;
public static void main(String args[])
{
Execution e = new Execution() ;
Object[] o ;

o = e.constants() ;

System.out.println("Here, in main().") ;

for(Execution.i=0; Execution.i<o.length; ++Execution.i)
	{
	System.out.println(o[Execution.i]) ;
	}

/*
for(i=0; i<o.length; ++i)
	{
	System.out.println(o[i]) ;
	}
This also works well, but variable i must be declared as static, if it has to be declared outside the 
main() and in the same class containing main().
*/
 
}
}

/*
if the variable i is declared outside the class, it can't be accessed directly as we used to do it 
when variables are declared inside the main() method. We have to consider it as a static variable, else
it throws this error.
error: non-static variable i cannot be referenced from a static contex
*/

//_____________________________________________________________________________________

/* If the values to be returned are of same data type, so, in such cases, one can also use
array of the respective data type to return the set of values from the method. */

class Constants
{
float pi = 3.142f ;
float g = 9.81f ;

float[] constants()
	{
	return new float[] {pi, g} ;
	}// end of method constants()

}// end of class Constants

class Execution extends Constants
{
public static void main(String args[])
{
int i ;
Execution e = new Execution() ;
float[] f ;
// writing float f[] also works well

//writing float[] f[] throws error
// error: incompatible types: float[] cannot be converted to float[][]

f = e.constants() ;

System.out.println("Here, in main(), 2 float constants have been received from the function constants().") ;

for(i=0; i<f.length; ++i)
	{
	System.out.println(f[i]) ;
	}
 
}// end of main()
}// end of class Execution

/*
My oservations while writing & testing this code:
1. As we have returned the values from the method constants() as a float array, it should ideally be 
catched in the array of same data type in the main().

2. If we have returned the values as a float array, but we are trying to catch these vaues into an 
object, then we get this error.
error: incompatible types: float[] cannot be converted to Object[]
So, one has to be careful here.
*/
//_____________________________________________________________________________________

class Constants
{
float pi ;
float g ;
String str = new String() ;

	Constants(String str)
		{
		this.pi = 3.142f ;
		this.g = 9.81f ;
		this.str = str ;
		}

Constants constants()
	{
	return new Constants(str) ;
	}
}

class Execution extends Constants
{
	Execution(String s)
		{
		super(s) ;
		}

public static void main(String args[])
{
int i ; 
Execution e = new Execution("meow") ;

Constants c = e.constants() ;

System.out.println("Here, in main().") ;
System.out.println("Pi: "+c.pi) ;
System.out.println("G: "+c.g) ;
System.out.println("Str: "+c.str) ;

}
}

