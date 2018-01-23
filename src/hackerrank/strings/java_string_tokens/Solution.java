package hackerrank.strings.java_string_tokens;

import java.io.*;
import java.util.*;

public class Solution {

    /*
        On the first line, print an integer, n, denoting the number of tokens in string s
        (they do not need to be unique). Next, print each of the n tokens on a new line
        in the same order as they appear in input string s.
     */

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input/tokens_input06.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Write your code here.
        String[] tokens;
        if (s.trim().length() == 0) {
            tokens = new String[0];
        } else {
            tokens = s.trim().split("[ !,?._'@]+");
        }
        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }

        scan.close();
    }
}
