//Project: Oravecz Program 2
//Author:Blake Oravecz
//GitHub:Blakeoravecz
//Descrip:tion: Calculator
//Date:Sept 23, 2019
//Version:1.0
package Oravecz_Program2;
import java.util.Scanner;
public class Oravecz_Program2 
{
  public static void main (String args [])
  {
	//Variables
	int Number1 = 0;
	int Number2 = 0;
	int Number3 = 0;
	char Operator;
	long Answer = 0;  
	
	//Keyboard input
	  Scanner keyboard = new Scanner
	  (System.in);
	  
	     //Reads
	     System.out.print("Enter First Number: ");
	     Number1 = keyboard.nextInt();
	     System.out.print("Enter Second Number: ");
	     Number2 = keyboard.nextInt();
	     System.out.print("Enter Third Number: ");
	     Number3 = keyboard.nextInt();
	     System.out.print("Menu of Actions:\n");
	     System.out.println("\tAdd:+\n\tSubtract:-\n\tMultiply:*\n\tDivide:/");
	     System.out.print("What Operation? ");
	     Operator = keyboard.next().charAt(0);
	     
	       //Switch Statement
	       switch (Operator) {
	    	 case '+': Answer = Number1 + Number2 + Number3;
	                   break;
	    	 case '-': Answer = Number1 - Number2 - Number3;
	    	           break;
	    	 case '*': Answer = Number1 * Number2 * Number3;
	    	           break;
	    	 case '/': Answer = Number1 / Number2 / Number3;
	    	           break;
	       }
	     //Final Equation and Answer
	     System.out.println(Number1+" "+Operator+" "+Number2+" "+" = "+Answer);
	     
	            //If-else Statement
	            if (Answer > Number3) 
	            	System.out.println(Answer+" "+"is greater than "+Number3+" ");
	            else
	            	System.out.println(Answer+" "+"is not greater than "+Number3+" ");
	//Close keyboard
	keyboard.close();
		
  
  }
}

