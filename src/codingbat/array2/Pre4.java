package codingbat.array2;

import java.util.Arrays;

public class Pre4 {

    /*
    Given a non-empty array of ints, return a new array containing the elements from
    the original array that come before the first 4 in the original array.
    The original array will contain at least one 4.Note that it is valid in java
    to create an array of length 0.

pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
	*/

    public static int[] pre4(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                return Arrays.copyOfRange(nums, 0, i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pre4(new int[]{1, 2, 4, 1})));
        System.out.println(Arrays.toString(pre4(new int[]{3, 1, 4})));
        System.out.println(Arrays.toString(pre4(new int[]{1, 4, 4})));
    }
}
