package hackerrank.advanced.java_singleton;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

/*
    Complete the Singleton class in your editor which contains the following components:
    A private Singleton non parameterized constructor.
    A public String instance variable named str.
    Write a static method named getSingleInstance that returns the single instance of the Singleton class.
*/

class Singleton {
    public String str;
    static Singleton singleInstance;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    @Override
    public String toString() {
        return "Hello I am a singleton! Let me say " + str + " to you";
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Singleton.getSingleInstance().str = sc.nextLine();
        System.out.println(Singleton.getSingleInstance());
    }
}
