package codingbat.recursion1;

public class CountHi {

    /*
    Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
	*/

    public static int countHi(String str) {
        if (str.length() <= 2) {
            return str.equals("hi") ? 1 : 0;
        }
        return (str.substring(0, 2).equals("hi") ? 1 : 0) + countHi(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
    }
}
