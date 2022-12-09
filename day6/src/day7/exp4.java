package day7;

public class exp4 extends Thread{  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
  exp4 t1=new exp4();  
  t1.start();  
  t1.start();  
 }  
}  