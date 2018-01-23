package codingbat.logic1;

public class More20 {

    /*
    Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
    See also: Introduction to Mod

more20(20) → false
more20(21) → true
more20(22) → true
	*/

    public static boolean more20(int n) {
        int test = n % 20;
        return (test == 1) || (test == 2);
    }

    public static void main(String[] args) {
        System.out.println(more20(20));
        System.out.println(more20(21));
        System.out.println(more20(22));
    }
}
