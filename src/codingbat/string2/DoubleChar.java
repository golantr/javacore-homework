package codingbat.string2;

public class DoubleChar {

    /*
    Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
	*/

    public static String doubleChar(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res += "" + str.charAt(i) + str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }
}
