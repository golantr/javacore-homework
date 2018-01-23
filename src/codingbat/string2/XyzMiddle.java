package codingbat.string2;

public class XyzMiddle {

    /*
    Given a string, does "xyz" appear in the middle of the string? To define middle,
    we'll say that the number of chars to the left and right of the "xyz" must differ
    by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
	*/

    public static boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }
        int targetShift = (str.length() - 3) / 2;
        if ((str.substring(targetShift, targetShift + 3).equals("xyz")) ||
                (str.length() % 2 == 0 && str.substring(targetShift + 1, targetShift + 4).equals("xyz"))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }
}
