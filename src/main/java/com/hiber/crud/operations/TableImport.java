package com.hiber.crud.operations;

public class TableImport {
    private int row;
    private String name;
    private String city;
    private int age;

    public TableImport(String line) {
        String[] attrs = line.split(";");
        this.row = Integer.valueOf(attrs[0]);
        this.name = attrs[1];
        this.city = attrs[2];
        this.age = Integer.valueOf(attrs[3]);
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
