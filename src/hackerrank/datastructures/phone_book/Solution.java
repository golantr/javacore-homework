package hackerrank.datastructures.phone_book;

//Complete this code or write your own from scratch

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

    /*
    You are given a phone book that consists of people's names and their phone number.
    After that you will be given some person's name as query. For each case, print "Not found" if
    the person has no entry in the phone book. Otherwise, print the person's name and phone number.
    */

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            if (!map.containsKey(s)) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + map.get(s));
            }
        }
    }
}