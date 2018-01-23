package codingbat.array1;

import java.util.Arrays;

public class MidThree {

    /*
    Given an array of ints of odd length, return a new array length 3 containing
    the elements from the middle of the array. The array length will be at least 3.

midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
	*/

    public static int[] midThree(int[] nums) {
        int[] res = new int[3];
        int startIndex = nums.length / 2 - 1;
        res[0] = nums[startIndex];
        res[1] = nums[startIndex+1];
        res[2] = nums[startIndex+2];
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3})));
    }
}
