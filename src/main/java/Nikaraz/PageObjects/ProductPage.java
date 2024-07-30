package Nikaraz.PageObjects;

import Nikaraz.Utils.BrowserUtils;

public class ProductPage {

    private static String addToCartButton = "//*[@id=\"button-cart\"]";
    private static String successMessage = "//div[contains(@class,'alert-success')]";
    private static String linkMacbook = "/html/body/div[2]/div/div/div[4]/div[2]/div/div[2]/div[1]/h4/a";
    private static String linkShoppingCart = "//span[text()='Shopping Cart']";

    public static void clickAddToCartButton() {
        System.out.println("Attempting to click add to cart button");
        BrowserUtils.clickElement(addToCartButton);
    }

    public static void clickMacBook(){
        BrowserUtils.clickElement(linkMacbook);
    }
    public static void clickShoppingCart() {
        BrowserUtils.clickElement(linkShoppingCart);
    }
}
