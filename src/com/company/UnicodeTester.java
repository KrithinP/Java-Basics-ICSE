package com.company;

public class UnicodeTester {
    public static void main(String[] args) {
        char c = '1';
        String value = toUnicode(c);
        System.out.println("Vale is "+ value);
    }

    private static String toUnicode(char ch) {
        return String.format("\\u%04x", (int) ch);
    }
}
