package dev;
interface A31
{
	public void run();
}
interface B
{
	public void speak();
}
interface Ability extends  A31, B
{
	public void show();
}
class Person implements Ability
{
	public void run()
	{
		System.out.println("A can run !!");
	}
	public void speak()
	{
		System.out.println("B can speak !!");
	}
	public void show() 
	{
		System.out.println("A and B are a person, A and B can speak and run !!");
	}
}
public class MultiInh
{
	public static void main(String[] args)
	{
		Person obj = new Person();
		obj.run();
		obj.speak();
		obj.show();
	}
}

