package Functions;
/*
 * Function-3 Demo (Make a function and multiply the two numbers and return the product of two numbers).
 */

import java.util.Scanner;

public class Functions3 {
    public static int productOfTwoNumber(int n1, int n2) {
        int prod = n1 * n2;
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number-1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number-2 : ");
        int n2 = sc.nextInt();

        int product = productOfTwoNumber(n1, n2);

        System.out.println(product);

        sc.close();
    }
}
