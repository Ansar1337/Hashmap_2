package com.company;

public class DriverLicense {
    private final int id;
    private final String name;

    public DriverLicense(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}