package andreallves.cursojava.javacore.introductionclasses.test;

import andreallves.cursojava.javacore.introductionclasses.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Andre";
        student.age = 23;
        student.gender = 'M';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        System.out.println("-----------------");
        Student student1 = new Student();
        student1.gender = 'F';
        student1.age = 28;
        student1.name = "Caio";
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gender);
    }
}
