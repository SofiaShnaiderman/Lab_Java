package edu.shnaiderman;

import edu.shnaiderman.controller.StudentController;
import edu.shnaiderman.viewer.StudentView;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        StudentView.view(StudentController.findStudentsInDatabase("18.12.2003", "22.02.2002"));
    }
}