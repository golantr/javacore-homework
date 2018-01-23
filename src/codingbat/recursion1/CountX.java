package codingbat.recursion1;

public class CountX {

    /*
    Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
	*/

    public static int countX(String str) {
        if (str.length() <= 1) {
            return str.equals("x") ? 1 : 0;
        }
        return (str.charAt(0) == 'x' ? 1 : 0) + countX(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));
        System.out.println(countX("xhixhix"));
        System.out.println(countX("hi"));
    }
}
