/*
 * StringDemo - How to declare String
 */

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        // ? we can declare string in this types
        // String name = "Devendra";
        // System.out.println(name);
        // String fullName = "Devendra Parmar";
        // System.out.println(fullName);
        // String n = new String("Hello, world");
        // System.out.println(n);

        // // ? We can also get the string from the user
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter your name : ");
        // String yourname = sc.nextLine();

        // System.out.println(yourname);

        // // ? Concate the two strings
        // String fname = "Devendra";
        // String lname = "Parmar";
        // String fullname = fname.concat(lname);
        // String fullname2 = fname + " " + lname;
        // System.out.println(fullname);
        // System.out.println(fullname2);

        // // ? Length of String
        // int len = fullname.length();
        // System.out.println(len);

        // ? Compare two string
        // String n1 = "Hello";
        // String n2 = "hello";
        // if (n1.compareTo(n2) == 0) {
        // System.out.println("String Is Equal!");
        // } else {
        // System.out.println("String Is not Equal!");
        // }

        // ! Challenge - Why This will not properly work
        // if (new String("Hello") == new String("Hello")) {
        // System.out.println("Is Equal!");
        // } else {
        // System.out.println("Is Not Equal!");
        // }

        // ? Sub String
        String sentence = "My name is Devendra";
        String name = sentence.substring(11);
        System.out.println(name);
    }
}