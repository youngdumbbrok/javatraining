package day7;

public class exp3 {

    Object world = new Object();
    Object hello = new Object();
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;;i++){
            Runnable helloTask = new Runnable(){
                @Override
                public void run(){
                    new exp3().printHello();
                }
            };
            Runnable worldTask = new Runnable(){
                @Override
                public void run(){
                    new exp3().printWorld();
                }
            };
            Thread t1 = new Thread(helloTask);
            Thread t2 = new Thread(worldTask);
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        }

    }

    public void printHello(){
        synchronized (world) {
            System.out.println("HELLO");
        }
    }

    public void printWorld(){
        synchronized (world) {
            System.out.println("QA ACE 2023");
        }
    }
}