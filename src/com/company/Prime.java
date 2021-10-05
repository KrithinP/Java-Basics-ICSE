package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number to check whether it is prime or not");
        int input = sc.nextInt();
        int count = 0;
        for (double i = 1; i <= input; ++i)
        {
            if (input / i == (int) (input / i))
            {
                ++count;
            }
        }
        if (count<=2)
        {
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("It is not a prime number");
        }
    }
}
