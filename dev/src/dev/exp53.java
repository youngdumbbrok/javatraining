package dev;

import java.util.Scanner;

public class exp53 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0;; i++) {

            System.out.println("Enter a numerator: ");
             //getting the numerator
            int num = sc.nextInt();
            //getting divisor
            System.out.println("Enter a divisor: ");

            int div = sc.nextInt();
            
            char numchar = (char) num;
            
            if (!(Character.isDigit(numchar))){
				if (num == 'Q' || num == 'q') {

                    System.out.println("End");

                    break;

                }
			}

            try {

                System.out.println(num/div);
              //catching exceptions
            } catch (Exception e) {

                System.out.println("Poor Input Data");

            }

        }

        sc.close();

    }



}