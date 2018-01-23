package codingbat.string2;

public class MixString {

    /*
    Given two strings, a and b, create a bigger string made of the first char of a,
    the first char of b, the second char of a, the second char of b, and so on.
    Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
	*/

    public static String mixString(String a, String b) {
        String res = "";
        int commonLen = Math.min(a.length(), b.length());
        for (int i = 0; i < commonLen; i++) {
            res += a.charAt(i);
            res += b.charAt(i);
        }
        res += a.substring(commonLen);
        res += b.substring(commonLen);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }
}
