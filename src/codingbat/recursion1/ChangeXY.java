package codingbat.recursion1;

public class ChangeXY {

    /*
    Given a string, compute recursively (no loops) a new string where all the lowercase 'x'
    chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
	*/

    public static String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return "y" + changeXY(str.substring(1));
        } else {
            return str.substring(0, 1) + changeXY(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(changeXY("codex"));
        System.out.println(changeXY("xxhixx"));
        System.out.println(changeXY("xhixhix"));
    }
}
