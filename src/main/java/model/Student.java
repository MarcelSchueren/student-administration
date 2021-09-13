package model;

public class Student {
    private String name = "Max Mustermann";
    private int age = 25;
    private boolean isLongTimeStudent = false;

    public Student() {
    }

    public Student(String name, int age, boolean isLongTimeStudent) {
        this.name = name;
        this.age = age;
        this.isLongTimeStudent = isLongTimeStudent;
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

    public String toString() {
        return "Student name=" + name + ", age=" + age + ", isLongTimeStudent=" + isLongTimeStudent;
    }
}
