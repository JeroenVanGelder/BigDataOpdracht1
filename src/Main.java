import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jasper on 05-Mar-17.
 */
public class Main {
    String userName = "root";
    String password = "weland";
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/";
    String[] databases = {"Opdracht1Fowler", "opdracht1stardiagram", "opdracht1snowflake"};
    Connection con = null;
    FileReader fileReader = new FileReader();

    public Main() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
//        con = DriverManager.getConnection(url + databases[0], userName, password);
////        Unit.ExcecuteInserts(this);
////        PhenomenonType.ExcecuteInserts(this);
////        Person.ExcecuteInserts(this);
////        Observation.ExcecuteInserts(this);
////        Quantity.ExcecuteInserts(this);
////        Measurement.ExcecuteInserts(this);
//    con.close();
        con = DriverManager.getConnection(url + databases[1], userName, password);
//        //stardiagram
////        Person.ExcelucteInsters2(this);
////        PhenomenonType.ExcecuteInserts2(this);
////        DateInsert.ExcecuteInserts(this);
          Quantity.ExcecuteInserts2(this);
        Observation.ExcecuteInserts2(this);
    con.close();
        con = DriverManager.getConnection(url + databases[2], userName, password);
        //snowflake
//        Unit.ExcecuteInserts(this);
        Quantity.ExcecuteInserts3(this);
//        PhenomenonType.ExcecuteInserts3(this);
//        Person.ExcelucteInsters2(this);
//        DateInsert.ExcecuteInserts(this);
        Observation.ExcecuteInserts2(this);
        con.close();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Main m = new Main();
    }

    public void InsertData(ArrayList<String> data, String table) throws SQLException {
        String parameters = "";
        for(int i = 0; i < data.size();i++){
            parameters += data.get(i);
            if(i < data.size() - 1){ parameters += ", "; }
        }

        String sql = "INSERT INTO " + table + " VALUES (" + parameters + ")";
        System.out.println(sql);
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.execute();
    }
}
