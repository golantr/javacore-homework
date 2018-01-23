package codingbat.ap1;

public class HasOne {

    /*
    Given a positive int n, return true if it contains a 1 digit. Note: use % to get
    the rightmost digit, and / to discard the rightmost digit.

hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
	*/

    public static boolean hasOne(int n) {
        while (n > 0) {
            if (n % 10 == 1) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasOne(10));
        System.out.println(hasOne(22));
        System.out.println(hasOne(220));
    }
}
