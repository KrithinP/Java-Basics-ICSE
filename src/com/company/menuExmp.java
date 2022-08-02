package com.company;
import java.util.*;

public class menuExmp

{
    public  static void main (String args [] )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to find the factors of a number and 2 to find the factorial of a number");
        int c = sc.nextInt();
        switch (c){
            case 1:
                System.out.println("Input the number to find the factors of a number");
                int input = sc.nextInt();
                System.out.println("The factors of a number are");
                for (double i = 1; i <= input; ++i)
                {
                    if (input / i == (int) (input / i))
                    {
                        System.out.print(i + " ");
                    }
                }
                break;
            case 2:
                System.out.println("Enter the factorial");
                int v = sc.nextInt(),f=1;

                for (int i=1;i<=v; ++i)
                {
                    f=f*i;
                }
                System.out.println(f+" Is the factorial of the number "+v);
                break;
            default:
                System.out.println("Wrong Input!");
        }

    }

}
