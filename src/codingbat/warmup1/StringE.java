package codingbat.warmup1;

public class StringE {

//    Return true if the given string contains between 1 and 3 'e' chars.
//
//    stringE("Hello") → true
//    stringE("Heelle") → true
//    stringE("Heelele") → false

    public static boolean stringE(String str) {
        int res = str.length() - str.replace("e", "").length();
        return (res >= 1 && res <= 3);
    }

    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }
}
