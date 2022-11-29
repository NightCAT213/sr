package com.samsung.learning;

public abstract class User {
    public String name, lname, otname, number;

    public User(String name, String lname, String otname, String number) {
        this.name = name;
        this.lname = lname;
        this.otname = otname;
        this.number = number;
    }

    public User(String name, String lname, String otname) {
        this.name = name;
        this.lname = lname;
        this.otname = otname;
    }

    public abstract void sayHello();
}
