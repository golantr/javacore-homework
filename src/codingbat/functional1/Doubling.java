package codingbat.functional1;

import java.util.Arrays;
import java.util.List;

public class Doubling {

    /*
    Given a list of integers, return a list where each integer is multiplied by 2.

doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []
	*/

    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(doubling(Arrays.asList(1, 2, 3)));
        System.out.println(doubling(Arrays.asList(6, 8, 6, 8, -1)));
        System.out.println(doubling(Arrays.asList()));
    }
}
