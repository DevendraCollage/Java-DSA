import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next(); // .next() this will get only one token
        // name = sc.nextLine(); // .nextLine() this will get the whole line of the
        // token
        System.out.println(name);

        // Quiz-Question : Take 2 variables 'a' and 'b' and print their sum.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

        sc.close();
    }
}
