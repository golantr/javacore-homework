package codingbat.array1;

import java.util.Arrays;

public class Front11 {

    /*
    Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
    If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
	*/

    public static int[] front11(int[] a, int[] b) {
        int arrayLen = 2;
        if (a.length == 0) {
            arrayLen--;
        }
        if (b.length == 0) {
            arrayLen--;
        }
        int[] res = new int[arrayLen];
        if (arrayLen > 0) {
            if (a.length > 0) {
                res[0] = a[0];
            } else {
                res[0] = b[0];
            }
            if (arrayLen == 2) {
                res[1] = b[0];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})));
        System.out.println(Arrays.toString(front11(new int[]{1}, new int[]{2})));
        System.out.println(Arrays.toString(front11(new int[]{1, 7}, new int[]{})));
    }
}
