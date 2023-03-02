package com.company;

import java.util.Scanner;

public class Anagram {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 strings");
        String s1 = sc.next(), s2 = sc.next();

        char si[] = new char[s1.length()];
        char sii[] = new char[s2.length()];

        if(s1.length()== s2.length())
        {
            for (int i = 0; i < s1.length(); i++)
            {
                for (int  j = 0; j <s2.length(); j ++)
                    if (!(si[i] == sii[j]))
                        continue;

            }
        }
    }
}
