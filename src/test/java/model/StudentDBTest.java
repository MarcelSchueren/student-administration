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

        String expected = "StudentsDB: Student name: Aaron, age: 25, isLongTimeStudent: false, id: 111;Student name: Berta, age: 25, isLongTimeStudent: false, id: 222;Student name: Cäsar, age: 25, isLongTimeStudent: false, id: 333;";

        //WHEN
        String actual = studentDB.toString();

        //THEN
        assertEquals(actual, expected);
    }
}