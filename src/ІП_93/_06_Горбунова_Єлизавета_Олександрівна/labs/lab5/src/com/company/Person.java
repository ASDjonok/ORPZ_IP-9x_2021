package com.company;

public class Person {
    public String name;
    private String passportID;
    public Person(String name, String passportID) {
        this.name = name;
        this.passportID = passportID;
    }
    public String getPassport() {
        return passportID;
    }
}
