package hackerrank.bignumber.java_biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    /*
        In this problem, you have to add and multiply huge numbers! These numbers are so big
        that you can't contain them in any ordinary data types like a long integer.
        Use the power of Java's BigInteger class and solve this problem.
    */

    public static void main(String[] args) {
        //Enter your code here.
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}