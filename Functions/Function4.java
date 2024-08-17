package Functions;
/*
 * Function-4 Demo (Find the factorial of the given number).
 */

import java.util.Scanner;

public class Function4 {
    public static int fact(int n) {
        int f = 1;
        if (n < 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int factorial = fact(n);

        System.out.println(factorial);

        sc.close();
    }
}
