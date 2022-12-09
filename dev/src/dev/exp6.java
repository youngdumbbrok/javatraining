package dev;

public class exp6 {
	
	public static void main(String[] args) {
		C c = new C();	            
	}
}

class A1{
	A1(){ System.out.println("A"); } 
}

class B1{
	B1(){ System.out.println("B"); } 
}

class C extends A1{                 
	B1 b = new B1();                 
}
