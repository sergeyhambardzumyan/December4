package com.Homework7.Arraylist;

import java.util.ArrayList;
import java.util.Random;

//9. copy one arrayList into another.
public class Homework9 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> myArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myArrayList.add(random.nextInt(10));
        }

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }
        System.out.println();
    }
}
