package Nikaraz.PageObjects;

import Nikaraz.BaseClass;
import Nikaraz.Utils.BrowserUtils;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {

    private static String txtEmail = "//input[@id='input-email']";
    private static String txtPassword = "//input[@id='input-password']";
    private static String btnLogin = "//input[@value='Login']";
    private static String linkForgottenPassword = "(//a[text() = 'Forgotten Password'])[1]";
    private static String alertLoginError = "//div[contains(@class,'alert-danger')]";

    public static void enterEmail(String email) {
        BrowserUtils.enterText(txtEmail, email);
    }

    public static void enterPassword(String password) {
        BrowserUtils.enterText(txtPassword, password);
    }

    public static void clickLogin() {
        BrowserUtils.clickElement(btnLogin);
    }

    public static void clickForgottenPassword() {
        BrowserUtils.clickElement(linkForgottenPassword);
    }

    public static void validateInvalidText(String expectedText) {
        BrowserUtils.validateText(alertLoginError, expectedText);
    }
}
