package hackerrank.strings.java_string_reverse;

import java.io.*;
import java.util.*;

public class Solution {

    // Given a string A, print Yes if it is a palindrome, print No otherwise.

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String reverse = "";

        for (int i = A.length() - 1; i >= 0; i--) {
            reverse += A.substring(i, i + 1);
        }

        System.out.println(A.equals(reverse) ? "Yes": "No");
    }
}

