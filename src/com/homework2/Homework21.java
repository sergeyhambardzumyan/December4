package com.homework2;
//2.1
//Generate 2 random int numbers in range 10 - 100
//calculate the sum.
//cast it to long.
//print
import java.util.Random;
public class Homework21 {
    public static void main(String[] args) {
        Random rand = new Random();

        int random1 = rand.nextInt(91 + 10);
        int random2 = rand.nextInt(91 + 10);
        long sum = (long)(random1 + random2);
        System.out.println(sum);
    }
}
