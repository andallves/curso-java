package andreallves.cursojava.introducao;

public class Aula06RepetingStructures {
    public static void main(String[] args) {
        // while, do while and for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        do {
            System.out.println(count--);
        } while (count > 0);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
