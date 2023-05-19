package edu.shnaiderman.controller;

import edu.shnaiderman.model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    public static List<Student> findStudentsInDb(String fromDate, String toDate) throws SQLException {
        List<Student> students = new ArrayList<>();

        PreparedStatement statement = DbManager.getDbConnection()
                .prepareStatement("SELECT * FROM \"student\" WHERE birthday BETWEEN to_date(?, 'dd.MM.yyyy') and to_date(?, 'dd.MM.yyyy');");

        // Add dates to statement
        statement.setString(1, fromDate);
        statement.setString(2, toDate);

        // Executing
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            students.add(new Student(resultSet.getInt("id"),resultSet.getString("surname"), resultSet.getString("name"), resultSet.getString("patronymic"), resultSet.getDate("recordBookId"), resultSet.getInt("birthday"))
            );
        }

        resultSet.close();
        statement.close();

        return students;
    }
}