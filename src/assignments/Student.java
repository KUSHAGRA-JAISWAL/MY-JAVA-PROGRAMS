package src.assignments;

import java.time.LocalDate;
import java.time.Period;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Student {
    private String studentName;
    private String studentRegNo;
    private String dateOfBirth; 
    // Date of Birth must be in YYYY-MM-DD format
    private String[] courses;

    public Student(String studentName, String studentRegNo) {
        this.studentName = studentName;
        this.studentRegNo = studentRegNo;
        this.courses = new String[3];
    }

    public Student(String studentName, String studentRegNo, String dateOfBirth) {
        this(studentName, studentRegNo);
        this.dateOfBirth = dateOfBirth;
    }

    void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    void setRegNum(String studentRegNo) {
        this.studentRegNo = studentRegNo;
    }

    void setdateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    void setCourses(String[] courses) {
        for (int i = 0; i < courses.length; i++) {
            this.courses[i] = courses[i];
        }
    }

    String getstudentName() {
        return studentName;
    }

    String getstudentRegNo() {
        return studentRegNo;
    }

    String getdateOfBirth() {
        return dateOfBirth;
    }

    String[] getCourses() {
        return courses;
    }

    int getAge() {
        LocalDate dateOfBirth = LocalDate.parse(this.dateOfBirth);
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }
}

class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Student[] students = new Student[3];

        System.out.println("Enter details of three students.");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nStudent: " + (i + 1));

            System.out.print("Enter Regestration Number: ");
            String regNo = br.readLine();

            System.out.print("Enter Student Name: ");
            String studentName = br.readLine();

            System.out.print("Enter Date Of Birth in YYYY-MM-DD format: ");
            String dateOfBirth = br.readLine();

            System.out.print("Enter number of courses enrolled in: ");
            int numberOfCources = Integer.parseInt(br.readLine());
            String[] courses = new String[numberOfCources];
            for (int j = 0; j < numberOfCources; j++) {
                System.out.print("Enter course Name " + (j + 1) + " : ");
                courses[j] = br.readLine();
            }

            Student st = new Student(studentName, regNo, dateOfBirth);
            st.setCourses(courses);
            students[i] = st;
        }

        System.out.println("\nStudent Details:");
        System.out.printf("%-20s %-20s %-10s%n", "Registration Number", "studentName", "Age");
          // here "%-20s %-20s %-10s" is used for formatting / aligning the output to 20 digits and 10 digits
        for (Student student : students) {
            System.out.printf("%-20s %-20s %-10d%n", student.getstudentRegNo(), student.getstudentName(), student.getAge());
        }
    }
}
