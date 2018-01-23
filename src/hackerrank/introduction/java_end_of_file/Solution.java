package hackerrank.introduction.java_end_of_file;

import java.util.*;

public class Solution {

    /*
    The challenge here is to read lines of input until you reach EOF,
    then number and print all lines of content.

    Sample Input

    Hello world
    I am a file
    Read me until end-of-file.

    Sample Output

    1 Hello world
    2 I am a file
    3 Read me until end-of-file.
    */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNext()) {
            System.out.println(++i + " " + sc.nextLine());
        }
        sc.close();
    }
}
