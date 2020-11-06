package com.homework3;
//3.4
//Write a program to print the odd numbers in range {-20, -60}
public class Homework34 {
    public static void main(String[] args) {
        for(int i = -20; i <= 60; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
