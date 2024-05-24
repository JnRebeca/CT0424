package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class InventoryPage extends WrapClass {
	
	public InventoryPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	//Invetorypage web elements
	
	@FindBy(id="add-to-cart-sauce-labs-backpack") 
	private WebElement addToCartBtn;
	
	@FindBy(id="remove-sauce-labs-backpack") 
	private WebElement removeBtn;
	
	
	
	public boolean addToCartAndVerifyRemoveButton () {
		WrapClass.click(addToCartBtn);
		
		return WrapClass.verifyElementDisplayed(removeBtn);
		
	}
	

}
