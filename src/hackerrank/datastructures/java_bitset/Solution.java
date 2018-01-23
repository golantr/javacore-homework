package hackerrank.datastructures.java_bitset;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /*
        The first line contains 2 space-separated integers, N (the length of both BitSets B1 and B2)
        and M (the number of operations to perform), respectively.
        The M subsequent lines each contain an operation where operands are read from left to right
        and the BitSet resulting from the operation replaces the contents of the first operand

        After each operation, print the number of set bits in the respective
        BitSets as two space-separated integers on a new line.

        Sample Input
        5 4
        AND 1 2
        SET 1 4
        FLIP 2 2
        OR 2 1

        Sample Output
        0 0
        1 0
        1 1
        1 2

        */

        Scanner sc = new Scanner(System.in);
        int bitSetLength = sc.nextInt();            //N
        BitSet[] bitSetArray = new BitSet[3];
        bitSetArray[1] = new BitSet(bitSetLength);  //B1
        bitSetArray[2] = new BitSet(bitSetLength);  //B2

        int operationCount = sc.nextInt();          //M
        for (int i = 0; i < operationCount; i++) {
            String operation = sc.next();                       // scan operation
            int bsIndex1 = sc.nextInt();                        // scan operand1
            int bsIndex2 = sc.nextInt(), position = bsIndex2;   // scan operand2

            BitSet targetBitSet = bitSetArray[bsIndex1];
            BitSet bitSet2 = (bsIndex2 < bitSetArray.length) ? bitSetArray[bsIndex2] : targetBitSet;
            switch (operation) {
                case "AND":
                    targetBitSet.and(bitSet2);
                    break;
                case "OR":
                    targetBitSet.or(bitSet2);
                    break;
                case "XOR":
                    targetBitSet.xor(bitSet2);
                    break;
                case "FLIP":
                    targetBitSet.flip(position);
                    break;
                case "SET":
                    targetBitSet.set(position);
                    break;
            }
            System.out.println(bitSetArray[1].cardinality() + " " + bitSetArray[2].cardinality());
        }
    }
}