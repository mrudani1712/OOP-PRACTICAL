import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        // Add students
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        // Insert at specific index
        students.add(1, "David");

        // Display all students
        System.out.println("Student List: " + students);

        // Remove a student
        students.remove("Bob");
        System.out.println("After removing Bob: " + students);

        // Check if a student exists
        System.out.println("Contains Alice? " + students.contains("Alice"));
        System.out.println("Contains Bob? " + students.contains("Bob"));

        // Display total number of students
        System.out.println("Total Students: " + students.size());
    }
}
