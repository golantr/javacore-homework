package codingbat.string1;

public class ExtraFront {

    /*
    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there.

extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
	*/

    public static String extraFront(String str) {
        int stringLen = Math.min(str.length(), 2);
        String res = str.substring(0, stringLen);
        return res + res + res;
    }

    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
    }
}
