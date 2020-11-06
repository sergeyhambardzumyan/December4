package com.homework2;
//2.8
//Given
//you have a circle with radius 5:
//Display a menu in console
//------------MENU-----------
//-- enter 1 for calculating area of the circle
//-- enter 2 for calculating perimeter of the circle
//-- enter 3 for exit.
//
//in case user enters 1 calculate and print area of the circle
//in case user enters 2 calculate and print perimeter of the circle
//in case user enters 3 exit.
import java.util.Scanner;

public class Homework28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = 5;

        System.out.println("------------MENU-----------");
        System.out.println("-- enter 1 for calculating area of the circle");
        System.out.println("-- enter 2 for calculating perimeter of the circle");
        System.out.println("-- enter 3 for exit.");

        int selection = sc.nextInt();

        switch (selection){
            case 1:
                System.out.println("The area of the circle is " + Math.PI * radius * radius);
                break;
            case 2:
                System.out.println("The perimeter of the circle is " + Math.PI * 2 * radius);
                break;
            case 3:
                System.out.println("Have a nice day!");
                break;
            default:
                System.out.println("Wrong entry!");
        }

    }
}
