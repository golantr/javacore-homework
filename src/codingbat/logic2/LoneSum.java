package codingbat.logic2;

public class LoneSum {

    /*
    Given 3 int values, a b c, return their sum. However, if one of the values is
    the same as another of the values, it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
	*/

    public static int loneSum(int a, int b, int c) {
        int res = a + b + c;
        if (a == b || a == c) {
            res -= 2 * a;
        }
        if (b == c) {
            res -= 2 * b;
            if (a == b) {
                return 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));
    }
}
