package tcs;

import java.sql.SQLException;

public class Testeo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CRUDutility crudUtility = new CRUDutility();

        System.out.println(
                "\nInsert User: \n " +
                        crudUtility.createComputadora("6 gb", "Intel", "500GB")
        );

        System.out.println(
                "\nGet Computadoras: \n " +
                        crudUtility.getComputadora()
        );

        System.out.println(
                "\nUpdate Computer with id=1:\n" +
                        crudUtility.updateComputadora(1, "8gb", "AMD", "1TB")
        );
        System.out.println(
                "\nGet Computadoras: \n " +
                        crudUtility.getComputadora()
        );

        //crudUtility.deleteComputadora(1);

        crudUtility.close();
    }

}
