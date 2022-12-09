package day6;

import java.util.*;  

public class exp5 {
    public static void main(String[] args)
    {
  
        // Creating an empty HashMap
        HashMap<String, String> map = new HashMap<String, String>();
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
        // Mapping string values to int keys
     map.put("Bread","Butter");  //Put elements in Map  
    map.put("Pen","Pencil");    
    map.put("Tall","Short");   
     map.put("Big","Small");  
  
      
        
      System.out.println(map);
        if(map.containsValue(s)){
            System.out.println("yes");
        }
        else if(map.containsKey(s)) {
        	System.out.println("yes");
        }
        else {
        	System.out.println("no");
        }
    }
}