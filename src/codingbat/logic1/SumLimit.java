package codingbat.logic1;

public class SumLimit {

    /*
    Given 2 non-negative ints, a and b, return their sum, so long as the sum has
    the same number of digits as a. If the sum has more digits than a, just return a without b.
    (Note: one way to compute the number of digits of a non-negative int n is to convert
    it to a string with String.valueOf(n) and then check the length of the string.)

sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9
	*/

    public static int sumLimit(int a, int b) {
        if (String.valueOf(a).length() < String.valueOf(a + b).length()) {
            return a;
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sumLimit(2, 3));
        System.out.println(sumLimit(8, 3));
        System.out.println(sumLimit(8, 1));
    }
}
