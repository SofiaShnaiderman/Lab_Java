package edu.shnaiderman.model;

import java.util.Objects;

public class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex gender;

    public Human(String firstName, String lastName, String patronymic, Sex gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.gender = gender;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public Sex getGender() {
        return this.gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return Objects.equals(getFirstName(), human.getFirstName()) && Objects.equals(getLastName(), human.getLastName()) && Objects.equals(getPatronymic(), human.getPatronymic()) && getGender() == human.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPatronymic(), getGender());
    }

    public String toString() {
        return "Human{firstName='" + this.firstName + "', lastName='" + this.lastName + "', parentage='" + this.patronymic + "', gender=" + this.gender + "}";
    }
}

