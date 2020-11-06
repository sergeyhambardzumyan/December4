package com.homework3;
//3.3
//Write a program to print the even numbers in range {-20, +60}
public class Homework33 {
    public static void main(String[] args) {
        for(int i = -20; i <= 60; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
