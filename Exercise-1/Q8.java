/*
 * Q8 - Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
 */

import java.util.Scanner;

public class Q8 {
    public static double powerOfTwo(double n1, double n2) {
        double power = Math.pow(n1, n2);
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number-1 : ");
        double n1 = sc.nextDouble();
        System.out.print("Enter power : ");
        double n2 = sc.nextDouble();

        double power = powerOfTwo(n1, n2);

        System.out.println(power);

        sc.close();
    }
}
