package com.company;
import java.util.*;
public class SumBreak {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a=0.0d,b=0.0d;
        for(int i =1; i<=10; i++)
        {
            System.out.println("Enter the 1st number");
            a = sc.nextDouble();
            if (a!=Math.abs(a))break;
            System.out.println("Enter the 2nd number");
            b = sc.nextDouble();
            if (b!=Math.abs(b))break;
            double sum = a+b;
            System.out.println(sum);
        }
    }
}
