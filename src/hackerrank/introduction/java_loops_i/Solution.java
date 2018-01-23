package hackerrank.introduction.java_loops_i;

import java.util.Scanner;

public class Solution {

    /*
    * In this challenge, we're going to use loops to help us do some simple math.
    * Given an integer, N, print its first 10 multiples each on a new line in the form:
    * N x i = result.
    * */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d\n", N, i, i*N);
        }
    }
}
