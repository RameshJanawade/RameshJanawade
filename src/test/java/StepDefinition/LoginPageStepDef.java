package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepDef {
	WebDriver driver;
	
	@Given("user is on Login Page")
	public void user_is_on_LoginPage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@When("User enters correct username")
	public void Enter_valid_credentials() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	
	@When("User enters correct password")
	public void Enter_valid_Password() {
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	
	@Then("User should be logged in successfully")
	
	public void user_loggedin_success() {
		driver.quit();
	}

	
	
}
