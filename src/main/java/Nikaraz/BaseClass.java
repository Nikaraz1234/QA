package Nikaraz;

import Nikaraz.Utils.GetBrowserDriver;
import Nikaraz.Utils.PropertiesUtil;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BaseClass extends GetBrowserDriver {

    public static WebDriver driver;
    static Properties properties = PropertiesUtil.loadApplicationProperties();
    static Properties props = PropertiesUtil.loadFrameworkProperties();

    public static void initializeDriver(){
        if (driver == null) {
            String url = properties.get("application.url").toString();
            String browser = props.getProperty("browser.driver");
            driver = getBrowserDriver(browser);
            if (driver != null) {
                driver.get(url);
                driver.manage().window().maximize();
            } else {
                throw new RuntimeException("Failed to initialize the browser driver");
            }
        }
    }

    public static void closeDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
