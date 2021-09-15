package appMain;

import model.Student;
import model.StudentDB;

import java.util.ArrayList;

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

        ArrayList<Student> students = new ArrayList<>();

        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println("Number of Students: " + Student.getNumberOfStudents());

        StudentDB studentDB = new StudentDB(students);
        System.out.println(studentDB.list());
        System.out.println(studentDB);

        System.out.println("Random Student:");
        System.out.println(studentDB.randomStudent());

        studentDB.remove(student4);
        System.out.println(studentDB);

        studentDB.add(new Student("Niklas Neu", 666));
        System.out.println(studentDB);
    }
}
