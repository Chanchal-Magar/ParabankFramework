package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class LoginStepDefinitions 
{
	 WebDriver driver = DriverFactory.getDriver();
	@Given("user launches parabank application")
	public void user_launches_parabank_application() 
	{
		 System.out.println("Application launched");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {

        driver.findElement(By.name("username")).sendKeys("john");

        driver.findElement(By.name("password")).sendKeys("demo");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
		 System.out.println("Login successful");
	}




}

