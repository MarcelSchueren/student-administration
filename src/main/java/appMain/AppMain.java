package appMain;

import model.Student;

public class AppMain {
    public static void main(String[] args) {
        Student student1 = new Student("Hans Wurst", 50, true);
        Student student2 = new Student("Lieschen Fleißig", 21, false);

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        System.out.println("Number of Students: " + Student.getNumberOfStudents());
    }
}
