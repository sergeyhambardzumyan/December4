package com.homework2;
//Write Program to print number of days in month using switch
//Input “monthName” from console (you can get string from console by scanner.nextLine() )

import java.util.Scanner;

public class Homework27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the name of the month: ");
        String month = sc.nextLine();

        switch (month) {
            case "January":
                System.out.println("January has 31 days");
                break;
            case "February":
                System.out.println("February has 28 or 29 days");
                break;
            case "March":
                System.out.println("March has 31 days");
                break;
            case "April":
                System.out.println("April has 30 days");
                break;
            case "May":
                System.out.println("May has 31 days");
                break;
            case "June":
                System.out.println("June has 30 days");
                break;
            case "July":
                System.out.println("July has 31 days");
                break;
            case "August":
                System.out.println("August has 31 days");
                break;
            case "September":
                System.out.println("September has 30 days");
                break;
            case "October":
                System.out.println("October has 31 days");
                break;
            case "November":
                System.out.println("November has 30 days");
                break;
            case "December":
                System.out.println("December has 31 days");
                break;
            default:
                System.out.println("Wrong entery!");
        }

    }
}
