package Nikaraz.PageObjects;

import Nikaraz.BaseClass;
import Nikaraz.Utils.BrowserUtils;

public class CheckoutPage extends BaseClass {

    private static String macBookText = "/html/body/div[2]/div[2]/div/form/div/table/tbody/tr/td[2]/a";

    public static void validateMacbookText(String expectedText) {
        BrowserUtils.findAndWaitForElement(macBookText);
        BrowserUtils.validateText(macBookText, expectedText);
    }

}
