package com.msb;

public class Student extends Person {
    private Integer age;
    private String name;

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    Student s1 = new Student(16,"辉夜");
}
