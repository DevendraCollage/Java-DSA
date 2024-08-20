import java.util.*;

public class FindElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row Size : ");
        int row = sc.nextInt();
        System.out.print("Enter Column Size : ");
        int column = sc.nextInt();
        System.out.println();

        int elem[][] = new int[row][column];

        System.out.println("Enter Elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("[%d][%d] : ", i, j);
                elem[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.print("Enter Element you want to find : ");
        int find = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (find == elem[i][j]) {
                    System.out.printf("%d-Row %d-Column available at!", i, j);
                    break;
                }
            }
        }

        sc.close();
    }
}
