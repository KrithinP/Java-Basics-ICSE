package com.company;

import java.util.Scanner;

public class RandomFunctions {
    public static void main(String[] args) {
        double num,abs, sqrt,cube, rand;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The desired number");
        num = sc.nextDouble();
        abs = Math.abs(num);
        sqrt = Math.sqrt(num);
        cube = Math.pow(num,3);
        rand = Math.random();
        System.out.println("The Original value is :"+num+"\nThe absolute value is "+abs+"\nThe square root is "+sqrt+"\nThe cube is" +cube+"\nA random value between 0 and 1 is "+rand);

    }
}
