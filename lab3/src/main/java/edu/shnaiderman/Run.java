package edu.shnaiderman;

import edu.shnaiderman.controller.*;
import edu.shnaiderman.model.University;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println("University successfully created!");
    }
}