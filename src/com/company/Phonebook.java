package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Phonebook {
    public static void main (String [ ] args) {
        Scanner sc = new Scanner(System.in);
        String n[] = new String[5];
        long no[] = new long[5];
        System.out.println("Enter the names with their numbers");

        for (int i = 0; i < 5; i++)
        {
            n[i] = sc.next();
            no[i] = sc.nextLong();
        }

        System.out.println("Enter the name for their number");
        String a = sc.next();

        for (int i = 0 ; i<5 ; i++)
        {

            if(a.equals(n[i]) )
            {
                System.out.println(no[i]);
                break;
            }
            else if ( i == 4) System.out.println("Does not exist");
        }
    }
}
