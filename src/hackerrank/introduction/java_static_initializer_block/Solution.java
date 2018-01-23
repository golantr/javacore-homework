package hackerrank.introduction.java_static_initializer_block;

import java.util.*;

public class Solution {

    /*
    * You are given a class Solution with a main method. Complete the given code
    * so that it outputs the area of a parallelogram with breadth and height.
    * You should read the variables from the standard input.
    * */

    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = false;

    static {
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
