package com.Homework7.Homework23;
//int[] arrayToAdd = new int[10];
//        DynamicIntArray dynamicIntArray = new DynamicIntArray();
//        dynamicIntArray.add(1);
//        dynamicIntArray.addAll(arrayToAdd); // int[]
//        dynamicIntArray.contains(4);
//        dynamicIntArray.remove(2); // index
//        dynamicIntArray.swap(1, 8);
//        dynamicIntArray.size();
//        dynamicIntArray.sort();
public class DynamicIntArray {
   private int numberOfElements = 0;
   private int[] array = new int[0];

    public void add(int newElement) {
        numberOfElements++;
        int[] newArray = new int[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[numberOfElements - 1] = newElement;
        array = newArray;
    }

    public void addAll(int[] arrayToAdd) {
        numberOfElements += 10;
        int[] newArrayToAdd = new int[numberOfElements];
        for (int i = 0; i < newArrayToAdd.length; i++) {
            if (i < array.length) {
                newArrayToAdd[i] = array[i];
            } else {
                newArrayToAdd[i] = arrayToAdd[i - array.length];
            }
        }
        array = newArrayToAdd;

    }

    public boolean contain (int element) {
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                check = true;
            }
        }
        return check;
    }

    public void remove(int index) {
        int[] array1 = new int[numberOfElements - 1];

        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                array1[i] = array[i];
            }
            else if (i > index) {
                array1[i - 1] = array[i];
            }
        }
        array = array1;
        numberOfElements--;
    }

    public void swipe(int index1, int index2) {
        int number = array[index1];
        array[index1] = array[index2];
        array[index2] = number;
    }

    public int size() {
        return numberOfElements;
    }

    public void sort() {
       int min = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {
                if (array[i] < array[i1]) {
                    min = array[i1];
                    array[i1] = array[i];
                    array[i] = min;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public DynamicIntArray idexOf(int number) {
        DynamicIntArray indexes = new DynamicIntArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                indexes.add(i);
            }
        }
        return indexes;
    }

}
