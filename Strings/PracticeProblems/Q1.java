/*
 * Q1 - Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println();

        String arr[] = new String[size];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextLine();
        }
        System.out.println();

        int strLength = 0;

        for (int i = 0; i < arr.length; i++) {
            strLength = strLength + arr[i].length();
        }

        System.out.println(strLength);

        sc.close();
    }
}
