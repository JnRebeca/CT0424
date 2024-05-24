package prueba;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selenium {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		// Obtener o indetificar los objetos GUI/webelements de la pagina
		WebElement userNameTxt = driver.findElement(By.id("user-name"));
		WebElement pwdTxt =driver.findElement(By.name("password"));
		WebElement loginBtn =driver.findElement(By.id("login-button"));
		
		
		//Login
		userNameTxt.sendKeys("standard_user");
		pwdTxt.sendKeys("secret_sauce");
		loginBtn.click();
		
		
		//Metodos del explorador
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//Metodos de navegacion
		driver.navigate().back();
		//Thread.sleep(2000);
		driver.navigate().forward();
		//Thread.sleep(2000);
		driver.navigate().refresh();
		//Thread.sleep(2000);

		
		//Verificar elementos de la pagina
		
		boolean prodDisplayed = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if (prodDisplayed) {
		 	System.out.println("El articulo esta desplegado");			
		}

		//oBTENER TEXTO
			String prodName =driver.findElement(By.className("inventory_item_name")).getText();
			
			boolean msjCorrect = prodName.contains("Sauce Labs Backpack");
			
			if (msjCorrect) {
			 	System.out.println("El nombre del articulo es CORRECTO");			
			}else {
			 	System.out.println("El nombre del articulo es INCORRECTO");			
			}
			
			//Dropdowns
			Select drpProdCont = new Select(driver.findElement(By.className("product_sort_container")));
			drpProdCont.selectByVisibleText("Price (low to high)");
			
			//Cerrar el navegador
			
			// driver.close(); // Cierra la ventana actual que el webdriver esta utilizando
			driver.quit(); // cierra todas las ventanas que el webdriver haya abierto -- prefente usar este
			
			
			
	}
}


