package hackerrank.introduction.java_if_else;

import java.util.Scanner;

public class Solution {

    /*
        In this challenge, we test your knowledge of using if-else conditional statements
        to automate decision-making processes

        If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5, print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20, print Not Weird
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
            //Complete the code
        } else if (n >= 2 && n <= 5) {
            ans = "Not Weird";
        } else if (n >= 6 && n <= 20) {
            ans = "Weird";
        } else if (n > 20) {
            ans = "Not Weird";
        }
        System.out.println(ans);

    }
}
