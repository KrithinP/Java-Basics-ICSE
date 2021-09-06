package com.company;

import java.util.Scanner;

public class SeriesV
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 to check if the character is a vowel, 2 to find series");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Enter the character");
                char c = sc.next().charAt(0);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                {
                    System.out.println(c +"is a vowel");
                }
                else
                {
                    System.out.println("It is not a vowel");
                }
                break;
            case 2:
                System.out.println("How many numbers in the series do you want to find?");
                int n= sc.nextInt();
                for (int i = 1; i<=n; ++i)
                {
                    int f = (i*i)+1;
                    System.out.println(f+",");
                }
                /*int x = -1;
                int g = 1;
                for (int i = 1; i<=n; ++i)
                {
                    x+=2;
                    g+=x;
                    System.out.println(g+",");
                }*/

                break;
            default:
                System.out.println("Invalid");

        }

    }
}
