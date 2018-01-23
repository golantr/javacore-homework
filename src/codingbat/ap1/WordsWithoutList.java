package codingbat.ap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsWithoutList {

    /*
    Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the
    given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.

wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
	*/

    public static List wordsWithoutList(String[] words, int len) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                res.add(words[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3));
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4));
    }
}
