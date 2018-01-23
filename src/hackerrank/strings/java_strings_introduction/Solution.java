package hackerrank.strings.java_strings_introduction;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /*
            For the first line, sum the lengths of A and B.
            For the second line, write Yes if A is lexicographically larger than B or No if it is not.
            For the third line, capitalize the first letter in both A and B and print them
            on a single line, separated by a space.
        */

        // Enter your code here. Print output to STDOUT.
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " +
                B.substring(0, 1).toUpperCase() + B.substring(1));

    }
}
