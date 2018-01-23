package codingbat.logic2;

public class LuckySum {

    /*
    Given 3 int values, a b c, return their sum. However, if one of the values is 13
    then it does not count towards the sum and values to its right do not count.
    So for example, if b is 13, then both b and c do not count.

luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
	*/

    public static int luckySum(int a, int b, int c) {
        int res = 0;
        if (a == 13) return res;
        res += a;
        if (b == 13) return res;
        res += b;
        if (c == 13) return res;
        res += c;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(luckySum(1, 2, 3));
        System.out.println(luckySum(1, 2, 13));
        System.out.println(luckySum(1, 13, 3));
    }
}
