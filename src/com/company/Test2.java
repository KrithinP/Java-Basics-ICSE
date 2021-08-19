package com.company;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String n = sc.next(), id;
        System.out.println("Enter the 1 for Air conditioner and 2 for an LCD Tv");
        int u = sc.nextInt();
        System.out.println("Enter the Principal");
        double p = sc.nextInt(),amnt,disc;

        if (p <= 20000&&p>0)
        {
           if (u ==1)
           {
               amnt = ((105/100)*p )+ (p * 125/1000);
               System.out.println(amnt);
           }
           else if ( u == 2){
               amnt = ((1025/1000)*p )+ (p * 12.5/100.0);
               System.out.println(amnt);
           }
           else{
               System.out.println("Invalid Item");
           }
        }
        if (p > 20000 && p<=40000)
        {
            if (u ==1)
            {
                amnt = ((1075/1000)*p )+ (p * 125/1000);
                System.out.println(amnt);
            }
            else if ( u == 2){

            }
            else{
                System.out.println("Invalid Item");
            }
        }
        if (p>40000 && p <=60000)
        {

            if (u ==1)
            {
                amnt = ((1100/1000)*p )+ (p * 125/1000);
                System.out.println(amnt);
            }
            else if ( u == 2){

            }
            else{
                System.out.println("Invalid Item");
            }
        }
        if (p >60000){
            if (u ==1)
            {
                amnt = ((112/1000)*p )+ (p * 125/1000);
                System.out.println(amnt);
            }
            else if ( u == 2){

            }
            else{
                System.out.println("Invalid Item");
            }
        }
        else
        {
           // System.out.println("Invalid Amount");
        }

    }
}
