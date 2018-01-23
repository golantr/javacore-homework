package hackerrank.oop.java_interface;

import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

/*
    You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n).
    You need to write a class called MyCalculator which implements the interface.
    For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12.
 */

//Write your code here
class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        int res = 0;
        for (int i = 1; i <= n / 2; i++) {
            res += (n % i == 0) ? i : 0;
        }
        return res + n;
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

