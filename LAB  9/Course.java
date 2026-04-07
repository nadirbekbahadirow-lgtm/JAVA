public class Course {
    String courseName;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Inner class
    class Student {
        String studentName;

        public Student(String studentName) {
            this.studentName = studentName;
        }

        public void showInfo() {
            System.out.println("Course: " + courseName);
            System.out.println("Student: " + studentName);
        }
    }

    // Main method
    public static void main(String[] args) {
        Course course = new Course("Java Programming");

        Course.Student student = course.new Student("Nadirbek");

        student.showInfo();
    }
}