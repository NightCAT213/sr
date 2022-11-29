package com.samsung.learning;

public class Teacher extends User implements Printer{
    public String subject;

    public Teacher(String name, String lname, String otname, String number, String subject) {
        super(name, lname, otname, number);
        this.subject = subject;
    }

    public Teacher(String name, String lname, String otname, String subject) {
        super(name, lname, otname);
        this.number = "x (xxx) xxx-xx-xx";
        this.subject = subject;
    }

    public Teacher(Teacher teacher) {
        this(teacher.name, teacher.lname, teacher.otname, teacher.number, teacher.subject);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравствуйте! Я преподаватель, мое имя " + lname + " " + name + " " + otname + ".");
    }

    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("<<Преподаватель\nИмя: " + name + "\nФамилия: " + lname + "\nОтчество: " + otname +
                "\nНомер телефона: " + number + "\nГруппа: " + subject + "\n>>");
    }
}
