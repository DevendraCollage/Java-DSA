/*
 * This file is for practice the loops questions.
 */

import java.util.Scanner;

public class Quiz_2Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here : ");
        int n = sc.nextInt();
        System.out.println();

        System.out.println("Multiplication Table of : " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }

        sc.close();
    }
}
