package com.Homework7.Arraylist;

import java.util.ArrayList;
import java.util.Random;

//5. update specific array element by given element.
public class Homework5 {
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

        myarray.remove(3);
        myarray.add(3,11);

        for (int i = 0; i < myarray.size(); i++) {
            System.out.print(myarray.get(i) + " ");
        }
    }
}
