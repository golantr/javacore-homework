package hackerrank.strings.java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

/*
    You need to write a regular expression and assign it to the pattern
    such that it can be used to validate an IP address.
    Just write the MyRegex class which contains a String pattern.
    The string should contain the correct regular expression.
 */

class MyRegex {
    public String pattern = "(([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])";
}