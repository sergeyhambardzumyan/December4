package com.company.Dec18.Random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 100;
        int guess = 50;
        int nums = 0;


        while (true) {
            System.out.println("My guess is " + guess);
            nums++;
            String input = scanner.nextLine();


            if (input.equals("less")) {
                if (min == 0) {
                    guess = guess / 2;
                    max = max / 2;
                } else if(min != 0) {
                    max = guess;
                    guess = min + (max - min) / 2;
                }
                System.out.println();

            }
            else if (input.equals("more")){

                if (guess == 99 && input.equals("more")) {
                    guess = 100;
                }

                min = guess;

                guess = min + (max - min) / 2;


                System.out.println();

            }


            if (input.equals("true")) {
                System.out.println("finally!!! Total guesses = " + nums);
                break;
            }
        }
    }
}
