package com.homework3;
//3.2
//Write a program to display the first 20 natural numbers but exclude the ones that are divisible by 3. (using continue)
public class Homework32 {
    public static void main(String[] args) {
        for ( int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("The " + i + " natural number is " + i);
        }
    }
}
