package com.company;

import java.util.Scanner;

public class DoWhilePallindrome
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The number");

        int  number = 0, reverseNo = 0;
        number = sc.nextInt();

        do {
            int rem = number % 10;
            reverseNo *= 10 +rem;
            number = number/10;

        }while(number!=0);

        System.out.println("The reverse number is" + reverseNo);
    }
}
