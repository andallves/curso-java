package andreallves.cursojava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        int[] age = new int[3];
        age[0] = 2;
        // We can't take a diferent type inside the array because of type
        // declaration
        // age[0] = 2f -> This throw an error!
        age[1] = (int) 2f; // -> We're using a casting to convert type

        // This types has the default value when they're creating, and it
        // doesn't assing a value.
        // byte, short, int, long, float and double: 0
        // char: '/u000' == ' '
        // boolean: false
        // String: null

        String[] name = new String[2];
        name[0] = "Andre";
        name[1] = "Cley";
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        // The array length cannot change dynamically, it always will change
        // manually.
        name = new String[3]; // I'm adding a new position to array

        // A new way to create an array and assing a value
        int[] numbers = {1, 3, 5, 7, 9};
        int[] anotherNumbers = new int[]{1, 3, 5, 7, 9};

        // foreach -> it's used in arrays
        for (int i : anotherNumbers) {
            System.out.println(i); // It might print each array's elements
        }
    }
}
