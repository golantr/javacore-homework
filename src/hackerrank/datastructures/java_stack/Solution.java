package hackerrank.datastructures.java_stack;

import java.util.*;

class Solution {

    /*
        A string containing only parentheses is balanced if the following is true:
            1. if it is an empty string
            2. if A and B are correct, AB is correct
            3. if A is correct, (A) and {A} and [A] are also correct.

        Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
        Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
        Given a string, determine if it is balanced or not.
     */

    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();

            //Complete the code
            Stack<Character> stack = new Stack<>();
            boolean prevIsOk = true;
            for (int i = 0; i < input.length(); i++) {
                switch (input.charAt(i)) {
                    case '[':
                    case '{':
                    case '(':
                        stack.push(input.charAt(i));
                        break;
                    case ']':
                        prevIsOk = checkPrev(stack, '[');
                        break;
                    case '}':
                        prevIsOk = checkPrev(stack, '{');
                        break;
                    case ')':
                        prevIsOk = checkPrev(stack, '(');
                        break;
                }
                if (!prevIsOk) {
                    break;
                }
            }
            System.out.println(prevIsOk && stack.isEmpty());
        }
        sc.close();
    }

    private static boolean checkPrev(Stack<Character> stack, char ch) {
        return !stack.isEmpty() && (stack.pop() == ch);
    }
}
