package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import runners.RegisterPage;
import util.DriverFactory;

public class RegisterSteps {
	RegisterPage registerPage =
            new RegisterPage(
                    DriverFactory.getDriver());

    @Given("user is on parabank registration page")
    public void user_is_on_registration_page() {

        registerPage.clickRegisterLink();
    }

    @When("user enters registration details")
    public void user_enters_registration_details() {

        registerPage.enterRegistrationDetails();
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {

        registerPage.clickRegisterButton();
    }

    @Then("user account should be created successfully")
    public void user_account_should_be_created_successfully() {

        Assert.assertTrue(
                registerPage.isRegistrationSuccessful());
    }
}
