import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jasper on 05-Mar-17.
 */
public class Unit {
    public static void ExcecuteInserts(Main main) throws SQLException {
        main.InsertData(new ArrayList<>(Arrays.asList("1", "'Beats per minute'")), "Unit");
        main.InsertData(new ArrayList<>(Arrays.asList("2", "'Degrees Celcius'")), "Unit");
        main.InsertData(new ArrayList<>(Arrays.asList("3", "'Pressure per square inch'")), "Unit");
    }
}
