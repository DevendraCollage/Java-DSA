/*
 * Demo1 - Bit Manipulation Demo (Get Bit)
 */

public class Demo1 {
    public static void main(String[] args) {
        int n = 5; // 0101 (Binary)
        int pos = 3;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }
}