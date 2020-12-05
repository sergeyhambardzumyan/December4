package com.Homework7.Arraylist;

import java.util.ArrayList;

//2. iterate through all elements in a arrayList
public class Homework2 {
    public static void main(String[] args) {
        ArrayList<Integer> myarray= new ArrayList<>();
        myarray.add(1);
        myarray.add(2);
        myarray.add(3);
        myarray.add(4);

        for (int i = 0; i < myarray.size(); i++) {
            System.out.print(myarray.get(i) + " ");
        }
    }
}
