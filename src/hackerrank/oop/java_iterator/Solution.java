package hackerrank.oop.java_iterator;

import java.util.*;

public class Solution {

    /*
        You have to modify the func method by editing at most 2 lines so that
        the code only prints the elements after the special string "###"
     */

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();     //~~~Complete this line~~~
            if (element instanceof String)  //~~~Complete this line~~~ //Hints: use instanceof operator
                break;
        }
        return it;

    }

    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        Iterator it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}
