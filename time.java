/*Program to convert seconds to H : M : S format*/

import java.util.* ;

class Time
{
public static void main(String args[])
{
int time ;	//store input here for computation purpose
int time_ref ;	
/*store input here for future reference, because the value of time in variable 'time' will be
altered during computation/converting to H:M:S format*/

int count_hour = 0 ;
int count_min = 0 ;
int count_sec = 0 ;

//boolean flag_mainLoop = true ;

Scanner S = new Scanner(System.in) ;

System.out.println("Please enter the time in seconds which has to be converted to H:M:S format. \t") ;
time = S.nextInt() ;

time_ref = time ;

//while(flag_mainLoop)
while(true)
/*One can try this code even without using this while loop*/
{
	if(time >= 3600)
	{
		do{
		time = time - 3600 ;
		++count_hour ;
		}while(time >= 3600) ;
	} //end of if()


	if(time >= 60 && time < 3600)
	{
		do{
		time = time - 60 ;
		++count_min ;
		}while(time >= 60 && time < 3600) ;
	} //end of if()


	if(time < 60)
	{
		count_sec = time ;
	} //end of if()

System.out.println("Entered time "+time_ref+" in H:M:S format is "+count_hour+" : "+count_min+" : "+count_sec) ;

System.exit(0) ;
/*This is used to exit the while loop. Alternately, instead of System.exit(0), one can also use a 
boolean flag as a reference to terminate/exit the loop once the work is done.*/

}//end of while loop

}//end of main()
}//end of class Time
