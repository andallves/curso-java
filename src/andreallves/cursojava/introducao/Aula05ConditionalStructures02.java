package andreallves.cursojava.introducao;

public class Aula05ConditionalStructures02 {
    public static void main(String[] args) {
        int age = 18;
        String category = "";
        if (age < 15) {
            category = "infantil";
        } else if (age >= 15 && age < 18) {
            category = "juvenil";
        } else {
            category = "adulto";
        }
        System.out.println("A categoria é " + category);
    }
}
