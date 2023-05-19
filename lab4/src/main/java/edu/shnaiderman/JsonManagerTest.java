package edu.shnaiderman;

import edu.shnaiderman.controller.JsonManager;
import edu.shnaiderman.controller.UniversityCreator;
import edu.shnaiderman.model.University;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JsonManagerTest {
    @Test
    public void JsonConvertTest() {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();

        JsonManager.SaveToFile(university, "university.json");
        University newUniversity = JsonManager.ReadFromFile("university.json");
        assertEquals(university, newUniversity);
    }
}