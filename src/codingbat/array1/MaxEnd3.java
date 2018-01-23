package codingbat.array1;

import java.util.Arrays;

public class MaxEnd3 {

    /*
    Given an array of ints length 3, figure out which is larger, the first or last element in the array,
    and set all the other elements to be that value. Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
	*/

    public static int[] maxEnd3(int[] nums) {
        int largest = Math.max(nums[0], nums[nums.length - 1]);
        int[] res = new int[3];
        res[0] = largest;
        res[1] = largest;
        res[2] = largest;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxEnd3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(maxEnd3(new int[]{11, 5, 9})));
        System.out.println(Arrays.toString(maxEnd3(new int[]{2, 11, 3})));
    }
}
