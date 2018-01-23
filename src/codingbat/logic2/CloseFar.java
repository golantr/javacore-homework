package codingbat.logic2;

public class CloseFar {

    /*
    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
    while the other is "far", differing from both other values by 2 or more.
    Note: Math.abs(num) computes the absolute value of a number.

closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
	*/

    public static boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - a) <= 1 && Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2) {
            return true;
        }
        if (Math.abs(c - a) <= 1 && Math.abs(b - a) >= 2 && Math.abs(c - b) >= 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(closeFar(1, 2, 10));
        System.out.println(closeFar(1, 2, 3));
        System.out.println(closeFar(4, 1, 3));
    }
}
