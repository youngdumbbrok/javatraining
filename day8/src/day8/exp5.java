package day8;

import java.io.FileWriter;



import java.io.IOException;



public class exp5
{

   public static void main(String[] args)
    {

String path = "/Users/lokesh.m/eclipse-workspace/day8/src/ex5";
        
        String text = " I am adding this text";



       try
        {
             
            // Creating an object of filewriter class to edit the text file
            
            FileWriter fw = new FileWriter(path, true);
            
            fw.write(text);
            
            fw.close();
        }
        
        catch(IOException e)
        {
            
        }
    }
}