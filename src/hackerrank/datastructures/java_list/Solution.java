package hackerrank.datastructures.java_list;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
        Given a list, L, of N integers, perform Q queries on the list. Once all queries are
        completed, print the modified list as a single line of space-separated integers.
     */

    public static void main(String[] args) {
        // Enter your code here.

        Scanner sc = new Scanner(System.in);

        int elementsCount = sc.nextInt();           //N
        List<Integer> list = new ArrayList<>();     //L
        for (int i = 0; i < elementsCount; i++) {
            list.add(sc.nextInt());
        }
        int queriesCount = sc.nextInt();            //Q

        for (int i = 0; i < queriesCount; i++) {
            String query = sc.next();
            int index, intValue;
            switch (query) {
                case "Insert":
                    index = sc.nextInt();
                    intValue = sc.nextInt();
                    list.add(index, intValue);
                    break;
                case "Delete":
                    index = sc.nextInt();
                    list.remove(index);
                    break;
            }
        }
        sc.close();

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
