package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        int num1=0,num2=1,num3=0,i=0,count=0;
        System.out.println("1 for fibonacci series, 2 for sum of x/odd numbers");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("How many terms do you want to print after 0 and 1");
                count= sc.nextInt();
                System.out.print(num1+" , "+num2);

                for(i=0;i<count;++i)
                {
                    num3=num1+num2;
                    System.out.print(" , "+num3);
                    num1=num2;
                    num2=num3;
                }
                break;
            case 2:
                System.out.println("How many numbers in the series do you want to find?");
                int n = sc.nextInt();
                System.out.println("What is the value of x?");
                int x = sc.nextInt();
                double finalV= 0,g=0.0,l = -1.0;;
                for (i = 1; i <= n; ++i)
                {
                    l+=2.0;
                    g = x/l;
                    //System.out.println(g);
                    finalV +=g;
                }
                System.out.println("Sum is"+finalV);
                break;
            default:
                System.out.println("Invalid Number");
        }


    }
}

