package Nikaraz.PageObjects;

import Nikaraz.BaseClass;
import Nikaraz.Utils.BrowserUtils;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {
    private static String myAccountText = "(//div[@id='content']/h2)[1]";
    private static String linkShowAllLaptopsAndNotebooks = "/html/body/div[1]/nav/div[2]/ul/li[2]/div/a";
    private static String linkLaptopsAndNotebooks = "/html/body/div[1]/nav/div[2]/ul/li[2]/a";


    public static void validateLogin(String expectedText) {
        BrowserUtils.validateText(myAccountText, expectedText);
    }

    public static void clickAllLaptopsAndNotebooks(){
        BrowserUtils.hoverAndClickOnElement(linkLaptopsAndNotebooks, linkShowAllLaptopsAndNotebooks);
    }
}
