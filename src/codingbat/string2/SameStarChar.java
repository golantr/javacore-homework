package codingbat.string2;

public class SameStarChar {

    /*
    Returns true if for every '*' (star) in the string, if there are chars both immediately
    before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
	*/

    public static boolean sameStarChar(String str) {
        if (str.length() < 3) {
            return true;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i + 1) == '*' && str.charAt(i) != str.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));
    }
}
