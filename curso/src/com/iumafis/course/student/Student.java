package com.iumafis.course.student;

import com.iumafis.course.data.Data;

public class Student extends Data {
    
    private int enrollment;

    public Student() {
    }

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, int enrollment) {
        super(id, name, age);
        this.enrollment = enrollment;
    }

    public int getEnrollment() { return enrollment; }

    public void setEnrollment(int enrollment) { this.enrollment = enrollment; }
}
