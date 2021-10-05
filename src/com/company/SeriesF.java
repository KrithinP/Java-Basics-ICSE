package com.company;

import java.util.Scanner;

public class SeriesF {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        int v = sc.nextInt();
        double x =2, f =1;
        System.out.println("Enter the value of x");
        x=sc.nextInt();
        double finalV = 0.0;

        for (int i=1;i<=v; ++i){
            f=f*i;
            if (i%2 == 0)
            {
                finalV -= Math.pow(x,i)/(f);
            }
            else
            {
                finalV += Math.pow(x,i)/(f);
            }
            System.out.println(finalV);


        }
        System.out.println(f+" Is the factorial of the number "+v);
    }
}
