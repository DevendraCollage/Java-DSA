/*
 * Calculate the X^N.
 */

public class Ex6 {
    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPowernm1 = calPower(x, n - 1);
        int xPow = x * xPowernm1;
        return xPow;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int power = calPower(x, n);
        System.out.println(power);
    }
}
