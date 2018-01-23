package codingbat.array3;

public class MaxMirror {

    /*
    We'll say that a "mirror" section in an array is a group of contiguous elements such
    that somewhere in the array, the same group appears in reverse order. For example,
    the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
    Return the size of the largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
	*/

    public static int maxMirror(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int j = nums.length - 1;
            while (j >= count && i + count < nums.length) {
                if (nums[j - count] == nums[i + count]) {
                    res = Math.max(res, ++count);
                    continue;
                }
                count = 0;
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{1, 2, 3, 3, 8}));
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(maxMirror(new int[]{1, 2, 1, 4}));
        System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }
}
