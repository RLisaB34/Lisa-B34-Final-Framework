package lisa.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lisa.page.object.model.LoginPage;

public class StepDef {
	WebDriver driver;

	@Given("Open browser and go to application")
	public void open_browser_and_go_to_application() {
	    //code
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rlisa/AppData/Local/Microsoft/Windows/INetCache/IE/ERPSGAX4/dev_online_Banking_monthly_yearly_statement[1].html");
	    
	}

	@When("Enter valid username")
	public void enter_valid_username() {
	    driver.findElement(LoginPage.username).sendKeys("Batch34");
		
	}

	@When("Enter valid password")
	public void enter_valid_password() {
	    
		driver.findElement(LoginPage.password).sendKeys("student123@");
	}

	@When("Click login")
	public void click_login() {
		driver.findElement(LoginPage.logIn).click();
	    
	}

	@Then("Logout button should be present")
	public void logout_button_should_be_present() {
	    //TestNG validate through Assertion = Hard (Assert) and Soft (SoftAssert)
		
		//Assert.assertEquals(false, false);  //This is HARD assert
		
		SoftAssert sf = new SoftAssert();
		
		//sf.assertEquals(false, false);  //actual, expected - Soft Assert 
		
		sf.assertTrue(driver.findElement(LoginPage.logOut).isDisplayed());
		sf.assertAll();
	}
	

	@When("Enter invalid username")
	public void enter_invalid_username() {
	    
		driver.findElement(By.xpath("//*[@id = 'username']")).sendKeys("Batch43");
	}

	@When("Enter invalid password")
	public void enter_invalid_password() {
	    
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student");
	}
	
	@When("Click login2")
	public void click_login2() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	}
	

	@Then("Show alert message Invalid username or password")
	public void show_alert_message_invalid_username_or_password() {
	    //Alert Interface 
		
		Alert alert = driver.switchTo().alert();
		String alertMsg = alert.getText();
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(alertMsg, "Invalid username or password");
	    
	}

	@When("Enter null username")
	public void enter_null_username() {
	    
		driver.findElement(By.xpath("//*[@id = 'username']")).sendKeys("");
	}

	@When("Enter null password")
	public void enter_null_password() {
	    
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("");
	}
	
	@When("Click login3")
	public void click_login3() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	}

}
