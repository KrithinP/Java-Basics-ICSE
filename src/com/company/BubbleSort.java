package com.company;
public class BubbleSort
{
    public static void main (String [ ] args)
    {
        int a[] = {10,8,47,328,393,282,17,273,10,0,-10,-47};

        for (int i = 0; i <a.length-1; i ++)
        {
            for(int j = 0; j < a.length - i - 1; j++)
            {
                if (a[j ]< a [j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;
                }
            }
        }

        for(int i = 0; i <a.length; i ++){
            System.out.print(a[i]+" , ");
        }
    }
}
