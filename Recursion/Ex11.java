/*
 * Ex11 - Check if an array is sorted (Strictly Increasing)
 * Time Complexity - O(n)
 */

import java.util.Scanner;

public class Ex11 {
    public static boolean isSorted(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] <= arr[index + 1]) {
            return isSorted(arr, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        System.out.println();

        int arr[] = new int[size];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d]: ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        boolean isTrue = isSorted(arr, 0);

        System.out.println(isTrue);

        sc.close();
    }
}
