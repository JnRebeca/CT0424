package commonMethods;

import org.openqa.selenium.WebElement;

public class WrapClass {
	//llamadas logicas a los metodos de selenium
	
	public static void click(WebElement webElement) {
		webElement.click();
	}

	
	public static void sendKeys(WebElement webElement, String textToSend) {
		webElement.sendKeys(textToSend);
	}
	
	public static String getText (WebElement webElement) {
		return webElement.getText();
		
	}
	
	public static boolean verifyElementDisplayed(WebElement webElement) {
		return webElement.isDisplayed();
		
		
	}
	
}
