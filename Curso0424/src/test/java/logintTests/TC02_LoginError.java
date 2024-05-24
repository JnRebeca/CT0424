package logintTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import driverSetup.DriverSetup;
import navigationPages.LoginPage;

public class TC02_LoginError {
	
	//declarar e inicializar el web driver
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//Pageobjects
	
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		
	}
	
	
  @Test
  public void TC02() {
	  
	  loginPage.login(GlobalVariables.LOCK_USER, GlobalVariables.PWD_STD_USER);
	  Assert.assertTrue(loginPage.validateLockError());
	  
	  
	  
  }
  
  
  @AfterTest
  
  public void closeDriver() {
	  
	  driver.quit();
  }
  
  
  
}
