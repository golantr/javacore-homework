package codingbat.array1;

import java.util.Arrays;

public class Make2 {

    /*
    Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
    the elements from a followed by the elements from b. The arrays may be any length, including 0,
    but there will be 2 or more elements available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
	*/

    public static int[] make2(int[] a, int[] b) {
        int[] res = new int[2];
        if (a.length == 0) {
            res[0] = b[0];
            res[1] = b[1];
        } else if (a.length == 1) {
            res[0] = a[0];
            res[1] = b[0];
        } else if (a.length > 1) {
            res[0] = a[0];
            res[1] = a[1];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(make2(new int[]{4, 5}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(make2(new int[]{4}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(make2(new int[]{}, new int[]{1, 2})));
    }
}
