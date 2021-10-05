package com.company;

import java.util.Scanner;

public class While_Even
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upper limit");
        int UL = sc.nextInt();
        System.out.println("Lower limit");
        int LL = sc.nextInt();
        double d = 0;
        while(LL<UL)
        {
            if ((LL+1)%2==0 && (LL + 1<UL))
            {
                ++LL;
                System.out.println(LL);
                LL += 1;
            }
            else LL++;
        }
    }
}
