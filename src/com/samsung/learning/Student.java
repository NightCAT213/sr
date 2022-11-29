package com.samsung.learning;

public class Student extends User implements Printer{
    String group;
    String number;

    public Student(String name, String lname, String otname, String number, String group) {
        super(name, lname, otname, number);
        this.group = group;
    }

    public Student(String name, String lname, String otname, String group) {
        super(name, lname, otname);
        this.number = "x (xxx) xxx-xx-xx";
        this.group = group;
    }

    public Student(Student student) {
        super(student.name, student.lname, student.otname, student.number);
        this.group = student.group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public void sayHello() {
        System.out.println("Привет! Я студент, мое имя " + lname + " " + name + " " + otname + ".");
    }

    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("<<Студент\nИмя: " + name + "\nФамилия: " + lname + "\nОтчество: " + otname +
                "\nНомер телефона: " + number + "\nГруппа: " + group + "\n>>");
    }
}
