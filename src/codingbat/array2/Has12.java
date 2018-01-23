package codingbat.array2;

public class Has12 {

    /*
    Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
	*/

    public static boolean has12(int[] nums) {
        boolean has1 = false;
        for (int i = 0; i < nums.length; i++) {
            if (!has1 && nums[i] == 1) {
                has1 = true;
            } else if (has1 && nums[i] == 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(has12(new int[]{1, 3, 2}));
        System.out.println(has12(new int[]{3, 1, 2}));
        System.out.println(has12(new int[]{3, 1, 4, 5, 2}));
    }
}
