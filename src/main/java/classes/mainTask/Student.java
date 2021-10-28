package classes.mainTask;

import java.time.LocalDate;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;
    private Faculty faculty;
    private int year;
    private String group;


    public Student() {
    }

    public Student(int id, String firstName, String lastName, String patronymic,
                   int birthyear, int month, int day, String address, String phoneNumber,
                   Faculty faculty, int year, String group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthday = LocalDate.of(birthyear, month, day);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.year = year;
        this.group = group;
    }

    public Student( int id,String firstName, String lastName, int birthyear, int month, int day, Faculty faculty, int year, String group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = LocalDate.of(birthyear, month, day);
        this.faculty = faculty;
        this.year = year;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + year + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
