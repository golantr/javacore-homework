package hackerrank.datastructures.java_arraylist;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // You are given n lines. In each line there are zero or more integers.
    // Each query will consist of two integers x and y.
    // In each line, output the number located in y position of x line.
    // If there is no such position, just print "ERROR!"

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        List<List<Integer>> listOfLines = new ArrayList<>();
        int listOfLinesLength = sc.nextInt();           //n

        for (int i = 0; i < listOfLinesLength; i++) {
            List<Integer> lineOfNumbers = new ArrayList<>();
            int integersPerLine = sc.nextInt();
            for (int j = 0; j < integersPerLine; j++) {
                lineOfNumbers.add(sc.nextInt());
            }
            listOfLines.add(lineOfNumbers);
        }

        int countOfQueries = sc.nextInt();
        for (int i = 0; i < countOfQueries; i++) {
            try {
                int queryLineNumber = sc.nextInt() - 1;  //x
                int queryPosition = sc.nextInt() - 1;    //y
                List<Integer> queryLine = listOfLines.get(queryLineNumber);
                int queryRes = queryLine.get(queryPosition);
                System.out.println(queryRes);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}