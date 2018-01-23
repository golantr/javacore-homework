package codingbat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoZ {

    /*
    Given a list of strings, return a list of the strings, omitting any string
    that contains a "z". (Note: the str.contains(x) method returns a boolean)

noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
	*/

    public static List<String> noZ(List<String> strings) {
        strings = new ArrayList<>(strings);
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(noZ(Arrays.asList("aaa", "bbb", "aza")));
        System.out.println(noZ(Arrays.asList("hziz", "hzello", "hi")));
        System.out.println(noZ(Arrays.asList("hello", "howz", "are", "youz")));
    }
}
