package hackerrank.strings.tag_content_extractor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
        For each line, print the content enclosed within valid tags.
        If a line contains multiple instances of valid content, print out each instance
        of valid content on a new line; if no valid content is found, print None.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String regex = "<([^<>]+)>([^<>]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            //Write your code here
            Matcher matcher = pattern.matcher(line);
            if (!matcher.find()) {
                System.out.println("None");
            } else {
                do {
                    if (matcher.groupCount() > 1) {
                        System.out.println(matcher.group(2));
                    }
                } while (matcher.find());
            }

            testCases--;
        }
    }
}