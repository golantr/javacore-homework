package codingbat.string2;

public class ZipZap {

    /*
    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z'
    and ending with 'p'. Return a string where for all such words, the middle letter is gone,
    so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
	*/

    public static String zipZap(String str) {
        String res = "";
        if (str.length() < 3) {
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                res += "zp";
                i += 2;
            } else {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
    }
}
