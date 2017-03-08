import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jasper on 08-Mar-17.
 */
public class DateInsert {

    public static void ExcecuteInserts(Main main) throws SQLException {
        ArrayList<ArrayList<String>> items = main.fileReader.bloodPressure;
        items.addAll(main.fileReader.heartRate);
        items.addAll(main.fileReader.temperature);

        int idCOunter = 1;
        for(int i = 0; i < items.size(); i++){
            ArrayList<String> temp = items.get(i);
            if(temp.size() == 0) continue;
            main.InsertData(new ArrayList<>(Arrays.asList(idCOunter + "", "'" +temp.get(1) + "'")), "Date");
            idCOunter++;
        }
    }
}
