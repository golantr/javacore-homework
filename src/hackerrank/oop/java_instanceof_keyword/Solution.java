package hackerrank.oop.java_instanceof_keyword;

import java.util.*;


class Student {
}

class Rockstar {
}

class Hacker {
}

/*
    Some lines of the code are missing, and you have to fix it by modifying
    only 3 lines! Don't add, delete or modify any extra line.
 */

public class Solution {

    static String count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);
            // ~~Complete this line~~
            if (element instanceof Student)
                a++;
            // ~~Complete this line~~
            if (element instanceof Rockstar)
                b++;
            // ~~Complete this line~~
            if (element instanceof Hacker)
                c++;
        }
        String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
        return ret;
    }

    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) mylist.add(new Student());
            if (s.equals("Rockstar")) mylist.add(new Rockstar());
            if (s.equals("Hacker")) mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}
