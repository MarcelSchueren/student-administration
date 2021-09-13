package appMain;

import model.Student;
import model.StudentDB;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {
        Student student1 = new Student("Hans Wurst", 50, true, 555);
        Student student2 = new Student("Lieschen Fleißig", 21, false, 666);
        Student student3 = new Student("Hans Wurst", 50, true, 555);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("student1 is equal to student2: " + student1.equals(student2));
        System.out.println("student1 is equal to student3: " + student1.equals(student3));

        System.out.println("Number of Students: " + Student.getNumberOfStudents());

        Student student4 = new Student("Aaron", 111);
        Student student5 = new Student("Berta", 222);
        Student student6 = new Student("Cäsar", 333);

        Student[] students = new Student[3];

        students[0] = student4;
        students[1] = student5;
        students[2] = student6;

        System.out.println("Number of Students: " + Student.getNumberOfStudents());

        StudentDB studentDB = new StudentDB(students);
        System.out.println(Arrays.toString(studentDB.list()));
        System.out.println(studentDB.toString());
        System.out.println(studentDB.randomStudent());
        studentDB.removeStudentById(111);
        System.out.println(studentDB);
        studentDB.addStudent(new Student("Niklas Neu", 666));
        System.out.println(studentDB);
    }
}
