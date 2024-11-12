/*
This question was thought & framed by me.
The solution to the question was also prepared by me.
-----------------------------------------------------

Write a program for the task of bank's loan distribution. The requirements of the program are as follows:

1. When the program starts, it will ask the staff to enter the factor value between 2-10.
If the factor value selected is 5, it means that the maximum loan a person can get = 5*annual take home salary. 
This value FACTOR*ANNUAL_TAKEHOME_SALARY is the maximum permissible loan a person can take.

2. If the factor value entered is < 2 or > 10, the program will assign the default factor value of 4.

3. User can take N number of small loans instead of a big loan. eg if a person is eligible for the loan of 5L,
he/she can either take a loan of 5L, or (2L & 3L) or (1L, 2L, 2L)...
and so on only from the various loan options displayed on the screen.

4. The user can select N no of small loans instead of 1 big loan till the time
sum of all the small loans <= total loan the person is permitted to take depending upon his annual take home salary
and the factor value as discussed in points 1,2 & 3.


*/

import java.lang.* ;
import java.util.* ;

class Execution 
{

Scanner S = new Scanner(System.in) ;

static void cancelLoan(float annualTakehomeSalary , float totalLoanSelection , float totalLoanPermitted )
{
System.out.println("All your loan(s) have been cancelled") ;
System.out.println("Total loan granted is 0.") ;

annualTakehomeSalary = 0.00f ;
totalLoanSelection = 0.00f ;
totalLoanPermitted = 0.00f ;

boolean flag_terminate = false ;
boolean flag_billKeyPressed = false ; 

//resetting the values for the next user
}

static void stopLoan(float annualTakehomeSalary, float totalLoanPermitted, float totalLoanSelection, int flags[], int loans[])
{
int i ;
System.out.println("\n\n_______________Receipt_______________\n") ;
System.out.println("Your Annual Takehome Salary : "+annualTakehomeSalary) ;
System.out.println("Total Loan You Were Eligible For : "+totalLoanPermitted) ;
System.out.println("Total Loan You Opted For : "+totalLoanSelection) ;

System.out.println("\n\n----------Loan Details----------\n") ;
System.out.println("Loan Amount\tQuantity\tTotal") ;

for(i = 0 ; i < flags.length ; ++i)
	{
	if(flags[i]!=0)
		{System.out.println(loans[i]+"\t\t"+flags[i]+"\t\t"+(loans[i]*flags[i])) ;}
	}
System.out.println() ;
System.out.println("Total loan granted is "+totalLoanSelection+" .") ;

annualTakehomeSalary = 0.00f ;
totalLoanSelection = 0.00f ;
totalLoanPermitted = 0.00f ;

boolean flag_terminate = false ;
boolean flag_billKeyPressed = false ; 
//resetting the values for the next user
}

void execution(float factor)
{
System.out.println("Value of factor in Execution class is "+factor+" .") ;

int loans[] = {10000, 20000, 30000, 50000, 100_000, 200_000, 500_000, 1_000_000, 1_500_000, 2_000_000, 2_500_000, 3_000_000, 5_000_000, 7_500_000, 10_000_000 } ;

int flags[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} ;
/*whenever a person is eligible for a particular loan, the corresponding flag count increases by 1 count*/

int i, choice ;
int choice_count = 0 ;
int count_eligibleLoans = 0 ;

float annualTakehomeSalary ;
float totalLoanSelection = 0.00f ; //how much loan amount user selects
float totalLoanPermitted = 0.00f ;//how much loan amount is user eligible to take

boolean flag_terminate = false ;
boolean flag_billKeyPressed = false ; 

//while(true)
//outer while loop
//{
System.out.println("Enter your annual takehome salary (decimal/fractional values allowed)") ;
annualTakehomeSalary = S.nextFloat() ;
System.out.println() ;

totalLoanPermitted = annualTakehomeSalary*factor ;

for(i = 0; i<loans.length ; ++i)
	{
	if(loans[i] <= totalLoanPermitted)
		{
		System.out.println(loans[i]) ;
		++count_eligibleLoans ;
		}//end of if loop
	}//end of for loop

if(count_eligibleLoans!=0)

{
System.out.println("You are eligible for these above mentioned "+count_eligibleLoans+" loans.\n") ;
System.out.println("You are eligible for a total loan of "+totalLoanPermitted +". You may either \n\n") ;

System.out.println("1. Select 1 lump sum or 1 big loan, not exceeding the permissible loan value as mentioned in the previous line.") ;
System.out.println("2. Opt for multiple small loans whose sum does not exceed the permissible loan value for which you are eligible.\n\n") ;

System.out.println("Press 0 for 10,000 loan") ;
System.out.println("Press 1 for 20,000 loan") ;
System.out.println("Press 2 for 30,000 loan") ;
System.out.println("Press 3 for 50,000 loan") ;
System.out.println("Press 4 for 1,00,000 loan") ;
System.out.println("Press 5 for 2,00,000 loan") ;
System.out.println("Press 6 for 5,00,000 loan") ;
System.out.println("Press 7 for 10,00,000 loan") ;
System.out.println("Press 8 for 15,00,000 loan") ;
System.out.println("Press 9 for 20,00,000 loan") ;
System.out.println("Press 10 for 25,00,000 loan") ;
System.out.println("Press 11 for 30,00,000 loan") ;
System.out.println("Press 12 for 50,00,000 loan") ;
System.out.println("Press 13 for 75,00,000 loan") ;
System.out.println("Press 14 for 1,00,00,000 loan") ;
System.out.println("Press 200 to stop once you have selected your loan(s).") ;
System.out.println("Press 300 to cancel your selected loan(s).\n\n") ;


/*Switch case used for loan selection*/

//while(totalLoanSelection <= (annualTakehomeSalary*factor) || flag_terminate == false)
while(flag_terminate==false)
{
if(totalLoanSelection == (annualTakehomeSalary*factor))
{break ;}

System.out.println("Enter the no. displayed to select the loan or to stop once you have selected your loan(s) or to cancel your loan") ;
choice = S.nextInt() ;
	switch(choice)
{
	case 0:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 10000))
	if(totalLoanPermitted >= 10000 && (totalLoanPermitted - totalLoanSelection >= 10000))
	//outer if statement
	{
	System.out.println("Loan of 10,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 10000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 0:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 1:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 20000))
	if(totalLoanPermitted >= 20000 && (totalLoanPermitted - totalLoanSelection >= 20000))
	{System.out.println("Loan of 20,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 20000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 1:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 2:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 30000))
	if(totalLoanPermitted >= 30000 && (totalLoanPermitted - totalLoanSelection >= 30000))
	{System.out.println("Loan of 30,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 30000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 2:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 3:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 50000))
	if(totalLoanPermitted >= 50000 && (totalLoanPermitted - totalLoanSelection >= 50000))
	{System.out.println("Loan of 50,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 50000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 3:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 4:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 100_000))
	if(totalLoanPermitted >= 100_000 && (totalLoanPermitted - totalLoanSelection >= 100_000))
	{System.out.println("Loan of 1,00,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 100_000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 4:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 5:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 200_000))
	if(totalLoanPermitted >= 200_000 && (totalLoanPermitted - totalLoanSelection >= 200_000))
	{System.out.println("Loan of 2,00,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 200_000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 5:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 6:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 500_000))
	if(totalLoanPermitted >= 500_000 && (totalLoanPermitted - totalLoanSelection >= 500_000))
	{System.out.println("Loan of 5,00,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 500_000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 6:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 7:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 1_000_000))
	if(totalLoanPermitted >= 1_000_000 && (totalLoanPermitted - totalLoanSelection >= 1_000_000))
	{System.out.println("Loan of 10,00,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 1_000_000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 7:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 8:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 1_500_000))
	if(totalLoanPermitted >= 1_500_000 && (totalLoanPermitted - totalLoanSelection >= 1_500_000))
	{System.out.println("Loan of 15,00,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 1_500_000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 8:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 9:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 2_000_000))
	if(totalLoanPermitted >= 2_000_000 && (totalLoanPermitted - totalLoanSelection >= 2_000_000))
	{System.out.println("Loan of 20,00,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 2_000_000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 9:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 10:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 2_500_000))
	if(totalLoanPermitted >= 2_500_000 && (totalLoanPermitted - totalLoanSelection >= 2_500_000))
	{System.out.println("Loan of 25,00,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 2_500_000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 10:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 11:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 3_000_000))
	if(totalLoanPermitted >= 3_000_000 && (totalLoanPermitted - totalLoanSelection >= 3_000_000))
	{System.out.println("Loan of 30,00,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 3_000_000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 11:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 12:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 5_000_000))
	if(totalLoanPermitted >= 5_000_000 && (totalLoanPermitted - totalLoanSelection >= 5_000_000))
	{System.out.println("Loan of 50,00,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 5_000_000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 12:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 13:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 7_500_000))
	if(totalLoanPermitted >= 7_500_000 && (totalLoanPermitted - totalLoanSelection >= 7_500_000))
	{System.out.println("Loan of 75,00,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 7_500_000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 13:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 14:
	//if(flags[choice]==1 && (totalLoanPermitted - totalLoanSelection >= 10_000_000))
	if(totalLoanPermitted >= 10_000_000 && (totalLoanPermitted - totalLoanSelection >= 10_000_000))
	{System.out.println("Loan of 1,00,00,000 is granted.") ;
	totalLoanSelection = totalLoanSelection + 10_000_000 ;
	++choice_count ; ++flags[choice] ;
	System.out.println("Total loan selected by you till now is "+totalLoanSelection+" .") ;

	if(totalLoanPermitted - totalLoanSelection >= 10000)
	//inner if statement
	{System.out.println("Depending upon your Annual Takehome Salary, you are eligible for an additional loan of "+(totalLoanPermitted - totalLoanSelection)+" .\n") ;
	System.out.println("You may select your additional loans or terminate once you have taken your desired loan or cancel your loan(s) by pressing the suitable keys.") ;

	for(i = 0; i<count_eligibleLoans ; ++i)
	{
	if(loans[i] <= totalLoanPermitted - totalLoanSelection)
		{
		System.out.println(loans[i]) ;
		}//end of if
	
	}//end of for loop
	}// end of inner if statement

	else 
	{System.out.println("You are no longer eligible for any loans.\n") ;}
	}//end of outer if, located just below case 14:

	else
	{System.out.println("You are not eligible for this loan.") ;}
	break ;

	case 200: stopLoan(annualTakehomeSalary, totalLoanPermitted, totalLoanSelection, flags, loans) ;
		  flag_terminate = true ; flag_billKeyPressed = true ;
		  break ;

	case 300: cancelLoan(annualTakehomeSalary, totalLoanSelection, totalLoanPermitted) ;
		  flag_terminate = true ; flag_billKeyPressed = true ;
		  break ;
/*break statement is needed in the previous 2 cases also i.e. case 200 & 300, else if not used,
the cases below are also executed.*/

	
	default:System.out.println("Invalid option selected.") ;

 
	}//end of switch

}//end of while

if(flag_billKeyPressed == false)
	{stopLoan(annualTakehomeSalary, totalLoanPermitted, totalLoanSelection, flags, loans) ;}
}//end of if

else 
{System.out.println("Sorry, you are not eligible for any loan.") ;}


//}//end of outer while loop

}//end of function execution



}//end of class Execution

class factorInitializer extends Execution
{
float factor ;
Scanner S = new Scanner(System.in) ;

float setup()
{

System.out.println("Please set up the app before it can be used. Please enter the factor value between 2 & 10.") ;

factor = S.nextFloat() ;

if(factor < 2 || factor > 10)

	{
		System.out.println("Inappropriate factor value... Default factor value of 4 has been assigned to the factor.") ;
		factor = 4 ;
	}

else	
	{
		this.factor = factor ;
		System.out.println("The value of the selected factor is " + factor + ".") ;
	}

System.out.println("The app setup is complete and the app is ready to use.\n\n") ;
return factor ;

}/*end of method setup()*/

//System.out.println("The app setup is complete and the app is ready to use.") ;
/*This line of code, if written here throws error - illegal start of type*/

}/*end of class factorInitializer*/


class bankLoanCode2 extends factorInitializer
{
public static void main(String args[])
{


float factor = 0.0f ;
Scanner S = new Scanner(System.in) ;
bankLoanCode2 b = new bankLoanCode2() ;
/*instance of class bankLoanCode2 created to access the constructors and other methods of other classes*/

factor = b.setup() ;
b.execution(factor) ; 

System.out.println("Factor value received in bankLoanCode2 class is "+factor+" .") ;

}

}

/*
The code can be generalised/automated i.e., once a user/customer is done, it should automatically reset
the values of variables and restart/reinitiate the loop/program for the new user/customer without having
the need to re - run it via the terminal/command prompt.
*/
