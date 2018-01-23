package codingbat.array1;

public class MaxTriple {

    /*
    Given an array of ints of odd length, look at the first, last,
    and middle values in the array and return the largest. The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
	*/

    public static int maxTriple(int[] nums) {
        return Math.max(nums[0], Math.max(nums[nums.length - 1], nums[nums.length / 2]));
    }

    public static void main(String[] args) {
        System.out.println(maxTriple(new int[]{1, 2, 3}));
        System.out.println(maxTriple(new int[]{1, 5, 3}));
        System.out.println(maxTriple(new int[]{5, 2, 3}));
    }
}
