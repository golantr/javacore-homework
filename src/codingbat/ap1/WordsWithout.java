package codingbat.ap1;

import java.util.Arrays;

public class WordsWithout {

    /*
    Given an array of strings, return a new array without the strings that are equal
    to the target string. One approach is to count the occurrences of the target string,
    make a new array of the correct length, and then copy over the correct strings.

wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
	*/

    public static String[] wordsWithout(String[] words, String target) {
        int len = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                len++;
            }
        }
        int j = 0;
        String[] res = new String[len];
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                res[j++] = words[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wordsWithout(new String[]{"a", "b", "c", "a"}, "a")));
        System.out.println(Arrays.toString(wordsWithout(new String[]{"a", "b", "c", "a"}, "b")));
        System.out.println(Arrays.toString(wordsWithout(new String[]{"a", "b", "c", "a"}, "c")));
    }
}
