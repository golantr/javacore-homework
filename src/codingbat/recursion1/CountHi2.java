package codingbat.recursion1;

public class CountHi2 {

    /*
    Given a string, compute recursively the number of times lowercase "hi"
    appears in the string, however do not count "hi" that have an 'x' immedately before them.

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
	*/

    public static int countHi2(String str) {
        if (str.length() <= 2) {
            return str.equals("hi") ? 1 : 0;
        }
        if (str.substring(0, 3).equals("xhi")) {
            return countHi2(str.substring(1)) - 1;
        } else if (str.substring(0, 2).equals("hi")) {
            return countHi2(str.substring(1)) + 1;
        } else {
            return countHi2(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(countHi2("hihihix"));
        System.out.println(countHi2("ahixhi"));
        System.out.println(countHi2("ahibhi"));
        System.out.println(countHi2("xhixhi"));
    }
}
