package codingbat.warmup1;

public class FrontBack {

//    Given a string, return a new string where the first and last chars have been exchanged.
//
//    frontBack("code") → "eodc"
//    frontBack("a") → "a"
//    frontBack("ab") → "ba"

    public static String frontBack(String str) {
        if (str.length() > 1) {
            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }
}
