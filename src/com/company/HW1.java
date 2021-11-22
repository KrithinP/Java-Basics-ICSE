package com.company;

public class HW1 {
    public static void main(String args[])
    {
        int e =1;
        for (int i = 15; i >= 1; i -= 2)
        {
            for (int j = i, f =e; (1<=f); j -= 2)
            {
                System.out.print(j + " ");
                --f;
            }
            e++;
            System.out.println();
        }
    }

}
