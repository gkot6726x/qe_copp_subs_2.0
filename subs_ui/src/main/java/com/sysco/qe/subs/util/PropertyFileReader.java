package com.sysco.qe.subs.util;


import org.testng.reporters.jq.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class PropertyFileReader {
    private static Logger logger = Logger.getLogger(Main.class.getSimpleName());

    private Properties getData(String fileName) {

        File file = new File("src/main/resources/testData/" + fileName + ".properties");
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            logger.info(e.toString());

        }
        Properties prop = new Properties();

        try {
            prop.load(fileInput);
        } catch (IOException e) {
            logger.info(e.toString());
        }
        return prop;
    }

    public String getProperty(String fileName, String key) {
        return getData(fileName).getProperty(key);

    }
}
