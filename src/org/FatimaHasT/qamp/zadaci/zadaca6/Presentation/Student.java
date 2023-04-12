package org.FatimaHasT.qamp.zadaci.zadaca6.Presentation;

public class Student {
    private final String name;
    private final int age;

    public Student(final String name) {
        this.name = name;
        this.age = 15;
    }

    public Student(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public final String getName() {
        return name;
    }

    public final int getAge() {
        return age;
    }

    public String toString() {
        return name + ", " + age;
    }

}
