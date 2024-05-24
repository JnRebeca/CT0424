package logintTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import driverSetup.DriverSetup;
import navigationPages.LoginPage;

public class TC01_Login {
	
	//declarar e inicializar el web driver
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//Pageobjects
	
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		
	}
	
	
  @Test
  public void TC01() {
	  
	  loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.PWD_STD_USER);
	  
	  
	  
  }
  
  
  @AfterTest
  
  public void closeDriver() {
	  
	  driver.quit();
  }
  
  
  
}
