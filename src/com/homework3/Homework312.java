package com.homework3;
//3.12
//
//Write a program to display the first n Fibonacci series.
//(Fibonacci series 0 1 1 2 3 5 8 13 .....)
//Test Data :
//Input number of terms to display: 10
//Expected Output :
//Here is the Fibonacci series up to to 10 terms :
//0 1 1 2 3 5 8 13 21 34
import java.util.Scanner;

public class Homework312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int input = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        for(int i = 1; i <= input; i++) {
            System.out.print(num1 + " ");
            int sumNum1Num2 = num1 + num2;
            num1 = num2;
            num2 = sumNum1Num2;
        }
    }
}
