import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Row Size : ");
        int row = sc.nextInt();
        System.out.print("Enter the Column Size : ");
        int column = sc.nextInt();
        System.out.println();

        int marks[][] = new int[row][column];

        System.out.println("Enter Elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("[%d][%d] : ", i, j);
                marks[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Your Array Elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("[%d][%d] : %d\n", i, j, marks[i][j]);
            }
        }

        sc.close();
    }
}
