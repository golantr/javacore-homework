package codingbat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No9 {

    /*
    Given a list of non-negative integers, return a list of those numbers
    except omitting any that end with 9. (Note: % by 10)

no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]
	*/

    public static List<Integer> no9(List<Integer> nums) {
        nums = new ArrayList<>(nums);
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(no9(Arrays.asList(1, 2, 19)));
        System.out.println(no9(Arrays.asList(9, 19, 29, 3)));
        System.out.println(no9(Arrays.asList(1, 2, 3)));
    }
}
