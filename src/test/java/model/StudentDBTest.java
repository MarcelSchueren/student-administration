package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
//
//    @Test
//    void testStudentDBList_shouldBeEqual() {
//        //GIVEN
//        Student student1 = new Student("Aaron", 111);
//        Student student2 = new Student("Berta", 222);
//        Student student3 = new Student("Cäsar", 333);
//
//        ArrayList<Student> students = new ArrayList<>();
//
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        StudentDB studentDB = new StudentDB(students);
//        ArrayList<Student> expected = new ArrayList<>(List.of(student1, student2, student3));
//
//        //WHEN
//        ArrayList<Student> actual = studentDB.list();
//
//        //THEN
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void testStudentDBList_shouldNotBeEqual() {
//        //GIVEN
//        Student student1 = new Student("Aaron", 123);
//        Student student2 = new Student("Berta", 234);
//        Student student3 = new Student("Cäsar", 333);
//
//        ArrayList<Student> students = new ArrayList<>();
//
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        StudentDB studentDB = new StudentDB(students);
//        ArrayList<Student> expected = new ArrayList<>(List.of(student2, student1, student3));
//
//        //WHEN
//        ArrayList<Student> actual = studentDB.list();
//
//        //THEN
//        assertNotEquals(expected, actual);
//    }
//
//    @Test
//    void testStudentDBToString() {
//        //GIVEN
//        Student student1 = new Student("Aaron", 111);
//        Student student2 = new Student("Berta", 222);
//        Student student3 = new Student("Cäsar", 333);
//
//        ArrayList<Student> students = new ArrayList<>();
//
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        StudentDB studentDB = new StudentDB(students);
//
//        String expected = "\nStudentsDB:\nStudent name: Aaron, age: 25, isLongTimeStudent: false, id: 111;\nStudent name: Berta, age: 25, isLongTimeStudent: false, id: 222;\nStudent name: Cäsar, age: 25, isLongTimeStudent: false, id: 333;\n";
//
//        //WHEN
//        String actual = studentDB.toString();
//
//        //THEN
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    void testStudentDBAddStudent() {
//        //GIVEN
//        Student student1 = new Student("Aaron", 111);
//        Student student2 = new Student("Berta", 222);
//        Student student3 = new Student("Cäsar", 333);
//
//        ArrayList<Student> students = new ArrayList<>();
//
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        StudentDB studentDB = new StudentDB(students);
//
//        Student student4 = new Student("Diana", 444);
//        ArrayList<Student> expected = new ArrayList<>(List.of(student1, student2, student3, student4));
//
//        //WHEN
//        studentDB.add(student4);
//        ArrayList<Student> actual = studentDB.list();
//
//        //THEN
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void testStudentDBRemoveStudent() {
//        //GIVEN
//        Student student1 = new Student("Aaron", 111);
//        Student student2 = new Student("Berta", 222);
//        Student student3 = new Student("Cäsar", 333);
//
//        ArrayList<Student> students = new ArrayList<>();
//
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        StudentDB studentDB = new StudentDB(students);
//
//        ArrayList<Student> expected = new ArrayList<>(List.of(student2, student3));
//
//        //WHEN
//        studentDB.remove(student1);
//        ArrayList<Student> actual = studentDB.list();
//
//        //THEN
//        assertEquals(expected, actual);
//    }
}