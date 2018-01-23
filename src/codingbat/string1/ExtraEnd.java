package codingbat.string1;

public class ExtraEnd {

//    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
//    The string length will be at least 2.
//
//    extraEnd("Hello") → "lololo"
//    extraEnd("ab") → "ababab"
//    extraEnd("Hi") → "HiHiHi"

    public static String extraEnd(String str) {
        String strEnd = str.substring(str.length() - 2);
        return strEnd + strEnd + strEnd;
    }

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
    }
}
