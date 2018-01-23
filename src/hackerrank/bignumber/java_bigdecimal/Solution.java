package hackerrank.bignumber.java_bigdecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

class Solution {

    /*
    Given an array, s, of n real number strings, sort them in descending order — but wait, there's more!
    Each number must be printed in the exact same format as it was read from stdin, meaning that .1
    is printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values
    (e.g., .1 = 0.1), then they must be listed in the same order as they were received as input).
    */

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        class IndexedNumber implements Comparable {
            BigDecimal number;
            int index;

            public IndexedNumber(BigDecimal number, int index) {
                this.number = number;
                this.index = index;
            }

            @Override
            public int compareTo(Object o) {
                return((IndexedNumber) o).number.compareTo(number);
            }
        }

        IndexedNumber[] indexedNumbers = new IndexedNumber[n];
        for (int i = 0; i < n; i++) {
            indexedNumbers[i] = new IndexedNumber(new BigDecimal(s[i]), i);
        }
        Arrays.sort(indexedNumbers);
        String[] sorted = new String[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = s[indexedNumbers[i].index];
        }
        s = sorted;

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}