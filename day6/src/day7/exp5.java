package day7;
class Count {

    public void run() {
    	try {

        for(int i = 1; i<=50; i++) {
        	Thread.sleep(1000);
            if (i%10==0) {
            	

                System.out.println("Hello");

            } else {

                System.out.println(i);

            }

        }

    }
    	catch(Exception e) {
    		
    	}

}

}

public class exp5 {



    public static void main(String[] args) {

        Count c = new Count();

        c.run();

    }



}
