
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

If a method being called is present in the subclass / childclass, i.e., here, the class inheriting 
the abstract class, the same method present in the subclass will be executed if that method is 
invoked by the subclass' object. play() method is the example of the same.

If a method being called is not present in the subclass / childclass, i.e., here, the class 
inheriting the abstract class, then the same method present in the parent class i.e., here, the
abstract class will be executed if that method is invoked by the subclasses' object. talk() & walk()
methods are the examples of the same.

Suggestions:
Use @Override while overriding parent methods and while implementing / overriding interface methods. 
Although program can work even without writing @Override, it is recommened to use it if in case to 
prevent mistakes while overriding it. Eg, if the no. of arguments to method are different than in parent 
class while overriding it, compiler will throw error and this will notify us that there is some problem.

Without using @Override, one won't get any such error, so our mistake might go unnoticed, atleast 
initially.
*/
