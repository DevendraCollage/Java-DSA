/*
 * Demo - Operators and Binary Numbers
 */

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        b = a++; // Post-Increment
        System.out.println(a);
        System.out.println(b);

        int c = 10;
        int d = 0;
        d = ++c; // Pre-Increment
        System.out.println(c);
        System.out.println(d);
    }
}