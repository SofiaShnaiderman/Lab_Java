package edu.shnaiderman.model;
public abstract class Structure {
    private String name;
    private Human headmaster;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(Human headmaster) {
        this.headmaster = headmaster;
    }
}