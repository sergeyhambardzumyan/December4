package com.homework2;
//2.4
//Get from the user an int number (from console)
//in case number > 100
//Generate a random int in range 50 - number :
//in case number < 100
//Generate a random int in range 0 - 50:
//cast the random number to String
//print

import java.util.Random;
import java.util.Scanner;

public class Homework24 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int userNumber;
        System.out.print("Enter a number: ");
        userNumber = sc.nextInt();
        int random = 0;
        if (userNumber > 100) {
            random = rand.nextInt(userNumber - 50) + 50;
        } else if (userNumber < 100) {
            random = rand.nextInt(50);
        }

        String result = String.valueOf(random);
        System.out.println(random);

    }


}
