package codingbat.string1;

public class MinCat {

    /*
    Given two strings, append them together (known as "concatenation") and return the result.
    However, if the strings are different lengths, omit chars from the longer string
    so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi".
    The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
	*/

    public static String minCat(String a, String b) {
        int stringLen = Math.min(a.length(), b.length());
        return a.substring(a.length() - stringLen) + b.substring(b.length() - stringLen);
    }

    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
    }
}
