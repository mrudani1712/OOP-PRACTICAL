

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");



        s1.enroll("Java Programming");
        s1.enroll("Data Structures");

        s2.enroll("Database Systems");
        s2.enroll("Computer Networks");

        s1.displayInfo();
        s2.displayInfo();
    }
}
