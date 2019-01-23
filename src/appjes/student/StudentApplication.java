package appjes.student;

import model.student.Student;

public class StudentApplication {

    public static void main(String[] args) {

        Student karin = new Student();

        Student carla = new Student("Karin", "123454321");

        Student victorien = new Student("Karin", "123", 3);

        System.out.println(carla.getName());

        carla.setAge(22);

        System.out.println(carla.getName());
        System.out.println(carla.getBsn());

    }
}
