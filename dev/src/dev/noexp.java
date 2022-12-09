package dev;
import java.util.Scanner;
 
//  Class
public class noexp {
 
    // Main driver method
    public static void main(String[] arg)
    {
        // Declaring an variable which
        // holds the input number entered
        int number;
        
 
        // Creating a Scanner class object to
        // take input from keyboard
        // System.in -> Keyboard
        Scanner sc = new Scanner(System.in);
 
        // Condition check
        // If condition holds true, Continue loop until
        // valid integer is entered by user
        
 
            // Display message
            
 
            // Try block to check if any exception occurs
        for(int i=0;i<10;i++) {
            try {
 
                // Parsing user input to integer
                // using the parseInt() method
            	
            		System.out.println("Enter the marks");
            		number = Integer.parseInt(sc.next());
            		
            
            	
            	
                
 
                // Number can be valid or invalid
 
                // If number is valid, print and display
                // the message and number
                
 
                // Get off from this loop
//                break;
            }
 
            // Catch block to handle NumberFormatException
            catch (NumberFormatException e) {
 
                // Print the message if exception occurred
                System.out.println(
                    "NumberFormatException occurred");
            }
        }
        }
    }

 
