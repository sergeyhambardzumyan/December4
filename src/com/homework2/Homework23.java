package com.homework2;
//2.3
//Generate a random int number in range 10 - 100
//calculate the square of it. (Math.pow())
//cast the result to String, (String.valueOf())
//print the result
import java.util.Random;

public class Homework23 {
    public static void main(String[] args) {
        Random rand = new Random();
        int random1 = rand.nextInt(91 + 10);
        int square =  (int)(Math.pow(random1, 2));
        String result = String.valueOf(square);

        System.out.println(result);


    }
}
