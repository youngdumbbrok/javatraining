package dev;
import java.util.Scanner;



class Student {

    String sName;

    int rollNo;

}



class Exam extends Student{

    int Sciencemarks;

    int EnglishMark;

    int Mathsmark;

}



class Result extends Exam{

    int totalMarks;

    

    public int totalMarks() {

        return Sciencemarks+EnglishMark+Mathsmark;

    }

}



class exp41 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Result res = new Result();

        System.out.println("Enter the marks scored in Science: " );

        res.Sciencemarks = sc.nextInt();

        System.out.println("Enter the marks scored in English: ");

        res.EnglishMark = sc.nextInt();

        System.out.println("Enter the marks scored in Maths: ");

        res.Mathsmark = sc.nextInt();

        System.out.println("The total marks scored is " + res.totalMarks());

        sc.close();

    }



}
