package com.homework2;
//Write a program to input week number(1-7) from console and print day of week name
//(1 - monday …7 - sunday) using switch case.
import java.util.Scanner;

public class Homework26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput;
        String weekday = " ";
        System.out.print("Please enter the number of weeknumber(1-7): ");
        userInput = sc.nextInt();

        switch (userInput) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
                break;
            default:
                System.out.println("Wrong entery!");
        }

        System.out.println("The weekday is " + weekday);
    }
}
