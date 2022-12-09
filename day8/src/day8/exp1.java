package day8;

import java.io.FileInputStream;

public class exp1
{
 public static void main(String[] args)
{
 try {

          FileInputStream a = new FileInputStream("/Users/lokesh.m/eclipse-workspace/day8/src/ex1");

            int count = 0;

           while ((count = a.read())!=-1)
  {

                System.out.print((char) count);

            }
 a.close();

        }
        catch (Exception e)
        {
System.out.println(e);
        }
    }
}