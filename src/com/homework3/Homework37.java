package com.homework3;
//3.7
//Write a program to find the average of even numbers of the first 100 natural numbers.
public class Homework37 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 0; i <= 100;i++) {
            if(i % 2 == 0) {
                sum += i;
                count++;
            }

        }
        System.out.println("The average of even numbers of the first 100 natural numbers is " + sum / count);
    }
}
