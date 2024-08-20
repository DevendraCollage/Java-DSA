/*
 * Q3 - Take an array of numbers as input and check if it is an array sorted in ascending order.
 
 * Eg : { 1, 2, 4, 7 } is sorted in ascending order.
 *      {3, 4, 6, 2} is not sorted in ascending order.
 */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        System.out.println();

        int arr[] = new int[size];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        boolean isAscending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The Given Array in Ascending Order!");
        } else {
            System.out.println("The Given Array in Descending Order!");
        }

        sc.close();
    }
}
