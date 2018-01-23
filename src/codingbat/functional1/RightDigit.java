package codingbat.functional1;

import java.util.Arrays;
import java.util.List;

public class RightDigit {

    /*
    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]
	*/

    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(rightDigit(Arrays.asList(1, 22, 93)));
        System.out.println(rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
        System.out.println(rightDigit(Arrays.asList(10, 0)));
    }
}
