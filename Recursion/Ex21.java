/*
 * Ex21 - Print all the subsets of a set of first n natural numbers.
 * Time Complexity - O(2^n)
 */

import java.util.ArrayList;

public class Ex21 {
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subsets) {
        if (n == 0) {
            printSubset(subsets);
            return;
        }
        // Add
        subsets.add(n);
        findSubsets(n - 1, subsets);

        // Not added
        subsets.remove(subsets.size() - 1);
        findSubsets(n - 1, subsets);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subsets = new ArrayList<>();
        findSubsets(n, subsets);
    }
}
