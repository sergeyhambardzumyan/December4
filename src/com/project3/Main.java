package com.project3;

public class Main {
        public static void main(String[] args) {
            Recursion recursion = new Recursion();

            System.out.println();

            //test for count22NoOverLap
            System.out.println(recursion.count22NoOverlap("22abc22"));
            System.out.println(recursion.count22NoOverlap("abc22x22x22"));
            System.out.println(recursion.count22NoOverlap("222"));

            System.out.println();

            //test for count22OverLap
            System.out.println(recursion.count22Overlap("22abc22"));
            System.out.println(recursion.count22Overlap("abc22x22x22"));
            System.out.println(recursion.count22Overlap("222"));
            System.out.println(recursion.count22Overlap("abc222222"));

            System.out.println();

            //test for factorsOf10
            int[] array1 = {1, 10, 20};
            int[] array2 = {100, 10, 20, 200};
            int[] array3 = {1000, 100, 10, 1, 10};
            int[] array4 = {10, 20, 33, 340};
            System.out.println(recursion.factorsOf10(array1, 0));
            System.out.println(recursion.factorsOf10(array2, 0));
            System.out.println(recursion.factorsOf10(array3, 0));
            System.out.println(recursion.factorsOf10(array4, 0));








        }



}
