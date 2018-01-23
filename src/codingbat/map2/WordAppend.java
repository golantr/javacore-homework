package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    /*
    Loop over the given array of strings to build a result string like this: when a string
    appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
    Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
	*/

    public static String wordAppend(String[] strings) {
        String res = "";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            Integer value = map.merge(strings[i], 1, (n1, n2) -> n1 + n2);
            if (value % 2 == 0) {
                res += strings[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "a"}));
        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(wordAppend(new String[]{"a", "", "a"}));
    }
}
