
import java.io.*;
import java.util.Scanner;
public class Program9{

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		


		{

			{
				// TODO Auto-generated method stub

				 try {
						
						// Open output file (where save)
						FileWriter fw = new FileWriter("/Users/blakeoravecz/Desktop/totalGrades.txt", true);
						PrintWriter outputFile = new PrintWriter(fw);


				        // Open input file (where we read)
						File fr = new File ("/Users/blakeoravecz/Desktop/grades.txt"); 
						Scanner inputFile = new Scanner (fr);


						double totalGrades = 0.00; 
						double gradeCounter=0.00;

						//loop through input file
						while(inputFile.hasNext()) 
						{
						  double grade = inputFile.nextDouble();
						  totalGrades += grade;
						  gradeCounter++; 


						}
						
						
						// Output data to file
						outputFile.println(" Grade Averages");
						outputFile.println(" =======================");
						outputFile.println(" Total Points; " +totalGrades);
						outputFile.println(" Total Assignments; " +gradeCounter);
						outputFile.println(" Average Score; " + (totalGrades/ gradeCounter));



						// Close files
						outputFile.close(); 
						inputFile.close(); 


				         }
				          catch (EOFException error)
				 //End Of File exception 
				          {
				             System.out.println(" Sorry the file has ended. ");
				             System.out.println(" Error Message:" + error.getMessage());
				           }
				          catch (FileNotFoundException error) 
				         {
				              System.out.println(" Sorry that file does not exist. ");
				              System.out.println(" Error Message:" + error.getMessage() ); 
				         }
				    
				    
				} }
	}

}
