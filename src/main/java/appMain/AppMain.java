package appMain;

import model.Student;
import model.StudentDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public class AppMain {
    public static void main(String[] args) {

        Student student1 = new Student("Anna", "MNR0001");
        Student student2 = new Student("Bert", "MNR0002");
        Student student3 = new Student("Caro", "MNR0003");

        Student student666 = new Student("Caro", "MNR0003");

        StudentDB studentDB = new StudentDB();

        studentDB.add(student1);
        studentDB.add(student2);
        studentDB.add(student3);

        try {
            studentDB.add(student666);
        } catch (RuntimeException e) {
            System.err.println("Junge! Pass mal besser auf! ");
            e.printStackTrace();
        }

        System.out.println(studentDB);

        studentDB.removeByNr("MNR0001");

        System.out.println("-------------");

        System.out.println(studentDB);

        System.out.println("-------------");
        studentDB.add(new Student("Dora", "MNR0004"));

        System.out.println(studentDB);
        System.out.println("-------------");
        System.out.println("Random students: ");

        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.randomStudent());

        Optional<Student> studentOptional = studentDB.findByID("MNR0002");
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            System.out.println("Student gefunden: " + student);
        } else {
            System.out.println("Kein Student gefunden!");
        }


//        Student student1 = new Student("Hans Wurst", 50, true, 555);
//        Student student2 = new Student("Lieschen Fleißig", 21, false, 666);
//        Student student3 = new Student("Hans Wurst", 50, true, 555);
//
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//
//        System.out.println("student1 is equal to student2: " + student1.equals(student2));
//        System.out.println("student1 is equal to student3: " + student1.equals(student3));
//
//        System.out.println("Number of Students: " + Student.getNumberOfStudents());
//
//        Student student4 = new Student("Aaron", 111);
//        Student student5 = new Student("Berta", 222);
//        Student student6 = new Student("Cäsar", 333);
//
//        ArrayList<Student> students = new ArrayList<>();
//
//        students.add(student4);
//        students.add(student5);
//        students.add(student6);
//
//        System.out.println("Number of Students: " + Student.getNumberOfStudents());
//
//        StudentDB studentDB = new StudentDB(students);
//        System.out.println(studentDB.list());
//        System.out.println(studentDB);
//
//        System.out.println("Random Student:");
//        System.out.println(studentDB.randomStudent());
//
//        studentDB.remove(student4);
//        System.out.println(studentDB);
//
//        studentDB.add(new Student("Niklas Neu", 666));
//        System.out.println(studentDB);
    }
}
