package codingbat.string2;

public class XyzThere {

    /*
    Return true if the given string contains an appearance of "xyz" where the xyz
    is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
	*/

    public static boolean xyzThere(String str) {
        return (str.replaceAll("\\.xyz", "").contains("xyz"));
    }

    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }
}
