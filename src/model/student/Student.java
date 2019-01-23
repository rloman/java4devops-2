package model.student;

public class Student {

    private String name; // field
    private int age;
    private String bsn;

    // constructor
    public Student(String name, String bsn) {
        this.name = name;
        this.bsn = bsn;
    }

    public Student() {

    }

    public Student(String name, String bsn, int age) {
        this.name =name;
        this.bsn = bsn;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBsn() {
        return bsn;
    }
}