/*
 * Ex18 - Count total paths in a maze to move from (0,0) to (n,m)
 */

public class Ex18 {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downPaths = countPaths(i + 1, j, n, m);
        int rightPaths = countPaths(i, j + 1, n, m);

        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        int totalCont = countPaths(0, 0, n, m);

        System.out.println(totalCont);
    }
}
