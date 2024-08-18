/*
 * Q1 - Enter 3 numbers from the user & make a function to print their average.
 */

import java.util.Scanner;

public class Q1 {
    public static double findAverage(double n1, double n2, double n3) {
        double avg = (n1 + n2 + n3) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number-1 : ");
        double n1 = sc.nextDouble();
        System.out.print("Enter number-2 : ");
        double n2 = sc.nextDouble();
        System.out.print("Enter number-3 : ");
        double n3 = sc.nextDouble();

        double average = findAverage(n1, n2, n3);

        System.out.println(average);

        sc.close();
    }
}