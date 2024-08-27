/*
 * Calculate the sum of the first n natural numbers using Recursion.
 */

import java.util.Scanner;

public class Ex3 {
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start : ");
        int start = sc.nextInt();
        System.out.print("Enter End : ");
        int end = sc.nextInt();

        printSum(start, end, 0);

        sc.close();
    }
}
