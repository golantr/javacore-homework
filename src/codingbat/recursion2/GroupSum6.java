package codingbat.recursion2;

public class GroupSum6 {

    /*
    Given an array of ints, is it possible to choose a group of some of the ints,
    beginning at the start index, such that the group sums to the given target?
    However, with the additional constraint that all 6's must be chosen. (No loops needed.)

groupSum6(0, [5, 6, 2], 8) → true
groupSum6(0, [5, 6, 2], 9) → false
groupSum6(0, [5, 6, 2], 7) → false
	*/

    public static boolean groupSum6(int start, int[] nums, int target) {
        if (nums.length == 0) {
            return target == 0;
        }
        if (start == nums.length - 1) {
            return (target == 0 && nums[start] != 6) || target == nums[start];
        }
        if (target < 0) {
            return false;
        }
        if (nums[start] != 6) {
            return groupSum6(start + 1, nums, target - nums[start])
                    || groupSum6(start + 1, nums, target);
        } else {
            return groupSum6(start + 1, nums, target - nums[start]);
        }
    }

    public static void main(String[] args) {
        System.out.println(groupSum6(0, new int[]{5, 6, 2}, 8));
        System.out.println(groupSum6(0, new int[]{5, 6, 2}, 9));
        System.out.println(groupSum6(0, new int[]{5, 6, 2}, 7));
    }
}
