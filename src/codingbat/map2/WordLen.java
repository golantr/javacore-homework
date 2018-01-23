package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordLen {

    /*
    Given an array of strings, return a Map<String, Integer> containing a key for
    every different string in the array, and the value is that string's length.

wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
	*/

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], strings[i].length());
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(wordLen(new String[]{"a", "bb", "a", "bb"}));
        System.out.println(wordLen(new String[]{"this", "and", "that", "and"}));
        System.out.println(wordLen(new String[]{"code", "code", "code", "bug"}));
    }
}
