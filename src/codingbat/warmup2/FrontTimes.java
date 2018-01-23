package codingbat.warmup2;

public class FrontTimes {

//    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
//    or whatever is there if the string is less than length 3. Return n copies of the front;
//
//    frontTimes("Chocolate", 2) → "ChoCho"
//    frontTimes("Chocolate", 3) → "ChoChoCho"
//    frontTimes("Abc", 3) → "AbcAbcAbc"

    public static String frontTimes(String str, int n) {
        String front, res = "";
        front = (str.length() > 2) ? str.substring(0, 3) : str;
        for (int i = 0; i < n; i++) {
            res += front;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
    }
}
