package com.company;

import java.util.Scanner;

public class Test {
    static float Test()
    {
        return 11.5f;
      //  System.out.println("hi");

    }
    public static void main(String[] args) {
        Test();
        int y = 10;
        int z = (++y*(y++ + 5));
        System.out.println(z);

        System.out.println(Math.max(40,5.0));
        System.out.println(Math.ceil(-0.6));
        System.out .println(Math.round(-18.5));

      //  int x[ ]={1, 2, 3};
       // System.out.println(x[3]);
        // runtime error
        float d= 0.0f;
        long e =0L;

        if (y == 3)
        {
            int a = 2;
        }// error else int a = 7;

        char c = 'H';

        System.out.println((char)(c+32));
        for( int i = 'a';i< 'c'; i ++);

        short i = 10000;

        int n =1;
        System.out.println((n+=4 )+",");

        //5

        int h[] ={1};
        System.out.println(h[0]++);

    //    String j = "uehf";
    //    System.out.println(j.charAt('a'));

        int g[] = {4,8,9,15};
        int f[] = { 6,91, 48,5,28};
        g=f;
        System.out.println(g[4]);

        System.out.println(("car").compareToIgnoreCase("coro"));

        int jh = 8;
        jh*= ++jh + jh++ +4;
        System.out.println(jh);

        System.out.println(20+27 + "essir");

        System.out.println(jh = 10);

        int []arr = {};
        System.out.println(arr.length);
    }

    }








