package codingbat.string1;

public class LastChars {

    /*
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
	*/

    public static String lastChars(String a, String b) {
        String res = "";
        if (a.equals("")) {
            res += "@";
        } else {
            res += a.charAt(0);
        }
        if (b.equals("")) {
            res += "@";
        } else {
            res += b.charAt(b.length()-1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }
}
