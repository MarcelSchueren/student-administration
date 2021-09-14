package model;

import java.util.Arrays;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] list() {
        return this.students;
    }

    public Student randomStudent() {
        int random = (int) (Math.random() * students.length);
        return students[random];
    }

    public void removeStudentById(int id) {
        Student[] newStudents = new Student[students.length-1];
        int newStudentsIndex = 0;
        for (int i = 0; i < students.length; i++){
            if (!(students[i].getId() == id)){
                newStudents[newStudentsIndex] = students[i];
                newStudentsIndex++;
            }
        }
        students = newStudents;
    }

    public void addStudent(Student student) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[students.length] = student;
        students = newStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Arrays.equals(students, studentDB.students);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(students);
    }

    @Override
    public String toString() {
        String result = "\nStudentsDB:\n";
        for (Student student : students) {
            result += student.toString() + "\n";
        }
        return result;
    }
}
