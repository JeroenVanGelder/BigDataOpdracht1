import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jasper on 05-Mar-17.
 */
public class FileReader {
    public ArrayList<ArrayList<String>> bloodPressure = new ArrayList<>();
    public ArrayList<ArrayList<String>> heartRate = new ArrayList<>();
    public ArrayList<ArrayList<String>> temperature = new ArrayList<>();


    public FileReader(){
        readBP();
        readHR();
        readTEMP();
    }

    private void readBP(){
        String path = "C:\\Users\\Jasper\\Documents\\school\\BigData\\opdracht 1\\1671545\\";
        String[] fileNames = { "bp.EvelineBrakefield.csv", "bp.JaquelineTso.csv", "bp.MarilynnStrohmeyer.csv"};
        BufferedReader bufferedReader = null;

        for(String file: fileNames){
            try{
                String line;
                int iDCounter = 0;
                bufferedReader = new BufferedReader(new java.io.FileReader(path + file));
                while((line = bufferedReader.readLine()) != null){
                    if(iDCounter != 0) {
                        String[] items = line.split(",");
                        bloodPressure.add(new ArrayList<>(Arrays.asList(iDCounter + "", items[0], items[1], items[2])));
                    }
                    iDCounter++;
                }

                bloodPressure.add(new ArrayList<String>());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(bufferedReader != null){
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private void readHR(){
        String path = "C:\\Users\\Jasper\\Documents\\school\\BigData\\opdracht 1\\1671545\\";
        String[] fileNames = { "hr.EvelineBrakefield.csv", "hr.JaquelineTso.csv", "hr.MarilynnStrohmeyer.csv"};
        BufferedReader bufferedReader = null;

        for(String file: fileNames){
            try{
                String line;
                int iDCounter = 0;
                bufferedReader = new BufferedReader(new java.io.FileReader(path + file));
                while((line = bufferedReader.readLine()) != null){
                    if(iDCounter != 0) {
                        String[] items = line.split(",");
                        heartRate.add(new ArrayList<>(Arrays.asList(iDCounter + "", items[0], items[1])));
                    }
                    iDCounter++;
                }

                heartRate.add(new ArrayList<String>());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(bufferedReader != null){
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private void readTEMP(){
        String path = "C:\\Users\\Jasper\\Documents\\school\\BigData\\opdracht 1\\1671545\\";
        String[] fileNames = { "temp.EvelineBrakefield.csv", "temp.JaquelineTso.csv", "temp.MarilynnStrohmeyer.csv"};
        BufferedReader bufferedReader = null;

        for(String file: fileNames){
            try{
                String line;
                int iDCounter = 0;
                bufferedReader = new BufferedReader(new java.io.FileReader(path + file));
                while((line = bufferedReader.readLine()) != null){
                    if(iDCounter != 0) {
                        String[] items = line.split(",");
                        temperature.add(new ArrayList<>(Arrays.asList(iDCounter + "", items[0], items[1])));
                    }
                    iDCounter++;
                }

                temperature.add(new ArrayList<String>());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(bufferedReader != null){
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
