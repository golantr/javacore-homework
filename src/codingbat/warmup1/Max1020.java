package codingbat.warmup1;

public class Max1020 {

//    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
//    or return 0 if neither is in that range.
//
//    max1020(11, 19) → 19
//    max1020(19, 11) → 19
//    max1020(11, 9) → 11

    public static int max1020(int a, int b) {
        int max = Math.max(a, b);
        int res = (max <= 20) ? max : a + b - max;
        return (res >= 10 && res <= 20) ? res : 0;
    }

    public static void main(String[] args) {
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
    }
}
