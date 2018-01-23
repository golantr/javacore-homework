package codingbat.string2;

public class RepeatSeparator {

    /*
    Given two strings, word and a separator sep, return a big string made of count occurrences
    of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
	*/

    public static String repeatSeparator(String word, String sep, int count) {
        String res = "";
        for (int i = 0; i < count; i++) {
            res += word;
            if (i + 1 < count) res += sep;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
    }
}
