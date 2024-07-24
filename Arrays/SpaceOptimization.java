package JAVA_DSA.Arrays;

import java.util.Scanner;

public class SpaceOptimization {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();
        sc.close();
        int size = Math.abs(b - a) + 1;
        int array[] = new int[size];
     
        for (int i = a; i <= b; i++)
            if (i % 2 == 0 || i % 5 == 0)
                array[i - a] = 1;
     
        System.out.println("MULTIPLES of 2"
                              + " and 5:");
        for (int i = a; i <= b; i++)
            if (array[i - a] == 1)
                System.out.printf(i + " ");
    }
}
