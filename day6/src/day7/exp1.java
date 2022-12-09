package day7;
class T1 extends Thread implements Runnable {



    @Override

    public void run() {

        System.out.println("T1");

    }

    

}



class T2 extends Thread implements Runnable {



    @Override

    public void run() {

        System.out.println("T2");

    }

    

}



public class exp1 {



    public static void main(String[] args) {

        T1 t1 = new T1();

        t1.setName("Lokesh");

        System.out.println(t1.getName());

        

        T2 t2 = new T2();

        t2.setName("M");

        System.out.println(t2.getName());

    }



}
