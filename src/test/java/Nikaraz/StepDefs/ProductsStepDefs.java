package Nikaraz.StepDefs;

import Nikaraz.BaseClass;
import Nikaraz.PageObjects.HomePage;
import Nikaraz.PageObjects.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsStepDefs extends BaseClass {


    @Given("User clicks on show all notebooks and laptops link")
    public void userClicksOnShowAllNotebooksAndLaptopsLink() {
        HomePage.clickAllLaptopsAndNotebooks();
    }

    @When("User clicks on a macbook")
    public void userClicksOnAMacbook() {
        ProductPage.clickMacBook();
    }

    @And("user clicks to Add To Cart button")
    public void userClicksToAddToCartButton() {
        ProductPage.clickAddToCartButton();
    }

    @Then("Product is added to cart")
    public void productIsAddedToCart() {
        ProductPage.validateSuccessText("Success: You have added MacBook to your shopping cart!");
    }
}
