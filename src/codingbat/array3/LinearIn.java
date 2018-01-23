package codingbat.array3;

public class LinearIn {

    /*
    Given two arrays of ints sorted in increasing order, outer and inner, return true if
    all of the numbers in inner appear in outer. The best solution makes only a single "linear"
    pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
	*/

    public static boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) {
            return true;
        }
        int i = 0, j = 0;
        for (; i < inner.length; i++) {
            for (; j < outer.length; j++) {
                if (outer[j] == inner[i]) {
                    if (i == inner.length - 1) {
                        return true;
                    } else {
                        break;
                    }
                } else if (outer[j] > inner[i]) {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
    }
}
