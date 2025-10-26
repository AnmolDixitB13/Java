
// how to access private class members [ variables ] using getter and setter methods

class Data
{
    private float pi = 3.142f ;
    
    float getData()
    {
        return pi ;
    } // getter method
    
    void changeData(float val)
    {
        pi = val ;
    } // setter method
}

class Main extends Data
{
public static void main (String[] args) {
    // Data d = new Data() ; // no error
    // System.out.println(d.getData()); // no error
    // System.out.println(d.pi); // error: pi has private access in Data
    
    Main m = new Main() ; // no error
    System.out.println(m.getData()); // no error
    // System.out.println(m.pi); // error: pi has private access in Data
    // however, it works if pi is declared protected instead of private
    
    m.changeData(10) ;
    System.out.println(m.getData()) ;
    // value is updated
}
}

// even with inheritance, private entities can't be accessed directly, or in the usual way

-------------------------------------

class Data
{
    private void display()
    {
        System.out.println("This is private display in Data class.");
    }
    
    void accessDisplay()
    {
        Data d = new Data() ;
        d.display() ;
    }
}


class Main
{
    public static void main (String[] args)
    {
        Data d = new Data() ;
        // d.display() ;   // error: display() has private access in Data
        
        d.accessDisplay() ; // no error
        
    }
}
