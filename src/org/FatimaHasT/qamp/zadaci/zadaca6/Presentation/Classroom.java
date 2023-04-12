package org.FatimaHasT.qamp.zadaci.zadaca6.Presentation;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> students;

    public Classroom() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean isPresent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void printClassroom() {
        System.out.println("Classroom:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
