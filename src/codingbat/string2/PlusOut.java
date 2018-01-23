package codingbat.string2;

public class PlusOut {

    /*
    Given a string and a non-empty word string, return a version of the original String
    where all chars have been replaced by pluses ("+"), except for appearances of the word
    string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
	*/

    public static String plusOut(String str, String word) {
        String res = "";
        int wordLen = word.length();
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - wordLen + 1 && str.substring(i, i + wordLen).equals(word)) {
                res += str.substring(i, i + wordLen);
                i += wordLen - 1;
            } else {
                res += "+";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }
}
