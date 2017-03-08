import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jasper on 05-Mar-17.
 */
public class Quantity {
    public static void ExcecuteInserts(Main main) throws SQLException {
        int counterID = 1;

        for (ArrayList<String> row: main.fileReader.temperature){
            if(row.size() == 0) continue;

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", row.get(2), "2")), "Quantity");
            counterID++;
        }

        for (ArrayList<String> row: main.fileReader.bloodPressure){
            if(row.size() == 0) continue;

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", row.get(2), "3")), "Quantity");
            counterID++;
            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", row.get(3), "3")), "Quantity");
            counterID++;
        }

        for (ArrayList<String> row: main.fileReader.heartRate){
            if(row.size() == 0) continue;

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", row.get(2), "1")), "Quantity");
            counterID++;
        }
    }

    public static void ExcecuteInserts2(Main main) throws SQLException {
        int counterID = 1;
        for (ArrayList<String> row: main.fileReader.bloodPressure){
            if(row.size() == 0) continue;

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", row.get(2), "'Pressure per square inch'")), "Value");
            counterID++;
            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", row.get(3), "'Pressure per square inch'")), "Value");
            counterID++;
        }

        for (ArrayList<String> row: main.fileReader.heartRate){
            if(row.size() == 0) continue;

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", row.get(2), "'Beats per minute'")), "Value");
            counterID++;
        }

        for (ArrayList<String> row: main.fileReader.temperature){
            if(row.size() == 0) continue;

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", row.get(2), "'Degrees Celcius'")), "Value");
            counterID++;
        }
    }

    public static void ExcecuteInserts3(Main main) throws SQLException {
        int counterID = 1;
        for (ArrayList<String> row: main.fileReader.bloodPressure){
            if(row.size() == 0) continue;

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", row.get(2), "3")), "Value");
            counterID++;
            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", row.get(3), "3")), "Value");
            counterID++;
        }

        for (ArrayList<String> row: main.fileReader.heartRate){
            if(row.size() == 0) continue;

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", row.get(2), "1")), "Value");
            counterID++;
        }

        for (ArrayList<String> row: main.fileReader.temperature){
            if(row.size() == 0) continue;

            main.InsertData(new ArrayList<>(Arrays.asList(counterID + "", row.get(2), "2")), "Value");
            counterID++;
        }
    }
}
