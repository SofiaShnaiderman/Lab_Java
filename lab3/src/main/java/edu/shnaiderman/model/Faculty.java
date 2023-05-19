package edu.shnaiderman.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty extends Structure{
    private String name;
    private Human headmaster;
    private List<Department> departments;

    public Faculty(String name, Human headmaster) {
        this.name = name;
        this.headmaster = headmaster;
        this.departments = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeadmaster(Human headmaster) {
        this.headmaster = headmaster;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }


    public Human getHeadmaster() {
        return this.headmaster;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public List<Department> getDepartments() {
        return this.departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty faculty)) return false;
        return Objects.equals(getName(), faculty.getName()) && Objects.equals(getHeadmaster(), faculty.getHeadmaster()) && Objects.equals(getDepartments(), faculty.getDepartments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHeadmaster(), getDepartments());
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", headmaster=" + headmaster +
                ", departments=" + departments +
                '}';
    }
}