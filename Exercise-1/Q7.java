/*
 * Q7 - Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
 */

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        while (true) {
            System.out.print("Enter number : ");
            int n = sc.nextInt();

            if (n == -999) {
                break;
            }

            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else if (n == 0) {
                zeros++;
            }
        }

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zeros);

        sc.close();
    }
}
