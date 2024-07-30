package Nikaraz.StepDefs;

import Nikaraz.BaseClass;
import Nikaraz.PageObjects.CheckoutPage;
import Nikaraz.PageObjects.HomePage;
import Nikaraz.PageObjects.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class ProductsStepDefs extends BaseClass {


    @Given("User clicks on show all notebooks and laptops link")
    public void userClicksOnShowAllNotebooksAndLaptopsLink() {
        HomePage.clickAllLaptopsAndNotebooks();
    }

    @And("User clicks on a macbook")
    public void userClicksOnAMacbook() {
        ProductPage.clickMacBook();
    }

    @And("user clicks to Add To Cart button")
    public void userClicksToAddToCartButton() {
        ProductPage.clickAddToCartButton();
        getBrowserLogs();
    }
    @When("User clicks on Shopping Cart button")
    public void userClicksOnShoppingCartButton() {
        ProductPage.clickShoppingCart();
    }

    @Then("Product is added to cart")
    public void productIsAddedToCart() {
        CheckoutPage.validateMacbookText("MacBook");
        getBrowserLogs();
    }



    public static void getBrowserLogs() {
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(entry.getLevel() + " " + entry.getMessage());
        }
    }


    @When("User clicks on checkout")
    public void userClicksOnCheckout() {
        CheckoutPage.clickCheckoutButton();
    }

    @Then("Alert message appears")
    public void alertMessageAppears() {
        CheckoutPage.validateAlertMessage("Products marked with *** are not available in the desired quantity or not in stock!\n" +
                "×");
    }
    @And("item is added to cart")
    public void itemIsAddedToCart() {
        userClicksOnShowAllNotebooksAndLaptopsLink();
        userClicksOnAMacbook();
        userClicksToAddToCartButton();
        userClicksOnShoppingCartButton();
        productIsAddedToCart();
    }
}
