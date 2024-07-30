package Nikaraz.PageObjects;

import Nikaraz.BaseClass;
import Nikaraz.Utils.BrowserUtils;

public class CheckoutPage extends BaseClass {

    private static String macBookText = "/html/body/div[2]/div[2]/div/form/div/table/tbody/tr/td[2]/a";
    private static String checkoutButton = "/html/body/div[2]/div[2]/div/div[3]/div[2]/a";
    private static String alertMessage = "/html/body/div[2]/div[1]";

    public static void validateMacbookText(String expectedText) {
        BrowserUtils.findAndWaitForElement(macBookText);
        BrowserUtils.validateText(macBookText, expectedText);
    }

    public static void clickCheckoutButton(){
        BrowserUtils.findAndWaitForElement(checkoutButton);
        BrowserUtils.clickElement(checkoutButton);
    }
    public static void validateAlertMessage(String expectedText){
        BrowserUtils.findAndWaitForElement(alertMessage);
        BrowserUtils.validateText(alertMessage, expectedText);
    }

}
