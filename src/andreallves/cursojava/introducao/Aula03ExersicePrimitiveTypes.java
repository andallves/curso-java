package andreallves.cursojava.introducao;

/*
    Practice

    It should create a variables for the fileds below that it insert inside
    the <> e then print the message.

    Eu <name>, morando no endereço <address>,
    confirmo que recebi o salári de  R$ <salary>, na data <date>
 */

public class Aula03ExersicePrimitiveTypes {
    public static void main(String[] args) {
        String name = "Andre";
        String address = "Av. 09, 102 Mondubim";
        float salary = 2000.00F;
        String dateReceiveSalary = "17/09/2000";
        String message = "Eu "+ name + " morando no endereço " + address +
                " confirmo que recebi o salário de R$ "+salary+", na data "
                + dateReceiveSalary;
        System.out.println(message);
    }
}
