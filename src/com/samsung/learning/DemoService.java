package com.samsung.learning;

public class DemoService {


    public static void demo() {
        Student student1 = new Student("Петя", "Сидоров", "Петрович", "1-я группа");
        Student student2 = new Student("Коля", "Степанов", "Александрович", "8(888)888-88-88", "1-я группа");
        Student student3 = new Student("Лев", "Львин", "Львович", "8(123)888-88-88", "2-я группа");
        Teacher teacher1 = new Teacher("Наталья", "Знаниевна", "Артемьевна", "83824823479", "алгебра");
        Teacher teacher2 = new Teacher("Светлана", "Науковна", "Евгеньевна", "83804823479", "информатика");
        University university = new University("Проспект Вернандского 9",
                new Student[]{student1, student2, student3},
                new Teacher[]{teacher1, teacher2});
        university.printInfoToConsoleSuperKpacuBo();
    }
}
