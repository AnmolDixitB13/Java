
import java.lang.* ;
import java.util.* ;

interface calci
{
int add(int a,int b) ;
}

class func_def implements calci
{
public int add(int a,int b)	// CAREFULL
	{
	return(a + b) ;
	}
}

class student extends func_def
{
public static void main(String args[])
{
student s = new student() ;
System.out.println("addition is "+s.add(7,8)) ;
}
}

/*
CAREFULL : DO NOT write static while defining the function add(int a,int b) along with public,
else the program will throw error ' add(int a,int b) in func_def cannot implement add(int a,int b) in calci ' .
*/ 
