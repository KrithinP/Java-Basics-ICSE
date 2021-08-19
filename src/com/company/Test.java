package com.company;
import java.util.Scanner;
public class Test {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers of the pattern you want to print");
        int v = sc.nextInt(), a=0,f=0;

        for (int i=2;i<=v+1; ++i){
            a=0;
            f+=a;
            System.out.print(f+",");
        }
       // System.out.println(f+" Is the factorial of the number "+v);
    }
}