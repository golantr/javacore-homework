package codingbat.string3;

public class GHappy {

    /*
    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
    immediately to its left or right. Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
	*/

    public static boolean gHappy(String str) {
        String myStr = " " + str + " ";
        for (int i = 1; i < myStr.length() - 1; i++) {
            if (myStr.charAt(i) == 'g' && !(myStr.charAt(i - 1) == 'g' || myStr.charAt(i + 1) == 'g')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggyygxx"));
    }
}
