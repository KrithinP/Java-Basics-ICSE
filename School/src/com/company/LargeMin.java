package com.company;

import java.util.Scanner;
import java.util.Scanner;

public class LargeMin {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The first number");
        a = sc.nextDouble();

        System.out.println("Enter The Second number");
        b = sc.nextDouble();

        System.out.println("Enter The Third number");
        c = sc.nextDouble();

        double largest = Math.max(Math.max(a, b), c);
        double smallest = Math.min(Math.min(a, b), c);
        System.out.println("Therefore, the largest is :" + largest + "\nThe smallest is :" + smallest);
    }
}
