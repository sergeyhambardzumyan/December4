package com.homework2;
//2.9
//Write a Java program that accepts two integer values between 25 to 75
//and return true if there is a common digit in both numbers
//
//Input the first number: 35
//Input the second number: 45
//Result: true
import java.util.Scanner;
import java.util.SortedMap;

public class Homework29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int firstNum, secondNum;

        System.out.print("Please enter the first number: ");
        firstNum = sc.nextInt();
        System.out.print("Please enter the second number: ");
        secondNum = sc.nextInt();

        if ( firstNum >= 25 && firstNum <= 75 && secondNum >= 25 && secondNum <= 75) {
            if(firstNum % 10 == secondNum % 10 || firstNum % 10 == secondNum / 10 || secondNum % 10 == firstNum / 10 || firstNum / 10 == secondNum / 10) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
            } else {
            System.out.println("Wrong Numbers");
        }


    }

}
