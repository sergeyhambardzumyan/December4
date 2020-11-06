package com.homework3;
//3.11
//Write a program to determine whether a given number is prime or not.
//Test Data :
//Input a number: 13
//Expected Output :
//13 is a prime number.
import java.util.Scanner;

public class Homework311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int input = scanner.nextInt();
        int cout = 0;
        for(int i = 2; i < input; i++) {
            if(input % i == 0) {
                cout++;
            }
        }
        if(cout == 0) {
            System.out.println(input + " is prime number.");
        } else {
            System.out.println(input + " is not prime number.");
        }
    }
}
