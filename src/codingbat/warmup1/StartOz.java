package codingbat.warmup1;

public class StartOz {

//    Given a string, return a string made of the first 2 chars (if present),
//    however include first char only if it is 'o' and include the second only if it is 'z',
//    so "ozymandias" yields "oz".
//
//    startOz("ozymandias") → "oz"
//    startOz("bzoo") → "z"
//    startOz("oxx") → "o"

    public static String startOz(String str) {
        String res = "";
        if (str.length() > 0 && str.charAt(0) == 'o') {
            res += 'o';
        }
        if (str.length() > 1 && str.charAt(1) == 'z') {
            res += 'z';
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }
}
