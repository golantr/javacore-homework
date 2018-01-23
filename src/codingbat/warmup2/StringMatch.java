package codingbat.warmup2;

public class StringMatch {

//    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
//    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings
//    appear in the same place in both strings.
//
//    stringMatch("xxcaazz", "xxbaaz") → 3
//    stringMatch("abc", "abc") → 2
//    stringMatch("abc", "axc") → 0

    public static int stringMatch(String a, String b) {
        int res = 0;
        int lenComp = Math.min(a.length(), b.length()) - 1;
        for (int i = 0; i < lenComp; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }
}
