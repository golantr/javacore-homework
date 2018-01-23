package codingbat.ap1;

public class MatchUp {

    /*
    Given 2 arrays that are the same length containing strings, compare the 1st string
    in one array to the 1st string in the other array, the 2nd to the 2nd and so on.
    Count the number of times that the 2 strings are non-empty and start with the same char.
    The strings may be any length, including 0.

matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
	*/

    public static int matchUp(String[] a, String[] b) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > 0 && b[i].length() > 0 && a[i].charAt(0) == b[i].charAt(0)) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"}));
        System.out.println(matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"}));
        System.out.println(matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}));
    }
}
