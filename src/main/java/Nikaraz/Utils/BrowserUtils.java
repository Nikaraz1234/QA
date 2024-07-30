package Nikaraz.Utils;

import Nikaraz.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class BrowserUtils extends BaseClass {

    static Properties properties = PropertiesUtil.loadFrameworkProperties();

    public static void clickElement(String element) {
        try {
            WebElement webElement = findAndWaitForElement(element);
            if (webElement != null) {
                System.out.println("Clicking element: " + element);
                webElement.click();
            } else {
                System.out.println("Failed to find and click the element: " + element);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred while clicking element: " + element);
            e.printStackTrace();
        }
    }

    public static void hoverAndClickOnElement(String element1, String element2){
        WebElement e1 = driver.findElement(By.xpath(element1));
        WebElement e2 = driver.findElement(By.xpath(element2));
        Actions actions = new Actions(driver);
        actions.moveToElement(e1).click(e2).build().perform();
    }

    public static void enterText(String element, String text) {
        WebElement webElement = findAndWaitForElement(element);
        if (webElement != null) {
            System.out.println("Entering text into element: " + element + " Text: " + text); // Logging
            webElement.clear();  // Clear the text field before entering text
            webElement.sendKeys(text);
        } else {
            System.out.println("Failed to find and enter text into the element: " + element);
        }
    }

    public static WebElement findAndWaitForElement(String xpath) {
        String timeout = properties.getProperty("timeout.maximum");
        WebElement element = null;
        try {
            long timeoutInSeconds = Long.parseLong(timeout);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
            element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        } catch (NumberFormatException e) {
            System.out.println("Invalid timeout value: " + timeout);
        } catch (TimeoutException e) {
            System.out.println("Element not found within timeout: " + xpath);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        return element;
    }

    public static void validateText(String element, String expectedText) {
        WebElement webElement = findAndWaitForElement(element);
        if (webElement != null) {
            String actualText = webElement.getText().trim(); // Trimming whitespace
            System.out.println("Validating text for element: " + element + " Expected: " + expectedText + " Actual: " + actualText); // Logging
            assertTrue("Expected Text \"" + expectedText + "\" does not match actual text \"" + actualText + "\"", actualText.equals(expectedText));
        } else {
            System.out.println("Failed to find the element to validate text: " + element);
        }
    }
    public static void containsText(String actualText, String expectedText) {
        boolean result = actualText.contains(expectedText);
        System.out.println(actualText + " " + expectedText);
        System.out.println("Actual text contains the expected text: " + result);
        assertTrue("Actual text does not contain the expected text.", result);
    }
}
