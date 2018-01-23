package codingbat.functional1;

import java.util.Arrays;
import java.util.List;

public class MoreY {

    /*
    Given a list of strings, return a list where each string has "y" added at its start and end.

moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]
	*/

    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y" + n + "y");
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(moreY(Arrays.asList("a", "b", "c")));
        System.out.println(moreY(Arrays.asList("hello", "there")));
        System.out.println(moreY(Arrays.asList("yay")));
    }
}
