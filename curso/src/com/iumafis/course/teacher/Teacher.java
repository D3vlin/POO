package com.iumafis.course.teacher;

import com.iumafis.course.data.Data;

public class Teacher extends Data {
    
    private int salary;

    public Teacher() {
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int salary, int id, String name, int age) {
        super(id, name, age);
        this.salary = salary;
    }    

    public int getSalary() { return salary; }

    public void setSalary(int salary) { this.salary = salary; }
}
