package codingbat.string1;

public class MiddleThree {

    /*
    Given a string of odd length, return the string length 3 from its middle,
    so "Candy" yields "and". The string length will be at least 3.

middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
	*/

    public static String middleThree(String str) {
        int startIndex = (str.length() - 3) / 2;
        return str.substring(startIndex, startIndex + 3);
    }

    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }
}
