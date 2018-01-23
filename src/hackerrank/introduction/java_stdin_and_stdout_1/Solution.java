package hackerrank.introduction.java_stdin_and_stdout_1;

import java.util.*;

public class Solution {

    /*
    * In this challenge, you must read 3 integers from stdin and then print them to stdout.
    * Each integer must be printed on a new line. To make the problem a little easier,
    * a portion of the code is provided for you in the editor below.
    * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
