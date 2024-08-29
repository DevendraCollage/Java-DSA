/*
 * Ex19 - Place Tiles of size 1xm in floor of size nxm
 */

public class Ex19 {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // Vertically
        int vertPlacements = placeTiles(n - m, m);
        // Horizontally
        int horPlacements = placeTiles(n - 1, m);

        return vertPlacements + horPlacements;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;

        int totalTiles = placeTiles(n, m);

        System.out.println(totalTiles);
    }
}
