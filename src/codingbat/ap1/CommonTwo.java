package codingbat.ap1;

public class CommonTwo {

    /*
    Start with two arrays of strings, a and b, each in alphabetical order, possibly with
    duplicates. Return the count of the number of strings which appear in both arrays.
    The best "linear" solution makes a single pass over both arrays, taking advantage
    of the fact that they are in alphabetical order.

commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
	*/

    public static int commonTwo(String[] a, String[] b) {
        int res = 0;
        int aIndex = 0, bIndex = 0;
        for (; aIndex < a.length; aIndex++) {
            if (aIndex > 0 && a[aIndex].equals(a[aIndex - 1])) {
                continue;
            }
            if (a[aIndex].compareTo(b[bIndex]) < 0) {
                continue;
            }
            for (; bIndex < b.length; bIndex++) {
                if (bIndex > 0 && b[bIndex].equals(b[bIndex - 1])) {
                    continue;
                }
                if (a[aIndex].compareTo(b[bIndex]) < 0) {
                    break;
                } else if (a[aIndex].compareTo(b[bIndex]) == 0) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(commonTwo(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"}));
        System.out.println(commonTwo(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"}));
        System.out.println(commonTwo(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));
    }
}
