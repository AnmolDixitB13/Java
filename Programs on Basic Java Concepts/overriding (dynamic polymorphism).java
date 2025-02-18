/* Runtime polymorphism / method overriding */

class Shapes
{
void shapes() 
	{
	System.out.println("This is Shapes class.") ;
	}
}

class Circle extends Shapes
{
void shapes()
	{
	System.out.println("This is Circle class.") ;
	}
}

class Square extends Circle
{
void shapes()
	{
	System.out.println("This is Square class.") ;
	}
}

class Execution 

/* "class Execution" or "class Execution extends Square" both are correct i.e. both these approaches
do not throw any error. However, it is not needed to write extends here i.e. it is not needed to 
write "class Execution extends Square" in this code. */

{
public static void main(String args[])
{
Shapes sh ;

sh = new Shapes() ;
sh.shapes() ;

sh = new Circle() ;
sh.shapes() ;

sh = new Square() ;
sh.shapes() ;

}// end of main()
}//end of class Execution

/*

O/P:
This is Shapes class.
This is Circle class.
This is Square class.
____________________
The name of the methods in the classes Shapes, Circle & Square should be same, else either error is 
thrown or some other method will be executed (depending upon which method is called by the object created).

Writing extends ClassName is compulsory while defining the subclasses, else we get the following errors:
error: incompatible types: Circle cannot be converted to Shapes
error: incompatible types: Square cannot be converted to Shapes

*/
