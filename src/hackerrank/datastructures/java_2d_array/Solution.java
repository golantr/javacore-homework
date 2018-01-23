package hackerrank.datastructures.java_2d_array;

import java.util.Scanner;

public class Solution {

    // In this problem you have to print the largest sum among all the hourglasses in the array.
    // You are given a 6x6 2D array. An hourglass in an array is a portion shaped like this:
    // a b c
    //   d
    // e f g

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int maxHourglass = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int hourglass = 0;
                hourglass += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                hourglass += arr[i + 1][j + 1];
                hourglass += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                maxHourglass = Math.max(hourglass, maxHourglass);
            }
        }

        System.out.println(maxHourglass);
    }
}