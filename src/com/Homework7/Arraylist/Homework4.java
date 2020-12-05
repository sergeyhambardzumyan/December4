package com.Homework7.Arraylist;

import java.util.ArrayList;
import java.util.Random;

//4. retrieve an element (at a specified index) from a given array list.
public class Homework4 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> myarray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myarray.add(random.nextInt(10));
        }

        for (int i = 0; i < myarray.size(); i++) {
            System.out.print(myarray.get(i) + " ");
        }
        System.out.println();

        System.out.println(myarray.get(4));
    }
}
