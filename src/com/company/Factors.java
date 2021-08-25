package com.company;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number to find the factors of a number");
        int input = sc.nextInt();
        System.out.println("The factors of a number are");
        for (double i = 1; i <= input; ++i) {
            if (input / i == (int) (input / i)) {
                System.out.print(i + " ");
            }
        }
    }
}
