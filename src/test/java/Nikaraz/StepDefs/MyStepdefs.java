package Nikaraz.StepDefs;

import Nikaraz.BaseClass;
import Nikaraz.PageObjects.HomePage;
import Nikaraz.PageObjects.LoginPage;
import Nikaraz.Utils.PropertiesUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Properties;

public class MyStepdefs extends BaseClass {

    Properties properties = PropertiesUtil.loadUserProperties();

    @Given("user enters valid email")
    public void userEntersValidEmail() {
        String email = properties.getProperty("email");
        System.out.println("Entering email: " + email); // Logging
        LoginPage.enterEmail(email);
    }

    @And("user enters valid password")
    public void userEntersValidPassword() {
        String password = properties.getProperty("password");
        System.out.println("Entering password: " + password); // Logging
        LoginPage.enterPassword(password);
    }

    @When("user clicks to the login button")
    public void userClicksToTheLoginButton() {
        System.out.println("Clicking login button"); // Logging
        LoginPage.clickLogin();
    }

    @Then("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {
        System.out.println("Validating successful login"); // Logging
        HomePage.validateLogin("My Account");
    }

    @Given("^user enters invalid email: (.*)$")
    public void userEntersInvalidEmail(String email) {
        System.out.println("Entering invalid email: " + email); // Logging
        LoginPage.enterEmail(email);
    }

    @And("^user enters invalid password: (.*)$")
    public void userEntersInvalidPassword(String password) {
        System.out.println("Entering invalid password: " + password); // Logging
        LoginPage.enterPassword(password);
    }

    @Then("error message is displayed")
    public void errorMessageIsDisplayed() {
        System.out.println("Validating error message"); // Logging
        LoginPage.validateInvalidText("Warning: No match for E-Mail Address and/or Password.");
    }


    @Given("User is logged in")
    public void userIsLoggedIn() {
        userEntersValidEmail();
        userEntersValidPassword();
        userClicksToTheLoginButton();
        userIsLoggedInSuccessfully();

    }



}
