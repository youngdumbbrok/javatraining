package day8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class exp3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream a=new FileOutputStream("/Users/lokesh.m/eclipse-workspace/day8/src/day8/ex3",true);//to write the file
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of Multiples:");
        int m=sc.nextInt();
        int result=0;//initializing value to the result.
        for(int i=1;i<=10;i++){//iterating till 10 value.
            result=m*i;//updating values.
            String table=m + " * " + i + " = " + result +"\n";//format to be print.
            System.out.println(table);
            a.write(table.getBytes());//to convert data in file into byte format.
        }
    }
}
