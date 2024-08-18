/*
 * Q3 - Write a function which takes in 2 numbers and returns the greater of those two.
 */

import java.util.Scanner;

public class Q3 {
    public static int greatestNumber(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number-1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number-2 : ");
        int n2 = sc.nextInt();
        System.out.println();

        int greatest = greatestNumber(n1, n2);

        System.out.println(greatest);

        sc.close();
    }
}