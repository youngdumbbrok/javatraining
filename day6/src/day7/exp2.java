package day7;

import java.util.Scanner;

class Thread1 extends Thread

{

 public void printValue(int a)
{

System.out.println("T1");

System.out.println(a);
}

}


class Thread2 extends Thread

{

  public void printValue(int a)

  {
      System.out.println("T2");

      System.out.println(a);

  }

}

public class exp2

{


  public static void main(String[] args)

  {
      Scanner scan = new Scanner(System.in);

      Thread1 t1 = new Thread1();

      Thread2 t2 = new Thread2();

for (int i = 1; i <= 100; i++)

      {

          if (i%2==0)

          {
              t2.printValue(i);
          }

          else
          {
              t1.printValue(i);
          }
      }
      scan.close();
  }
}