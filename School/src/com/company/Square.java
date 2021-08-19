package com.company;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = sc.nextInt();
        boolean n1bool, n2bool;
        double nsq1 = Math.sqrt(n1);
        double nsq2 = Math.sqrt(n2);
        if (n1 > 0) {

            if (nsq1 == (int) nsq1)
            {
                n1bool = true;
            }
           else n1bool = false;
        }
        else
        {
            n1bool = false;
        }

        if (n2 > 0)
        {
            if (nsq2 == (int) nsq2)
            {
                n2bool = true;
            }
           else n2bool = false;

        }
        else
        {
            n2bool = false;
        }

        if (n1bool && n2bool)
        {
            System.out.println("They are perfect squares");
        }
        else if (n1bool && !n2bool )
        {
            System.out.println(n1+"is a perfect square number\n"+ n2 +"is not a perfect square number");
        }
        else if (!n1bool && n2bool )
        {
            System.out.println(n1+"is not a perfect square number\n"+ n2 +"is a perfect square number");
        }
        else if (!n1bool && !n2bool)
        {
            System.out.println("They are not perfect square numbers");
        }

    }
}

