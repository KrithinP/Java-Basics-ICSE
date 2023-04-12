package com.company;

public class Pattern
{
    public static void main (String[] args)
    {
        for (int i = 5,  k =17; i >0; i--)
        {
            for (double j = 5 , l =k;j >=i; j-- ,l-=2)
            {
                System.out.print(l+" ");
            }
            System.out.println(" ");
            k-=2;
        }

    }
}
