package com.company;

import java.util.Scanner;

public class ProjRev4
{
    static String s="", s1= "",s2="";
    char a = '\000';
    public static void main (String [ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        s = sc.nextLine();

        for (int i = 0, j =0; i <s.length(); i++)
        {
            int x = (int) s.charAt(i);

            if ( x == 32 )
            {
               s1 = s.substring(j,i);
                Reverse();
                j =i;
            }
            else if ((i == (s.length()-1)))
            {
                s1 = s.substring(j);
                Reverse();
                j = i;
            }
        }

    }

    private static void Reverse()
    {
        s2 = "";
        for (int k = s1.length()-1; k>=0; k --)
        {
            s2+= s1.charAt(k);
        }
        System.out.print(s2+ " ");
    }
}
