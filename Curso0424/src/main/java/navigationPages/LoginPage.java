package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class LoginPage {
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	// LoginPage WebElements
	
	@FindBy(id="user-name") 
	private WebElement userNameTxt;
	
	@FindBy(id="password") 
	private WebElement pwdTxt;
	
	@FindBy(id="login-button") 
	private WebElement loginBtn;
	
	@FindBy(xpath="//h3[@data-test='error']") 
	private WebElement errorBox;
	
	
	//LoginPage Methods
	public void login (String user, String pwd) {
		
		WrapClass.sendKeys(userNameTxt, user);
		WrapClass.sendKeys(pwdTxt, pwd);
		WrapClass.click(loginBtn);
		
		
	}
	
	public boolean validateLockError () {
		boolean errorDisplayed= WrapClass.getText(errorBox).contains("Epic sadface: Sorry, this user has been locked out.");
		return errorDisplayed;
		
	}
	

}
