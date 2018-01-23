package codingbat.functional1;

import java.util.Arrays;
import java.util.List;

public class Math1 {

    /*
    Given a list of integers, return a list where each integer is added
    to 1 and the result is multiplied by 10.

math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110]
	*/

    public static List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(math1(Arrays.asList(1, 2, 3)));
        System.out.println(math1(Arrays.asList(6, 8, 6, 8, 1)));
        System.out.println(math1(Arrays.asList(10)));
    }
}
