package codingbat.array3;

public class CountClumps {

    /*
    Say that a "clump" in an array is a series of 2 or more adjacent elements
    of the same value. Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
	*/

    public static int countClumps(int[] nums) {
        int res = 0;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else if (count > 1) {
                res++;
                count = 1;
            }
        }
        return (count > 1) ? res + 1 : res;
    }

    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{}));
        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[]{1, 1, 2, 1, 1}));
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1}));
    }
}
