package com.company;

import java.util.Scanner;

public class WhileTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The number");

        int  number = 0, FinalNo = 0;
        number = sc.nextInt();

        while(number != 0)
        {
            int rem = number % 10;
            if(rem%2 !=0)
            {
                FinalNo+= rem;
            }

            number = number/10;
        }

        System.out.println("The reverse number is" + FinalNo);
    }
}
