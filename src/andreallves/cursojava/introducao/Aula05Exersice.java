package andreallves.cursojava.introducao;

public class Aula05Exersice {
    public static void main(String[] args) {
        double salary = 25000;
        double tax = 0;
        if (salary <= 34712) {
            tax = salary * 9.7 / 100;
        } else if (salary > 34713 && salary <= 68507) {
            tax = salary * 37.35 / 100;
        } else {
            tax = salary * 49.5 / 100;
        }
        System.out.println("O salario é R$"+salary+" anual e terá de " +
                "pagar R$"+tax + " de impostos");
    }
}
