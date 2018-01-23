package codingbat.string1;

public class AtFirst {

    /*
    Given a string, return a string length 2 made of its first 2 chars.
    If the string length is less than 2, use '@' for the missing chars.

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
	*/

    public static String atFirst(String str) {
        int leng = Math.min(str.length(), 2);
        String res = str.substring(0, leng);
        for (int i = 0; i < 2 - leng; i++) {
            res += "@";
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
    }
}
