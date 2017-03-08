import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jasper on 05-Mar-17.
 */
public class Observation {
    public static void ExcecuteInserts(Main main) throws SQLException {
        ArrayList<ArrayList<String>> list = main.fileReader.temperature;
        list.addAll(main.fileReader.bloodPressure);
        list.addAll(main.fileReader.heartRate);

        int personID = 1, counterID = 1;
        for(ArrayList<String> row: list){
            if(row.size() == 0) {
                personID++;
                if(personID == 4) personID = 1;
                continue;
            }

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", "'" + row.get(1) + "'", personID + "")),
                    "Observation");
            counterID++;
        }
    }

    public static void ExcecuteInserts2(Main main) throws SQLException {
        int idCounter = 1, dateId =1, patientId = 1;

        for(ArrayList<String> row: main.fileReader.bloodPressure){
            if(row.size() == 0) { patientId++; continue; }

            main.InsertData(new ArrayList<>(Arrays.asList(idCounter + "", dateId + "", patientId + "", idCounter +
                            "", "1", "NULL")),
                    "Observation");
            idCounter++;
            main.InsertData(new ArrayList<>(Arrays.asList(idCounter + "", dateId + "", patientId + "", idCounter +
                            "", "2", "NULL")),"Observation");
            idCounter++;
            dateId++;
        }

        patientId = 1;
        for(ArrayList<String> row: main.fileReader.heartRate){
            if(row.size() == 0) { patientId++; continue; }

            main.InsertData(new ArrayList<>(Arrays.asList(idCounter + "", dateId + "", patientId + "", idCounter +
                            "", "3", "NULL")),
                    "Observation");
            idCounter++;dateId++;
        }

        patientId = 1;
        for(ArrayList<String> row: main.fileReader.temperature){
            if(row.size() == 0) { patientId++; continue; }

            main.InsertData(new ArrayList<>(Arrays.asList(idCounter + "", dateId + "", patientId + "", idCounter +
                            "", "2", "NULL")),
                    "Observation");
            idCounter++;dateId++;
        }
    }
}
