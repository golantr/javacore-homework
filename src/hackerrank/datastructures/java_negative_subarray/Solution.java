package hackerrank.datastructures.java_negative_subarray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // Given an array of n integers, find and print its number of negative subarrays on a new line.

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int negativeSubArrayCount = 0;
        int sum;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += array[j];
                if (sum < 0) {
                    negativeSubArrayCount++;
                }
            }
        }
        System.out.println(negativeSubArrayCount);
    }
}