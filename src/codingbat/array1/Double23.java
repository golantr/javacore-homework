package codingbat.array1;

public class Double23 {

    /*
    Given an int array, return true if the array contains 2 twice, or 3 twice.
    The array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
	*/

    public static boolean double23(int[] nums) {
        return (nums.length == 2 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)));
    }

    public static void main(String[] args) {
        System.out.println(double23(new int[]{2, 2}));
        System.out.println(double23(new int[]{3, 3}));
        System.out.println(double23(new int[]{2, 3}));
    }
}
