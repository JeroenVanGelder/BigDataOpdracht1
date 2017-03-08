import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jasper on 05-Mar-17.
 */
public class Measurement {
    public static void ExcecuteInserts(Main main) throws SQLException {
        int counterID = 1;
        for (ArrayList<String> row: main.fileReader.temperature){
            if(row.size() == 0) continue;

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", counterID + "", "3", counterID + "")),
                    "Measurement");
            counterID++;
        }

        int observationID = counterID;
        for (ArrayList<String> row: main.fileReader.bloodPressure){
            if(row.size() == 0) continue;

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", counterID + "", "1", observationID + "")),
                    "Measurement");
            counterID++;
            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", counterID + "", "2", observationID + "")),
                    "Measurement");
            counterID++;observationID++;
        }

        for (ArrayList<String> row: main.fileReader.heartRate){
            if(row.size() == 0) continue;

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", counterID + "", "4", observationID + "")),
                    "Measurement");
            counterID++;observationID++;
        }
    }
}
