package codingbat.recursion1;

public class ParenBit {

    /*
    Given a string that contains a single pair of parenthesis, compute recursively a new string
    made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".

parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
	*/

    public static String parenBit(String str) {
        if (!str.startsWith("(")) {
            return parenBit(str.substring(1));
        }
        if (!str.endsWith(")")) {
            return parenBit(str.substring(0, str.length() - 1));
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(parenBit("xyz(abc)123"));
        System.out.println(parenBit("x(hello)"));
        System.out.println(parenBit("(xy)1"));
    }
}
