package codingbat.array1;

import java.util.Arrays;

public class Reverse3 {

    /*
    Given an array of ints length 3, return a new array with the elements in reverse order,
    so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
	*/

    public static int[] reverse3(int[] nums) {
        int[] res = new int[3];
        res[0] = nums[2];
        res[1] = nums[1];
        res[2] = nums[0];
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(reverse3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(reverse3(new int[]{7, 0, 0})));
    }
}
