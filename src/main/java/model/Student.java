package model;

import java.util.Objects;

public class Student {
    private String name = "Max Mustermann";
    private int age = 25;
    private boolean isLongTimeStudent = false;
    private int id;

    private static int numberOfStudents = 0;

    public Student() {
        numberOfStudents++;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        numberOfStudents++;
    }

    public Student(String name, int age, boolean isLongTimeStudent, int id) {
        this.name = name;
        this.age = age;
        this.isLongTimeStudent = isLongTimeStudent;
        this.id = id;
        numberOfStudents++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLongTimeStudent() {
        return isLongTimeStudent;
    }

    public void setLongTimeStudent(boolean longTimeStudent) {
        isLongTimeStudent = longTimeStudent;
    }

    @Override
    public String toString() {
        return "Student name: " + name + ", age: " + age + ", isLongTimeStudent: " + isLongTimeStudent + ", id: " + id + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && isLongTimeStudent == student.isLongTimeStudent && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isLongTimeStudent);
    }
}
