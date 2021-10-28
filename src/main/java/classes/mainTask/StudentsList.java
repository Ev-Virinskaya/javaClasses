package classes.mainTask;

import java.util.Arrays;

public class StudentsList {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Vasya", "Petrov", "Petrovich", 1998, 6, 7, "Minsk", "222222222", Faculty.MATH, 1, "2A");
        Student student2 = new Student(2, "Fedya", "Ivanov", "Petrovich", 1990, 11, 11, "Grodno", "777777777", Faculty.MATH, 2, "1A");
        Student student3 = new Student(3, "Gena", "Ruban", "Petrovich", 1991, 3, 3, "Mogilev", "722222222", Faculty.PHYSICS, 1, "3B");
        Student student4 = new Student( 4,"Zakhar", "Vasin", 1990, 11, 11, Faculty.MATH, 2, "1A");
        Student student5 = new Student( 5,"Petya", "Virinsky", 1987, 2,12, Faculty.PHYSICS, 1, "3B");

        Student[] students = new Student[5];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;

        studentsFaculty(students, Faculty.PHYSICS);
        studentsFacultyYears(students,1, Faculty.PHYSICS);
        studentsYoungerThanYear(students, 1990);
        studentsGroup(students, "1A");
    }

    public static void studentsFaculty(Student[] students, Faculty faculty) {
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student.getFaculty() + " " + student.getId() + " "
                        + student.getFirstName() + " " + student.getLastName());
            }
        }
        System.out.println();
    }
    public static void studentsFacultyYears(Student[] students, int year, Faculty faculty) {
        for (Student student: students) {
            if(student.getFaculty().equals(faculty) && student.getYear() == year){
                System.out.println(student.getFaculty() + " "+student.getYear()+" " + student.getId() + " "
                        + student.getFirstName() + " " + student.getLastName());
            }
        }
        System.out.println();
    }

    public static void studentsYoungerThanYear(Student[] students, int year) {
        Arrays.stream(students)
                .filter(student -> student.getBirthday().getYear() > year)
                .forEach(student -> System.out.println(student.getBirthday() +" " + student.getId() + " "
                        + student.getFirstName() + " " + student.getLastName()));
        System.out.println();
    }

    public static void studentsGroup(Student[] students, String group) {
        Arrays.stream(students)
                .filter(student -> student.getGroup().equals(group))
                .forEach(student -> System.out.println(student.getGroup() +" " + student.getId() + " "
                        + student.getFirstName() + " " + student.getLastName()));
    }

}
