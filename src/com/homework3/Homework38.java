package com.homework3;
//3.8
//Write a program to read 10 numbers from the keyboard (console) and find their sum and average
import java.util.Scanner;
public class Homework38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;
        int count = 0;

        for(int i = 1;i < 11;i++) {
            System.out.print("please enter " + i + " number: ");
            input = scanner.nextInt();
            sum += input;
            count++;
        }
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The average of the numbers is " + (double)sum/count);

    }
}
