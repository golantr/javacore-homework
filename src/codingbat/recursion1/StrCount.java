package codingbat.recursion1;

public class StrCount {

    /*
    Given a string and a non-empty substring sub, compute recursively the number of times
    that sub appears in the string, without the sub strings overlapping.

strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
	*/

    public static int strCount(String str, String sub) {
        if (str.length() <= sub.length()) {
            return str.equals(sub) ? 1 : 0;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }

    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat"));
        System.out.println(strCount("catcowcat", "cow"));
        System.out.println(strCount("catcowcat", "dog"));
    }
}