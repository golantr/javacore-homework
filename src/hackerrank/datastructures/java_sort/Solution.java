package hackerrank.datastructures.java_sort;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        /*
            Your task is to rearrange them according to their CGPA in decreasing order.
            If two student have the same CGPA, then arrange them according to their first
            name in alphabetical order. If those two students also have the same first name,
            then order them according to their ID. No two students have the same ID.
         */
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                int res = Double.compare(student2.getCgpa(), student1.getCgpa());
                res = (res != 0) ? res : student1.getFname().compareTo(student2.getFname());
                res = (res != 0) ? res : student1.getId() - student2.getId();
                return res;
            }
        });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
