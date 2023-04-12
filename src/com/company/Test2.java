package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Test2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter the elements of the array");

        int []a = new int[10];

        for (int i = 0; i < 10; i ++)
            a[i] = sc.nextInt();

        int s=0, e = a.length, mid = (s+e)/2;

        System.out.println("Enter the elemnt you are searching for");
        int x = sc.nextInt();


    }
}



