package com.company;
import java.util.Scanner;

public class Frequency {
    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the String: ");

        String s = sc.nextLine();

        System.out.println("Enter the word you are searching for ");

        String w = sc.nextLine();

        int in, count = 0;

        for (int i = 0; i + w.length() <= s.length(); i++)  //i+sub.length() is used to reduce comparisions

        {

            in = s.indexOf(w, i);

            if (in >= 0) {

                count++;

                i = in;



            }

        }

        System.out.println("Occurence of '" + w + "' in String is " + count);
    }
}