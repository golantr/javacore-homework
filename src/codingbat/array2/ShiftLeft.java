package codingbat.array2;

import java.util.Arrays;

public class ShiftLeft {

    /*
    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns{2, 5, 3, 6}.
    You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
	*/

    public static int[] shiftLeft(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shiftLeft(new int[]{6, 2, 5, 3})));
        System.out.println(Arrays.toString(shiftLeft(new int[]{1, 2})));
        System.out.println(Arrays.toString(shiftLeft(new int[]{1})));
    }
}
