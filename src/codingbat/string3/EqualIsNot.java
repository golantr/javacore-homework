package codingbat.string3;

public class EqualIsNot {

    /*
    Given a string, return true if the number of appearances of "is" anywhere in the string
    is equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
	*/

    public static boolean equalIsNot(String str) {
        int diff = 0;
        String myStr = str + " ";
        for (int i = 0; i < myStr.length() - 2; i++) {
            if (myStr.substring(i, i + 2).equals("is")) {
                diff++;
            } else if (myStr.substring(i, i + 3).equals("not")) {
                diff--;
            }
        }
        return (diff == 0);
    }

    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }
}
