package com.company;

import java.util.Scanner;
public class Shop {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter G to check ground floor\nF to check First floor\nS to check second floor\n T to check Third floor");
            char ch = sc.next().charAt(0);
            double volume = 0.0,length = 0.0, breadth = 0.0, height = 0.0, radius = 0.0;

            switch (ch) {
                case 'G':

                case 'g':
                    System.out.println("Kid's Wear");
                    break;
                case 'F':
                    System.out.println("Ladies Wear");
                    break;
                case 'S':
                    System.out.println("Designer sarees");
                    break;
                case 'T':
                    System.out.println("Men's Wear");
                    break;
                default:
                    System.out.println("unknown input");

            }

    }

}
