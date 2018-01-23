package codingbat.string2;

public class StarOut {

    /*
    Return a version of the given string, where for every star (*) in the string the star
    and the chars immediately to its left and right are gone. So "ab*cd" yields "ad"
    and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
	*/

    public static String starOut(String str) {
        String res = "";
        String myStr = "q" + str + "q";
        for (int i = 1; i < myStr.length() - 1; i++) {
            if (myStr.charAt(i - 1) != '*' && myStr.charAt(i) != '*' && myStr.charAt(i + 1) != '*') {
                res += myStr.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
    }
}
