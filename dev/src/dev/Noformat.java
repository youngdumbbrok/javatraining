package dev;
import java.util.Scanner;
 
//  Class
public class Noformat {
 
    // Main driver method
    public static void main(String[] arg)
    {
        // Declaring an variable for marks
        int marks;
 
        // Creating a Scanner 
        Scanner sc = new Scanner(System.in);
        int n=10;
 
        for(int i=0;i<n;i++) {
        	   System.out.println("Enter any valid Integer: ");
        	marks=sc.nextInt();
        	
        }
       for(int i=0;i<10;i++) {
 
           
           
 
            // Try block to check if any exception occurs
            try {
 
                // Parsing user input to integer
                // using the parseInt() method
                marks = Integer.parseInt(sc.next());
 
                // Number can be valid or invalid
 
                // If number is valid, print and display
                // the message and number
                System.out.println("You entered: "
                                   + marks);
 
                break;
            }
 
            // Catch block to handle NumberFormatException
            catch (NumberFormatException e) {
 
                
                System.out.println(
                    "NumberFormatException occurred");
            }
        }
    }
}