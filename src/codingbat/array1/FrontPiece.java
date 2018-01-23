package codingbat.array1;

import java.util.Arrays;

public class FrontPiece {

    /*
    Given an int array of any length, return a new array of its first 2 elements.
    If the array is smaller than length 2, use whatever elements are present.

frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
	*/

    public static int[] frontPiece(int[] nums) {
        int arrayLen = Math.min(2, nums.length);
        return Arrays.copyOfRange(nums, 0, arrayLen);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(frontPiece(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(frontPiece(new int[]{1, 2})));
        System.out.println(Arrays.toString(frontPiece(new int[]{1})));
    }
}
