/*
 * This file is for the practice the loops questions.
 */

public class Quiz_1Loops {
    public static void main(String[] args) {
        // Question-1
        // Print the sum of n natural numbers
        int n = 4;
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

    }
}
