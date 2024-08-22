/*
 * Demo - StringBuilder 
 */

public class Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Devendra");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'D');
        System.out.println(sb);

        sb.insert(0, 'D');
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        sb.append(" ");
        sb.append("P");
        sb.append("a");
        sb.append("r");
        sb.append("m");
        sb.append("a");
        sb.append("r");
        System.out.println(sb);

        System.out.println(sb.length());

        // ? Direct Reverse Logic
        // System.out.println(sb.reverse());

        // ? Reverse Logic using loop
        for (int i = 0; i < sb.length() / 2; i++) {
            int from = i;
            int back = sb.length() - 1 - i;
            char front = sb.charAt(from);
            char backChar = sb.charAt(back);

            sb.setCharAt(from, backChar);
            sb.setCharAt(back, front);
        }
        System.out.println(sb);
    }
}