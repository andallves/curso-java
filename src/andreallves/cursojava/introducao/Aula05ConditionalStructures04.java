package andreallves.cursojava.introducao;

public class Aula05ConditionalStructures04 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        byte day = 5;

        switch (day) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("valor inválido!");
                break;

        }
    }
}
