package com.company;
import java.util.Scanner;

public class GCD {
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the 2 numbers");
        int a = sc .nextInt();
        int b = sc.nextInt();
        int t =0;
        while(a%b !=0)
        {
            t=a%b;
            a=b;
            b=t;

        }
        System.out.println("The gcd is "+b);
    }
}
