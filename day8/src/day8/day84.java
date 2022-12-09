package day8;

import java.io.*;

import java.util.Scanner;

class day84

{
public static void readFile() throws IOException

    {

        //To read the data of a file

        FileInputStream in = new FileInputStream("/Users/lokesh.m/eclipse-workspace/day8/src/day8/ex4.1");

        

        //To write the data into a file

        FileOutputStream out= new FileOutputStream("/Users/lokesh.m/eclipse-workspace/day8/src/ex4.2");

        

        int a= in.read();

        

        while(a!=-1)

        {

            

            //To read the file character by character

            a=in.read();

            

            out.write(a);

        }

        out.flush();

        

        out.close();

    }



    public static void main(String[] args) throws IOException

    {

        Scanner sc=new Scanner(System.in);

        

        readFile();

    }

}