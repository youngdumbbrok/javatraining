package dev;
class Test {
    void log() {
        System.out.println("Hi");
    }

    public int a = 10;

    public void display() {
        System.out.println(a);
    }

    private int b = 20;

    private void print() {
        System.out.println(b);
    }

    protected int c = 30;

    protected void show() {
        System.out.println(c);
    }
}
public class day31{
    public static void main(String[] args){
        Test t=new Test();
        t.log();
        t.display();
        t.print();
        t.show();



    }



}
