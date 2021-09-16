package model;

import java.util.*;

public class StudentDB {

    private Map<String, Student> students = new HashMap<>();


    public Optional<Student> findByID(String matrikelNr) {
        if (students.containsKey(matrikelNr)) {
            return Optional.ofNullable(students.get(matrikelNr));
        }
        else return Optional.empty();
    }

    public void add(Student student) {

        if (this.students.containsKey(student.getMatrikelNr())){
            throw new RuntimeException("Alert! Student already in DB! id: " + student.getMatrikelNr());
        }
        students.put(student.getMatrikelNr(), student);
    }

    public void removeByNr(String matrikelNr) {
        students.remove(matrikelNr);
    }

    public Map<String, Student> list() {
        return this.students;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        students.forEach((k, v) -> {
            stringBuilder.append("Matrikelnummer: ");
            stringBuilder.append(k);
            stringBuilder.append(" Name: ");
            stringBuilder.append(v.getName());
            stringBuilder.append("\n");
        });
        return stringBuilder.toString();
    }

    public void printIds(){
        StringBuilder sb = new StringBuilder();
        students.forEach((k, v) -> {
            sb.append("ID: ");
            sb.append(k);
            sb.append("; ");
        });
        System.out.println(sb);
    }


    public Student randomStudent() {
        List<Student> valuesList = new ArrayList<>(students.values());
        Collections.shuffle(valuesList);
        return valuesList.get(0);
    }


    /*
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("\nStudentsDB:\n");
        for (Student student : students) {
            result.append(student.toString());
            result.append("\n");
        }
        return result.toString();
    }
    */


}

//    private ArrayList<Student> students;
//
//    public void add(Student student){
//        students.add(student);
//    }
//
//    public void remove(Student student){
//        students.remove(student);
//    }
//
//    public StudentDB(ArrayList<Student> students) {
//        this.students = students;
//    }
//
//    public ArrayList<Student> list() {
//        return this.students;
//    }
//
//    public Student randomStudent() {
//        int random = (int) (Math.random() * students.size());
//        return students.get(random);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        StudentDB studentDB = (StudentDB) o;
//        return Objects.equals(students, studentDB.students);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(students);
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder result = new StringBuilder("\nStudentsDB:\n");
//        for (Student student : students) {
//            result.append(student.toString());
//            result.append("\n");
//        }
//        return result.toString();
//    }
//}
