package hackerrank.datastructures.java_1d_array_introduction;

import java.util.*;

public class Solution {

    /*
        Write the following code in the unlocked portion of your editor:
        Create an array, a, capable of holding n integers.
        Modify the code in the loop so that it saves each sequential value to its
        corresponding location in the array. For example, the first value must be stored in a0,
        the second value must be stored in a1, and so on.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Declare array a here
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            // Fill array a here
            a[i] = val;
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}