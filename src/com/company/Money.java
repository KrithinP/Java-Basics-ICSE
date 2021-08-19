package com.company;

import java.util.Scanner;

public class Money {
  //  public static double a ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total principal of the bill ");
        double a ;
        double p = sc.nextDouble();
        if (p > 0 && p <= 2000) {
            a = p*1.2;
            System.out.println("Your principal is Rs "+p+"\nYou get a discount of 20% making the final sum Rs"+a+"\nYou also get a free bag");
        }
        else if (p >2000 && p<=5000) {
            a = p*1.3;
            System.out.println("Your principal is Rs "+p+"\nYou get a discount of 30% making the final sum Rs"+a+"\nYou also get a free wall clock");
        }
        else if(p>5000) {
            a= p*1.4;
            System.out.println("Your principal is Rs "+p+"\nYou get a discount of 40% making the final sum Rs"+a+"\nYou also get a free watch");
        }
        else {
            System.out.println("Invalid amount");
        }
    }
}