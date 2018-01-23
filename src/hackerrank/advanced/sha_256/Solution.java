package hackerrank.advanced.sha_256;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

    //Print the SHA-256 encryption value of s on a new line.

    public static void main(String[] args) {
        //Enter your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String res = "";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(str.getBytes(StandardCharsets.UTF_8));
            for (int i = 0; i < digest.length; i++) {
                res += String.format("%02x", digest[i]);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        System.out.println(res);
    }
}
