package Nikaraz.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Properties;

public class GetBrowserDriver {
    public static WebDriver driver;
    static Properties properties = PropertiesUtil.loadApplicationProperties();
    static Properties props = PropertiesUtil.loadFrameworkProperties();

    public static WebDriver getBrowserDriver(String browser){
        if(browser!=null){
            if(browser.equalsIgnoreCase("chrome")){
                driver = setChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                driver = setFireFoxDriver();
            } else if (browser.equalsIgnoreCase("ie")) {
                driver = setIEDriver();
            }
        }
        return driver;

    }

    private static WebDriver setIEDriver() {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        return driver;
    }

    private static WebDriver setFireFoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }

    private static WebDriver setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
}
