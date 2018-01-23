package codingbat.ap1;

public class ScoresClump {

    /*
    Given an array of scores sorted in increasing order, return true if the array contains
    3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.

scoresClump([3, 4, 5]) → true
scoresClump([3, 4, 6]) → false
scoresClump([1, 3, 5, 5]) → true
	*/

    public static boolean scoresClump(int[] scores) {
        if (scores.length < 3) {
            return false;
        }
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(scoresClump(new int[]{3, 4, 5}));
        System.out.println(scoresClump(new int[]{3, 4, 6}));
        System.out.println(scoresClump(new int[]{1, 3, 5, 5}));
    }
}
