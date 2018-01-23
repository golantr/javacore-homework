package hackerrank.introduction.java_output_formatting;

import java.util.Scanner;

public class Solution {

    /*
     * The purpose of this exercise is to test your understanding of formatting output using printf.
     * Each String is left-justified with trailing whitespace through the first 15 characters.
     * The leading digit of the integer is the 16 character, and each integer that was less
     * than 3 digits now has leading zeroes.
     *
        Sample Input
        java 100
        cpp 65
        python 50

        Sample Output
        ================================
        java           100
        cpp            065
        python         050
        ================================
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");

    }
}
