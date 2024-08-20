/*
 * Q1 - Take Array From the user and find the element X from the Array and print that elements index.
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        System.out.println();

        int arr[] = new int[size];

        System.out.println("Enter the Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        System.out.print("Enter the element you want to find : ");
        int elem = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}
