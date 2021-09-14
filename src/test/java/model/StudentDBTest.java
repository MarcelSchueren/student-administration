package model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void testStudentDBList_shouldBeEqual(){
        //GIVEN
        Student student1 = new Student("Aaron", 111);
        Student student2 = new Student("Berta", 222);
        Student student3 = new Student("Cäsar", 333);

        Student[] students = new Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        StudentDB studentDB = new StudentDB(students);
        Student [] expected = {student1, student2, student3};

        //WHEN
        Student[] actual = studentDB.list();

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    void testStudentDBList_shouldNotBeEqual(){
        //GIVEN
        Student student1 = new Student("Aaron", 123);
        Student student2 = new Student("Berta", 234);
        Student student3 = new Student("Cäsar", 333);

        Student[] students = new Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        StudentDB studentDB = new StudentDB(students);
            //Hier students im expected-array in andere Reihenfolge gebracht
        Student [] expected = {student3, student2, student1};

        //WHEN
        Student[] actual = studentDB.list();

        //THEN
        assertFalse(Arrays.equals(actual, expected));
    }

    @Test
    void testStudentDBToString(){
        //GIVEN
        Student student1 = new Student("Aaron", 111);
        Student student2 = new Student("Berta", 222);
        Student student3 = new Student("Cäsar", 333);

        Student[] students = new Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        StudentDB studentDB = new StudentDB(students);

        String expected = "\nStudentsDB:\nStudent name: Aaron, age: 25, isLongTimeStudent: false, id: 111;\nStudent name: Berta, age: 25, isLongTimeStudent: false, id: 222;\nStudent name: Cäsar, age: 25, isLongTimeStudent: false, id: 333;\n";

        //WHEN
        String actual = studentDB.toString();

        //THEN
        assertEquals(actual, expected);
    }

    @Test
    void testStudentDBAddStudent(){
        //GIVEN
        Student student1 = new Student("Aaron", 111);
        Student student2 = new Student("Berta", 222);
        Student student3 = new Student("Cäsar", 333);

        Student[] students = new Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        StudentDB studentDB = new StudentDB(students);

        Student student4 = new Student("Diana", 444);
        Student [] expected = {student1, student2, student3, student4};

        //WHEN
        studentDB.addStudent(student4);
        Student[] actual = studentDB.list();

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    void testStudentDBRemoveStudent(){
        //GIVEN
        Student student1 = new Student("Aaron", 111);
        Student student2 = new Student("Berta", 222);
        Student student3 = new Student("Cäsar", 333);

        Student[] students = new Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        StudentDB studentDB = new StudentDB(students);

        Student [] expected = {student2, student3};

        //WHEN
        studentDB.removeStudentById(111);
        Student[] actual = studentDB.list();

        //THEN
        assertArrayEquals(expected, actual);
    }
}