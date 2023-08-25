package andreallves.cursojava.introducao;

public class Aula05ConditionalStructures01 {
    public static void main(String[] args) {
        int age = 19;
        boolean authorizedBuyAlcohol = age >= 20;
        // if
        if (authorizedBuyAlcohol) {
            System.out.println("Autorizado para comprar bebida alcoolica");
        }

        // if else
        if (authorizedBuyAlcohol) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("Não é autorizado para comprar comida!");
        }
    }
}
