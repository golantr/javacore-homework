package codingbat.array2;

public class TwoTwo {

    /*
    Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
	*/

    public static boolean twoTwo(int[] nums) {
        if (nums.length == 1) {
            return nums[0] != 2;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if ((i < nums.length - 1 && nums[i + 1] != 2) || i == nums.length - 1) {
                    if (i > 0 && nums[i - 1] != 2) {
                        return false;
                    }
                } else {
                    i++;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(twoTwo(new int[]{4, 2, 2, 3}));
        System.out.println(twoTwo(new int[]{2, 2, 4}));
        System.out.println(twoTwo(new int[]{2, 2, 4, 2}));
    }
}
