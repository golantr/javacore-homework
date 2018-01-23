package codingbat.string3;

public class SameEnds {

    /*
    Given a string, return the longest substring that appears at both the beginning
    and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
	*/

    public static String sameEnds(String string) {
        int maxLen = string.length() / 2;
        int resultLen = 0;
        for (int i = 0; i < maxLen; i++) {
            if (string.substring(0, i + 1).equals(string.substring(string.length() - i - 1))) {
                resultLen = i + 1;
            }
        }
        String res = string.substring(0, resultLen);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx"));
    }
}
