package edu.shnaiderman.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University extends Structure{
    private String name;
    private Human head;
    private List<Faculty> faculties;

    public University(String name, Human head) {
        this.name = name;
        this.head = head;
        faculties = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getHead(), that.getHead()) && Objects.equals(getFaculties(), that.getFaculties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFaculties());
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", faculties=" + faculties +
                '}';
    }
}