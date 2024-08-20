
/*
 * ArrayDemo
 */

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // Array Declaration Type-1
        int[] marks = new int[5]; // Define the Array of Marks
        marks[0] = 55;
        marks[1] = 65;
        marks[2] = 75;
        marks[3] = 85;
        marks[4] = 95;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Array Declaration Type-2
        int arr[] = { 10, 20, 50, 40, 50 };

        // Array Declaration Type-3
        // Use-Define Array Declaration

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size : ");
        int size = sc.nextInt();
        System.out.println();

        int age[] = new int[size];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < age.length; i++) {
            System.out.printf("[%d] : ", i);
            age[i] = sc.nextInt();
        }

        sc.close();
    }
}