package codingbat.recursion1;

public class Array6 {

    /*
    Given an array of ints, compute recursively if the array contains a 6. We'll use
    the convention of considering only the part of the array that begins at the given index.
    In this way, a recursive call can pass index+1 to move down the array. The initial
    call will pass in index as 0.

array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true
	*/

    public static boolean array6(int[] nums, int index) {
        return (nums.length != 0) &&
                ((nums[index] == 6) || ((index != (nums.length - 1)) && array6(nums, index + 1)));
    }

    public static void main(String[] args) {
        System.out.println(array6(new int[]{1, 6, 4}, 0));
        System.out.println(array6(new int[]{1, 4}, 0));
        System.out.println(array6(new int[]{6}, 0));
    }
}
