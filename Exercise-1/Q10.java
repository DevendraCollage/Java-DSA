/*
 * Q10 - Write a program to print Fibonacci series of n terms where n is input by user :
 * 0 1 1 2 3 5 8 13 21 ..... 
 * In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
 * (BONUS)
 */

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Stop Condition : ");
        int stop = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < stop; i++) {
            System.out.print(n1 + ", ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        sc.close();
    }
}
