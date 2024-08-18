/*
 * Q4 - Write a function that takes in the radius as input and returns the circumference of a circle.
 */

import java.util.Scanner;

public class Q4 {
    public static void circumferenceCircle(int r) {
        double circumference = 2 * Math.PI * r;
        System.out.println(circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of Circle : ");
        int r = sc.nextInt();

        circumferenceCircle(r);

        sc.close();
    }
}
