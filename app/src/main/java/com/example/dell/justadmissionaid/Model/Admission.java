package com.example.dell.justadmissionaid.Model;

public class Admission {
    public String roll,name,location;

    public Admission(String roll, String name, String location) {
        this.roll = roll;
        this.name = name;
        this.location = location;
    }

    public Admission() {
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
