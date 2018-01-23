package hackerrank.datastructures.java_priority_queue;

import java.util.*;

/*
 * Create the Student and Priorities classes here.
 */
class Student {

//    The Student class should implement:
//
//    The constructor Student(int id, String name, double cgpa).
//    The method int getID() to return the id of the student.
//    The method String getName() to return the name of the student.
//    The method double getCGPA() to return the CGPA of the student.

    private final int id;
    private String name;
    private final double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    //    The Priorities class should implement the method List<Student> getStudents(List<String> events)
    //    to process all the given events and return all the students yet to be served in the priority order:
    //
    //    The student having the highest Cumulative Grade Point Average (CGPA) is served first.
    //    Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
    //    Any students having the same CGPA and name will be served in ascending order of the id.

    private PriorityQueue<Student> queue;

    {
        queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                int res = Double.compare(student2.getCGPA(), student1.getCGPA());
                res = (res != 0) ? res : student1.getName().compareTo(student2.getName());
                res = (res != 0) ? res : student1.getId() - student2.getId();
                return res;
            }
        });
    }

    /*
        Each of the n subsequent lines will be of the following two forms:
        ENTER name CGPA id: The student to be inserted into the priority queue.
        SERVED: The highest priority student in the queue was served.
    */
    public List<Student> getStudents(List<String> events) {
        for (String event : events) {
            String[] studentEventTokens = event.split("\\s");
            switch (studentEventTokens[0]) {
                case "ENTER":
                    Student newStudent = createStudent(studentEventTokens);
                    addStudentToQueue(newStudent);
                    break;
                case "SERVED":
                    serveStudent();
                    break;
            }
        }
        return getStudentsFromQueue();
    }

    private Student createStudent(String[] studentEventTokens) {
        int id = Integer.parseInt(studentEventTokens[3]);
        String name = studentEventTokens[1];
        double cgpa = Double.parseDouble(studentEventTokens[2]);
        return new Student(id, name, cgpa);
    }

    private void addStudentToQueue(Student student) {
        queue.offer(student);
    }

    private void serveStudent() {
        queue.poll();
    }

    private List<Student> getStudentsFromQueue() {
        List<Student> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }
        return list;
    }
}

public class Solution {


    private final static Scanner scan = new Scanner(System.in);

    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }

}
