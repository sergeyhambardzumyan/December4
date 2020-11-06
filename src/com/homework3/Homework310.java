package com.homework3;
//3.10
//Write a program to display the multiplication table of a given integer
//Test Data :
//Input the number (Table to be calculated): 15
//Expected Output :
//15 X 1 = 15
//...
//...
//15 X 10 = 150
import java.util.Scanner;

public class Homework310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int input = scanner.nextInt();

        for(int i = 1; i <= 10;i++) {
            System.out.println(input + " X " + i + " = " + input * i);
        }
    }
}
