package hackerrank.bignumber.java_primality_test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // Given a large integer, n, use the Java BigInteger class' isProbablePrime method
    // to determine and print whether it's prime or not prime.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();

        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}