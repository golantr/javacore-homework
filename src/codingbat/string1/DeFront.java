package codingbat.string1;

public class DeFront {

    /*
    Given a string, return a version without the first 2 chars.
    Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
	*/

    public static String deFront(String str) {
        String res = "";
        if (str.length() >= 2) {
            if (str.charAt(0) == 'a') {
                res += 'a';
            }
            if (str.charAt(1) == 'b') {
                res += 'b';
            }
            res += str.substring(2);
        }
        if (str.equals("a")) {
            res = "a";
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
    }
}
