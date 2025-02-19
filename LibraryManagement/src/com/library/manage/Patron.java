package com.library.manage;

public class Patron {
    private String name;
    private String patronId;

    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getPatronId() {
        return patronId;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "name='" + name + '\'' +
                ", patronId='" + patronId + '\'' +
                '}';
    }
}
