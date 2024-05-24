package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Ejemplo_HardAssertion {
  @Test
  public void f() {
	  
	//  int a =10;
	//  int b=10;
	//  Assert.assertEquals(a,b);
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle, "El titulo no coincide" );
		
		
		
	  
  }
}
