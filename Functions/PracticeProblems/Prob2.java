import java.util.Scanner;

public class Prob2 {
    public static void isEvenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Is Even!");
        } else {
            System.out.println("Is odd!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        isEvenOrOdd(num);

        sc.close();
    }
}
