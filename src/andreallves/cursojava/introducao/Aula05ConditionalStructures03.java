package andreallves.cursojava.introducao;

/*
    Ternary Operator -> (conditional) ? true : false;
 */

public class Aula05ConditionalStructures03 {
    public static void main(String[] args) {
        double salary = 4000;
        String result = salary >= 5000 ? "Vou doar 500 para caridade" : "Não vou ter como doar pra caridade";
        System.out.println(result);
    }
}
