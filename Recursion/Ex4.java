/*
 * Print Factorial of a given number.
 */

import java.util.Scanner;

public class Ex4 {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int num = fact(n);

        System.out.println(num);

        sc.close();
    }
}
