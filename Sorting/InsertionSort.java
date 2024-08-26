/*
 * Insert-Sort
 ? Logic - Divide the Array into two parts (Sorted, Unsorted)
 */

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertion Sort => ");
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        System.out.println();

        int arr[] = new int[size];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        // Insertion Sort (Time Complexity - O(n^2))
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Placing the elements
            arr[j + 1] = curr;
        }

        System.out.println("After Sorting Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : %d\n", i, arr[i]);
        }

        sc.close();
    }
}
