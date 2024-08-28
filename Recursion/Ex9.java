/*
 * Ex9 - Print a String in Reverse
 * Time Complexity = O(n)
 */

import java.util.Scanner;

public class Ex9 {
    public static void printRev(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        printRev(str, index - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String Here : ");
        String s = sc.nextLine();
        System.out.println();

        printRev(s, s.length() - 1);

        sc.close();
    }
}
