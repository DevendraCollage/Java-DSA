/*
 * Q1 - Take an array of names as input from the user and print them on the screen.
 */

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println();

        String names[] = new String[size];

        System.out.println("Enter names : ");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("[%d] : ", i);
            names[i] = sc.nextLine();
        }
        System.out.println();

        System.out.println("Names is : ");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("[%d] : %s\n", i, names[i]);
        }

        sc.close();
    }
}