package codingbat.logic2;

public class EvenlySpaced {

    /*
    Given three ints, a b c, one of them is small, one is medium and one is large.
    Return true if the three values are evenly spaced, so the difference between small
    and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
	*/

    public static boolean evenlySpaced(int a, int b, int c) {
        if (a == b && b == c) return true;
        if ((a != b) && (b != c) && (a != c)) {
            if (Math.abs(a - b) == Math.abs(b - c)) return true;
            if (Math.abs(a - b) == Math.abs(a - c)) return true;
            if (Math.abs(a - c) == Math.abs(b - c)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));
    }
}
