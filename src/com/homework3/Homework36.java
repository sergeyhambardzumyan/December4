package com.homework3;
//3.6
//Write a program to find the sum of odd numbers of the first 100 natural numbers.
public class Homework36 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i <= 100;i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of of the first 100 natural numbers is " + sum);
    }
}
