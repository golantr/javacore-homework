package codingbat.array2;

public class More14 {

    /*
    Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
	*/

    public static boolean more14(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i] == 1 ? 1 : 0;
            res -= nums[i] == 4 ? 1 : 0;
        }
        return res > 0;
    }

    public static void main(String[] args) {
        System.out.println(more14(new int[]{1, 4, 1}));
        System.out.println(more14(new int[]{1, 4, 1, 4}));
        System.out.println(more14(new int[]{1, 1}));
    }
}
