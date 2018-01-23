package codingbat.recursion2;

public class SplitArray {

    /*
    Given an array of ints, is it possible to divide the ints into two groups, so that
    the sums of the two groups are the same. Every int must be in one group or the other.
    Write a recursive helper method that takes whatever arguments you like, and make
    the initial call to your recursive helper from splitArray(). (No loops needed.)

splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true
	*/

    public static boolean splitArray(int[] nums) {
        return canSplitArray(0, nums, 0, 0);
    }

    static boolean canSplitArray(int start, int[] nums, int sum1, int sum2) {
        if (start == nums.length) {
            return sum1 == sum2;
        }
        return canSplitArray(start + 1, nums, sum1 + nums[start], sum2)
                || canSplitArray(start + 1, nums, sum1, sum2 + nums[start]);
    }

    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{2, 2}));
        System.out.println(splitArray(new int[]{2, 3}));
        System.out.println(splitArray(new int[]{5, 2, 3}));
    }
}
