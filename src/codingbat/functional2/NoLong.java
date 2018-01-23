package codingbat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoLong {

    /*
    Given a list of strings, return a list of the strings, omitting any string length 4 or more.

noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []
	*/

    public static List<String> noLong(List<String> strings) {
        strings = new ArrayList<>(strings);
        strings.removeIf(n -> n.length() >= 4);
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(noLong(Arrays.asList("this", "not", "too", "long")));
        System.out.println(noLong(Arrays.asList("a", "bbb", "cccc")));
        System.out.println(noLong(Arrays.asList("cccc", "cccc", "cccc")));
    }
}
