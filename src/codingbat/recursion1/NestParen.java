package codingbat.recursion1;

public class NestParen {

    /*
    Given a string, return true if it is a nesting of zero or more pairs of parenthesis,
    like "(())" or "((()))". Suggestion: check the first and last chars, and then
    recur on what's inside them.

nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
	*/

    public static boolean nestParen(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (str.startsWith("(") && str.endsWith(")")) {
            return str.length() == 2 || nestParen(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(nestParen("(())"));
        System.out.println(nestParen("((()))"));
        System.out.println(nestParen("(((x))"));
    }
}
