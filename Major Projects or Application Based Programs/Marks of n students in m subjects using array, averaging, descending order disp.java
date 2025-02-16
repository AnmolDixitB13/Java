import java.lang.*;
import java.util.*;

class methods
{
static int i, j, sum = 0, temp2 ;
static float temp1 ;

	static void cal_avg(int m[][], int roll[], int a,int b)
	{
	float avg[] = new float[100] ;

//to calculate average marks of students

		for(i=0; i<a; ++i)
		{for(j=0; j<b; ++j)
		{
		sum = sum + m[i][j] ;
		}
		avg[i] = (sum/(float)b) ;
		System.out.println("Average of student "+(i+1)+" is "+avg[i]);
		sum = 0 ;
		}

//to display the students' average marks in the descending order

		for(i=0; i<a; ++i)
		{for(j=i+1; j<a; ++j)
		{	if(avg[i]<avg[j])

			{
			temp1 = avg[i] ;
			avg[i] = avg[j] ;
			avg[j] = temp1 ;

			temp2 = roll[i] ;
			roll[i] = roll[j] ;
			roll[j] = temp2 ;
			}

		}
		}

System.out.println("Rank\tRoll number\tAverage\n_____________________________________________\n") ;
		for(i=0; i<a; ++i)
		{
		System.out.println(+(i+1)+"\t\t"+roll[i]+"\t\t"+avg[i]) ;
		}
	
	}
}

class myException extends Exception

{
	myException(String message)
	{
	super(message) ;
	}	 
}

class student //extends methods
{
public static void main(String args[])
{	
int n_sub = 0, n_stud = 0, temp = 0, sum = 0, i, j ;

Scanner S = new Scanner(System.in);
	
System.out.println("Please enter the number of students and the number of subjects");
	
	try
	{
	n_stud = S.nextInt() ;
	n_sub = S.nextInt() ;

	if(n_stud < 0 || n_sub < 0)

	throw new myException("Either subject or student number is invalid") ;
	}

	catch(myException e)
	{
	System.out.println(e.getMessage());	//prints only the exception message
	System.out.println(e);			//prints classname & exception message both
	}

//int marks[][] = new int[n_stud][n_sub] ;
//float avg[] = new float[n_stud] ;
//Avoid using these statements as they give ArrayIndexOutOfBoundsException

int marks[][] = new int[100][10] ;
int roll[] = new int[100] ;
//Assume an array sufficiently large to accomodate the values

outer:for(i=0; i<n_stud; ++i)
{

try 
	{
	 System.out.println("Enter the roll no. of student "+(i+1));
	 roll[i] = S.nextInt() ;

		if(roll[i]<0)
		throw new myException("Invalid roll no.") ;
	}

catch(myException e)

	{
	System.out.println(e.getMessage());	
	System.out.println(e);
	continue outer ;
	}


inner:for(j=0; j<n_sub; ++j)
{
System.out.println("Enter the marks of student "+(i+1)+" in subject "+(j+1));
	temp = S.nextInt() ;

	if(temp < 0 || temp > 100)
	{marks[i][j] = 0 ;}

	else
	{marks[i][j] = temp ;}
}
}

methods.cal_avg(marks, roll, n_stud, n_sub) ;

}
}

/*

My observations when I was doing this program:

1. class student extends methods gives no error, but is not required
as we use classname methods to access the method cal_avg defined in it
(methods.cal_avg(marks, roll, n_stud, n_sub) ;) .

2. class student extends myException throws error
'constructor myException in class myException cannot be applied to given types.'

3. class student extends Scanner throws error 'cannot inherit from final Scanner'.

*/

/*
Improvements that can be done in this code:

1. A string can be incorporated to store the names of the students, just as we have arrays
to store their marks.
2. Arrays can also be incorporated to store total marks, percent and grades in individual 
subjects and overall grades of all students.
3. This program can also be tried using DSA in Java, which would be a more robust programming 
approach.

*/
