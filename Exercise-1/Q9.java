/*
 * Q9 - Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
 */

import java.util.Scanner;

public class Q9 {
    public static int GCD(int n1, int n2) {
        int min = Math.min(n1, n2);
        while (min > 0) {
            if (n1 % min == 0 && n2 % min == 0) {
                break;
            }
            min--;
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number-1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number-2 : ");
        int n2 = sc.nextInt();

        int gcd = GCD(n1, n2);

        System.out.println(gcd);

        sc.close();
    }
}
