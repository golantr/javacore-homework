package codingbat.recursion1;

public class NoX {

    /*
    Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
	*/

    public static String noX(String str) {
        if (str.length() <= 1) {
            return str.equals("x") ? "" : str;
        }
        return (str.charAt(0) == 'x' ? "" : str.substring(0, 1)) + noX(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(noX("xaxb"));
        System.out.println(noX("abc"));
        System.out.println(noX("xx"));
    }
}
