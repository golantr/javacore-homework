package codingbat.warmup2;

public class AltPairs {

//    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
//
//    altPairs("kitten") → "kien"
//    altPairs("Chocolate") → "Chole"
//    altPairs("CodingHorror") → "Congrr"

    public static String altPairs(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i / 2 % 2 == 0) {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }
}
