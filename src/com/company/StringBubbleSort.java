package com.company;

import java.util.Scanner;

public class StringBubbleSort
{

        public static void main (String [ ] args)
        {
            Scanner sc = new Scanner (System.in);
            String a[] = new String[5];
            System.out.println("Enter the names");
            for (int i = 0; i <5; i++)
            {
                a[i]= sc.next();
            }
            for (int i = 0; i <a.length-1; i ++)
            {
                for(int j = 0; j < a.length - i - 1; j++)
                {
                    if (a[j].compareTo(a[i]) > 0){
                        String temp = a[j];
                        a[j] = a[j+1];
                        a[j+1]= temp;
                    }
                }
            }

            for(int i = 0; i <a.length; i ++)
            {
                System.out.print(a[i]+" , ");
            }

    }

}
