package day6;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;



public class exp4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList <String> str = new ArrayList<String>();

       System.out.println("Enter a string:");

        String str1 = sc.nextLine();
String[] strArray1 = str1.split(" ");

        

        System.out.println("Enter a string:");
        String str2 = sc.nextLine();
        String[] strArray2 = str2.split(" ");
System.out.println(Arrays.toString(strArray2));

         String[] strArray3 = new String[strArray1.length+strArray2.length];
for (int i = 0, k = 0; i < strArray3.length; i++) {

            if (i<strArray1.length) {

                strArray3[i] = strArray1[i];

            } else {

                strArray3[i] = strArray2[k++];

            }

        }  for (int i = 0; i < strArray3.length; i++) {

            str.add(strArray3[i]);

        }

  //display called

        display(str);

        sc.close();

    }

 public static void display(ArrayList<String> s) {
Scanner sc=new Scanner(System.in);
        for(int i=0;i<s.size();i++) {

            if(s.get(i)!="*"){

                s.add(i+1,"*");

            }

        }
System.out.println("Enter the string to search");

        //string to search

        String search=sc.nextLine();

        int c=-1;

        for(int i=0;i<s.size();i++) {

            if(s.get(i).equals(search)){

                c=i;

            }
          System.out.print(s.get(i) + ", ");

        }

 System.out.println("\n"+search+" is found at "+c);

    }

}