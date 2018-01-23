package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    /*
    Given an array of strings, return a Map<String, Boolean> where each different string
    is a key and its value is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	*/

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], false);
            } else {
                map.put(strings[i], true);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}
