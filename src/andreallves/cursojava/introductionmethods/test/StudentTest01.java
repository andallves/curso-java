package andreallves.cursojava.introductionmethods.test;

import andreallves.cursojava.introductionmethods.domain.PrinterStudent;
import andreallves.cursojava.introductionmethods.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student02 = new Student();
        PrinterStudent printer = new PrinterStudent();

        student.name = "Andre";
        student.age = 23;
        student.gender = 'M';

        student02.name = "Paula";
        student02.age = 29;
        student02.gender = 'F';

        printer.print(student);
        printer.print(student02);
    }
}
