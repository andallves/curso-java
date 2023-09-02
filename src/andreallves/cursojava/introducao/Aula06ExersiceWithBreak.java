package andreallves.cursojava.introducao;

public class Aula06ExersiceWithBreak {
    // Dado o valor de um carro, descrubra em quantas vezes ele pode ser
    // parcelado;
    // Condição valorDaParcela >= 1000
    public static void main(String[] args) {
        double carValue = 50000;
        for (int parcela = 1; parcela <= carValue; parcela++) {
            double carParcValue = carValue / parcela;
            System.out.println(parcela + "parc.: " + carParcValue);
            if (carParcValue <= 1000) break;
        }
        System.out.println("\n");
        for (int parcela = (int) carValue; parcela >= 1; parcela--) {
            double carParcValue = carValue / parcela;
            if (carParcValue < 1000) continue;
            System.out.println(parcela + "parc.: " + carParcValue);
        }
    }
}
