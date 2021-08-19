package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial");
        int v = sc.nextInt(),f=1;

        for (int i=1;i<=v; ++i){
            f=f*i;
        }
        System.out.println(f+" Is the factorial of the number "+v);
    }
}
