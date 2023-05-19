package edu.shnaiderman.controller;

import edu.shnaiderman.model.Structure;
import edu.shnaiderman.model.University;
import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class JsonManagerTest {

    @Test
    public void writeAndRead() throws IOException {
        JsonManager jsonManager = new JsonManager<University>(University.class);
        University university = new UniversityCreator().createRandomly();

        jsonManager.writeToFile(university, "test.json");
        University readUniversity = (University) jsonManager.readFromFile("test.json");

        assertEquals(university, readUniversity);
    }
}