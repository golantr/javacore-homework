package codingbat.warmup2;

public class StringX {

//    Given a string, return a version where all the "x" have been removed.
//    Except an "x" at the very start or end should not be removed.
//
//    stringX("xxHxix") → "xHix"
//    stringX("abxxxcd") → "abcd"
//    stringX("xabxxxcdx") → "xabcdx"

    public static String stringX(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i < str.length() - 1 && str.charAt(i) == 'x') {
                continue;
            }
            res += str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }
}
