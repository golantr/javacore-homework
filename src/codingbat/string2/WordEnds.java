package codingbat.string2;

public class WordEnds {

    /*
    Given a string and a non-empty word string, return a string made of each char
    just before and just after every appearance of the word in the string.
    Ignore cases where there is no char before or after the word, and a char may be
    included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
	*/

    public static String wordEnds(String str, String word) {
        String res = "";
        int wordLen = word.length();
        for (int i = 0; i < str.length() - wordLen + 1; i++) {
            if (str.substring(i, i + wordLen).equals(word)) {
                res += (i > 0) ? str.charAt(i - 1) : "";
                res += (i < str.length() - wordLen) ? str.charAt(i + wordLen) : "";
                i += wordLen - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
    }
}
