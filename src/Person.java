import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jasper on 05-Mar-17.
 */
public class Person {
    public static void ExcecuteInserts(Main main) throws SQLException {
        main.InsertData(new ArrayList<>(Arrays.asList("1", "'Eveline'", "'Brakefield'")), "Person");
        main.InsertData(new ArrayList<>(Arrays.asList("2", "'Jaqueline'", "'Tso'")), "Person");
        main.InsertData(new ArrayList<>(Arrays.asList("3", "'Marilynn'", "'Strohmeye'")), "Person");
    }

    public static void ExcelucteInsters2(Main main) throws SQLException{
        main.InsertData(new ArrayList<>(Arrays.asList("1", "'Eveline'", "'Brakefield'")), "Patient");
        main.InsertData(new ArrayList<>(Arrays.asList("2", "'Jaqueline'", "'Tso'")), "Patient");
        main.InsertData(new ArrayList<>(Arrays.asList("3", "'Marilynn'", "'Strohmeye'")), "Patient");
    }
}
