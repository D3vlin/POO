package com.iumafis.course.main;

import com.iumafis.course.student.Student;

public class Main {

    public static void main(String[] args) {
        
        Student student = new Student(1020, "Nora", 24);
        
        student.setEnrollment(1);
        System.out.println(String.format("El alumno %s, identificado con %s y edad %s años.\nCon matriculado en %s", 
                                        student.getName(), student.getId(), student.getAge(), student.getEnrollment()));
    }
}