package com.project3;

public class Recursion {



    public int count22NoOverlap(String str) {
        if (str.length() <= 1) {
            throw new RuntimeException("Bad parameter");
        }

        return count22NoOverlapRec(str);

    }

    private int count22NoOverlapRec(String str) {
        if (str.length() <= 1) {
            return 0;
        } else {
            if (str.charAt(0) == '2' && str.charAt(1) == '2') {
                return 1 + count22NoOverlapRec(str.substring(2));
            } else {
                return count22NoOverlapRec(str.substring(1));
            }
        }
    }





    public int count22Overlap(String str) {
        if (str.length() <= 1) {
            throw new RuntimeException("Bad parameter");
        }

        return count22OverLapRec(str);
    }

    private int count22OverLapRec(String str) {
        if (str.length() <= 1) {
            return 0;
        } else {
            int count = count22OverLapRec(str.substring(1));
            if (str.charAt(0) == '2' && str.charAt(1) == '2')
                count++;
            return count;
        }
    }




    public int factorsOf10(int[] array, int value) {

        if (array.length == 0) {
            throw new RuntimeException("Bad parameters");
        }

        int element = 0;

        return factorsOf10Rec(array, value , element);
    }

    private int factorsOf10Rec(int[] array, int value, int element) {
        if(array.length == element +1) {
            return value;
        } else {
            if((double)array[element + 1] / (double)array[element] == 10 || (double)array[element] / (double)array[element + 1] == 10){
                value = value + 1;
            }
            element++;
        }
        return factorsOf10Rec(array, value, element);
    }
}
