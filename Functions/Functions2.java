package Functions;
/*
 * Function-2 Demo (Make a function and add 2 numbers and return the sum).
 */

import java.util.Scanner;

public class Functions2 {
    public static int sumOfTwoNumber(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number-1 here : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number-2 here : ");
        int n2 = sc.nextInt();

        int sum = sumOfTwoNumber(n1, n2);

        System.out.println("The Sum of two number is : " + sum);

        sc.close();
    }
}
