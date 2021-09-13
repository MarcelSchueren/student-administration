package appMain;

import model.Student;

public class AppMain {
    public static void main(String[] args) {
        Student student1 = new Student("Hans Wurst", 50, true);
        Student student2 = new Student("Lieschen Fleißig", 21, false);
        Student student3 = new Student("Hans Wurst", 50, true);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("student1 equal to student2: "+ student1.equals(student2));
        System.out.println("student1 equal to student2: "+ student1.equals(student3));

        System.out.println("Number of Students: " + Student.getNumberOfStudents());
    }
}
