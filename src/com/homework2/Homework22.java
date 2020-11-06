package com.homework2;
//2.2
//Generate 2 random int numbers in range 10 - 100
//calculate the product.
//in case product is even cast it to long
//in case product is odd cast it to double
//Print the product
import java.util.Random;

public class Homework22 {
    public static void main(String[] args) {
        Random rand = new Random();
        int random1 = rand.nextInt(91 + 10);
        int random2 = rand.nextInt(91 + 10);

        if ((random1 * random2) % 2 == 0) {
            System.out.println("Even Product of 2 numbers is " + (long)(random1 * random2));
        } else {
            System.out.println("Odd Product of 2 numbers is " + (double)(random1 * random2));
        }


    }
}
