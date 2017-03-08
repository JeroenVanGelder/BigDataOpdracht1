import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jasper on 05-Mar-17.
 */
public class PhenomenonType {
    public static void ExcecuteInserts(Main main) throws SQLException {
        main.InsertData(new ArrayList<>(Arrays.asList("1", "'Bloodpressure estolic'")), "PhenomenonType");
        main.InsertData(new ArrayList<>(Arrays.asList("2", "'Bloodpressure diastolic'")), "PhenomenonType");
        main.InsertData(new ArrayList<>(Arrays.asList("3", "'Body temperature'")), "PhenomenonType");
        main.InsertData(new ArrayList<>(Arrays.asList("4", "'Heartrate'")), "PhenomenonType");
    }

    public static void ExcecuteInserts2(Main main) throws SQLException {
        main.InsertData(new ArrayList<>(Arrays.asList("1", "'Bloodpressure estolic'")), "Type");
        main.InsertData(new ArrayList<>(Arrays.asList("2", "'Bloodpressure diastolic'")), "Type");
        main.InsertData(new ArrayList<>(Arrays.asList("3", "'Body temperature'")), "Type");
        main.InsertData(new ArrayList<>(Arrays.asList("4", "'Heartrate'")), "Type");
    }

    public static void ExcecuteInserts3(Main main) throws SQLException {
        main.InsertData(new ArrayList<>(Arrays.asList("1", "'Bloodpressure'", "NULL")), "Type");
        main.InsertData(new ArrayList<>(Arrays.asList("2", "'Body temperature'", "NULL")), "Type");
        main.InsertData(new ArrayList<>(Arrays.asList("3", "'Heartrate'", "NULL")), "Type");
        main.InsertData(new ArrayList<>(Arrays.asList("4", "'Estolic'", "1")), "Type");
        main.InsertData(new ArrayList<>(Arrays.asList("5", "'Diastolic'", "1")), "Type");
    }
}
