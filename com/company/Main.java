package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer, DriverLicense> allLicenses = new HashMap<>();

    public static void main(String[] args) {
        addLicenses();
        printAll();
        clearAll();
        sizeLicenses();
    }

    private static void addLicenses() {
        addLicense(new DriverLicense(1, "John"));
        addLicense(new DriverLicense(2, "Wick"));
        addLicense(new DriverLicense(3, "Jenny"));
        addLicense(new DriverLicense(4, "Andrew"));
        addLicense(new DriverLicense(5, "Michael"));
    }

    private static void addLicense(DriverLicense license) {
        allLicenses.put(license.getId(), license);
    }

    private static void printAll() {
        for (Map.Entry<Integer, DriverLicense> entry : allLicenses.entrySet()) {
            System.out.println("id: " + entry.getKey() + " license: " + entry.getValue());
        }
    }

    private static void clearAll() {
        System.out.println("Clearing Hashmap's content...");
        allLicenses.clear();
    }

    private static void sizeLicenses() {
        System.out.println("The size of Hashmap is: " + allLicenses.size());
    }
}