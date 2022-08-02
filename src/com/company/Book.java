package com.company;

import java.util.Scanner;

public class Book {
    public static void main(String[] args)
    {
        input();

    }

    public static void input()
    {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the book");
        String bName = sc.nextLine();
        System.out.println("Enter ISBN");
        String isbn = sc.next();
        System.out.println("Enter the number of days");
        int d = sc.nextInt();
        book.calc(d,bName,book);

    }

    public static void calc(int day ,String bName,Book book)
    {

    }
    public static void display()
    {

    }
}
