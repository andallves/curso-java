package andreallves.cursojava.introducao.examples;

public class PersonName {
    private String name;

    public PersonName(String name) {
        this.name = name;
    }

    public String getName() {
        if (name.length() > 16)
            return "Name is too large!";

        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() > 2) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        PersonName person = new PersonName("Andre");
        person.setName("Andre Alves");
        System.out.println(person.getName());
    }
}
