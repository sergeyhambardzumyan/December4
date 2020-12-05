package com.Homework7.Arraylist;

import java.util.ArrayList;

public class Homework1 {
    public static void main(String[] args) {
        ArrayList<String> myarray = new ArrayList<>();
        myarray.add("Yello");
        myarray.add("Green");
        myarray.add("Black");
        myarray.add("White");
        myarray.add("Pink");
        for (int i = 0; i < myarray.size(); i++) {
            System.out.print(myarray.get(i) + " ");
        }



    }
}
