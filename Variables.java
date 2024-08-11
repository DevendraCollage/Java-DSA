public class Variables {
    public static void main(String[] args) {
        // Java is a typed-safe language
        String name = "Devendra";
        int a = 25;
        int b = 10;
        int age = 22;
        double price = 25.25;
        System.out.println(name);
        System.out.println(a);
        System.out.println(b);
        System.out.println(age);
        System.out.println(price);

        // We can also change the data of the declared variables
        b = 15;
        name = "Darshan";

        // Variables Example
        int n1 = 10;
        int n2 = 5;
        int c = n1 + n2;
        System.out.println(c);

        int diff = n1 - n2;
        System.out.println(diff);

        // ! Quiz-Question :
        /*
         * We want to calculate this:
         * axb
         * --- a=10, b=5 Value of this variable
         * a-b
         * 10x5 50
         * ---- ---- = Answer (10)
         * 10-5 5
         * //? Which is the correct option for the above operation
         * Option A : a * b / a - b
         * Option B : (a*b) / (a-b)
         */
    }
}
