package com.samsung.learning;

public class University implements Printer {
    public String adres;
    public Student[] spisok_students;
    public Teacher[] spisok_prepodov;

    public University(String adres, Student[] spisok_students, Teacher[] spisok_prepodov) {
        this.adres = adres;
        this.spisok_students = spisok_students;
        this.spisok_prepodov = spisok_prepodov;
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("<<СТУДЕНТЫ:");
        for (int i = 0; i < spisok_students.length; i++) {
            spisok_students[i].printInfoToConsoleSuperKpacuBo();
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("<<ПРЕПОДАВАТЕЛИ:");
        for (int i = 0; i < spisok_prepodov.length; i++) {
            spisok_prepodov[i].printInfoToConsoleSuperKpacuBo();
            System.out.println("\n");
        }
    }
}
