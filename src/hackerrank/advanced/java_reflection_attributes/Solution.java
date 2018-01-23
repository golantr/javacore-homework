package hackerrank.advanced.java_reflection_attributes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    /*
        You have to print all the methods of the student class in alphabetical order like this:
        anothermethod
        getName
        setEmail
        setId
        ......
    */

    public static void main(String[] args) {
        /*~~~Complete this line~~~*/
        Class student = Student.class;
        /*~~~Complete this line~~~*/
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        /*~~~Complete this line~~~*/
        for (Method method : methods) {
            /*~~~Complete this line~~~*/
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }

    class Student {
        private String name;
        private String id;
        private String email;

        public String getName() {
            return name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void anothermethod() {
        }
    }

}
