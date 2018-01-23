package codingbat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoNeg {

    /*
    Given a list of integers, return a list of the integers, omitting any that are less than 0.

noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
	*/

    public static List<Integer> noNeg(List<Integer> nums) {
        nums = new ArrayList<>(nums);
        nums.removeIf(n -> n < 0);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(noNeg(Arrays.asList(1, -2)));
        System.out.println(noNeg(Arrays.asList(-3, -3, 3, 3)));
        System.out.println(noNeg(Arrays.asList(-1, -1, -1)));
    }
}
