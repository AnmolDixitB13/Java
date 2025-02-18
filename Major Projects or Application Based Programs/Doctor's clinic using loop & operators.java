/*
W.A.P. for waiting queue at a doctor's clinic. At a time, a maximum of 10 people are
allowed to wait in the queue at the clinic. First queue is for non-senior citizens and
second queue is for senior citizens. But, if the no. of patients at the second queue
i.e. senior citizens' queue is > 4, senior citizens are to be asked to move to first queue.
*/

import java.lang.* ;
import java.util.* ;

class Execution	
{
public static void main(String args[])
{
int n_pat_total = 0 ;	//total no. of patients
int n_pat_regular = 0 ;	//no. of patients (non-senior citizens)
int n_pat_senior = 0 ;	//no. of patients (senior citizens)
int age, temp, choice1, choice2 ;

Scanner S = new Scanner(System.in);

	loop:do
{
n_pat_total = n_pat_regular + n_pat_senior ;
	if(n_pat_total > 0)
	{System.out.println("Total no. of patients in queue are "+n_pat_total+"\n") ;}

	else
	{System.out.println("Total no. of patients in queue are 0\n") ;}

System.out.println("Press 1 to enter a new patient in the waiting queue") ;
System.out.println("Press 2 to remove a patient from the waiting queue") ;
choice1 = S.nextInt() ;

	switch(choice1)
{	case 1:

	{
	System.out.println("Enter the age of patient") ;
	age = S.nextInt() ;
		

	if(age < 60 || (n_pat_senior > 4 && age > 60))
		{System.out.println("Proceed to queue 1\n") ;
		++n_pat_regular ;
		continue loop ;}

	if(age > 60 && n_pat_senior <= 4)
		{System.out.println("Proceed to queue 2\n") ;
		++n_pat_senior ;
		continue loop ;}
	}

case 2:
System.out.println("Press 1 to remove a non senior-citizen patient from the waiting queue") ;
System.out.println("Press 2 to remove a senior citizen patient from the waiting queue") ;
choice2 = S.nextInt() ;

	switch(choice2)

	{
	case 1:
		if(n_pat_total == 0 || n_pat_regular == 0)
		{
		System.out.println("No non senior-citizens present in the queue\n") ;
		continue loop ;
		}

		else
		--n_pat_total ; --n_pat_regular ; continue loop ;
	
	case 2:
		if(n_pat_total == 0 || n_pat_senior == 0)
		{
		System.out.println("No senior-citizens present in the queue\n") ;
		continue loop ;
		}

		else
		--n_pat_total ; --n_pat_senior ; continue loop ;

	}//end of inner switch

	default:
		System.out.println("Invalid choice\n") ;

}//end of outer switch

}while(n_pat_total < 10) ;//end of while

}
}


/*
Improvements possible in this program:
Suitable checks either by using if - else or by using exceptions can be added to ensure 
that the data/input that the user enters is appropriate. For example, age is usually > 0 
and < 100 (or say upto 120 sometimes), but can't be negative. So, suitable checks can be implemented either with the help of if - else statements or by using user defined exceptions.
*/
