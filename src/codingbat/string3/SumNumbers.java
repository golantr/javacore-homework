package codingbat.string3;

public class SumNumbers {

    /*
    Given a string, return the sum of the numbers appearing in the string, ignoring
    all other characters. A number is a series of 1 or more digit chars in a row.
    (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
    Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
	*/

    public static int sumNumbers(String str) {
        int res = 0;
        String numStr = "";
        String myStr = str + " ";
        for (int i = 0; i < myStr.length(); i++) {
            if (Character.isDigit(myStr.charAt(i))) {
                numStr += myStr.charAt(i);
            } else if (numStr.length() > 0) {
                res += Integer.parseInt(numStr);
                numStr = "";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));
    }
}
