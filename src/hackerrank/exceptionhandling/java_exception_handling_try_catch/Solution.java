package hackerrank.exceptionhandling.java_exception_handling_try_catch;

import java.io.*;
import java.util.*;

public class Solution {

    /*
        You will be given two integers x and y as input, you have to compute x/y.
        If x and y are not bit signed integers or if is zero, exception will
        occur and you have to report it.
            Sample Input 1:
            10
            Hello
            Sample Output 1:
            java.util.InputMismatchException

            Sample Input 2:
            10
            0
            Sample Output 2:
            java.lang.ArithmeticException: / by zero

     */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}