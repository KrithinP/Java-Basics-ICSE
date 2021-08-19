package com.company;
import java.util.Scanner;

public class Total {
    public static void main(String[] args)
    {

        double students ;
        byte boys ;
        byte girls;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of boys:");
        boys = in.nextByte();
        System.out.println("Please enter the number of girls:");
        girls = in.nextByte();
        students = boys + girls;

        double percentBoys = (boys/students )*100;
        double percentGirls = (girls/students )*100;

        System.out.println("The percentage of girls is "+ percentGirls +"% \n The percentage of boys are "+ percentBoys+"%" );

    }
}
