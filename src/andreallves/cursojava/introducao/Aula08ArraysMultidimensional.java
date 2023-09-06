package andreallves.cursojava.introducao;

public class Aula08ArraysMultidimensional {
    public static void main(String[] args) {
        int[][] days = new int[2][3];

        days[0][0] = 31;
        days[0][1] = 29;
        days[0][2] = 31;

        days[1][0] = 30;
        days[1][1] = 31;
        days[1][2] = 30;


        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }
        System.out.println("--------------");
        // This for its more recommended to use with multidimensional arrays.
        for (int[] baseArr : days) {
            for (int numberOfDays : baseArr) {
                System.out.println(numberOfDays);
            }
        }
        System.out.println("--------------");

        // How I can to initialize a multidimensional array
        int[][] intArray = new int[3][];

        intArray[0] = new int[2];
        intArray[1] = new int[3];
        intArray[2] = new int[1];

        for (int[] lineOfArray : intArray) {
            int count = 1;
            for (int columnOfArray : lineOfArray) {
                columnOfArray = count;
                System.out.println(columnOfArray);
                count++;
            }
        }
        // Another way to initializar a multidimensional array
        int[][] intArray2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
    }
}
