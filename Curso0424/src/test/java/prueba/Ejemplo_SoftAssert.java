package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Ejemplo_SoftAssert {
	
	SoftAssert soft=new SoftAssert();
  @Test
  public void f() {
	  
	  int a=5;
	  int b=10;
	  int x=8;
	  int y=8;
	  
	  //Assert.assertEquals(a, b); // falla y aqui se detiene
	  //Assert.assertEquals(x, y);
	  
	  //soft.assertEquals(a, b); // falla y sontinua validando el otro
	  //soft.assertEquals(x, y);
	  
	  WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com");
			
			String expectedTitle = "Swag Labs";
			String actualTitle = driver.getTitle();
			String badTitle="My store";
			
			soft.assertEquals(expectedTitle, actualTitle);
			soft.assertEquals(expectedTitle, badTitle);

	  
	  
	  
	  soft.assertAll();
	  
  }
}
