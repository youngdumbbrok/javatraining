package day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exp2{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            char []data=str.toCharArray();  // Convert the above string INPUT to a char array.
            Set s = new HashSet(); // Hashset s created
            System.out.println("String:");
            for(int i=0; i<data.length; i++){

                s.add(data[i]); // all the char are uniquely are added to the hashset
            }

            Object[] s1 = s.toArray(); // hashset to array of type object
            System.out.print("{ ");
            for(int i=0; i<s.size(); i++){
            	

                System.out.print(s.toArray()[i]+"=");
                ArrayList<Integer> t = new ArrayList<>(); // arraylist made to store the indices i.e. to show concordance of each character
                char c=(Character) s1[i]; // to get a character value and to do so we need to typecast it
                for(int j=0;j<data.length; j++){
                    // We will traverse through each character and add their index in the arraylist t
                    if(c==data[j]){
                        t.add(j);
                    }

                }if (i==s.size()-1) {

                    System.out.print(t+ " ");

                } else {

                    System.out.print(t+ ", ");

                }
                

          
            }

            System.out.print("}");
    }
}