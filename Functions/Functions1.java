package Functions;
/*
 * Functions Demo
 */

import java.util.Scanner;

public class Functions1 {
    public static void printMyName(String name) {
        System.out.println("Your name is : " + name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String username = sc.nextLine();

        printMyName(username);

        sc.close();
    }
}