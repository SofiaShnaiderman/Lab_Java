package edu.shnaiderman.model;

import java.util.ArrayList;
import java.util.List;

public class Department extends Structure{
    private String name;
    private List<Group> groups;

    public Department(String name) {
        this.name = name;
        this.groups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public List<Group> getGroups() {
        return groups;
    }
}