import java.util.Scanner;

public class Prob3 {
    public static void multiplicationTable(int n) {
        System.out.println("Multiplication table of : " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here : ");
        int n = sc.nextInt();
        System.out.println();

        multiplicationTable(n);

        sc.close();
    }
}
