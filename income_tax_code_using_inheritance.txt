/*
Write a code to implement tax deduction for a given salary amount. The conditions are as follows:

Salary slot			% of tax to be deducted in the slot
0 - 2,50,000				 0 %
2,50,001 - 5,00,000			10 %
5,00,001 - 10,00,000			20 %
> 10,00,000				30 %
*/

import java.lang.* ;
import java.util.* ;

class calculation

{
float deduction, temp ;

void compute(float salary)

{
	if(salary >= 0 && salary <= 250000)
		{
		deduction = 0 ;
		}

	if(salary > 250000 && salary <= 500000)
		{
		temp= 0.1F*(salary - 250000) ;
		deduction = deduction + temp ;
		//reduce 2.5L from salary as 1st 2.5L is non taxable
		//f in 0.1f stands for float
		}

	if(salary > 500000 && salary <= 1000000)
		{
		temp = 0.2F*(salary - 500000) ;	
		deduction = deduction + temp + 0.1F*250000 ;
		}

	if(salary > 1000000)
		{
		temp = 0.3F*(salary - 1000000) ;
		deduction = deduction + temp + 0.1F*250000 + 0.2F*500000 ;
		}

System.out.println("Taxable amount is "+deduction) ;
}

}

class income_tax_code extends calculation
{
public static void main(String args[])
{
Scanner S = new Scanner(System.in) ;

float deduction, salary ;

System.out.println("Enter the salary") ;
salary = S.nextFloat() ;

income_tax_code i = new income_tax_code() ;
i.compute(salary) ;

}

}

/*

Enhancements/recommendations for the code:
1. Other deductions like insurances, PPF, etc can also be included suitably.
2. Suitable checks, either by using if - else or by using exceptions can be implemented so as to ensure the user 
entered data is appropriate. eg, salary can't be negative, so a check can be added to ensure that the salary is 
a non negative value.
3. I haven't included any constructor to initialize the salary to the current user entered salary because it was not needed. Anyways, you may include it as per your needs.
4. The code can be automated by incorporating a while/do while loop in the class containing the main function.
-----------------------------------------
Details related to code:

to access compute() method by using the classname in which it is defined, the method must be static.

to directly invoke the compute() method, use extends calculation after class income_tax_code, and it must be static;
else create object of class calculation and then use the object to access compute() method.

to access compute() method non- statically, use extends calculation after class income_tax_code
and create object of class income_tax_code and use this object to access compute()

*/
