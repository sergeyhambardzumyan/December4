package com.homework2;
//Generate 2 random ints
//Take from console an operator (+, -, * or /)
//perform calculation based on operator
//(USING SWITCH)
//print the result
import java.util.Random;
import java.util.Scanner;

public class Homework25 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int random1 = rand.nextInt(100);
        int random2 = rand.nextInt(100);
        int result = 0;
        char userInput;
        System.out.print("Enter an operator (+, -, * or /): ");
        userInput = sc.next().charAt(0);

        switch (userInput) {
            case '+':
                result = random1 + random2;
                break;
            case '-':
                result = random1 - random2;
                break;
            case '*':
                result = random1 * random2;
                break;
            case '/':
                result = random1 / random2;
                break;
            default:
                System.out.println("Wrong entery!");
        }

        System.out.println("The result of " + random1 + " " + userInput + " " + random2 + " is " + result);



    }
}
