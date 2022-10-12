package com.sysco.qe.subs.util;

import com.helger.commons.csv.CSVWriter;
import com.syscolab.qe.core.common.LoggerUtil;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.sysco.qe.subs.common.Constants.*;
import static com.sysco.qe.subs.data.CommonDataProvider.*;

public class CsvFilesUtil {
    private CsvFilesUtil(){}

    public static void writeDataLineByLine(String filePath, String[][] uploadData, int rows)
    {
        File file = new File(filePath);
        try (FileWriter outputfile = new FileWriter(file)){
            // create CSVWriter object
            CSVWriter writer = new CSVWriter(outputfile);
            // adding header to csv
            String[] header = { CUSTOMER_ID_COLUMN_NAME, SITE_COLUMN_NAME, SUPC_COLUMN_NAME, UOM_COLUMN_NAME, PRICE_COLUMN_NAME,
                    START_DATE_COLUMN_NAME, END_DATE_COLUMN_NAME, PRICE_ZONE_COLUMN_NAME};
            writer.writeNext(header);
            // add data to csv
            String[] dataRow = new String[8];
            for(int i=0; i<rows; i++){
                for(int j=0; j<8; j++){
                    dataRow[j] =  uploadData[i][j];
                }
                writer.writeNext(dataRow);
            }
            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            LoggerUtil.logERROR("Error in writing data", e);
        }
    }

    public static String generateUniqueCsvFile(String[][] uploadData, int dataRows) {
        //File name needs to be unique
        String newFileName = VALID_FILENAME_BRIDGE_UPLOAD + System.currentTimeMillis()+".csv";
        LoggerUtil.logINFO("****** NEW FILE ******"+ newFileName);
        String filepath = DIR_PATH+newFileName;
        writeDataLineByLine(filepath, uploadData, dataRows);
        return newFileName;
    }

    public static void deleteFile(String filePath){
        try {
            Files.deleteIfExists(Paths.get(filePath));
        }
        catch(NoSuchFileException e) {
            LoggerUtil.logERROR("No such file/directory exists", e);
        }
        catch(DirectoryNotEmptyException e) {
            LoggerUtil.logERROR("Directory is not empty.", e);
        }
        catch(IOException e) {
            LoggerUtil.logERROR("Invalid permissions.", e);
        }
        LoggerUtil.logINFO("Deletion successful.");
    }

    public static String removeExtensionFromFileName(String fileNameWithExt) {
        return FilenameUtils.removeExtension(fileNameWithExt);
    }

    //Generates a CSV file with given customer and supc data
    public static String generateCsvFileWithGivenCustItem(String[][] uploadData, int dataRows, String fileName, String filePath) {
        String newFileName = fileName +".csv";
        LoggerUtil.logINFO("****** NEW FILE ******"+ newFileName);
        String filepath = filePath+newFileName;
        writeCustItemDataLineByLine(filepath, uploadData, dataRows);
        return filepath;
    }

    //Write customer and supc data to CSV file
    public static void writeCustItemDataLineByLine(String filePath, String[][] uploadData, int rows){
        File file = new File(filePath);
        try (FileWriter outputfile = new FileWriter(file)){
            // create CSVWriter object
            CSVWriter writer = new CSVWriter(outputfile);
            // add data to csv
            String[] dataRow = new String[2];
            for(int i=0; i<rows; i++){
                for(int j=0; j<2; j++){
                    dataRow[j] =  uploadData[i][j];
                }
                writer.writeNext(dataRow);
            }
            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            LoggerUtil.logERROR("Error in writing data", e);
        }
    }

    //Read customer and supc data from the CSV file and return as an array
    public static List<List<String>> readCustItemDataLineByLine(String filePath){
        List<List<String>> records = new ArrayList<>();
        Scanner inputStream;
        File file = new File(filePath);
        try{
            inputStream = new Scanner(file);

            while(inputStream.hasNext()){
                String line= inputStream.next();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                records.add(Arrays.asList(values));
            }
            inputStream.close();
        }catch (FileNotFoundException e) {
            LoggerUtil.logERROR("Error in reading data", e);
        }
        return records;
    }

    public static String getValueOfGivenRowAndColumn(int rowNum , int columnNum, List<List<String>> records) {
        String value = null;
        if(!records.isEmpty() && !records.get(rowNum).isEmpty()) {
            value = records.get(rowNum).get(columnNum).replace("\"", "");
        }
        return value;
    }
}
