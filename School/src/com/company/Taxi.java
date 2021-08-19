package com.company;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Taxi number");
        String  id = sc.next();
        System.out.println("Enter the distance travelled");
        int u = sc.nextInt(), uO = u;
        double amntA=0.0d, amntB=0.0d, amntC=0.0d, amntD = 0.0d;
        System.out.println("The Taxi number is :"+ id+"\nDistance Covered :"+u);
        if(u >0){
            if (u<=5){
                amntA = 100;
                System.out.println("Amount :"+ amntA);
            }
            else{
                u-= 5;
                amntA = 100;

                if (u<=10){
                    amntB = (u*10)+ amntA;
                    System.out.println("The amount is "+ amntB);
                }
                else {
                    u -= 10;
                    amntB = (10 * 10) + amntA;

                    if (u <=10) {
                        amntC = (u * 8) + amntB;
                        System.out.println("The amount is " + amntC);
                    }
                    else
                    {
                        u-= 10;
                        amntC = (10*8)+amntB;
                        if (uO >=25)
                        {
                            amntD = (u* 5)+amntC;
                            System.out.println("The amount is"+ amntD);
                        }
                        else
                        {
                            System.out.println("The amount is "+amntC);
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
