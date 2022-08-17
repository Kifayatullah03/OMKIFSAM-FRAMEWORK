package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {

    static Properties properties;

   public static Properties reader(String filePath){

       try {
           FileInputStream fileInputStream = new FileInputStream(filePath);
           properties = new Properties();
           properties.load(fileInputStream);
       } catch (FileNotFoundException e) {
            e.printStackTrace();
       }catch(IOException e){
            e.printStackTrace();
       }
       return properties;
   }

   public static String getReaderValue(String key){
        return properties.getProperty(key);
    }

}
