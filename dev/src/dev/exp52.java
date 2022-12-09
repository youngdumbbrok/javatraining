package dev;
// A Class that represents use-defined exception
 
class MyException extends RuntimeException {
	int age;
	public void ageCheck(int age) {
		if (age<0) {
			throw new MyException();
		} else {
			this.age = age;
		}
	}
}
 
// A Class that uses above MyException
public class exp52 {
    public static void main(String args[])
    {
    	MyException e = new MyException();
        try {
            e.ageCheck(-2);
        }
        catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}