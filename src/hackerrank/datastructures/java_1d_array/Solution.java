package hackerrank.datastructures.java_1d_array;

import java.util.*;

public class Solution {

    // You can move from index i to index i+1, i-1, or i+leap as long as the destination
    // index is a cell containing a 0. If the destination index is greater than n-1,
    // you win the game.
    // Given leap and game, complete the function in the editor below so that it returns true
    // if you can win the game (or false if you cannot).

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.

        if (game[0] != 0) {
            return false;
        }
        if (game.length == 1 || leap >= game.length) {
            return true;
        }
        // try moving i+1
        boolean result = canWin(leap, Arrays.copyOfRange(game, 1, game.length));
        int jump = leap;
        // try moving i+leap and then back while possible
        while (jump > 1 && game[jump] == 0) {
            result |= canWin(leap, Arrays.copyOfRange(game, jump, game.length));
            jump--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}