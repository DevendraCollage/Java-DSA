/*
 * Ex20 - Find the number of ways in which you can invite people to your party, single or in pairs
 */

public class Ex20 {
    public static int countWays(int n) {
        if (n <= 1) {
            return 1;
        }
        int ways1 = countWays(n - 1);
        int ways2 = (n - 1) * countWays(n - 2);
        int total = ways1 + ways2;
        return total;
    }

    public static void main(String[] args) {
        int n = 4;
        int total = countWays(n);
        System.out.println(total);
    }
}
