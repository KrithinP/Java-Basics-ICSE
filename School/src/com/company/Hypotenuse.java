package com.company;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        double hyp, opp, adj;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Adjacent Side");
        adj = sc.nextDouble();
        System.out.println("Enter The Opposite Side");
        opp = sc.nextDouble();

        hyp = Math.sqrt(Math.pow(adj,2) + Math.pow(opp,2));
        System.out.println("The Hypotenuse is "+ hyp);

    }
}
