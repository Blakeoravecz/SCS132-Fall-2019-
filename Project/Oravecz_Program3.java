import java.util.Scanner;
public class Oravecz_Program3 
{

	public static void main(String[] args) 
	// TODO Auto-generated method stub
	{
		//Keyboard In
		Scanner keyboard = new Scanner (System.in);
		
		 //Variables
		 int Number;
		 String Name;
		  
		  //Ask the user for Name and Integer
		  System.out.print("Enter Your Name: ");
		  Name = keyboard.next();
		  System.out.print("Enter an Number between 0 and 100: ");
		  Number = keyboard.nextInt();
		  
		//Validate Number
		  while(Number < 0 || Number > 100);
		  {  
			  System.out.println("That number is invalid.");  
			  System.out.print("Enter a number in the " +                   
			                   "range of 0 through 100: ");  
			  Number = keyboard.nextInt();
		  }
		System.out.println("Thank you for your input "+ Name);
		System.out.println("Watch out "+ Name + " for the booby trap");
		System.out.println("Your health is at "+ Number);
		  
		  //Countdown
		  for(int i = 0; Number>=i; Number--)
			  System.out.println("You are poisoned and slowly losing health. Your health is at "+ Number+"%");
		      
		    //Ending
		    System.out.println("You died.");
	
		
		
		
		
		
		
		
		
		//Close Keyboard
		keyboard.close();
	}

}
