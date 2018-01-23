package codingbat.warmup2;

public class StringSplosion {

//    Given a non-empty string like "Code" return a string like "CCoCodCode".
//
//    stringSplosion("Code") → "CCoCodCode"
//    stringSplosion("abc") → "aababc"
//    stringSplosion("ab") → "aab"

    public static String stringSplosion(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res += str.substring(0, i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }
}
