package hackerrank.introduction.java_loops;

import java.util.Scanner;

public class Solution {

    /*
    * Sample Input
    2
    0 2 10
    5 3 5

    Sample Output
    2 6 14 30 62 126 254 510 1022 2046
    8 14 26 50 98

    * */

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int[] temp = new int[n];
            temp[0] = a + b;
            for (int j = 1; j < n; j++) {
                temp[j] = temp[j - 1] + (int) Math.pow(2, j) * b;
            }
            for (int j = 0; j < n; j++) {
                System.out.print(temp[j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
