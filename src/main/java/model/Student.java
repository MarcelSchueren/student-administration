package model;

import java.util.Objects;

public class Student {
    private String name;
    private String matrikelNr;

    public Student(String name, String id) {
        this.name = name;
        this.matrikelNr = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(String matrikelNr) {
        this.matrikelNr = matrikelNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrikelNr == student.matrikelNr && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, matrikelNr);
    }

    @Override
    public String toString() {
        return "Matrikelnummer: " + this.getMatrikelNr() +
                " Name: " + this.name;
    }
}