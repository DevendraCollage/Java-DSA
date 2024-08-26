/*
 * Bubble-Sort
 ? Logic : Get the biggest elements of the array and compare with all elements and place it at the last of the array
 */

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bubble Sort => ");
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

        // Bubble Sort (Time Complexity - O(n^2))
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After Sorting Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : %d\n", i, arr[i]);
        }

        sc.close();
    }
}