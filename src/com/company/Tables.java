package com.company;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the multiples up to 10");
        double n = sc.nextDouble();
        for (int i = 1; i <=10 ; ++i ) {
            double p = n*i;
            System.out.println(n+" * "+i+" = "+p);
        }

    }
}
