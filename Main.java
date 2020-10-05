import java.util.Scanner;
/**
 *This program will tell the user the factors of the entered integer.
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
   //declare a variable to store integerUser
   int integerUser;
   int count = 0;
   int total = 1;
   
   do{
    // ask the user for a positive integer
    System.out.println("Please enter a positive integer to determine its factors:");
    integerUser = input.nextInt();
    
   }while(integerUser <= 0 );
   // tell the user the factors of the entered number
   System.out.println("The factors of " + integerUser + " are:"); 

  while( count <= integerUser){
   total = total + count;
     count = count + 1;
    
   // declare a variable to store remainderZero 
   int remainderZero = 0;
   // find the remainder of the entered number and the count
   // declare a variable to store factorsRemainder
   int factorsRemainder = integerUser % count;
   // find out which numbers from 0 to the entered numbers have a remainder of remainderZero
   if(factorsRemainder == remainderZero ){
     // print out the factors to the screen
     System.out.println(count);
    

   }
  }
   
  
  
 }
}

