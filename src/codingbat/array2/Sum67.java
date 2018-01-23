package codingbat.array2;

public class Sum67 {

    /*
    Return the sum of the numbers in the array, except ignore sections of numbers starting
    with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
    Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
	*/

    public static int sum67(int[] nums) {
        int res = 0;
        boolean is67 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                is67 = true;
            }
            if (is67) {
                if (nums[i] == 7) {
                    is67 = false;
                }
                continue;
            }
            res += nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sum67(new int[]{1, 2, 2}));
        System.out.println(sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
        System.out.println(sum67(new int[]{1, 1, 6, 7, 2}));
    }
}
