package com.company;

import java.util.Scanner;

public class automorphic {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int oriNum = sc.nextInt();

        int rem = 0, multiplicativeIndex =1;
        int finalVal = 0;
        double sqr = Math.sqrt(oriNum);

        for(;oriNum!=0;oriNum/=10, multiplicativeIndex *=10)
        {
            finalVal += (oriNum%10)*multiplicativeIndex;

            if(finalVal == sqr ) System.out.println("It is automorphic");
        }

    }
}
