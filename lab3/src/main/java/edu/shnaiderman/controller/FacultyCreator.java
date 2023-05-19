package edu.shnaiderman.controller;

import edu.shnaiderman.model.Faculty;
import edu.shnaiderman.model.Human;

public class FacultyCreator {
    public FacultyCreator() {
    }

    public Faculty createFaculty(String name, Human headmaster) {
        return new Faculty(name, headmaster);
    }
}