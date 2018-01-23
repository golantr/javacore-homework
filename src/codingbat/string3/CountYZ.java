package codingbat.string3;

public class CountYZ {

    /*
    Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
    and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
    We'll say that a y or z is at the end of a word if there is not an alphabetic letter
    immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
	*/

    public static int countYZ(String str) {
        int res = 0;
        String myStr = str.toLowerCase() + " ";
        for (int i = 1; i < myStr.length(); i++) {
            if ((myStr.charAt(i - 1) == 'y' || myStr.charAt(i - 1) == 'z')
                    && !Character.isLetter(myStr.charAt(i))) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));
    }
}
