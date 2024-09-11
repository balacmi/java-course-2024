package org.ethz.day2;

public class Examples {


    public static void main(String[] args) {

        int[] array = new int[2];

        String x = "Java";

        String y = "Java";

        int h = 0;
        Integer hh = Integer.valueOf(10);

        String z = new String("Java");

        if (x == y) {
            System.out.println("These string are the same");
        }
        else {
            System.out.println("These string are NOT the same");

        }

        if (x == z) {
            System.out.println("These string are the same");
        }
        else {
            System.out.println("These string are NOT the same");

        }

        if (x.equals(z)) {
            System.out.println("These string are the same");
        }
        else {
            System.out.println("These string are NOT the same");

        }


    }



}
