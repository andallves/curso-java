package andreallves.cursojava.introducao;

public class Aula02PrimitiveTypes {
    public static void main(String[] args) {
        /*
         * Primitive types are reserved word and lowercase
         * int, double, float, char, byte, sort, long, boolean
         */
        int age = 23; // 4 bytes
        long numberLong = 10000000L; // 8 bytes
        double salaryDouble = 2000.0; // 8 bytes
        float salaryFloat = 2500.0F; // 4 bytes
        byte ageByte = 127; // 1 byte
        short ageSort = 32000; // 2 bytes
        boolean truty = true; // 1 bit
        boolean falso = false; // 1 bit
        char caractere = 'M'; // 2 bytes
        char caractere1 = 65; // 2 bytes
        String name = "Andre";
        String text = "I can to write a text here";
        System.out.println("Hello "+name+"!" + text);
        System.out.println(age + numberLong + salaryDouble);
        System.out.println(salaryFloat + ageByte + ageSort);
        System.out.println(truty);
        System.out.println(falso);
        System.out.println(caractere + caractere1);

    }
}
