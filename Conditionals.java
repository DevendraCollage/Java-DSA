/*
 * Conditionals
 */

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You can ride it!");
        } else {
            System.out.println("You can not ride it!");
        }

        sc.close();
    }
}