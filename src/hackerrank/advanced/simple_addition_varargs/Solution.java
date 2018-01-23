package hackerrank.advanced.simple_addition_varargs;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
    Your task is to create the class Add and the required methods so that the code prints
    the sum of the numbers passed to the function add.
    Note: Your add method in the Add class must print the sum as given in the Sample Output
    1+2=3
    1+2+3=6
    1+2+3+4+5=15
    1+2+3+4+5+6=21
*/

//Write your code here
class Add {

    public void add(int... numbers) {
        int res = 0;
        String outputStr = "";
        for (int number : numbers) {
            res += number;
            outputStr += "+" + number;
        }
        System.out.println(outputStr.substring(1) + "=" + res);
    }
}

public class Solution {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}