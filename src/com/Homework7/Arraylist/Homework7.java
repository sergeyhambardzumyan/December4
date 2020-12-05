package com.Homework7.Arraylist;

import java.util.ArrayList;
import java.util.Random;

//7. search an element in a arrayList.
public class Homework7 {
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

        System.out.println(myarray.contains(4));

    }
}
