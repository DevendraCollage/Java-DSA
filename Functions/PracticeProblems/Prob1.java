import java.util.Scanner;

public class Prob1 {
    public static void primeOrNot(int n) {
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(n + " = Is Prime Number!");
        } else {
            System.out.println(n + " = Is Not-Prime Number!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        primeOrNot(num);

        sc.close();
    }
}
