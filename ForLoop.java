/*
 * This is demo file of the loops.
 */

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.println("Hello, world-1");
        System.out.println("Hello, world-2");

        // * Syntax of for loop
        // * for(initialization; condition; updating){there is your code you want to
        // print}

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }

        // ? This is infinite for loop
        // ! If we cant give terminating condition then this will be the infinite
        for (int i = 0;; i++) {
            System.out.println("Hello world");
        }
    }
}
