package codingbat.array1;

public class No23 {

    /*
    Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
	*/

    public static boolean no23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(no23(new int[]{4, 5}));
        System.out.println(no23(new int[]{4, 2}));
        System.out.println(no23(new int[]{3, 5}));
    }
}
