package com.company;

import java.util.Scanner;

public class Vote {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name =  sc.next();
        System.out.println("Enter your age to check whether you are eligible");

        double x = sc.nextDouble();
        if (x >= 18) {
            System.out.println("You are eligible " + name);
        }
        else {
            System.out.println("You are not eligible " + name);
        }
    }
}
