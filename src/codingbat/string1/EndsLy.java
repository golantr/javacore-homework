package codingbat.string1;

public class EndsLy {

    /*
    Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
	*/

    public static boolean endsLy(String str) {
        if (str.length() >= 2) {
            return str.endsWith("ly");
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }
}
