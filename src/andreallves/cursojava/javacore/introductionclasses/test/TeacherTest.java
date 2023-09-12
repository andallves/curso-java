package andreallves.cursojava.javacore.introductionclasses.test;

import andreallves.cursojava.javacore.introductionclasses.domain.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.age = 34;
        teacher.name = "Walber";
        teacher.gender = 'M';

        System.out.println("Nome " + teacher.name + ", idade: " + teacher.age +
                " sexo: " + teacher.gender);
    }
}
