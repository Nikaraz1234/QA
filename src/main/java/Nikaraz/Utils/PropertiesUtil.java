package Nikaraz.Utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public static Properties properties = new Properties();
    static FileInputStream fis;

    public static Properties loadApplicationProperties(){

        try {
            fis = new FileInputStream("src/test/resources/config/application.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return properties;
    }
    public static Properties loadFrameworkProperties(){

        try {
            fis = new FileInputStream("src/test/resources/config/framework.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties;
    }
    public static Properties loadUserProperties(){

        try {
            fis = new FileInputStream("src/test/resources/config/user.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties;
    }

}
