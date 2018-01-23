package codingbat.string3;

public class WithoutString {

    /*
    Given two strings, base and remove, return a version of the base string where all
    instances of the remove string have been removed (not case sensitive).
    You may assume that the remove string is length 1 or more.
    Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
	*/

    public static String withoutString(String base, String remove) {
        String res = "";
        int wordLen = remove.length();
        int i;
        for (i = 0; i < base.length() - wordLen + 1; ) {
            if (base.substring(i, i + wordLen).toLowerCase().equals(remove.toLowerCase())) {
                i += wordLen;
            } else {
                res += base.charAt(i);
                i++;
            }
        }
        return res + base.substring(i, base.length());
    }

    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));
    }
}
