package hackerrank.datastructures.java_dequeue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.BiFunction;

public class Solution {

    public static void main(String[] args) {

        /*
        In this problem, you are given N integers. You need to find the maximum number
        of unique integers among all the possible contiguous subarrays of size M.

        The first line of input contains two integers N and M: representing the
        total number of integers and the size of the subarray, respectively.
        The next line contains N space separated integers.

        Note: Time limit is 3 second for this problem.
         */

        try {
            System.setIn(new FileInputStream("input/deque_input10.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = in.nextInt();       // N
        int m = in.nextInt();       // M

        int maxUniqueCount = 0, curUniqueCount = 0;

        for (int i = 0; i < n; i++) {
            // adding to deque
            Integer intToAdd = in.nextInt();
            Integer mapValue = map.merge(intToAdd, +1, (int1, int2) -> int1 + int2);
            curUniqueCount += (mapValue == 1) ? +1 : 0;
            deque.addLast(intToAdd);

            // removing from deque
            if (i >= m) {
                Integer intToRemove = deque.removeFirst();
                mapValue = map.merge(intToRemove, -1, (int1, int2) -> int1 + int2);
                curUniqueCount += (mapValue == 0) ? -1 : 0;
                maxUniqueCount = Math.max(maxUniqueCount, curUniqueCount);
            }
        }
        maxUniqueCount = Math.max(maxUniqueCount, curUniqueCount);

        System.out.println(maxUniqueCount);
    }
}
