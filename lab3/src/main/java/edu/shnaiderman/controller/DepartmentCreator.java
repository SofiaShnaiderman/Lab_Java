package edu.shnaiderman.controller;

import edu.shnaiderman.model.Department;
import edu.shnaiderman.model.Human;
public class DepartmentCreator {
    public DepartmentCreator() {
    }
    public Department createDepartment(String name, Human head) {
        return new Department(name);
    }
}