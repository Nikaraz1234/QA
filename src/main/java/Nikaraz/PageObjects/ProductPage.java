package Nikaraz.PageObjects;

import Nikaraz.Utils.BrowserUtils;

public class ProductPage {
    // More robust XPath using relative path and class names
    private static String addToCartButton = "//button[@id='button-cart']";
    private static String successMessage = "//div[contains(@class,'alert-success')]";
    private static String linkMacbook = "/html/body/div[2]/div/div/div[4]/div[2]/div/div[2]/div[1]/h4/a";

    public static void clickAddToCartButton() {
        System.out.println("Attempting to click add to cart button");
        BrowserUtils.clickElement(addToCartButton);
    }

    public static void validateSuccessText(String expectedText) {
        System.out.println("Validating success message text");
        BrowserUtils.containsText(successMessage, expectedText);
    }
    public static void clickMacBook(){
        BrowserUtils.clickElement(linkMacbook);
    }
}
