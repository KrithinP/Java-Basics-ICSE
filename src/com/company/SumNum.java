package com.company;

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args){
        int input = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to add");
        int n = sc.nextInt();
        for (int i = 0 ; i<n; ++i){
            System.out.println("Enter a number");
            input = sc.nextInt();
            sum+=input;
        }
        System.out.println("The sum is"+sum);
    }
}
//