package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getName() {
        //GIVEN
        Student student = new Student();
        //WHEN
        String actual = student.getName();
        //THEN
        assertEquals("Max Mustermann", actual);
    }

    @Test
    void setName() {
        //GIVEN
        Student student = new Student();
        //WHEN
        student.setName("Marie Mustermann");
        //THEN
        assertEquals("Marie Mustermann", student.getName());
    }

    @Test
    void getAge() {
        //GIVEN
        Student student = new Student();
        //WHEN
        int actual = student.getAge();
        //THEN
        assertEquals(25, actual);
    }

    @Test
    void setAge() {
        //GIVEN
        Student student = new Student();
        //WHEN
        student.setAge(99);
        //THEN
        assertEquals(99, student.getAge());
    }

    @Test
    void isLongTimeStudent() {
        //GIVEN
        Student student = new Student();
        //WHEN
        boolean actual = student.isLongTimeStudent();
        //THEN
        assertFalse(actual);
    }

    @Test
    void setLongTimeStudent() {
        //GIVEN
        Student student = new Student();
        //WHEN
        student.setLongTimeStudent(true);
        //THEN
        assertTrue(student.isLongTimeStudent());
    }

    @Test
    void testStudentToString() {
        //GIVEN
        Student student = new Student("Hans Wurst", 50, true);
        //WHEN
        String actual = student.toString();
        //THEN
        assertEquals("Student name: Hans Wurst, age: 50, isLongTimeStudent: true", actual);
    }

    @Test
    void testStudentEquals1() {
        //GIVEN
        Student student1 = new Student("Hans Wurst", 50, true);
        Student student2 = new Student("Hans Wurst", 50, true);

        //WHEN
        boolean actual = student1.equals(student2);
        //THEN
        assertTrue(actual);
    }

    @Test
    void testStudentEquals2() {
        //GIVEN
        Student student1 = new Student("Hans Wurst", 50, true);
        Student student2 = new Student("Hans Wurst", 50, false);

        //WHEN
        boolean actual = student1.equals(student2);
        //THEN
        assertFalse(actual);
    }
}