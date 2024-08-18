/*
 * Q5 - Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
 */

import java.util.Scanner;

public class Q5 {
    public static void isEligible(int age) {
        if (age > 18) {
            System.out.println("eligible for vote!");
        } else {
            System.out.println("not eligible for vote!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        isEligible(age);

        sc.close();
    }
}
