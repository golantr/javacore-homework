package hackerrank.advanced.java_lambda_expressions;

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    /*
        Write the following methods that return a lambda expression performing a specified action:

        PerformOperation isOdd(): The lambda expression must return true if a number is odd
        or false if it is even.

        PerformOperation isPrime(): The lambda expression must return true if a number is prime
        or false if it is composite.

        PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome
        or false if it is not.
    */

    PerformOperation isOdd() {
        return (p) -> p % 2 == 1;
    }

    PerformOperation isPrime() {
        return (p) -> java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(p)).allMatch(x -> p % x != 0);
    }

    PerformOperation isPalindrome() {
        return (p) ->
                new StringBuilder(String.valueOf(p)).reverse().toString().equals(String.valueOf(p));
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

