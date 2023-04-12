package org.FatimaHasT.qamp.zadaci.zadaca6.Presentation;

public class MainClassroom {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.addStudent(new Student("Fatima"));
        classroom.addStudent(new Student("Lejla"));
        classroom.addStudent(new Student("Alma"));

        System.out.println(classroom.isPresent("Fatima"));
        System.out.println(classroom.isPresent("Emina"));

        classroom.printClassroom();
    }
}

