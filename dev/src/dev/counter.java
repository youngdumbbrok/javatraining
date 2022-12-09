package dev;

	class counter {
	    static int count = 0;
	    counter(){
	        count ++;
	    }
	    public void getCount() {
	        System.out.printf("Value of counter: %d \n", count);
	    }
	    public static void main( String args[] ) {
	        counter c1 = new counter(); 
	        c1.getCount();
	        counter c2 = new counter();
	        c2.getCount();
	        counter c3 = new counter(); 
	        c3.getCount();
	    }
	}


