/*
 * Selection-Sort
 ? Logic : Get the smallest elements of the array and compare with all elements and place it at the start of the array
 */

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selection Sort => ");
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

        // Selection Sort (Time Complexity - O(n^2))
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // Swapping
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After Sorting Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : %d\n", i, arr[i]);
        }

        sc.close();
    }
}
