
import java.util.*;

class Student {
    private String rollNo;
    private String name;
    private static int rollCount = 1;   // For generating roll numbers
    private static int index = 0;       // For array indexing
    private static Student[] s = new Student[100];

    // Generate roll number
    private String generateRollNo() {
        String rn = "UCF " + rollCount;
        rollCount++;
        return rn;
    }

    // Private constructor
    private Student(String name) {
        this.rollNo = generateRollNo();
        this.name = name;
    }

    // Enroll a new student
    public static Student enrollment(String name) {
        if (index < 100) {
            s[index] = new Student(name);
            index++;
            return s[index - 1];
        }
        return null;
    }

    // Display single student
    public void display() {
        System.out.println("Name: " + name + " Roll Number: " + rollNo);
    }

    // Display all enrolled students
    public static void displayStudents() {
        for (Student ss : s) {
            if (ss != null) {
                ss.display();
            }
        }
    }
}

public class School {
    public static void main(String[] args) {
        Student s1 = Student.enrollment("Alice");
        Student s2 = Student.enrollment("Bob");
        Student s3 = Student.enrollment("Charlie");

        // Display all students
        Student.displayStudents();
    }
}
