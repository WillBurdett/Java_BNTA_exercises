package com.exercise_will.week02.day2.classes_files_exercises.Exercise2;

import java.time.LocalDate;
import java.util.Objects;

public class Person2 {
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dob;

    public Person2(String firstName, String lastName, char gender, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return gender == person2.gender && Objects.equals(firstName, person2.firstName) && Objects.equals(lastName, person2.lastName) && Objects.equals(dob, person2.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, dob);
    }
}
