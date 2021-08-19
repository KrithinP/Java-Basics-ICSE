package com.company;

import java.util.Scanner;
public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to calculate the volume of a cubloid, 2 to calculate cylinder, 3 calculate cone");
        int v = sc.nextInt();
        double volume = 0.0,length = 0.0, breadth = 0.0, height = 0.0, radius = 0.0;

        switch (v) {
            case 1:

                System.out.println("Enter the length");
                length = sc.nextDouble();
                System.out.println("Enter the breadth");
                breadth = sc.nextDouble();
                System.out.println("Enter the height");
                height= sc.nextDouble();
                volume = length*breadth*height;
                System.out.println("The Volume of the cuboid is "+ volume);
                break;
            case 2:
                System.out.println("Enter the radius");
                radius = sc.nextDouble();
                System.out.println("Enter the height");
                height= sc.nextDouble();
                volume = (22.0/7.0)*radius*radius*height;
                System.out.println("The Volume of the Cylinder is "+ volume);
                break;
            case 3:
                System.out.println("Enter the radius");
                radius = sc.nextDouble();
                System.out.println("Enter the height");
                height= sc.nextDouble();
                volume = (1.0/3.0)*(22.0/7.0)*radius*radius*height;
                System.out.println("The Volume of the cuboid is "+ volume);
                break;
            default:
                System.out.println("unknown input");

        }
    }
}
