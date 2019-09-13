//Project: Oravecz Program 1
//Author:Blake Oravecz
//GitHub:
//Descrip:tion: Overview of variable, conditions, and scanner
//Date:Sept 12, 2019
//Version:1.0
package Oravecz_Program1;
import java.util.Scanner;
public class Oravecz_Program1
{
	
	public static void main(String args [])
	
	{
		System.out.println("Welcome to Blake's code");
		System.out.println("This is some info about me");
		   int month, day, year;
		    //Birthdate 
		    month = 11;
		    day = 12;
		    year = 2000;
		System.out.println("I am a freshman");		
		    System.out.print("My birthdate is");
		    System.out.println(" Month " + month + " Day " +  day  + " Year " +  year );
		System.out.print("I can also see into the future!");
	    System.out.println(" I can guess any number you are thinking of.");
		System.out.print("If you don't believe me then enter a number: ");	
	         Scanner keyboard = new Scanner(System.in);
		     String number = keyboard.nextLine();
	            long digit;
	          System.out.println("I think your number is " + number);
		
		       
	} 
		}


