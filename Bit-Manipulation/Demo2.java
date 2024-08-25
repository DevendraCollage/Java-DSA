/*
 * Demo2 - Bit Manipulation Demo (Set Bit)
 */

public class Demo2 {
    public static void main(String[] args) {
        int n = 5; // 0101 (Binary)
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
