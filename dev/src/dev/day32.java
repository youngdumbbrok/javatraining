package dev;

class Data{
    protected int a=10;

}

class info extends Data{
    void display(){
        int a=20;
        System.out.println(a);
    }
    void dataA() {
    	System.out.println(a++);
    }


}

public class day32 {
    public static void main(String[] args){
        info b=new info();
        b.display();
        b.dataA();
        b.dataA();

    }
}