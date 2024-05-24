package prueba;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo_ImplicidWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		//impricit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // best practices  ... aplica para todo lo siguiente ... 30 a 60
		
		// Obtener o indetificar los objetos GUI/webelements de la pagina
		WebElement userNameTxt = driver.findElement(By.id("user-name"));
		
		driver.quit();
	}

}
