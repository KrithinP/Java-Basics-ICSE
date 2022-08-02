package com.company;

import java.util.Scanner;

public class fibonacciSeries {
    public  static void main (String args [] )
    {
        Scanner sc = new Scanner(System.in);
        int num1=0,num2=1,num3=0,i=0,count=0;
        System.out.println("Enter 1 to find the fibonacci series after 0 and 1 ,2 to find the Series 2,5,10,17");
        int c = sc.nextInt();
        switch (c){
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
                System.out.println("Enter the number of terms in the series");
                int n = sc.nextInt();
                int a = 1;
                for (int j = 1,divident=1; j <=n; j ++, divident +=2){
                    a+=divident;
                    System.out.println(a+"");
                }
                break;
            default:
                System.out.println("Wrong Input!");
        }

    }

}
