package codingbat.array3;

public class CanBalance {

    /*
    Given a non-empty array, return true if there is a place to split the array so that
    the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
	*/

    public static boolean canBalance(int[] nums) {
        int[] sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                sums[i] = sums[i - 1] + nums[i];
            } else {
                sums[i] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (sums[i] * 2 == sums[nums.length - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{10, 10}));
    }
}
