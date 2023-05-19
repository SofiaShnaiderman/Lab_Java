package edu.shnaiderman.controller;

import edu.shnaiderman.model.Group;

public class GroupCreator {
    public GroupCreator() {
    }

    public Group createGroup(String name) {
        return new Group(name);
    }
}