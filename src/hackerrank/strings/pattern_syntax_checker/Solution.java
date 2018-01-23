package hackerrank.strings.pattern_syntax_checker;

import java.util.Scanner;
import java.util.regex.*;

public class Solution {

    // For each test case, print Valid if the syntax of the given pattern is correct.
    // Otherwise, print Invalid. Do not print the quotes.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();

            //Write your code
            testCases--;
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}
