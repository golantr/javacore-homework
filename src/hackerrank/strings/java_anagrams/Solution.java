package hackerrank.strings.java_anagrams;

import java.io.*;
import java.util.*;

public class Solution {

    /*
        Print "Anagrams" if a and b are case-insensitive anagrams of each other;
        otherwise, print "Not Anagrams" instead.
     */

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        String[] lettersA, lettersB;
        Arrays.sort(lettersA = a.toLowerCase().split(""));
        Arrays.sort(lettersB = b.toLowerCase().split(""));
        for (int i = 0; i < lettersA.length; i++) {
            if (!lettersA[i].equals(lettersB[i])) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}