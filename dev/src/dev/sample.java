package dev;

class sample {

	public void mth1() {

        mth2();

        System.out.println("caller");

    }

    

    public void mth2() {

        try {

//            System.out.println(10/0);

            return;

//            System.exit(0);

            

        } catch (Exception e) {

            System.out.println("catch-mth2");

        }

        finally {

            System.out.println("finally-mth2");

        }

    }

    

    public static void main(String[] args) {

        sample test = new sample();

        test.mth1();

    }



}