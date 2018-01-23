package codingbat.warmup2;

public class DoubleX {

//    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
//
//    DoubleX("axxbb") → true
//    DoubleX("axaxax") → false
//    DoubleX("xxxxx") → true

    static boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                return (str.charAt(i + 1) == 'x');
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }
}
