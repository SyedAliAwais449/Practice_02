package com.example.toast;

public class Friends {
    private int id;
    private String name;
    private int dob;
    private String city;
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDob() {
        return dob;
    }

    public String getCity() {
        return city;
    }

    public Friends(int id, String name, int dob, String city) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.city = city;
    }

}
