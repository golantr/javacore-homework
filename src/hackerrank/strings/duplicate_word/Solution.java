package hackerrank.strings.duplicate_word;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    /*
        Write a RegEx that will match any repeated word.
        Complete the second compile argument so that the compiled RegEx is case-insensitive.
        Write the two necessary arguments for replaceAll such that each repeated word is
        replaced with the very first instance the word found in the sentence. It must be
        the exact first occurrence of the word, as the expected output is case-sensitive.
     */

    public static void main(String[] args) {

        String regex = "\\b(\\w+)\\b(\\s+\\b\\1\\b)+";  // ~~Complete this line~~
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);  // ~~Complete this line~~

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));  // ~~Complete this line~~
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
