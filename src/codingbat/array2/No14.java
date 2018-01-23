package codingbat.array2;

public class No14 {

    /*
    Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
	*/

    public static boolean no14(int[] nums) {
        boolean no1 = true, no4 = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                no1 = false;
            }
            if (nums[i] == 4) {
                no4 = false;
            }
        }
        return no1 || no4;
    }

    public static void main(String[] args) {
        System.out.println(no14(new int[]{1, 2, 3}));
        System.out.println(no14(new int[]{1, 2, 3, 4}));
        System.out.println(no14(new int[]{2, 3, 4}));
    }
}
