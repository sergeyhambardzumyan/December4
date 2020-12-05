package com.company.Dec4;

public class StringReverse implements CharSequence {
    private String localString = "";

    public StringReverse (String localString) {
        this.localString = localString;
    }

    @Override
    public int length() {
        return localString.length();
    }

    @Override
    public char charAt(int index) {
        return localString.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String partOfTheString = "";
        for (int i = start; i <= end; i++) {
            partOfTheString = partOfTheString + localString.charAt(i);
        }
        return partOfTheString;
    }

    public String reverse() {
        String reverseString = "";
        for (int i = localString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + localString.charAt(i);
        }
        return reverseString;
    }
}
