/*
 * Q2 - Write a function to print the sum of all odd numbers from 1 to n.
 */

import java.util.Scanner;

public class Q2 {
    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Stop Condition : ");
        int stop = sc.nextInt();

        int sum = sumOfOddNumbers(stop);

        System.out.println(sum);

        sc.close();
    }
}
