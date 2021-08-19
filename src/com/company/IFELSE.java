package com.company;
import  java.util.*;

public class IFELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is positive or negative");

        double x = sc.nextDouble();
        if (x > 0) {
            System.out.println("It is positive");
        }
        else if (x<0){
            System.out.println("It is negative");
        }
        else {
            System.out.println(" It is 0");
        }
    }
}
