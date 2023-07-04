package lisa.page.object.model;

import org.openqa.selenium.By;

public class LoginPage {
     //Page Object Model = By method
	 //Page Factory = @FindBy method 
	// xpath formula = //*[@locator='value']
	public static By username = By.xpath("//*[@id = 'username']"); 
	public static By password = By.xpath("//*[@id='password']"); 
	public static By logIn = By.xpath("//*[@type='submit']"); 
	public static By logOut = By.xpath("//*[@id='logoutButton']"); 
	
}
