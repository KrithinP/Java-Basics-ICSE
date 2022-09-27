package com.company;
import java .util.*;
public class BinarySearch {
    public static void main (String [] args ){
        int a [] = new int [5];
        int s = 0, e = a.length;
        int mid = (s+e)/2;
        Scanner sc = new Scanner ( System.in);

        System.out.println("Enter the elements of the array");
        for (int i =0; i<a.length; i ++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("Which element are you searching for?");
        int n = sc.nextInt();
        int i =0;
        do
        {
            mid = (s+e)/2;
            i++;
                if (a[mid ]== n){
                    System.out.println("The element lies in index"+ (mid));

                }
                else if(i >a.length ) {
                    System.out.println("The element does not exist");
                    break;
                }
                else if (a[mid]>n)
                    s = mid;
                else if (a[mid]<n)
                    e = mid;

        }while (a[mid] != n);
    }
}
