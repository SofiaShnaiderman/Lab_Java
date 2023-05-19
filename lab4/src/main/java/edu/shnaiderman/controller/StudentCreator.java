package edu.shnaiderman.controller;

import edu.shnaiderman.model.Group;
import edu.shnaiderman.model.Sex;
import edu.shnaiderman.model.Student;

public class StudentCreator {
    public StudentCreator() {
    }

    public Student createStudent(String firstName, String lastName, String parentage, Sex gender) {
        return new Student(firstName, lastName, parentage, gender);
    }
}