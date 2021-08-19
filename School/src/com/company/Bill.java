package com.company;
import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String n = sc.next(), id;
        System.out.println("Enter your customer ID");
        id = sc.next();
        System.out.println("Enter the number of units purchased");
        int u = sc.nextInt();
        double amntA, amntB, amntC, amntD;
        if(u >0){
            if (u<=100){
                amntA = u *5.5;
                System.out.println("The amount to be payed is"+ amntA);
            }
            else{
                u-= 100;
                amntA = 100 *5.5;

                if (u<=200){
                    amntB = (u*6.5)+ amntA;
                    System.out.println("The amount is "+ amntB);
                }
                else {
                    u -= 200;
                    amntB = (200 * 6.5) + amntA;

                    if (u <= 300) {
                        amntC = (u * 7.5) + amntB;
                        System.out.println("The amount is " + amntC);
                    } else {
                        u -= 300;
                        amntC = (300 * 7.5) + amntB;

                        if (u > 0) {
                            amntD = (u * 8.5) + amntC;
                            System.out.println("The amount is " + amntD);
                        } else
                        {
                            return;
                        }
                    }

                }
            }
        }
        else{
            System.out.println("Invalid Amount");
        }

    }
}
