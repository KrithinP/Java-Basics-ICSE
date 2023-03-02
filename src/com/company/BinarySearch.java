package com.company;
import java .util.*;
public class BinarySearch {
    public static void main (String [] args ){
        int a [] = {1,2,3,4,5,6,7,8,9,10};


        Scanner sc = new Scanner ( System.in);


        System.out.println("Enter the number you are searching for");
        int n = sc.nextInt();

        int i = 0;
        int e = a.length, s = 0, mid;

        do
        {
            mid = (s+e)/2;

                 if
                     (s==e || s>e||i >a.length )
                 {
                     System.out.println("Does not exist");
                     break;
                 }

                else if (a[mid]== n){
                    System.out.println("The element "+ n+ "has been found at"+(mid));

                }

                else if (a[mid]<n)
                    s = mid+1;
                else if (a[mid]>n)
                    e = mid-1;


        }while (a[mid] != n);
    }
}
