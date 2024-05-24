package inventoryTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import driverSetup.DriverSetup;
import navigationPages.InventoryPage;
import navigationPages.LoginPage;

public class TC03_VerifyRemoveButton {
	
	//declarar e inicializar el web driver
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//Pageobjects
	
	LoginPage loginPage = new LoginPage(driver);
	InventoryPage inventory = new InventoryPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		
	}
	
	
  @Test
  public void TC03() {
	  
	  //step 1: Login
	  
	  loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.PWD_STD_USER);
	  
	  //step 2: Verificar el boton remove
	  
	  inventory.addToCartAndVerifyRemoveButton();
	    
	  
  }
  
  
  @AfterTest
  
  public void closeDriver() {
	  
	  driver.quit();
  }
  
  
  
}
