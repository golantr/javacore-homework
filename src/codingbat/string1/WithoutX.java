package codingbat.string1;

public class WithoutX {

    /*
    Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
	*/

    public static String withoutX(String str) {
        String res = str;
        if (res.length() > 0 && res.charAt(0) == 'x') {
            res = res.substring(1);
        }
        if (res.length() > 0 && res.charAt(res.length() - 1) == 'x') {
            res = res.substring(0, res.length() - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
    }
}
