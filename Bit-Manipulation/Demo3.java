/*
 * Demo3 - Bit Manipulation Demo (Clear Bit)
 */

public class Demo3 {
    public static void main(String[] args) {
        int n = 5; // 0101 (Binary)
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
