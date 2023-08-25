package andreallves.cursojava.introducao;

public class Aula04Operators {
    public static void main(String[] args) {
        // + - / *
        int number1 = 10;
        int number2 = 20;
        System.out.println(number2 - number1);
        System.out.println(number2 + number1);
        System.out.println(number1 * number2);
        System.out.println(number2 / number1);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= != == (comparasion operators)
        boolean isTenGreaterThanTwenty = 10 >= 20;
        boolean isTenSmallerThanTwenty = 10 <= 20;
        boolean isTenEqualTwenty = 10 == 20;
        System.out.println("isDezMaiorQueVinte:" + isTenGreaterThanTwenty);
        System.out.println("isDezMenorQueVinte:" + isTenSmallerThanTwenty);
        System.out.println("isDezIgualVinte:" + isTenEqualTwenty);

        // && (AND), || (OR), ! (NOT) (logic operators)
        int age = 29;
        float salary = 3500F;
        boolean isIntoLawGreaterThanThirty = age >= 30 && salary >= 4612;
        boolean isIntoLawLowerThanThirty = age < 30 && salary >= 3381;
        System.out.println("isIntoLawGreaterThanThirty: " + isIntoLawGreaterThanThirty);
        System.out.println("isIntoLawLowerThanThirty: " + isIntoLawLowerThanThirty);

        double valueTotalCurrentAccount = 200;
        double valueTotalSaveAccount = 10000;
        float playstationValue = 5000F;

        boolean isPlaystationBuying =
                valueTotalCurrentAccount >= playstationValue || valueTotalSaveAccount >= playstationValue;
        System.out.println("isPlaystationComprável: " + isPlaystationBuying);

        // = += -+ *= /= %= (assigment operators)

        double bonus = 1800;
        bonus += 1000;
        bonus *= 2;
        System.out.println(bonus);

        // ++ --
        int counter = 0;
        counter++; // first execute then increment
        ++counter; // first increment then execute
        System.out.println(counter);
        counter--; // first execute then descriment
        --counter; // first descriment then execute
        System.out.println(counter);

    }
}
