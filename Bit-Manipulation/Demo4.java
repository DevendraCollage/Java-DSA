/*
 * Demo4 - Bit Manipulation Demo (Update Bit)
 */

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt(); // operation=1 : Set
        // Operation=0 : Clear

        int n = 5; // 0101 (Binary)
        /*
         * 1 => 0101 -> 0111 -> Decimal of 7
         */
        int pos = 1;

        int bitMask = 1 << pos;
        if (operation == 1) {
            // Set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // Clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

        sc.close();
    }
}
