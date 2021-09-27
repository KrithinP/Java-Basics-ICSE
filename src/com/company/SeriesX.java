package com.company;

import java.util.Scanner;

public class SeriesX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers in the series do you want to find?");
        int n = sc.nextInt();
        System.out.println("What is the value of x?");
        int x = sc.nextInt();
        double finalV= 0;
        for (int i = 1; i <= n; ++i)
        {
            double f =  (1.0/(Math.pow(x,i)));
         //   System.out.println(f);
            finalV+=f;
        }
        System.out.println(finalV);
    }
}
