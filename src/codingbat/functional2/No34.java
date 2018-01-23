package codingbat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No34 {

    /*
    Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple"]
	*/

    public static List<String> no34(List<String> strings) {
        strings = new ArrayList<>(strings);
        strings.removeIf(n -> n.length() == 4 || n.length() == 3);
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(no34(Arrays.asList("a", "bb", "ccc")));
        System.out.println(no34(Arrays.asList("a", "bb", "ccc", "dddd")));
        System.out.println(no34(Arrays.asList("ccc", "dddd", "apple")));
    }
}
