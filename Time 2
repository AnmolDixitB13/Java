/*A program that finds the total no. of seconds in the user entered time in H : M : S format. */

import java.util.* ;

class Time2
{
public static void main(String args[])
{
int temp ;
int total_sec = 0 ;

Scanner S = new Scanner(System.in) ;

System.out.println("Enter the hours, minutes & seconds one by one in this order.") ;

System.out.print("Enter the no of hours:\t") ;
temp = S.nextInt() ;
total_sec = total_sec + temp*3600 ;

System.out.print("Enter the no of minutes:\t") ;
temp = S.nextInt() ;
total_sec = total_sec + temp*60 ;

System.out.print("Enter the no of seconds:\t") ;
temp = S.nextInt() ;
total_sec = total_sec + temp ;

System.out.println("The total no. of seconds for the entered H : M : S format are "+total_sec) ;

}// end of main()
}// end of class Time2

/*
This program was written using a single variable to accept & store I/P that the user enters i.e. temp.
However, one can use 3 separate variables such as hour, min & sec to store no. of hours, minutes
& seconds which are entered by the user. One can also use a 1 D array of 3 elements to store no. of 
hours, minutes & seconds that the user enters & then do the multiplications suitably to get the total
no. of seconds for the entered H : M : S format.

Alternately, suitable exception handling can also be implemented so as to ensure invalid inputs i.e. non
numeric characters are not passed ahead in the program.
*/
