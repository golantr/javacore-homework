package codingbat.functional1;

import java.util.Arrays;
import java.util.List;

public class AddStar {

    /*
    Given a list of strings, return a list where each string has "*" added at its end.

addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]
	*/

    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(addStar(Arrays.asList("a", "bb", "ccc")));
        System.out.println(addStar(Arrays.asList("hello", "there")));
        System.out.println(addStar(Arrays.asList("*")));
    }
}
