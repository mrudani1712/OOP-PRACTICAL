

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<String> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enroll(String course) {
        enrolledCourses.add(course);
    }

    public String getName() {
        return name;
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Courses Enrolled:");
        for (String course : enrolledCourses) {
            System.out.println("- " + course);
        }
        System.out.println();
    }
}
