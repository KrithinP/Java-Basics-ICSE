package com.company;

import java.util.Scanner;

public class StringPalindrome {

        public static void main (String [] args)
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("enter the word");
            String s = sc.next(),s2 = "";

            for (int i = s.length()-1 ; i>=0; i --){
                s2+=s.charAt(i);
            }
            if(s.equals(s2) ) System.out.println("It is a palindrome");
            else System.out.println("it is not");
        }






}
