package hackerrank.strings.valid_username_checker;

import java.util.Scanner;

class UsernameValidator {
    /*
        Update the value of regularExpression field in the UsernameValidator class so
        that the regular expression only matches with valid usernames.
        Write regular expression here.
     */
    public static final String regularExpression = "\\p{Alpha}\\w{7,29}";
}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}