package com.company;

import java.util.Scanner;

public class Menu {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 for addition, 2 for difference, 3 for multiplication, 4 for division, 5 to find the remainder");
        int v = sc.nextInt();
        System.out.println("Enter the First number");
        double a = sc.nextDouble();
        System.out.println("Enter the second number");
        double b = sc.nextDouble();
        double finalV = 0;

        switch (v){
            case 1:
                finalV = a+b;
                System.out.println("The sum is "+ finalV);
                break;
            case 2:
                finalV = a-b;
                System.out.println("The difference is "+ finalV);
                break;
            case 3:
                finalV = a*b;
                System.out.println("The product is "+ finalV);
                break;
            case 4:
                finalV = a/b;
                System.out.println("The quotient is "+ finalV);
                break;
            case 5:
                finalV = a%b;
                System.out.println("The remainder is "+ finalV);
                break;
            default:
                System.out.println("Wrong Input");

        }

    }
}
