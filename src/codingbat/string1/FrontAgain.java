package codingbat.string1;

public class FrontAgain {

    /*
    Given a string, return true if the first 2 chars in the string also appear at the end of the string,
    such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
	*/

    public static boolean frontAgain(String str) {
        if (str.length() >= 2) {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }
}
