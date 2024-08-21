/*
 * Q2 - Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
 * Example : 
 * original = eabcdef ; result = iabcdif
 * Original = xyz ; result = xyz
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string here : ");
        String demo = sc.nextLine();

        String result = "";

        for (int i = 0; i < demo.length(); i++) {
            if (demo.charAt(i) == 'e') {
                result = result + 'i';
            } else {
                result = result + demo.charAt(i);
            }
        }

        System.out.println(result);

        sc.close();
    }
}
