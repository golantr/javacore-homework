package codingbat.array2;

import java.util.Arrays;

public class ZeroFront {

    /*
    Return an array that contains the exact same numbers as the given array, but rearranged
    so that all the zeros are grouped at the start of the array. The order of the non-zero
    numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return
    the given array or make a new array.

zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
	*/

    public static int[] zeroFront(int[] nums) {
        int[] res = new int[nums.length];
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                res[nums.length - 1 - count] = nums[i];
                count++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0, 0, 1})));
        System.out.println(Arrays.toString(zeroFront(new int[]{0, 1, 1, 0, 1})));
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0})));
    }
}
