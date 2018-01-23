package hackerrank.datastructures.java_hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    // You are given n pairs of strings. Two pairs (a, b) and (c, d) are identical if a=c and b=d.
    // That also implies (a, b) is not same as (b, a).
    // After taking each pair as input, you need to print number of unique pairs you currently have.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here
        Set<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + pair_left[i].length() + pair_right[i] + pair_right[i].length());
            System.out.println(set.size());
        }

    }
}