package codingbat.warmup1;

public class In1020 {

//    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
//
//    in1020(12, 99) → true
//    in1020(21, 12) → true
//    in1020(8, 99) → false

    public static boolean in1020(int a, int b) {
        return ((a <= 20 && a >= 10) || (b <= 20 && b >= 10));
    }

    public static void main(String[] args) {
        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99));
    }
}
