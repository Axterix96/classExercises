package tcs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CRUDutility {
    Connection con;
    MysqlConnector mysqlConnector = new MysqlConnector();

    public CRUDutility() throws SQLException, ClassNotFoundException {
        this.con = mysqlConnector.connector();
    }

    public void close() {
        try {
            mysqlConnector.closeConnector(con);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    List<Computadoras> getComputadora() throws SQLException {

        //step 1 Declare Empty list of Persons
        List<Computadoras> computadorasList = new ArrayList<>();

        //step 2 create the statement object
        Statement stmt = con.createStatement();

        // Prepare your select Statement
        String select = "SELECT * FROM ejercicio.computadora;";

        //step 3 execute select query
        ResultSet rs = stmt.executeQuery(select);
        while(rs.next()) {
            computadorasList.add(new Computadoras(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }

        return computadorasList;
    }



    Computadoras createComputadora(String ram, String procesador, String discoduro) throws SQLException {

        //step 1 create the statement object
        Statement stmt = con.createStatement();

        //step 2 Prepare your select Statement
        String insert = " INSERT INTO `ejercicio`.`computadora` (`ram`, `procesador`, `discoduro`) " +
                " VALUES " +
                " ('" + ram + "', '" + procesador + "', '" + discoduro + "');";

        //step 3 execute insert query
        int result = stmt.executeUpdate(insert);

        //step 4 Preapre return statement
        Computadoras computadora = new Computadoras(result, ram, procesador, discoduro);
        System.out.println("Record Inserted: (result="+result+") " + computadora.toString());
        return computadora;
    }



    Computadoras updateComputadora(int idcomputadora, String ram, String procesador, String discoduro) throws SQLException {

        //step 1 create the statement object
        Statement stmt = con.createStatement();

        //Step 2
        String update = " UPDATE `ejercicio`.`computadora` SET " +
                " `ram` = '" + ram + "', `procesador` = '"+procesador+"', `discoduro` = '"+discoduro+"' WHERE (`idcomputadora` = '"+idcomputadora+"'); ";

        //step 3 execute insert query
        int result = stmt.executeUpdate(update);

        //step 4 Preapre return statement
        Computadoras person = new Computadoras(idcomputadora, ram, procesador, discoduro);

        return person;
    }


    void deleteComputadora(int idcomputadora) throws SQLException {

        //step 1 create the statement object
        Statement stmt = con.createStatement();

        // setp 2 delete statement
        String delete = " DELETE FROM `ejercicio`.`computadora` WHERE (`idcomputadora` = '"+idcomputadora+"'); ";

        //step 3 execute insert query
        int result = stmt.executeUpdate(delete);
    }
}
