package com.company;

import java.util.Scanner;

public class PigLatin
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the word");
        String s = sc.next().toLowerCase(),s2="";

    for (int i = 0; i <s.length(); i++)
    {
       char c = (s.charAt(i));

       if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
       {
           s2 = s.substring(i) +s.substring(0,i) +"ay";
           break;
       }
    }
        System.out.println(s2);
    }




}
