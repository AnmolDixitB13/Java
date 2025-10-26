
abstract class Animal
{
    int age ;
    boolean ageUnknown ;
    
    Animal()
    {
        ageUnknown = true ;
    }
    
    Animal(int age)
    {
        this.age = age ;
        ageUnknown = false ;
    }
    
    void talk()
    {
        System.out.println("Animals talk.") ;
    }
    
    void walk()
    {
        System.out.println("Animals walk.") ;
    }
    
    void play()
    {
        System.out.println("Animals play.") ;
    }
    
    void printAge()
    {
        if (ageUnknown)
        {
            System.out.println("This animal's age is unknown.") ;
        }
        
        else
        {
            System.out.println("Animal's age is " + age + " years.") ;
        }
    }
}

class Dog extends Animal
{
    int age ;
    
    Dog()
    {
        super() ;
    }
    
    Dog(int age)
    {
        super(age) ;
    }
    
    void play()
    {
        System.out.println("Many dogs are playful.") ;
    }
    
    void smell()
    {
        System.out.println("Dogs like to smell around.") ;
    }
}

public class Main
{
	public static void main(String[] args)
	{
	    Dog d = new Dog(7) ;
	    d.talk() ;
	    d.walk() ;
	    d.play() ;
	    d.smell() ;
	    d.printAge() ;
	}
}

/*
O/P:

Animals talk.
Animals walk.
Many dogs are playful.
Dogs like to smell around.
Animal's age is 7 years.

Observations:

If a method being called is present in the subclass, i.e. the class inheriting the abstract class, the same method present in the subclass will be executed if that method is invoked by the subclasses' object. play() method is the example of the same.

If a method being called is not present in the subclass, i.e. the class inheriting the abstract class, the same method present in the parent class i.e. the abstract class will be executed if that method is invoked by the subclasses' object. smell() method is the example of the same.

*/

