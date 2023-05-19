package edu.shnaiderman;

import edu.shnaiderman.controller.JsonManager;
import edu.shnaiderman.controller.UniversityCreator;
import edu.shnaiderman.model.Structure;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world! Beginning work");
        StructureCreator universityCreator = new UniversityCreator();
        Structure university = universityCreator.createRandomly();
        JsonManager jsonManager = new JsonManager<>(Structure.class);
        jsonManager.writeToFile(university, "test.json");
    }
}

