package codingbat.string2;

public class GetSandwich {

    /*
    A sandwich is two pieces of bread with something in between. Return the string that is
    between the first and last appearance of "bread" in the given string, or
    return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
	*/

    public static String getSandwich(String str) {
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");
        String res = "";
        if (firstBread > -1 && lastBread > firstBread) {
            res = str.substring(firstBread + 5, lastBread);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }
}
