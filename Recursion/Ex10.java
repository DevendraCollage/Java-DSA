/*
 * Ex10 - Find the 1st & last occurrence of an element in string.
 * Time Complexity - O(n)
 */

public class Ex10 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int index, char elem) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == elem) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        findOccurance(str, index + 1, elem);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurance(str, 0, 'a');
    }
}
