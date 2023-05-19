package edu.shnaiderman.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.shnaiderman.model.University;

import java.io.*;

public class JsonManager {
    private Gson gson;

    public JsonManager() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void saveUniversityToJson(University university, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(university, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public University loadUniversityFromJson(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
