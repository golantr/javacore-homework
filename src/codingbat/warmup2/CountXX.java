package codingbat.warmup2;

public class CountXX {

//    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//
//    countXX("abcxx") → 1
//    countXX("xxx") → 2
//    countXX("xxxx") → 3

    static int countXX(String str) {
        int res = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }
}
