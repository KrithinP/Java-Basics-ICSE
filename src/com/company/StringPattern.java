package com.company;

import java.util.Scanner;

public class StringPattern
{

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String s = sc.next();
        for (int i = 1; i<=s.length(); i ++){
            System.out.println(s.substring(0,i));
        }
    }

}
