package codingbat.array2;

import java.util.Arrays;

public class FizzArray2 {

    /*
    Given a number n, create and return a new string array of length n, containing
    the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return
    a length 0 array. Note: String.valueOf(xxx) will make the String form of most types.
    The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)

fizzArray2(4) → ["0", "1", "2", "3"]
fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
fizzArray2(2) → ["0", "1"]
	*/

    public static String[] fizzArray2(int n) {
        String[] res = new String[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + "";
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray2(4)));
        System.out.println(Arrays.toString(fizzArray2(10)));
        System.out.println(Arrays.toString(fizzArray2(2)));
    }
}
