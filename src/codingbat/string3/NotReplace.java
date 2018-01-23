package codingbat.string3;

public class NotReplace {

    /*
    Given a string, return a string where every appearance of the lowercase word "is"
    has been replaced with "is not". The word "is" should not be immediately preceeded
    or followed by a letter -- so for example the "is" in "this" does not count.
    (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
	*/

    public static String notReplace(String str) {
        String res = "";
        String myStr = " " + str + "  ";
        int i;
        for (i = 1; i < myStr.length() - 2; ) {
            if (!Character.isLetter(myStr.charAt(i - 1)) && !Character.isLetter(myStr.charAt(i + 2))
                    && myStr.substring(i, i + 2).equals("is")) {
                res += "is not";
                i += 2;
            } else {
                res += myStr.charAt(i);
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
    }
}
