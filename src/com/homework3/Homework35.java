package com.homework3;
//3.5
//Write a program to find the sum of the first 100 natural numbers.
public class Homework35 {

    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i <= 100;i++) {
           sum += i;
        }
        System.out.println("The sum of of the first 100 natural numbers is " + sum);
    }
}
